package studyJava2;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    while (a <= b) {           // 계속 반복할 조건
      if (a % 2 == 0) {
        System.out.println(a);
        b--;
      }
      b--;
    }
  }
}
