package Quiz.ver2;

public class Student {//이건 아래의 main 을 돌리기위한 클레스이다

  private String name;
  private int math;
  private int kor;
  private int eng;
  private int sum;
  private float average;

  Student(String name, int math, int eng, int kor) {
    //생성자는 객체를 만드는게아니고 초기화를시켜주는것=> 초기화는 객체생성에 필수적인 데이터를 넣어주는과정

    this.name = name;
    //this.name은 나자신 이고 =name부분은 위에 Student(String name, int math, int eng, int kor)
    //에서받은 인자값이다
    this.math = math;
    this.kor = kor;
    this.eng = eng;

    this.sum = math + eng + kor;
    this.average = (float) (sum / 3.0);

  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    this.sum = sum;
  }

  public float getAverage() {
    return average;
  }

  public void setAverage(float average) {
    this.average = average;
  }
}

class Student2 {

  public static void main(String[] args) { //psvn 여기가 구동을 하는부분
    Student[] score = new Student[3];
    //Student[] score -> Student클레스 타입의 참조변수 score를 선언
    //score = new Student[] -> Student[0]~Student[2]의 Student객체생성
    //위의 class Student에 해당변수들이랑 메서드 들이 들어있다

    score[0] = new Student("A학생", 80, 70, 30);
    //'new'가 객체를 만들어주는거고 Student("A학생", 80, 70, 30);은 score[0]에 넣을 인자들을 주는것
    score[1] = new Student("B학생", 60, 50, 90);
    score[2] = new Student("C학생", 90, 70, 60);

    int korTotal = 0, engTotal = 0, mathTotal = 0;
    int sum = 0;
    int mathsum = 0;
    int korsum = 0;
    int engsum = 0;

    System.out.println("  이름   국어  영어  수학  총점  평균");
    System.out.println("==================================");

    for (int i = 0; i < score.length; i++) {
      System.out.printf("\n %1s ", score[i].getName());
      System.out.printf("%5d", score[i].getKor());
      System.out.printf("%5d", score[i].getEng());
      System.out.printf("%5d", score[i].getMath());

      score[i].setSum(score[i].getKor() + score[i].getEng() + score[i].getMath());
      score[i].setAverage(score[i].getSum() / score.length);

      System.out.printf("%5d %5.1f%n", score[i].getSum(),
          score[i].getAverage());

    }
    for (int i = 0; i < score.length; i++) {
      korTotal += score[i].getKor();
      engTotal += score[i].getEng();
      mathTotal += score[i].getMath();
    }
    System.out.println("==================================");
    System.out.printf(" 총점: %5d %4d %4d%n", korTotal, engTotal, mathTotal);
  }
}









/*
class Student2 {

  public static void main(String[] args) {
    Student student = new Student();
    student.name = "hong";
    student.math = 10; //이건 직접 필드에 접근하는건데 차음에 private로 막아 둔거라 그냥은 접근못한다
    student.setMath(10); //이렇게 set을 써서 넣는게 가능하다
    student.setEng(89);
//넣는건 set 가져오는건 get

  }


}

 */