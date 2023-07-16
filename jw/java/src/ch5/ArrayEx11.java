package ch5;

public class ArrayEx11 {
/*
  계수기 구현하기. 카운터기 구현하기
  ex.33542 => 배열에 저장된 '요소값' => 을 index로 활용하라 => 결과배열에 index로 활용
 */

  public static void main(String[] args) {
    int[] numArr = new int[10];
    int[] counter = new int[10]; //요소가 모두 0으로 초기화 된 상태임

    for (int i = 0; i < numArr.length; i++) {  //numArr배열에 요소를 초기화함
      numArr[i] = (int) (Math.random() * 10);  //요소값으로 사용하기위해서 난수로 생성(0~9)
      //(0~9)를 counter 배열의 index로 사용하겠다

      System.out.print(numArr[i]);
    }

    System.out.println();

    for (int i = 0; i < numArr.length; i++) {  //계수기 동작을 구현
      counter[numArr[i]]++;
    }
    for (int i = 0; i < numArr.length; i++) { // counter 배열의 요소값을 출력하면 , 카운트된 결과가 됨
      System.out.println(i + "의 개수 :" + counter[i]);
    }
  }

}
