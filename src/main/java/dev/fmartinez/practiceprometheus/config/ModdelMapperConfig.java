package dev.fmartinez.practiceprometheus.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModdelMapperConfig {

    /**
     * Esta funcion permite que el contenedor de Spring
     * maneje el objeto ModelMapper utilizando IoC
     * @return ModelMapper
     */

    @Bean
    public ModelMapper ModelMapperInit() {
        return new ModelMapper();
    }
}
