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

        int digit = 3;
        String result = "";
        boolean exit = true;
        List<Integer> ranNum = randomNum.create(digit);


        while(exit){

            System.out.println("환영합니다! 원하시는 번호를 입력해주세요.");
            System.out.println("0.자리수설정 1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기");
            int num = scanner.nextInt();

            switch(num) {
                case 0:
                    System.out.println("설정하고자 하는 자리수를 입력해주세요.");
                   digit = scanner.nextInt();

                   ranNum = randomNum.create(digit);
                   break;

                case 1:

//                List<Integer> ranNum = randomNum.create();
                System.out.println(ranNum);

                while (!result.equals(digit+"스트라이크")) {

                    System.out.println("숫자를 입력해주세요.");
                    String input = scanner.next();

                    if (Inputnum.isVaild(input,digit)) {
                        continue;
                    }
                    ;

                    result = numResult.result(ranNum, inputnum.playerNumber(input));
                    if(!result.equals(digit+"스트라이크")){
                    System.out.println(result);}
                }
                result = "";
                break;

                case 2:
                    // 기록보기
                    numResult.showResult();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    exit=false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");

            }


        }
    }
}