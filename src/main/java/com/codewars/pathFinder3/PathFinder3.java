package com.codewars.pathFinder3;

import java.util.PriorityQueue;

public class PathFinder3 {
    private static class Coordinate{
        final int x;
        final int y;
        int cost;
        Coordinate parent;

        private Coordinate(int x, int y, Coordinate parent,int cost) {
            this.x = x;
            this.y = y;
            this.parent = parent;
            this.cost = cost;
        }

    }

    public static int pathFinder(String maze) {

        String[] mazeRows = maze.split("\n");

        PriorityQueue<Coordinate> queue
                = new PriorityQueue<>((o1, o2) -> {
                    if(o1.cost > o2.cost) return 1;
                    if(o1.cost < o2.cost) return -1;
                    return 0;
        });

        boolean[][] isExplored = new boolean[mazeRows.length][mazeRows[0].length()];

        Coordinate start = new Coordinate(0,0,null,0);
        queue.add(start);

        while (!queue.isEmpty()) {

            Coordinate cur = queue.poll();

            if (isExplored[cur.y][cur.x]){
                continue;
            }


            if (cur.x == mazeRows[0].length() - 1 && cur.y == mazeRows.length - 1) return cur.cost;

            if(cur.x + 1 < mazeRows.length)
                queue.add(new Coordinate(cur.x + 1, cur.y, cur, cur.cost + Math.abs(mazeRows[cur.y].charAt(cur.x + 1) - mazeRows[cur.y].charAt(cur.x))));
            if(cur.x > 0)
                queue.add(new Coordinate(cur.x - 1, cur.y, cur,cur.cost + Math.abs(mazeRows[cur.y].charAt(cur.x - 1) - mazeRows[cur.y].charAt(cur.x))));
            if(cur.y + 1 < mazeRows.length)
                queue.add(new Coordinate(cur.x, cur.y + 1, cur, cur.cost + Math.abs(mazeRows[cur.y + 1].charAt(cur.x) - mazeRows[cur.y].charAt(cur.x))));
            if(cur.y > 0)
             queue.add(new Coordinate(cur.x, cur.y - 1, cur, cur.cost + Math.abs(mazeRows[cur.y - 1].charAt(cur.x) - mazeRows[cur.y].charAt(cur.x))));

            isExplored[cur.y][cur.x] = true;
        }

        return -1;
    }

//    private static int backtrackPath(Coordinate cur) {
//        int pathLength = -1;
//        Coordinate iter = cur;
//
//        while (iter != null) {
//            pathLength++;
//            iter = iter.parent;
//        }
//        return pathLength;
//    }

}
