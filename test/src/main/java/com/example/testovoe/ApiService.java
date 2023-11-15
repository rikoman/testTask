package com.example.testovoe;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ApiService {

    public Map<Character,Integer> duplicatesSymbolInText(String text){
        String textWithoutSpases = deleteSpaces(text);

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<textWithoutSpases.length();i++){
            char symbol = textWithoutSpases.charAt(i);

            if(map.containsKey(symbol)){
                int count = map.get(symbol);
                map.put(symbol,count+1);
            }
            else {
                map.put(symbol,1);
            }
        }
        return sortingByValues(map);
    }

    private String deleteSpaces(String text){
        return text.replaceAll(" ","");
    }

    private Map<Character,Integer> sortingByValues(Map<Character,Integer> map){
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
                }
}
