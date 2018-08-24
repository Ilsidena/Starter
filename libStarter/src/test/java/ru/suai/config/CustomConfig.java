package ru.suai.config;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.suai.model.Animal;

@Configuration
public class CustomConfig {
    // написать заглушку с Mock
    @Mock
    Animal animal;

    @Bean
    public Animal getAnimal() {
        MockitoAnnotations.initMocks(this);
        return animal;
    }
}
