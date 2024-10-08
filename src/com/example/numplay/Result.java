package com.example.numplay;

import java.util.ArrayList;
import java.util.List;

public class Result {

    Compare compare = new Compare();
    int count = 0;

    List<Integer> gameResults = new ArrayList<>();

    // 스트라이크, 볼, 아웃 출력
    public String result(List<Integer> computer, List<Integer> player) {
        int total = compare.total(computer, player);
        int strike = compare.strike(computer, player);
        int ball = total - strike;

        if (total == 0) {
            count += 1;
            return "아웃";
        } else if (strike == 0) {
            count += 1;
            return ball + "볼";
        } else if (strike == computer.size()) {
            count += 1;
            System.out.println("정답입니다. 축하합니다!");

            addResult(count);

            count = 0;
            return strike + "스트라이크";
        } else if (ball == 0) {
            count += 1;
            return strike + "스트라이크";
        }

        count += 1;
        return strike + "스트라이크 " + ball + "볼 ";
    }

    // 결과 저장
    private void addResult(int count) {

        gameResults.add(count);

    }

    // 저장된 결과 출력
    public void showResult() {
        if(gameResults.isEmpty()){
            System.out.println("기록이 없습니다.");
        }
        else{
            for (int i = 0; i < gameResults.size(); i++) {
                System.out.println((i + 1) + "번째 게임 : 시도 횟수 - " + gameResults.get(i));
            }
        }
    }
}
