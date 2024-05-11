package com.github.bluegitter;

import com.google.code.kaptcha.text.TextProducer;
import com.google.code.kaptcha.util.Configurable;

import java.util.Random;

public class CustomTextCreator extends Configurable implements TextProducer {

    public CustomTextCreator() {
    }

    public String getText() {

        int length = this.getConfig().getTextProducerCharLength();
        char[] chars = this.getConfig().getTextProducerCharString();
        Random rand = new Random();
        StringBuffer text = new StringBuffer();

        for(int i = 0; i < length; ++i) {
            text.append(chars[rand.nextInt(chars.length)]);
        }

        boolean result = text.toString().matches("[a-zA-Z]+") || text.toString().matches("[0-9]+");
        if(result) {
            return getText();
        } else {
            return text.toString();
        }
    }
}

