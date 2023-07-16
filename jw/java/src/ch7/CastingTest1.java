package ch7;

class Car {

  String color;
  int door;

  void drive() {
    System.out.println("drive~~~");
  }

  void stop() {
    System.out.println("stop!!!");
  }
}

class FireEngine extends Car {

  void water() {
    System.out.println("water))))");
  }
}


public class CastingTest1 {

  public static void main(String[] args) {
    Car car = null; // 부모
    FireEngine fe = new FireEngine(); //자식1
    FireEngine fe2 = new FireEngine(); //자식2

    //상속관계를 활용하여
    //자식이 부모의 속성 및 기능을 사용
    fe.water(); //???????????????????????????????????????????????????????????????????????

    //부모와 자식관의 객체를 타입형변환
    //업케스팅 : 형변환 생략가능
    //다운케스팅 : 형변환 필수

    //부모로 <- 자식이
    car = fe;
    car = (Car) fe; //형변환 적어도 되긴된다.

    //자식으로 <- 부모를
    //fe2 =car; // ERROR
    fe2 = (FireEngine) car; //다운케스팅의 경우 형변환이 필수다

    fe2.water();

  }
}
