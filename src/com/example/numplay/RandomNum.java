package com.example.numplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNum {

    public int randomNum() {
        Random random = new Random();
        return random.nextInt(9)+1;
    }

    public List<Integer> create(){

        List<Integer> comNum = new ArrayList<Integer>();

        while(comNum.size()<3){
            int randomNum = randomNum();

            if(comNum.contains(randomNum)){
                continue;
            }
            else{
                comNum.add(randomNum);
            }
        }


        return comNum;

    }


}
