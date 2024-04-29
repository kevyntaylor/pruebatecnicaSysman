package com.prueba.tecnica.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.prueba.tecnica.controllers")) // Paquete donde se encuentran los controladores de la API
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Prueba Tecnica API")
                .description("Esta es un api construida para prueba tecnica...")
                .version("1.0.0")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .termsOfServiceUrl("http://swagger.io/terms/")
                .contact(new springfox.documentation.service.Contact("KevynTaylor", "https://github.com/kevyntaylor", "kevinmolinataylor@gmail.com")) // Información de contacto
                .build();

    }


    private springfox.documentation.service.ResponseMessage customResponseMessage(int code, String message) {
        return new ResponseMessageBuilder()
                .code(code)
                .message(message)
                .build();
    }
}
