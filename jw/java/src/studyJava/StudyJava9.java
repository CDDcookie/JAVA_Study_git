package studyJava;

import java.util.Scanner;

public class StudyJava9 {

  public static void main(String[] args) {

//    int sum = 0;
//
//    for (int i = 1; i < 11; i++) {
////      sum = sum + i;
//      sum += i;
//    }
//    System.out.println(sum);


    int sum=0;
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    for(int i=1;i<a+1 ;i++ ){

      sum=sum+i;

    }
    System.out.println(sum);

  }
}

