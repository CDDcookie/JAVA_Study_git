package ch7;
/*
  예제의 조건
  1. 상속,부모 자식 관계
  2. 참조변수,부모타입,자식타입
  3. 자식 클래스에 (동일한 이름의)맴버변수,맴버메소드가 없는 경우
 */


//부모 class 만들기
class Parent3 {

  int x = 100;

  void method() {
    System.out.println("Parent Method");
  }

}

//자식 class 만들기
//부모클레스와 동일한 이름의 맴버변수가 없는 경우
class Child3 extends Parent3 {

  int x = 200;

  void method() {
    System.out.println("Chile Method");
  }


  /////////////////////////////////////////////////////////////////////
  public class BindingTest2 {

    public static void main(String[] args) {

      Parent3 p = new Child3();
      //부모타입의 자식객체
      Child3 c = new Child3();
      //자식타입의 자식객체

      //참조변수를 이용해서 위의 2.1, 2.2의 조건을 실행

      //참조변수가 부모타입
      System.out.println("p.x(부모) = " + p.x);
      p.method();

      //참조변수가 자식타입
      System.out.println("c.x(자식) = " + c.x);
      c.method(); //<<--오버라이드 된것
    }

  }
}