package ch7;

class Parent {

  int x = 10;
}

class Child extends Parent {

  int x = 20;

  void method() {
    System.out.println("x=" + x); //아무것도 안쓰면 나 child클래스의 x라 20
    System.out.println("this.x=" + this.x); //나 child클래스의 x라 20
    System.out.println("super.x=" + super.x); //Parent 클래스의 x라 10
  }
}

public class SuperTest {

  public static void main(String[] args) {

  }

}
