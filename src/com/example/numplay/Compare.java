package com.example.numplay;

import java.util.List;

public class Compare {

    // 랜덤숫자와 입력받은 숫자 비교
    public int total(List<Integer> computer, List<Integer> player) {
        int result = 0;

        for (int i = 0; i < player.size(); i++) {
            if (computer.contains(player.get(i))) {
                result += 1;
            }
        }
        return result;
    }

    // 같은 위치에 있는지 비교
    public int strike(List<Integer> computer, List<Integer> player) {
        int strike = 0;

        for (int i = 0; i < player.size(); i++) {
            if (computer.get(i) == player.get(i)) {
                strike += 1;
            }

        }
        return strike;
    }
}
