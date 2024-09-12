package com.example.numplay;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;

public class Inputnum {

    // 유효성 검사
    public static boolean isVaild(String input, int digit) {

        // 자리수보다 더 많은 입력을 받을 시
        if (input.length() != digit) {
            System.out.println("잘못 입력하셨습니다.");
            return true;
        }

        // 숫자가 아닐시
        try {
            Integer.parseInt(input);


            // 중복숫자 입력시
            List<Integer> validNum = new ArrayList<>();

            for (String number : input.split("")) {
                validNum.add(Integer.parseInt(number));
            }
            for (int i = 0; i < validNum.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (validNum.get(j) == validNum.get(i)) {
                        i--;
                        System.out.println("중복된 숫자입니다.");
                        return true;
                    }
                }
            }


        } catch (NumberFormatException e) {
            System.out.println("잘못 입력하셨습니다.");
            return true;
        }


        return false;
    }


    // 입력받은 값 숫자로 바꾸기
    public List<Integer> playerNumber(String input) {

        List<Integer> playerNum = new ArrayList<>();

        for (String number : input.split("")) {
            playerNum.add(Integer.parseInt(number));
        }


        return playerNum;

    }
}
