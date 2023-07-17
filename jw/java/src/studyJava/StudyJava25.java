package studyJava;

import java.util.Arrays;

public class StudyJava25
{
  public static void main(String[] args) {
  int[] arr = {1,5};
//    System.out.println(Arrays.toString(arr));

    int tmp = arr[0];
    arr[0]=arr[1];
    arr[1]= tmp;

    System.out.println(Arrays.toString(arr));

  }

}
