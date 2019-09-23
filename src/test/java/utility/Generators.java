package utility;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Generators {
    private static Faker faker = new Faker(new Locale("pl"));

    public static String username() {
        return faker.name().username();
    }

    public static String name() {
        return faker.name().name();
    }

    public static String email() {
        return faker.internet().emailAddress();
    }

    public static String password() {
        return faker.internet().password();
    }

    public static String quote() {
        return faker.rickAndMorty().quote();
    }
}
