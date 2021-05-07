package com.example.countryselection;

import java.util.HashMap;

public class GetClassCode {

    static HashMap<String, String> codeHash = new HashMap<>();

    static {
        init();
    }
    public static void init() {
        codeHash.put("Select a country","-");
        codeHash.put("India", "+91");
        codeHash.put("France", "+87");
        codeHash.put("England", "+45");
        codeHash.put("Belgium", "+65");
        codeHash.put("Russia","+69");
        codeHash.put("Switzerland","+90");
        codeHash.put("Vietnam","+42");
        codeHash.put("Thailand","+32");
        codeHash.put("South Korea","+83");
        codeHash.put("Canada","+97");
    }

    public static String getCode(String param) {
        return codeHash.get(param);
    }
}
