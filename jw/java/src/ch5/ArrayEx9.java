package ch5;

import java.util.Arrays;

public class ArrayEx9 {

  /*
    두개의 배열을 활용하여 임의의 데이터가 저장되도록 하나의 배열에 값을 저장
    A 배열: 값을 초기화함
    B 배열: 임의의 index를 가지고 A배열의 요소 접근해서 그 값을 저장해서 사용
   */

  public static void main(String[] args) {
    int[] code = {-4, -1, 3, 6, 11};
    int[] arr = new int[10]; //위의 5개를 아랭의 10자리빈칸에 넣기

    for (int i = 0; i < arr.length; i++) {
      int tmp = (int) (Math.random() * code.length);
      arr[i] = code[tmp];
    }
    System.out.println(Arrays.toString(arr));
  }

}