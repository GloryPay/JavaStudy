package exam;

import java.util.Scanner;

public class WordGameApp {

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);

        System.out.print("게임에 참가하는 인원은 몇명입니까 : ");

        int playerNum = rd.nextInt();

        Player players = new Player(playerNum);

        System.out.println("시작하는 단어는 아버지입니다.");

        String preWord = "아버지";

        boolean flag = true;
        int turn = 0;

        do {
            String word = players.sayWord(turn % playerNum);

            flag = players.succeed(preWord, word);

            preWord = word;

            turn++;

        }while(flag);


    }


}
