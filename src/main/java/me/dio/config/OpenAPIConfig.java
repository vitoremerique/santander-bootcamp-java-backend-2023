package me.dio.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("API Banco")
                        .description("API intermediária do Banco de dados Postgresql")
                        .contact(new Contact().name("Vitor Torres Emerique").email("vitort.emerique@hotmail.com")
                                ) .version("1.0.0"));
    }
}
