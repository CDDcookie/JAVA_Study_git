package ch5;

class ArrayEx18 {

  public static void main(String[] args) {
    //2차원 배열의 요소는 1차원 배열이다, 각 행은 하나하나가 1차원배열이다
    //요소가 1차원 배열의 갯수가 4개이다 => 이걸 행이라 해서 4행
    //각 요소가 1차원 배열의 요소가 3개 => 이걸 열이라 해서 3열
    int[][] score = {
        {100, 100, 100}
        , {20, 20, 20}
        , {30, 30, 30}
        , {40, 40, 40}
    };
    int sum = 0;

    //반복 조건을 이해하려면 => 그림5.5 가 기준이다
    for (int i = 0; i < score.length; i++) {     //각행의 배열의 시작 주소를 관리하는 배열
      for (int j = 0; j < score[i].length; j++) { //각향의 열 안에 열값들을 관리하는 배열
        System.out.println(score[i][j]);
      }//inner 각행의 반복요소를 반복
    }//outer 전체 행을 반복

    int tot = 0;
    //2차원 배열에서 각 요소는 1차원 배열이다
    for (int[] tmp : score) {   //score은 2차원배열이고 2차원 배열에서 각 요소를 접근. 각 요소가 1차원 배열이다 그걸저장하기위해 []를 쓴것
      //나온 1차원 배열에서 요소값을 추출한다
      for (int i : tmp) {   //더하니까 위에 변수만들고//tmp라는건 2차원의 배열에서 추출한 요소(1차원의배열)에서 각 요소(int,정수)를 추출
        tot += 1;
      }
    }
    System.out.println("total : " + tot);
  }
}//p.218