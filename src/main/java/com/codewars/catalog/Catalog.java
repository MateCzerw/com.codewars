package com.codewars.catalog;


import java.util.*;

public class Catalog {
    public static String catalog(String s, String article) {
        List<Product> productsList = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        String[] products = s.split("\\n\\n");

        Arrays.stream(products).forEach(product -> {

            String name = product.substring(product.indexOf("<name>") + 6, product.indexOf("</name>"));
            String price = product.substring(product.indexOf("<prx>") + 5, product.indexOf("</prx>"));
            String quantity = product.substring(product.indexOf("<qty>") + 5, product.indexOf("</qty>"));
            productsList.add(new Product(name,price,quantity));
        });

        productsList
                .stream()
                .filter(product -> product.getName().contains(article))
                .forEach(product -> sb.append(product.getName() + " > prx: $" + product.getPrice() + " qty: " + product.getQuantity() + "\n"));

        if(sb.length() == 0) return "Nothing";

        return sb
                .delete(sb.length()-1,sb.length())
                .toString();
    }


    private static class Product{
        private String name;
        private String price;
        private String quantity;

        public Product(String name, String price, String quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public String getPrice() {
            return price;
        }

        public String getQuantity() {
            return quantity;
        }

    }



}
