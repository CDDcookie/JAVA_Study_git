package studyJava;

import java.util.Scanner;

public class StudyJava6 {
  public static void main(String[] args) {

    System.out.print("1부터6까지의 정수입력 : ");
    Scanner start = new Scanner(System.in);
    int A = start.nextInt();

    switch (A){
      case 1:
        System.out.println("1입력했습니다");
        break;
      case 2:
        System.out.println("2입력했습니다");
        break;
      case 3:
        System.out.println("3입력했습니다");
        break;
      case 4:
        System.out.println("4입력했습니다");
        break;
      case 5:
        System.out.println("5입력했습니다");
        break;
      case 6:
        System.out.println("6입력했습니다");
        break;
    }
  }
}
