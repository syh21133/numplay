package com.example.numplay;

import java.util.List;

public class Result {

    Compare compare = new Compare();

    public String result(List<Integer> computer, List<Integer> player) {
        int total = compare.total(computer, player);
        int strike = compare.strike(computer, player);
        int ball = total - strike;

        if (total == 0) {
            return "낫싱";
        } else if (strike == 0) {
            return ball + "볼";
        } else if (strike == 3) {
            System.out.println("정답입니다. 축하합니다!");
        } else if (ball == 0) {
            return strike + "스트라이크";
        }


        return strike + "스트라이크" + ball + "볼 ";
    }


}
