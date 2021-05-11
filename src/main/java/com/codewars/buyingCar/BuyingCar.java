package com.codewars.buyingCar;

public class BuyingCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        double oldCarPrice = startPriceOld;
        double newCarPrice = startPriceNew;
        double percentLoss = percentLossByMonth;
        int moneySaved = 0;
        int month = 0;

        while(oldCarPrice + moneySaved < newCarPrice){
            month++;
            if(month % 2 == 0 && month != 0) percentLoss += 0.5;
            oldCarPrice *= ((100 - percentLoss) / 100);
            newCarPrice *= ((100 - percentLoss) / 100);
            moneySaved += savingperMonth;
        }
        return new int[]{month, (int) Math.round(moneySaved + oldCarPrice - newCarPrice)};
    }
}
