package ch5;

public class ArrayEx10 {

  /*
    버블정렬 : 연속된 두 개의 인덱스의 값을 비교해서, 큰값을 뒤로 이동.
            => 오름 차순으로 정렬
            ex. 3  4  1  5  2  =>  1  2  3  4  5 (목표!!)

                3  4  1  5  2 (0번)                [비교범위 idx 0~4]
                3  1  4  2  5 (1번 진행시 ->5는 끝남 )[비교범위 idx 0~3]
                1  3  2  4  5 (2번 진행시 ->4,5는 끝남) [비교범위 idx 0~2]
                1  2  3  4  5 (3번 진행시 ->3,4,5는 끝남) [비교범위 idx 0~1]
                1  2  3  4  5 (4번 진행시 ->2,3,4,5는 끝남) [비교범위 idx 0~0] => 비교가 끝남

   앞뒤를 행마다 비교하고 + 정렬될때까지 반복이 필요 => 2개의 반복문이 필요
   */


  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] numArr = new int[10];

    for (int i = 0; i < numArr.length; i++) {
      System.out.print(numArr[i] = (int) (Math.random() * 10)); //초기값만들기 ex. 8521968186
      /*
        정렬시작
          outer for : 정렬이 완료될때까지 반복을 제어. 비교범위를 제어
          inner for : 앞뒤의 요소값을 비교하여 큰 값을 뒤로 이동 (각행)
      */

    }
    System.out.println();
    for (int i = 0; i < numArr.length - 1; i++) {  //outer for // 비교하는 ind값이 줄어드는것
      /*
      -1은 처음 시작시  50번째 줄에서보면 j+1이라서 4번째랑 4+1번째
       위에서 3  4  1  5  2 (0번)  [비교범위 idx 0~4] 이걸보면 사실 마지막2는 비교할필요가 없어서
       */
      boolean changed = false;
      //정렬이 발생한 경우인가?? false이면 정렬이 끝났다는것

      for (int j = 0; j < numArr.length - 1 - i; j++) {//inner for // -i 가 비교범위가 줄어드는것
        /*
        numArr.length - 1 - i
        10  -1 -0 =>9
        j < numArr.length - 1 - i 를 만족하는 j는 8
        012345678 까지 비교

         */
        if (numArr[j] > numArr[j + 1]) {                //요소 앞 뒤랑 비교하기
          int temp = numArr[j];       //큰값인 원본데이터를 백업
          numArr[j] = numArr[j + 1];  //뒤쪽요소의 값을 앞 요소 값으로 이동
          numArr[j + 1] = temp;       //뒤쪽요소의 값을 큰 값인 앞쪽 요소의 값으로 초기화
          changed = true;                               //=>정렬이 발생했는걸 알리는 flag를 기록

        }//if
      }//inner for

      if (!changed) { //정렬이 끝나고나서 체크하기 ->changed = true; 였으면 ! 떔에 false가되어 break안함
        break;
      }

      for (int k = 0; k < numArr.length; k++) { //정렬 단계별로 출력함, 과정을 모니터링하는거
        System.out.print(numArr[k]);
      }
      System.out.println(); //값 정렬과정을 구분하기위한 개행
    }
  }
}
