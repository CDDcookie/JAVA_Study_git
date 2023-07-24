package studyJava;

import java.util.Scanner;

public class UbClass06 {

  public void aMethod6(String a){

    for (int i = a.length()-1; i>=0; i--){
      System.out.print(a.charAt(i));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();

    UbClass06 jjw = new UbClass06();
    jjw.aMethod6(n);

  }
}
