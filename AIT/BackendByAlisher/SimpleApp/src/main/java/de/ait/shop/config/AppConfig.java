package de.ait.shop.config;

import de.ait.shop.validation.PasswordValidator;
import de.ait.shop.validation.impl.PasswordNotEmptyValidatorImpl;
import de.ait.shop.validation.impl.PasswordValidatorRegexImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public PasswordValidator passwordValidatorNotEmpty() {
        return new PasswordNotEmptyValidatorImpl();
    }

    @Bean
    public PasswordValidator passwordValidatorRegex() {
        return new PasswordValidatorRegexImpl();
    }
}