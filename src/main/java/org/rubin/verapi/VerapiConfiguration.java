package org.rubin.verapi;

import org.springframework.boot.autoconfigure.web.WebMvcRegistrationsAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 *
 * @author rubin
 * @date 2017年06月09日
 */
@Configuration
public class VerapiConfiguration {

    @Bean
    public WebMvcRegistrationsAdapter webMvcRegistrationsAdapter() {
        return new WebMvcRegistrationsAdapter(){
            @Override
            public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
                return new VerapiRequestMappingHandlerMapping();
            }
        };
    }

}
