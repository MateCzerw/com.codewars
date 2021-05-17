package com.codewars.simpleMaze;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMazeTest {


    @Test
    void test1(){
        assertEquals(true,SimpleMaze
                .hasExit(new String[] {"########",
                "# # ####",
                "# #k#   ",
                "# # # ##",
                "# # # ##",
                "#      #",
                "########"}));
    }
    @Test
    void test2(){
        assertEquals(false,SimpleMaze
                .hasExit(new String[] {"########",
                        "# # ## #",
                        "# #k#  #",
                        "# # # ##",
                        "# # #  #",
                        "#     ##",
                        "########"}));
    }
    @Test
    void test3(){
        assertEquals(true,SimpleMaze
                .hasExit(new String[] {
                        " ",
                        "# # ##   ",
                        "# #k#                  #",
                        "# # # #                            #",
                        "# # #  #         ",
                        "#     #      #",
                        "          "}));
    }

    @Test
    void test4(){
        assertEquals(true,SimpleMaze
                .hasExit(new String[] {
                        " ",
                        "   ",
                        "               k                 ",
                        "   ",
                        "  ",
                        " "}));
    }

    @Test
    void test5(){
        assertEquals(true,SimpleMaze
                .hasExit(new String[] {
                        "                          ",
                        "                           ",
                        "      k     ",
                        "                              ",
                        "                                ",
                        " "}));
    }



}