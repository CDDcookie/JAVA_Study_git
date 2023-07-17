package studyJava;

import java.util.Scanner;

public class StudyJava2 {

  public static void main(String[] args) {

//    int a =sc.nextInt();
//
//
    Scanner sc = new Scanner(System.in);

    System.out.print("x값입력: ");
    String strX =sc.nextLine();
    int x = Integer.parseInt(strX);

    System.out.print("y값입력: ");
    String strY =sc.nextLine();
    int y = Integer.parseInt(strY);

    int result =x+y;
    System.out.println("x+y :" + result);
    System.out.println();

    while (true) {
      System.out.print("입력문자열: ");
      String data = sc.nextLine();
      if(data.equals("q")){
        break;
      }
      System.out.println("출력문자열: " + data);
      System.out.println();

    }
    System.out.println("종료");
  }
}
