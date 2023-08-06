//package ch7;
//
///*[]
//1.상속관계
//2.부모와 자식관계에서
//ㄴ2.1맴버변수가 이름이 동일한 경우
//    - 참조변수가 부모인 경우 => 부모의 맴버변수
//    - 참조변수가 자식인 경우 => 자식의 맴버변수
//    ㄴ-->>맴버볌수는 덮어써지고
//ㄴ2.2오버라이드 된 메소드가 있는경우
//    - 참조변수가 부모인 경우 => 자식의 오버라이드 메소드
//    - 참조변수가 자식인 경우 => 자식의 오버라이드 메소드
//    ㄴ-->>메소드는 덮어써지고
// */
//
//
////부모 class 만들기
//class Parent2 {
//
//  int x = 100; //2.1의 케이스인 =>인스턴스변수
//
//  void method() { //2.2의 케이스
//    System.out.println("Parent Method");
//  }
//
//}
//
////자식 class 만들기
//class Child2 extends Parent2 {
//
//  int x = 200; //2.1의 케이스인 =>인스턴스변수
//
//  //위의 조건을 이용해서 객체를 생성
//  //자식객체를 생성하는데, 부모타입과 자식타입 각각생성
//  //=>동일한 객체이지만, 참조변수의 타입이 부모, 자식의 경우.
//  public class BindingTest {
//
//    public static void main(String[] args) {
//
//      Parent2 p = new Child2();
//      //부모타입의 자식객체
//      Child2 c = new Child2();
//      //자식타입의 자식객체
//
//      //참조변수를 이용해서 위의 2.1, 2.2의 조건을 실행
//
//      //참조변수가 부모타입
//      System.out.println("p.x(부모) = " + p.x);
//      p.method();
//
//      //참조변수가 자식타입
//      System.out.println("c.x(자식) = " + c.x);
//      c.method(); //<<--오버라이드 된것
//    }
//
//    void method() {  //2.2의 케이스인 => 메소드 오버라이딩
//      System.out.println("Chile Method");
//    }
//
//  }
//}
