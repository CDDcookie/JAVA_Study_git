package studyJava;

import java.util.Scanner;

public class UbClass04 {

  int n = 10;

  int aMethod4(int a, int b) {

    int c = a / b;
    return c;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    UbClass04 jjw4 = new UbClass04();
    int i = jjw4.aMethod4(n1, n2);
    System.out.println(i);


  }

}

