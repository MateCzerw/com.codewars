package com.codewars.harvestFestiva;

public class HarvestFestival {
    public static String plant(char seed, int water, int fert, int temp){
        String steem = "-".repeat(water);
        String flowers = Character.toString(seed).repeat(fert);

        if(temp > 30 || temp < 20) return steem.repeat(water) + seed;
        return (steem + flowers).repeat(water);
    }


}
