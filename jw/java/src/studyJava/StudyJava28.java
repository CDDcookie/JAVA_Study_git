package studyJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudyJava28 {

  public static void main(String[] args) {

    String[] str = {"We", "are", "the", "world"};
    int[] answer = new int[str.length];

    for (int i = 0; i < str.length; i++) {
      answer[i]= str[i].length();


    }

    System.out.println(Arrays.toString(answer));

//      System.out.println(Arrays.toString(str[i].length()));
//      System.out.print(str[i].length());

//
//    for (int i = 0; i < str.length; i++) {
//      System.out.println(Arrays.toString(str[i].length()));
////      System.out.print(str[i].length());
//    }

  }
}