package com.codewars.findChair;

import java.util.LinkedList;
import java.util.List;

public class FindChair {

    public static Object meeting(Room[] rooms, int need) {
        List<Integer> resultList = new LinkedList<>();
        int requiredChairs = need;
        if (need == 0) return "Game On";

        for (int i = 0; i < rooms.length; i++) {
            if (requiredChairs == 0) break;
            int occupants = rooms[i].occupants.length();
            int availableChairs = rooms[i].chairs > occupants
                                        ? rooms[i].chairs - occupants
                                        : 0;
            resultList.add(Math.min(requiredChairs, availableChairs));
            requiredChairs -= Math.min(requiredChairs, availableChairs);
        }

        return requiredChairs == 0 ? resultList.stream().mapToInt(i -> i).toArray() : "Not enough!";
    }

}

