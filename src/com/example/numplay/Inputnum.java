package com.example.numplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inputnum {

    public List<Integer> playerNumber(String input){

        List<Integer> playerNum = new ArrayList<>();

        for(String number: input.split("")){
            playerNum.add(Integer.parseInt(number));
        }

        return playerNum;

}
    }
