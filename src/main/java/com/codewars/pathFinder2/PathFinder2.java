package com.codewars.pathFinder2;

import java.util.LinkedList;
import java.util.List;

public class PathFinder2 {
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

    public static int pathFinder(String maze) {

        String[] mazeRows = maze.split("\n");

        List<Coordinate> nextToVisit
                = new LinkedList<>();

        boolean[][] isExplored = new boolean[mazeRows.length][mazeRows[0].length()];


        Coordinate start = new Coordinate(0,0,null);
        nextToVisit.add(start);

        while (!nextToVisit.isEmpty()) {

            Coordinate cur = nextToVisit.remove(0);

            if (cur.getY() >= mazeRows.length
                    || cur.getY() < 0
                    || cur.getX() < 0
                    || cur.getX() >= mazeRows[0].length()
                    || isExplored[cur.getY()][cur.getX()]
                    || mazeRows[cur.getY()].charAt(cur.getX()) ==  'W' ){
                continue;
            }


            if (cur.getX() == mazeRows[0].length() - 1 && cur.getY() == mazeRows.length - 1) return backtrackPath(cur);

            nextToVisit.add(new Coordinate(cur.getX() + 1, cur.getY(), cur));
            nextToVisit.add(new Coordinate(cur.getX() - 1, cur.getY(), cur));
            nextToVisit.add(new Coordinate(cur.getX(), cur.getY() + 1, cur));
            nextToVisit.add(new Coordinate(cur.getX(), cur.getY() - 1, cur));

            isExplored[cur.getY()][cur.getX()] = true;
        }

        return -1;
    }

    private static int backtrackPath(Coordinate cur) {
        int pathLength = -1;
        Coordinate iter = cur;

        while (iter != null) {
            pathLength++;
            iter = iter.parent;
        }
        return pathLength;
    }

}
