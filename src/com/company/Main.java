package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String input = "hfdawaowhwhcoooomd";
        List<String> vietnameseCharacters = getVietnameseCharacters(input);
        int count = vietnameseCharacters.size();
        System.out.println("Input: "+ input);
        System.out.println("Output: " + count + " " + vietnameseCharacters);
    }

    public static List<String> getVietnameseCharacters(String input) {
        List<String> vietnameseCharacters = new ArrayList<>();
        String regex = "aw|aa|dd|ee|oo|ow|w";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            vietnameseCharacters.add(matcher.group());
        }

        return vietnameseCharacters;
    }
}
