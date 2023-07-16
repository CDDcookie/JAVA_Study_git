package ch6;

class Car {

  String color;
  String gearType;
  int door;

  //기본생성자
  //Car() {}
  Car() {
    //
    //생성자 안에서 생성자 호출=>
    this("black", "manual", 6);
  }

  Car(String color) {
    this(color, "manual", 6);
  }


  //매개변수가 있는 생성자
  Car(String color, String gearType, int door) {
    this.color = color;
    this.gearType = gearType;
    this.door = door;

  }
}

public class CarTest {

  public static void main(String[] args) {
    Car c1 = new Car();
    c1.color = "white";    //<-보안문제가 있어서 사용을 많이 않한다=>그래서 생성자를사용 => 캡슐화
    c1.gearType = "auto";  //<-보안문제가 있어서 사용을 많이 않한다=>그래서 생성자를사용 => 캡슐화
    c1.door = 4;          //<-보안문제가 있어서 사용을 많이 않한다=>그래서 생성자를사용 => 캡슐화

    //인스턴스 변수를 직접초기화 하는것보다는
    //매개변수 생성자를 이용하는 것이 깔끔함
    Car c2 = new Car("white", "auto", 4);
    System.out.println("c1 객체 :" + c1.color + "," + c1.gearType + "," + c1.door);
    System.out.println("c 객체 :" + c2.color + "," + c2.gearType + "," + c2.door);
    System.out.println("c1 객체 :" + c1.color + "," + c1.gearType + "," + c1.door);
  }
}
