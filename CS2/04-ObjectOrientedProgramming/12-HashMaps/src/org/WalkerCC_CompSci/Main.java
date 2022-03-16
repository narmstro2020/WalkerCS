package org.WalkerCC_CompSci;


import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //HashMap<key, value>

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Germany", "Berlin");
        capitalCities.put("United Kingdom", "London");
        capitalCities.put("Brazil", "Brasilia");
        capitalCities.put("Egypt", "Cairo");

        System.out.println(capitalCities);

        String capitalOfBrazil = capitalCities.get("Brazil");
        System.out.println(capitalOfBrazil);
        capitalCities.remove("Brazil");
        System.out.println(capitalCities);

        for(String i : capitalCities.keySet()){
            System.out.println(i + ":" + capitalCities.get(i));
        }

        HashMap<Integer, String> generationNames = new HashMap<Integer, String>(){{
            put(1997, "Gen Z");
            put(1981, "Millennial");
            put(1965, "Gen X");
            put(1955, "Boomer II");
            put(1946, "Boomer I");
            put(1928, "Post War");``````````````````````
            put(1922, "Greatest Generation");
        }};


        capitalCities.clear();
        System.out.println(capitalCities);








    }
}
