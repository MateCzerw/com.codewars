package com.codewars.salesmanTravel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SalesmanTravel {
    public static String travel(String addresses, String zipcode) {

        Map<String, Map<String, String>> mapOfAddresses = converStringToMap(addresses);
        StringBuilder result = new StringBuilder();
        if(!mapOfAddresses.containsKey(zipcode)) return zipcode + ":/";
        result.append(zipcode + ":");
        mapOfAddresses.get(zipcode)
                .entrySet()
                .forEach(street -> result.append(street.getValue() + ","));
        result.setLength(result.length() - 1);
        result.append("/");

        mapOfAddresses.get(zipcode)
                .entrySet()
                .forEach(street -> result.append(street.getKey() + ","));
        result.setLength(result.length() - 1);
        return result.toString();
    }

    private static Map<String, Map<String, String>> converStringToMap(String addresses) {
        String[] rows = addresses.split(",");
        Map<String, Map<String, String>> mapOfAddresses = new HashMap<>();
        for (int i = 0; i < rows.length; i++) {
            String zipCode = rows[i].substring(rows[i].length() - 8);
            if (!mapOfAddresses.containsKey(zipCode)) {
                Map<String, String> address = new LinkedHashMap<>();
                String number = rows[i].substring(0, rows[i].indexOf(' '));
                String street = rows[i].substring(rows[i].indexOf(' ') + 1, rows[i].length() - 9);
                address.put(number, street);
                mapOfAddresses.put(zipCode, address);
            } else {
                Map<String, String> streets = mapOfAddresses.get(zipCode);
                String number = rows[i].substring(0, rows[i].indexOf(' '));
                String street = rows[i].substring(rows[i].indexOf(' ') + 1, rows[i].length() - 9);
                streets.put(number, street);
            }
        }
        return mapOfAddresses;
    }
}
