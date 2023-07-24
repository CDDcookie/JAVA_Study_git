package studyJava;

import java.util.Scanner;

public class UbClass05 {

  String aMethod5(String a) {
    String a2 = a.toUpperCase();

    return a2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();

    UbClass05 jjw = new UbClass05();
    String jjwprint = jjw.aMethod5(n);
    System.out.println(jjwprint);
  }
}
