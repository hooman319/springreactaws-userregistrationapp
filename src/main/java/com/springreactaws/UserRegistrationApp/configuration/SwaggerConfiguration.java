package com.springreactaws.UserRegistrationApp.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        Set<String> contentType = new HashSet<>();
        contentType.add(MediaType.APPLICATION_JSON_VALUE);

        ApiInfo swaggerInfo = new ApiInfo("User Registeration API",
                "User Registeration App",
                "1.0", null,
                new Contact("H.Mehdipour", null, "mehdipour_h@behsazan.net"),
                "", "", Collections.emptyList());
     //   Tag organization = new Tag("organization", "***");
       // Tag getValidAccountTypesTag = new Tag("getValidAccountTypes", "**");
        //Tag registerAccountRequest = new Tag("registerAccountRequest", "**");
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(swaggerInfo)
                .produces(contentType)
               // .tags(organization)
               // .tags(getValidAccountTypesTag)
                //.tags(registerAccountRequest)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.springreactaws.UserRegistrationApp"))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }



}
