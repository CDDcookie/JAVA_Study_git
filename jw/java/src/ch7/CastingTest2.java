package ch7;

/////////////////////////////??????????????????????????????????????????????????????????/
class Car2 {

  String color;
  int door;

  void drive() {
    System.out.println("drive~~~");
  }

  void stop() {
    System.out.println("stop!!!");
  }
}

class FireEngine2 extends ch7.Car2 {

  //인스턴스 메소드
  void water() {
    System.out.println("water))))");
  }
}

/*
  [객체간의 캐스팅 예제]
  -부모타입으로 여러자식을 하나의 타입으로 형변환 가능
   부모타입으로 형변환되면, 여러 자식의 타입을 포함하는 논리적인 형태 => 다형성을 의미
  -캐스팅을 할경우
    ㄴ 업케스팅,다운케스팅시 반드시 쌍방(부모와 자식)의 객체가 각각 실존하는지가 중요함
  -현제예제는 부모와 자식의 객체가 실존하는 경우에 대한것

  -대표적으로 발생하는 에러가 ClassCastException 인데
   이 에러발생 타이밍이 실행할떄이다 => 코드레벨에서는 에러가 발생하지않는다 =>실행하니까 에러!!

 */


public class CastingTest2 {

  public static void main(String[] args) {
    Car2 car = new Car2(); //부모객체 생성

    FireEngine2 fe2 = null;  //자식은 객체를 생성하지 않으상태
    car.drive();

    fe2 = (FireEngine2) car; //다운케스트함 -> 코드레벨에선 에러가 안뜸
    //결론은 이 객체를 만들지 않은 상태에서 down casting 하려고 하기 때문이다
    fe2.water();
    //원인 해결을 한 코드로 다시 작성ㅎ해서 테스트한다
    FireEngine2 fe3 = new FireEngine2();
    car = fe3;
    fe3 = (FireEngine2) car;
    fe3.water();
  }

}
