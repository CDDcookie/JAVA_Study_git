package studyJava;

import java.util.Scanner;

public class StudyJava5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    while (true) {
      System.out.println("----------------");
      System.out.println("1입력시 점수입력");
      System.out.println("2입력시 종료 ");
      System.out.println("----------------");
      System.out.println();

      int start = sc.nextInt();

      if (start == 1) {
        System.out.print("점수입력:");

        int score = sc.nextInt();
        if (90 < score && score <= 100) {
          if (95 < score) {
            System.out.println("A+");
          } else {
            System.out.println("A");
          }

        } else if (score > 80 && score <= 90) {
          if (85 < score) {
            System.out.println("B+");
          } else {
            System.out.println("B");
          }


        } else if (score > 70 && score <= 80) {
          if (75 < score) {
            System.out.println("C+");
          } else {
            System.out.println("C");
          }

        } else {
          System.out.println("D");
        }


      }
      if (start == 2) {
        System.out.println("종료합니다");
        break;
      }
    }
  }
}
