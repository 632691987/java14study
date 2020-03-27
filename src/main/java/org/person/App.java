package org.person;

import java.text.MessageFormat;

public class App
{
    public static void main(String... args) {
        System.getenv().entrySet().forEach(entry -> {
            System.out.println(MessageFormat.format("Key = {0}, \t\t\t\t\t\t value = {1}", entry.getKey(), entry.getValue()));
        });
    }
}
