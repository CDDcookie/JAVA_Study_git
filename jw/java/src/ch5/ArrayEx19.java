package ch5;

public class ArrayEx19 {
  /*
    성적관리 프로그램
    5행 3열의
    채점이 완료된 성적을 관리하는 프로그램
    각 1차원배열은 한 학생의 국,영,수 에 대한 점수이다
   */

  public static void main(String[] args) {
    int[][] score = {
        {100, 100, 100}   //A학생
        , {20, 20, 20}    //B학생
        , {30, 30, 30}    //C학생
        , {40, 40, 40}    //D학생
        , {50, 50, 50}    //E학생
    };
//과목별 총점 변수만들기
    int korTotal = 0, engTotal = 0, mathTotal = 0;

    //출력되는 결과를 리포트 형식으로 만들기
    System.out.println("번호 국어 영어 수학 총점 평균");
    System.out.println("=========================");

    for (int i = 0; i < score.length; i++) {
      int sum = 0;
      float avg = 0.0f;

      //과목별 총점구하기
      korTotal += score[i][0]; //i 는 한행 ,0 은 열(0번쨰 행->국어)
      engTotal += score[i][1]; //i 는 한행 ,1 은 열(1번쨰 행->영어)
      mathTotal += score[i][2];//i 는 한행 ,2 은 열(2번쨰 행->수학)
      //타이틀의 번호에 해당하는 값을 출력
      System.out.printf("%5d", i + 1); //0+1 1+1 이래되니 1,2,3,4,5 가나옴

      //학생별 성적출력하기
      //국어 영어 수학의 점수를 가지고 있는 1차원 배열
      for (int j = 0; j < score[i].length; j++) {
        sum += score[i][j]; //학생의 총점 계산하기 (앞에서 선언한 sum이용하기)
        System.out.printf("%5d", score[i][j]); //학생의 교과목별 성적을 출력하기
      }// 위의 과정이 끝나면 '번호,국,영,수,' 까지 나온것

      avg = sum / (float) score[i].length; //뒤의 score[i].length 는 과목수, 실수가 되야해서 변환도 해줌
      System.out.printf("%5d %5.1f%n", sum, avg); //학생의 총점과 평균을 입력 //%5.1f 소숫점 1자리 까지만


    }
    //이거를 for문 밖에서 해야했다
    System.out.println("=========================");
    System.out.printf("총점:%5d %5d %5d%n", korTotal, engTotal, mathTotal);
    //%5d 5자리칸을만들었고 앞 두자리는 공백 이고  그뒤로 3개의 변수가 들어감

  }

}
//p.218
