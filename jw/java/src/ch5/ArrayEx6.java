package ch5;

public class ArrayEx6 {
/*
  최대값,최소값 구하기
  임의의 값으로 설정한 후 배열의  전체 요소의 값과 모두 비교를 하면된다
 */

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] score = {79, 88, 91, 33, 100, 55, 95};

    int max = score[0]; // 자기자신보다 큰 값으로 계속저장
    int min = score[0]; // 자기자신보다 작은 값으로 계속저장

    //각 요소와 비교
    for (int i = 1; i < score.length; i++) {
      if (score[i] > max) {
        max = score[i];
      } else if (score[i] < min) {
        min = score[i];
      }
    }
    /*
      for문의 i로 0~5 번째까지 다 돌아가고
      자기자신[0번]보다 크면(=true면) max값에 저장하고 아니면
      자기자신[0번]보다 작으면 (=true면) min값에 저장한다 그것도아니면 그냥 넘어가서
      다음 i번인 [1번]

     */

    System.out.println("최대값 :" + max);

    System.out.println("최소값 :" + min);
  }

}
