package studyJava;

import java.util.Arrays;

public class StudyJava26 {

  public static void main(String[] args) {
    int[] arr = new int[5];


    for(int i=0;i<5 ;i++ ){
//      double a=0;
//      a=Math.random();
//      int b = (int)(a*10);
//
//      arr[i]=b;

      arr[i] = (int)(Math.random()*10);

    }
    System.out.println(Arrays.toString(arr));

  }

}
