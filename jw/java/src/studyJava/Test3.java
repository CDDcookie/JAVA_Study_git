package studyJava;

import java.util.Scanner;

public class Test3 {

  public static void main(String[] args) { //퍼블릭'클레스' 밑에 main'메소드' 부분은 특별하게 '실행'을 시켜준다
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;

    for (int i = 0; i < n + 1; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
  }
}
