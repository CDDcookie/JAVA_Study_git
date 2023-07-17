package studyJava;

import java.util.Scanner;

public class StudyJava4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
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
}
