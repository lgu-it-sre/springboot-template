package com.example.demo.config;

import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.responses.ApiResponse;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenApiCustomiser openApiCustomiser() {
    return openApi -> {
      openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations().forEach(operation -> {
        operation.getResponses()
            .addApiResponse("401", new ApiResponse()
                .description("인증 정보가 없습니다."))
            .addApiResponse("403", new ApiResponse()
                .description("권한이 없습니다."))
            .addApiResponse("500", new ApiResponse()
                .description("서버 오류"));
      }));
    };
  }

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("API 문서")
            .version("v1")
            .description("API 문서입니다."));
  }

}
