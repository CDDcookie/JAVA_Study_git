//package Quiz.ver2;
//
//public class program {
//
//  public static void main(String[] args) {
//    Student[] score = new Student[3];
//
//    score[0] = new Student();  //생성된 객체를 score에 할당한다,이제 socre[]사용가능
//    score[1] = new Student();
//    score[2] = new Student();
//
//    score[0].setName("A학생");  //set이 있어서 필드에 넣을수있다
//    score[0].setKor(70);
//    score[0].setEng(80);
//    score[0].setMath(75);
//
//    score[1].setName("B학생");
//    score[1].setKor(70);
//    score[1].setEng(80);
//    score[1].setMath(75);
//
//    score[2].setName("C학생");
//    score[2].setKor(70);
//    score[2].setEng(90);
//    score[2].setMath(75);
//
//    int korTotal = 0, engTotal = 0, mathTotal = 0;
//    int sum = 0;
//    int mathsum = 0;
//    int korsum = 0;
//    int engsum = 0;
//    float avg = 0.0f;
//    //과목별 총점 변수만들기
//
//    System.out.println("  이름   국어  영어  수학  총점  평균");
//
//    for (int i = 0; i < score.length; i++) {
//      System.out.printf("\n %1s ", score[i].getName());
//      System.out.printf("%5d", score[i].getKor());
//      System.out.printf("%5d", score[i].getEng());
//      System.out.printf("%5d", score[i].getMath());
//
//      score[i].setSum(score[i].getKor() + score[i].getEng() + score[i].getMath());
//      score[i].setAverage(score[i].getSum() / score.length);
//
//      ////sum += score[0];  ////
//      ////System.out.printf("%7d", sum);
//      // avg = sum / (float) score.length; //뒤의 score[i].length 는 과목수, 실수가 되야해서 변환도 해줌
//      System.out.printf("%5d %5.1f%n", score[i].getSum(),
//          score[i].getAverage()); //학생의 총점과 평균을 입력 //%5.1f 소숫점 1자리 까지만
//
//    }
//
//    for (int i = 0; i < score.length; i++) {
//
//      //과목별 총점구하기
//      korTotal += score[i].getKor();
//      engTotal += score[i].getEng();
//      mathTotal += score[i].getMath();
//
//      //sum += score[j]; // 이게 안되는건,,
//      //System.out.println(score[j]); -> score[1] score[2] score[3]안에는 주소값만 들어있다
//      //                                 그 안의 인스턴스에 접근을 해야한다
//
//    }
//
//    System.out.println("=========================");
//    System.out.printf(" 총점: %5d %4d %4d%n", korTotal, engTotal, mathTotal);
//  }
//
//}
