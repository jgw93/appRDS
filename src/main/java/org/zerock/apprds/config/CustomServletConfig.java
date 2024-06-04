package org.zerock.apprds.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CustomServletConfig implements WebMvcConfigurer {
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry
        // localhost:8080/files/sample.html 요청 URL
        .addResourceHandler("/files/**")
        // 실제 프로젝트 내의 위치
        .addResourceLocations("classpath:/static/");
  }
}
