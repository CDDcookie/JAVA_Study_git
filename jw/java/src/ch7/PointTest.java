package ch7;
/*
  실습시 주의사항
   현제 파일에 있는 동일한 package 내에서 Point class가 이미 존재하면
   Point class 명을 변경해서 사용

   Object 클레스를 제외한 모든 클레스의 생성자의 첫 줄에는 this() 또는 super()
   를 호출해야함
   명시적으로 호출하지않으면 , 컴파일러가 자동으로 super() 를 생성자의 첫 줄에 삽입
 */

class Point2 {

  int x;
  int y;

  //기본 생성자 없음.
  //클레스에서 생성자가 하나도 없으면 자동으로 기본생성자가 추가된다
  //현제는 매개변수가 있는 생성자가 존재하므로 ,기본생성자는 없는 상태임

  //매개변수가 있는 생성자만 있다.
  Point2(int x, int y) {
    this.x = x;
    this.y = y;
  }

  String getLocation() {
    return "x:" + x + ", y :" + y;
  }
}

class Point3D2 extends Point2 {

  int z;

  //기본생성자는 없음. (매개변수가 있는 생성자가 존재함)
  //매개변수가있는 생성자
  Point3D2(int x, int y, int z) {

    super(x, y); //에러해결 방법2번 : Point2 class에 있는 존재하는 매개변수 생성자를 사용
    this.x = x;
    this.y = y;
    this.z = z;

  }

  String getLocation() {
    return "x:" + x + ", y :" + y + ", z :" + z;
  }
}

public class PointTest {

  public static void main(String[] args) {

  }
}
