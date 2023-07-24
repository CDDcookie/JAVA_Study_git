package studyJava;

import java.util.Scanner;

public class UbClass03 {
  int n = 10;

  int aMethod3(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    UbClass03 jjw3 = new UbClass03();
    int i = jjw3.aMethod3(n);
    System.out.println(i);
  }
}

