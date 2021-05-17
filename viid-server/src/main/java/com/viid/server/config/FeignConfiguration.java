package com.viid.server.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.viid.common.constant.ViidConstants;
import feign.Logger;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * FeignConfiguration
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/19
 * @since 0.1.0
 **/
@Configuration
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Decoder feignDecoder() {
        var jacksonConverter = new MappingJackson2HttpMessageConverter(objectMapper());
        ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(jacksonConverter);
        return new ResponseEntityDecoder(new SpringDecoder(objectFactory));
    }

    @Bean
    public Encoder feignEncoder(){
        var jacksonConverter = new MappingJackson2HttpMessageConverter(objectMapper());
        ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(jacksonConverter);
        return new SpringEncoder(objectFactory);
    }

    public ObjectMapper objectMapper() {
        var mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.configure(JsonParser.Feature.IGNORE_UNDEFINED, true);
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        var javaTimeModule = new JavaTimeModule();
        var dateTimeFormatter = DateTimeFormatter.ofPattern(ViidConstants.DATE_TIME_FORMATTER_PATTERN);
        javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(dateTimeFormatter));
        javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(dateTimeFormatter));
        mapper.registerModule(javaTimeModule);
        return mapper;
    }
}
