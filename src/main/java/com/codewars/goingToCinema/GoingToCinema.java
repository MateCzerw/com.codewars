package com.codewars.goingToCinema;

public class GoingToCinema {
    public static int movie(int card, int ticket, double perc) {
        int systemA = ticket;
        double subresultB = ticket * perc;
        double systemB = card + subresultB;
        int result = 1;
        while (Math.ceil(systemB) >= systemA){
            result++;
            systemA += ticket;
            subresultB *= perc;
            systemB += subresultB;
        }
        return result;
    }
}
