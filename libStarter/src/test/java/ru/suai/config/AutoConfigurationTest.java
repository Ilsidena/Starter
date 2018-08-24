package ru.suai.config;

import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import ru.suai.Factory;

import static org.junit.Assert.*;

public class AutoConfigurationTest {
    @Test
    public void integrateTest() {
        ApplicationContextRunner applicationContext = new ApplicationContextRunner().withConfiguration(
                AutoConfigurations.of(AutoConfiguration.class, CustomConfig.class));
        applicationContext.withUserConfiguration(AutoConfiguration.class).run(
                context -> {
                    assertNotNull(context.getBean(Factory.class));
                }
        );
    }
}