package com.example.numplay;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.isNaN;

public class Inputnum {

    public static boolean isVaild(String input) {
        if (input.length() != 3) {
            System.out.println("잘못 입력하셨습니다.");
            return true;
        } else if (input.substring(0, 1).equals(input.substring(1, 2)) || input.substring(0, 1).equals(input.substring(2, 3)) || input.substring(1, 2).equals(input.substring(2, 3))) {
            System.out.println("잘못 입력하셨습니다.");
            return true;
        }

        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("잘못 입력하셨습니다.");
            return true;
        }


        return false;
    }

    public List<Integer> playerNumber(String input) {

        List<Integer> playerNum = new ArrayList<>();

        for (String number : input.split("")) {
            playerNum.add(Integer.parseInt(number));
        }

        return playerNum;

    }
}
