package top.huangt.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/8/17
 * Time 9:38
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.huangt.springboot.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("api文档")
                .description("restful 风格接口")
                //服务条款网址
                // .termsOfServiceUrl("http://www.huangt.top")
                .version("1.0")
                .contact(new Contact("LittleTry涛涛", "https://www.jianshu.com/u/f4aa5f961bd7", "1109394634@qq.com"))
                .build();
    }
}
