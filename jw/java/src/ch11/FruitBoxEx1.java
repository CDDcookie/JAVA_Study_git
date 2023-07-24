//package ch11;
//import java.util.*;
///*
//  지네릭 클래스의 객체 생성시 고려사항
//  1. 참조변수의 타입변수와 생성자의 타입변수는 동일해야한다
//  2. 상속관계
//    2.1-row type 에 대한 상속 : O (다형성이 적용, 생성하는 객체를 부모타입으로 한다.)
//    2.2-타입 변수 에서의 상속
//     ㄴ참조변수의 타입변수와 생성자의 타입변수가 동일하면 : O
//     ㄴ참조변수의 타입변수와 생성자의 타입변수가 다르다면 : X
//
//     ArrayList<T>
//     ArrayList<Apple> : 부모인 Fruit는 저장 못함
//
//    2.3-매소드의 매개변수
//      row type 에 대한 상속과 동일
//*///------------------------------------------------------------------
//
////1.Box class 를 만듬
//class Box<T> {//이런형식이 지네릭 클레스이다
////  ArrayList<T> //element를 T로 하겠다
//    ArrayList<T> list = new ArrayList<T>();
//
//    void add(T item) { list.add(item);}
//    T get(int i) {return list.get(i);}
//    int size() {return  list.size();}
//    public String toString(){return list.toString();}
//}
//
////2.Fruit class 를 만듬
//class Fruit {
//  public String toString(){
//    return  "Fruit";
//  }
//}
//
//
////3.Apple class 를 만듬
//class Apple extends Fruit {
//  public String toString() {
//    return "Apple";
//
////4.Grape class 를 만듬
//    class Grape extends Fruit {
//
//      public String toString() {
//        return "Grape";
//      }
//    }
//
////Toy class 를 만듬
//    class Toy {
//
//      public String toString() {
//        return "Toy";
//      }
//    }
//
//    class FruitBoxEx1 {
//
//      public static void main(String[] args) {
//    /*
//    Box : row type
//    Box<Apple> : <Apple>는 참조변수의 타입변수
//    */
//
//        //1.참조변수의 타입변수와 생성자의 타입변수는 동일해야한다
//        Box<Fruit> fruitBox = new Box<Fruit>(); //Fruit 담는 Box 생성
//        Box<Apple> appleBox = new Box<Apple>();
//        Box<Toy> toyBox = new Box<Toy>();
//
//        //참조변수의 타입변수와 생성자의 타입변수는 동일하지 않음. => NG
//        //Box<Grape> fruitBox2 = new Box<Fruit>();
//
//        //2.3 메소드의 매개변수
//        //객체생성시 타입변수를 Fruit 로 했기 떄문에 메소드의 매개변수가 Fruit 타입으로 대입되었기 때문에,
//        //자식(apple,grape)을 받을 수가 있다
//        fruitBox.add(new Fruit()); //   Box<Fruit> fruitBox = new Box<Fruit>(); //Fruit 담는 Box 생성
//        fruitBox.add(new Apple()); // O
//        fruitBox.add(new Grape()); // O
//        //~~ VS ~~//
//        appleBox.add(new Apple()); // o Box<Apple> appleBox = new Box<Apple>(); 이걸로 생성된거라 됨
//        appleBox.add(new Grape()); // x
//        fruitBox.add(new Fruit()); // x
//
//        toyBox.add(new Toy());
//        toyBox.add(new Apple()); //   x 타입이 달라서
//
//        System.out.println(fruitBox); //Fruit,Apple,Grape 출력
//        System.out.println(appleBox); //Apple 출력
//        System.out.println(toyBox);   //Toy 출력
//
//      }
//
//    }
//  }}