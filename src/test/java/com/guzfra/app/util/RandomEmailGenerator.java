package com.guzfra.app.util;

import java.util.Random;

public class RandomEmailGenerator {
    private static final String[] DOMAINS = {"gmail.com", "yahoo.com","hotmail.com","outlook.com"};

    public static String generate(){
        Random random = new Random();
        String username = "ShofyTest" + random.nextInt(1000);
        String domain = DOMAINS[random.nextInt(DOMAINS.length)];
        String email = username + "@" + domain;
        return email;
    }
}
