package com.example.numplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNum {

    // 랜덤 숫자 생성
    public int randomNum() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    // 랜덤 숫자 생성하고 리스트에 넣기
    public List<Integer> create(int digit) {

        List<Integer> comNum = new ArrayList<Integer>();

        while (comNum.size() < digit) {
            int randomNum = randomNum();

            if (comNum.contains(randomNum)) {
                continue;
            } else {
                comNum.add(randomNum);
            }
        }


        return comNum;

    }


}
