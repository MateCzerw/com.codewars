package com.codewars.makeAWindow;

class MakeWindow {
    static String makeAWindow(int number)
    {
        String output = "";
        //top line
        output += createLine(number);
        output += "\n";

        //window section
        output += createWindowSection(number);

        //middle line
        output += createMiddleLine(number);

        //window section
        output += createWindowSection(number);

        //bottom line
        output += createLine(number);

       return output;
    }


    private static String createMiddleLine(int number) {
        String output = "";
        output += "|";
        for (int i = 1; i <= number; i++) {
            output += "-";
        }
        output += "+";
        for (int i = 1; i <= number; i++) {
            output += "-";
        }
        output += "|\n";
        return output;
    }

    private static String createLine(int number) {
        String output = "";
        for (int i = 1; i <= 3 + 2 * number; i++) {
            output += "-";
        }
        return output;
    }

    private static String createWindowSection(int number) {
        String output = "";

        for (int i = 1; i <= number; i++) {
            //row
            output += "|";
            for (int j = 1; j <= number; j++) {
                output += ".";
            }
            output += "|";
            for (int j = 1; j <= number; j++) {
                output += ".";
            }
            output += "|\n";
        }
        return output;
    }
}
