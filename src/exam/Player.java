package exam;

import java.util.Scanner;

public class Player {

    public String[] playerName;

    Player(int playerNum){

        playerName = new String[playerNum];

        for (int i = 0 ; i < playerNum; i++){
            System.out.print("참가자의 이름을 입력하세요>> ");
            Scanner inputName = new Scanner(System.in);
            playerName[i] = inputName.next();
        }

    }

    String sayWord(int i){
        String word;

        System.out.print(playerName[i] + ">> ");
        Scanner inputWord = new Scanner(System.in);

        word = inputWord.next();

        return word;
    }

    boolean succeed(String word, String checking){

        int lastIndex = word.length() -1;
        char lastChar = word.charAt(lastIndex);

        char firstChar = checking.charAt(0);

        if (lastChar == firstChar) {
            return true;
        }
        return false;
    }

}
