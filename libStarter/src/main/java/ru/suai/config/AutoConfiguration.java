package ru.suai.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.suai.Factory;
import ru.suai.model.Animal;

@Configuration
public class AutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public Factory getFactory(Animal animal){
        return new Factory(animal);
    }
}
