package ch7;

/*
  관계를 맺어줄때
    is-a 관계: '상속' extends 사용
    has-a 관계: '포함' 인스턴스 변수형태로 가지게끔.
 */


/////////////////////////Shape 면
class Shape {

  String color = "green"; //인스턴스변수를 선언과 동시에 초기화함

  void draw() {
    System.out.println("color :" + color);
  }
}

////////////////////////Point 점
class Point {

  //2차원 좌표만들기
  int x;
  int y;

  //생성자 1번 // this()는 생성자/this는 자기자신을 나타내는 참조변수(객체주소)
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  //생성자 2번    // !!!매개변수를 안넣으면 일루감
  Point() {
    this(0, 0);  // !!!->여기의 this는 바로위의 this를 가르킨다
  }

  //좌표출력메소드
  String getXY() {
    return "[x :" + x + ", y :" + y + "]";
  }
}


///////////////////////// Circle 원
/*관계설정
    원은 면이다 -> extend로
    원은 점을 가지고있다(중심점)  -> 포함관계로
 */
class Circle extends Shape {

  Point center; //중심점
  int r; //반지름
//Circle 클래스 에서 Point 타입의 center 변수와 int 타입의 r 변수가 선언되어 있습니다.


  //생성자의 역할 : 인스턴스 변수의 초기화
  //초기화 => 초기화의 block (클레스,인스턴스) => 시리얼넘버
  Circle() {
    this(new Point(0, 0), 50);
    //포함관계를 만드는과정
    //여기의 this는 Circle중 매개변수2개짜리 놈을 호출->아래의 Circle(Point center, int r)이거다
  }
  //ㄴ Point p = new Point (0,0);
  //ㄴ Circle c = new Circle( p , 50 );
  //ㄴ Circle을 만들때 Point p 라는 놈을 포함해서 만들겠다.

//Circle 클래스의 기본 생성자Circle()는 this(new Point(0, 0), 50);를 호출하고 있습니다.
//이는 매개변수가 없는 Circle 생성자를 호출할 경우, 내부적으로 Point 객체를 생성하여 center 변수에 대입하고,
//r 변수에는 50을 대입하는 역할을 합니다.
//따라서, new Circle()로 객체를 생성할 때, 중심점을 (0, 0)으로, 반지름을 50으로
//초기화한 Circle 객체가 생성됩니다.


  // 매개변수있는 생성자가 필요하다
  Circle(Point center, int r) {
    //초기화
    this.center = center;
    this.r = r;
  }

  //그리기 메소드
  void draw() {
    System.out.println("circle center :" + center.x + "," + center.y);
    System.out.println("center color :" + color);
    System.out.println("center r :" + r);
    System.out.println();
  }

}

//////////////////////// 삼각형
/*관계설정
    삼각형은 면이다 -> extend
    삼각형은 점을 가지고있다 -> 포함관계로
 */
class Triangle extends Shape {

  Point[] p = new Point[3];

  //생성자
  Triangle(Point[] p) {
    this.p = p;
  }

  //그리기
  void draw() {
    //prinfln메소드가 대표적으로 오버로딩의 예 이다
    //오버로딩은 유지보수성,가독성을 위함이다(개발생산성은x)
    System.out.println("Triangle p1 :" + p[0].x + "," + p[0].y);
    System.out.println("Triangle p2 :" + p[1].x + "," + p[1].y);
    System.out.println("Triangle p3 :" + p[2].x + "," + p[2].y);
  }
}


public class DrawShape {

  public static void main(String[] args) {

    Circle c = new Circle(new Point(150, 150), 50);
    //ㄴ Point p = new Point (150,150);
    //ㄴ Circle c = new Circle( p , 50 );
    c.draw();

    Point[] p = {
        new Point(10, 10),
        new Point(20, 20),
        new Point(30, 30)};
    Triangle t = new Triangle(p);
    t.draw();
  }

}