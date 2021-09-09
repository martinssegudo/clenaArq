package com.bank.domain.util;

import java.util.Random;

public class MessageUtil {

    private MessageUtil(){}

    public static String pickRandomMessage(String messagePropertie){
        if(messagePropertie != null){
            String[] messages = messagePropertie.split(",");
            Random generator = new Random();
            return messages[generator.nextInt(messages.length)];
        }
        return "Opps...something wrong with it!";
    }
}
