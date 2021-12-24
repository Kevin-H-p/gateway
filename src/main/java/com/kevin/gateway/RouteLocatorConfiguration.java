package com.kevin.gateway;

import com.kevin.gateway.service.ITMGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfiguration {

    @Autowired
    private ITMGatewayService service;

    @Bean
    public RouteLocator addLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        service.list().forEach(o->{
            routes.route(o.getId(), r ->
                    r.path(o.getPath())
                            .filters(f ->
                                    f.stripPrefix(1))
                            .uri(o.getUrl()));
        });
        return routes.build();
    }
}
