package de.ait.shop;
import de.ait.shop.config.AppConfig;
import de.ait.shop.validation.PasswordValidator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 8/30/2023
 * SimpleApp
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static void main(String[] args) {
        // то же самое с EmailValidator
        // создаем Spring-контейнер
        // мы передали ему AppConfig
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        PasswordValidator passwordValidator = applicationContext.getBean("passwordValidatorRegex", PasswordValidator.class);

        System.out.println(passwordValidator);
    }
}