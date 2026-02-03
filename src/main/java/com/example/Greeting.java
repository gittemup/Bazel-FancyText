package com.example;
import com.engflow.fancytext.FancyFormatter;

public class Greeting {
    public static void sayHi() {
        FancyFormatter myFormatter = new FancyFormatter();
        System.out.println(myFormatter.format("Hello World!"));
    }
}
