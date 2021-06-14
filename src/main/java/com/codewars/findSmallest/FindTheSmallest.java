package com.codewars.findSmallest;

public class FindTheSmallest {
    public static long[] smallest(long n) {
        long[] result = new long[3];
        String digits = String.valueOf(n);
        for (int i = 0; i < digits.length(); i++) {

            //fixme
            int smallestDigit = findSmallestDigit(digits, i);
            if(smallestDigit < Integer.parseInt(String.valueOf(digits.charAt(i))))  {
                if(digits.indexOf(Integer.toString(smallestDigit)) == 1)
                {
                    StringBuilder sb = new StringBuilder(digits);
                    sb.delete(digits.indexOf(Integer.toString(smallestDigit)),digits.indexOf(Integer.toString(smallestDigit)) + 1);
                    sb.insert( i, (char)(smallestDigit + '0'));
                    result[0] = Long.parseLong(sb.toString());
                    result[1] = i;
                    result[2] = digits.indexOf(Integer.toString(smallestDigit));
                } else {
                    StringBuilder sb = new StringBuilder(digits);
                    sb.delete(digits.indexOf(Integer.toString(smallestDigit)),digits.indexOf(Integer.toString(smallestDigit)) + 1);
                    sb.insert( i, (char)(smallestDigit + '0'));
                    result[0] = Long.parseLong(sb.toString());
                    result[1] = digits.indexOf(Integer.toString(smallestDigit));
                    result[2] = i;
                }
                return result;
            }
        }

        return new long[]{n,0,0};
    }

    private static int findSmallestDigit(String digits, int start){
        int smallestNumber = Integer.parseInt(String.valueOf(digits.charAt(start)));
        for (int i = start; i < digits.length(); i++) {
            int numberToCompare = Integer.parseInt(String.valueOf(digits.charAt(i)));
            if(numberToCompare < smallestNumber) smallestNumber = numberToCompare;
        }
        return smallestNumber;
    }
}
