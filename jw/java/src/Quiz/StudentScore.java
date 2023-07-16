package Quiz;

class Student {

  String name;
  int math;
  int kor;
  int eng;
  int sum;
  float average;
}

public class StudentScore {

  public static void main(String[] args) {
    Student[] score = new Student[3];

    score[0] = new Student();
    score[1] = new Student();
    score[2] = new Student();

    score[0].name = "A학생";
    score[0].kor = 70;
    score[0].eng = 80;
    score[0].math = 75;

    score[1].name = "B학생";
    score[1].kor = 70;
    score[1].eng = 90;
    score[1].math = 85;

    score[2].name = "C학생";
    score[2].kor = 70;
    score[2].eng = 90;
    score[2].math = 75;

    int korTotal = 0, engTotal = 0, mathTotal = 0;
    int sum = 0;
    int mathsum = 0;
    int korsum = 0;
    int engsum = 0;
    float avg = 0.0f;
    //과목별 총점 변수만들기

    System.out.println("  이름   국어  영어  수학  총점  평균");

    for (int i = 0; i < score.length; i++) {
      System.out.printf("\n %1s ", score[i].name);
      System.out.printf("%5d", score[i].kor);
      System.out.printf("%5d", score[i].eng);
      System.out.printf("%5d", score[i].math);

      score[i].sum = score[i].kor + score[i].eng + score[i].math;
      score[i].average = score[i].sum / score.length;

      ////sum += score[0];  ////
      ////System.out.printf("%7d", sum);
      // avg = sum / (float) score.length; //뒤의 score[i].length 는 과목수, 실수가 되야해서 변환도 해줌
      System.out.printf("%5d %5.1f%n", score[i].sum,
          score[i].average); //학생의 총점과 평균을 입력 //%5.1f 소숫점 1자리 까지만

    }

    for (int i = 0; i < score.length; i++) {

      //과목별 총점구하기
      korTotal += score[i].kor;
      engTotal += score[i].eng;
      mathTotal += score[i].math;

      //sum += score[j]; // 이게 안되는건,,
      //System.out.println(score[j]); -> score[1] score[2] score[3]안에는 주소값만 들어있다
      //                                 그 안의 인스턴스에 접근을 해야한다

    }

    System.out.println("=========================");
    System.out.printf(" 총점: %5d %4d %4d%n", korTotal, engTotal, mathTotal);
  }
}

