package ch5;

public class ArrayEx7 {
/*
  섞기!!
    1. 배열의 요소 초기화
    2. 섞는건 규칙적으로 섞는것이 아니기때문에 , 랜덤하게 되어야한다
      현제의 배열의 각 인덱스에 저장된 값을 임의의 인덱스에 저장이 되도록 해야한다
      -> random() 을 활용해야한다. ->여기서 현제 배열에필요한 인덱스값을 가져와야한다
      -> random()의 범위가 0.0 <= random() < 1.0 이라 나의 배열의 인덱스용 정수값이 되도록 해야한다
      -> 0.0 <= random() < 10.0 이렇게만들어야 0~9까지를 랜덤하게 생성이된다
      -> 원본 배열의 섞기를 진행하기
*/

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] numArr = new int[10]; //공간 만들기

    for (int i = 0; i < numArr.length; i++) { //초기화하기
      numArr[i] = i;
      System.out.print(numArr[i]);
    }
    System.out.println();

    //많이 섞으면 , 더 잘섞이게 된다.
    for (int i = 0; i < 100; i++) {
      int n = (int) (Math.random() * 10); //random()을 이용해서 인덱스값을 가져와야한다.//(int)로 정수화
      //저위의 n을 어따쓸까-> 현제배열에서 이동시킬 대상의 index값으로 사용

      int tmp = numArr[0];                //원본데이터는 저장해두고
      numArr[0] = numArr[n];              //이동할대상을 백업받은 자리에 덮어씀
      numArr[n] = tmp;                    //원본 데이터를 이동했던 자리에 덮어씀


    }

    for (int i = 0; i < numArr.length; i++) {
      System.out.print(numArr[i]);
    }

  }
}
