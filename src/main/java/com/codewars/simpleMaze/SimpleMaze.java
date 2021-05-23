package com.codewars.simpleMaze;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimpleMaze {

    private static class Coordinate{
        private int x;
        private int y;
        private Coordinate parent;

        private Coordinate(int x, int y, Coordinate parent) {
            this.x = x;
            this.y = y;
            this.parent = parent;
        }

        private int getX() {
            return x;
        }
        private int getY() {
            return y;
        }

    }

    public static boolean hasExit(String[] maze) {

        List<Coordinate> nextToVisit
                = new LinkedList<>();

        List<List<Boolean>> isExplored
                = new ArrayList<>();
        for (int i = 0; i < maze.length; i++) {
            List<Boolean> temp = new ArrayList<>();
            for (int j = 0; j < maze[i].length(); j++) {
                temp.add(false);
            }
            isExplored.add(temp);
        }

        Coordinate start = findStart(maze);
        nextToVisit.add(start);

        while (!nextToVisit.isEmpty()) {

            Coordinate cur = nextToVisit.remove(0);

            if (cur.getY() >= maze.length
                    || cur.getY() < 0
                    || cur.getX() < 0
                    || cur.getX() >= maze[cur.getY()].length()
                    || isExplored
                    .get(cur.getY())
                    .get(cur.getX())
                    ||maze[cur.getY()].charAt(cur.getX()) ==  '#' ){
                continue;
            }


            if (cur.getX() == 0
                || cur.getX() == maze[cur.getY()].length() - 1
                || cur.getY() == 0
                || cur.getY() == maze.length - 1) {
                    return true;
                            //backtrackPath(cur);

            }

            nextToVisit.add(new Coordinate(cur.getX() + 1, cur.getY(), cur));
            nextToVisit.add(new Coordinate(cur.getX() - 1, cur.getY(), cur));
            nextToVisit.add(new Coordinate(cur.getX(), cur.getY() + 1, cur));
            nextToVisit.add(new Coordinate(cur.getX(), cur.getY() - 1, cur));

            List<Boolean> temp = isExplored.get(cur.getY());
            temp.set(cur.getX(),true);
            isExplored.set(cur.getY(),temp);
        }

        return false;
    }

    private static Coordinate findStart(String[] maze){
        Coordinate result = null;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length(); j++) {
                if (maze[i].charAt(j) == 'k' && result != null) throw new RuntimeException();
                if (maze[i].charAt(j) == 'k' && result == null) result = new Coordinate(j,i, null);
            }
        }
        if(result == null) throw new RuntimeException();
        return result;
    }



//    private static List<Coordinate> backtrackPath(Coordinate cur) {
//        List<Coordinate> path = new LinkedList<>();
//        Coordinate iter = cur;
//
//        while (iter != null) {
//            path.add(iter);
//            iter = iter.parent;
//        }
//
//        return path;
//    }

}
