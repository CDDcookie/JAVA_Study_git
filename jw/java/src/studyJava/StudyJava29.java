package studyJava;

import java.util.Arrays;

public class StudyJava29 {

  public static void main(String[] args) {
    int[] arr = {5, 7, 8, 1, 3, 6};
    int[] arr1 = new int[2];
    int a =0;
    int b =0;

    for (int i=0 ; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        a++;
      } else {
        b++;
      }
    }

    arr1[0] = a;
    arr1[1] = b;
    System.out.println(Arrays.toString(arr1));
  }
}
