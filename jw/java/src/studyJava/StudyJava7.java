package studyJava;

import java.util.Scanner;

public class StudyJava7 {

  public static void main(String[] args) {

    System.out.print("값입력 : ");
    Scanner sc = new Scanner(System.in);
    int A;
    A = sc.nextInt();

    if (A == 6) {
      System.out.println(6);

    } else if (A == 5) {
      System.out.println("5출력");

    } else if (A == 4) {
      System.out.println("4출력");
    } else if (A == 3) {
      System.out.println("3출력");
    } else if (A == 2) {
      System.out.println("2출력");
    } else {
      System.out.println("1출력");
    }


  }
}
