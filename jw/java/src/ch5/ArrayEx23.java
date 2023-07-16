package ch5;

import java.util.Scanner;

public class ArrayEx23 {
/*
  영어단어 학습 프로그램

  영어단어 맞추는 문제를 출제하고
  영어단어, 영어단어의 뜻 => 배열의 요소(1차원)가 된다
 */

  public static void main(String[] args) {
    //영어단어 리스트 생성 .(2차원 배열)
    String[][] words = {
        {"chair", "의자"},
        {"computer", "컴퓨터"},
        {"float", "실수"}
    };

    //사용자로 부터 단어 문제에 대한 답을 입력 받기 위해서
    //scanner class 사용한다
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < words.length; i++) {
      System.out.printf("문제%d. %s의 뜻을 입력하세요.", i + 1, words[i][0]); //영어단어 문제 출제
      String tmp = scanner.nextLine(); // 사용자로 부터 단어뜻을 입력받음

      //정답체크
      //사용자가 입력한 답이 2차원 배열의 단어의 뜻과 동일한지 확인.
      if (tmp.equals(words[i][1])) {
        System.out.println("정답입니다");
      } else {
        System.out.println("틀렸습니다");
      }
    }
  }

}
//p.227
