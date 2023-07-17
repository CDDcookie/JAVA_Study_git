package studyJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudyJava20 {

  public static void main(String[] args) {
//    int[] a = new int[5];
//    a[0] = 1;
//    a[1] = 2;
//    a[2] = 3;
//    a[3] = 4;
//    a[4] = 5;
//
//    System.out.println(a[0]);
//    System.out.println(a[1]);
//    System.out.println(a[2]);
//    System.out.println(a[3]);
//    System.out.println(a[4]);
//  }

    int[] a = new int[5];
    for (int i = 0; i < 5; i++) {
      a[i]=i+1;
//      System.out.println(a[i]);

    }
    System.out.println(Arrays.toString(a));
    System.out.println(a);
  }
}
