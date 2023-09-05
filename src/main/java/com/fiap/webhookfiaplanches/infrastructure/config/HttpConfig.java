package com.fiap.webhookfiaplanches.infrastructure.config;

import com.fiap.webhookfiaplanches.web.http.FiapLanchesCallback;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpConfig {

    @Value("${fiap.lanches.url}")
    private String fiapLanchesUrl;
    @Bean
    FiapLanchesCallback fiapLanchesCallback() {
        WebClient client = WebClient.builder().baseUrl(fiapLanchesUrl).build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();

       return factory.createClient(FiapLanchesCallback.class);

    }

}