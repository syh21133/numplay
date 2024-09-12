package com.example.numplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RandomNum randomNum = new RandomNum();
        Inputnum inputnum = new Inputnum();
        Result numResult = new Result();

        Scanner scanner = new Scanner(System.in);
        List<Integer> platNum = new ArrayList<>();

        String result = "";

        List<Integer> ranNum = randomNum.create();
        System.out.println(ranNum);
        while (!result.equals("3스트라이크")) {

            System.out.println("숫자를 입력해주세요.");
            String input = scanner.next();

            if(Inputnum.isVaild(input)){
                continue;
            };

            result = numResult.result(ranNum, inputnum.playerNumber(input));

            System.out.println(result);
        }


    }
}