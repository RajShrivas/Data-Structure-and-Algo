package com.stark.recursion.backtracking;

public class Maze {

    public static void main(String[] args) {

        //System.out.println(countSteps(3, 3));
        //steps("", 3, 3);
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},};

        //mazeWithObstacle("", maze, 0, 0);
    }


    private static int countSteps(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int down = countSteps(r - 1, c);
        int right = countSteps(r, c - 1);

        return down + right;
    }


    private static void steps(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            steps(p + "D", r - 1, c);
        }
        if (c > 1) {
            steps(p + "R", r, c - 1);
        }
    }

    private static void stepsIncludesDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1 && c > 1) {
            stepsIncludesDiagonal(p + "D", r - 1, c - 1);
        }
        if (r > 1) {
            stepsIncludesDiagonal(p + "V", r - 1, c);
        }
        if (c > 1) {
            stepsIncludesDiagonal(p + "H", r, c - 1);
        }
    }


    private static void mazeWithObstacle(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            mazeWithObstacle(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            mazeWithObstacle(p + "R", maze, r, c + 1);
        }
    }

}
