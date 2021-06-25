package com.codewars.triangleArea;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {
    public String makeTri(int n){
        String tri = "\n";
        for(int i=1;i<=n;i++){
            tri+=". ".repeat(i).trim()+"\n";
        }
        return(tri);
    }
    //you can use the above function to generate a triangle of size n for adding your test

    @Nested
    @DisplayName("Example Tests")
    public class BasicTest{
        @Test
        public void BasicTest1(){
            assertEquals(.5,TriangleArea.tArea("\n.\n. .\n"),0.0);//in this example, "\n.\n. .\n" can be replace by makeTri(2)
        }
        @Test
        public void BasicTest2(){
            assertEquals(2,TriangleArea.tArea("\n.\n. .\n. . .\n"),0.0);
        }
        @Test
        public void BasicTest3(){
            assertEquals(32,TriangleArea.tArea("\n.\n. .\n. . .\n. . . .\n. . . . .\n. . . . . .\n. . . . . . .\n. . . . . . . .\n. . . . . . . . .\n"),0.0);
        }
        @Test
        public void BasicTest4(){
            assertEquals(8,TriangleArea.tArea("\n.\n. .\n. . .\n. . . .\n. . . . .\n"),0.0);
        }
    }
}