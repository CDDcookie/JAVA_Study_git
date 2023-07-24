//package ch11;
//
//import java.util.*;
//
//
//class Box2<T> {//이런형식이 지네릭 클레스이다
//  //  ArrayList<T> //element를 T로 하겠다
//  ArrayList<T> list = new ArrayList<T>();
//
//  void add(T item) {
//    list.add(item);
//  }
//
//  T get(int i) {
//    return list.get(i);
//  }
//
//  int size() {
//    return list.size();
//  }
//
//  public String toString() {
//    return list.toString();
//  }
//}
//
//class Fruit2 implements Eatable { //여기에 구현??
//  public String toString() {
//    return "Fruit2";
//  }
//}
//
//class Apple2 extends Fruit2 {
//
//  public String toString() {
//    return "Apple2";
//
//    class Grape2 extends Fruit2 {
//
//      public String toString() {
//        return "Grape2";
//      }
//    }
//
//    class Toy2 {
//
//      public String toString() {
//        return "Toy2";
//      }
//    }
//
//    interface Eatable {
//
//    }
///*
//     // 타입변수 선언시, 상속관계 및 인터페이스 구현에 대한 제한을 설정
//     타입 변수 T이 제한
//      -Fruit2 자신과 Fruit2 자손까지 사용 가능
//      -FruitBox2 class 는 Eatable 인터페이스를 구현 해야함
//
//      FruitBox2 는 Box2를 상속받아 구현함
//*/
////    class FruitBox2 extends Box2 {
//    class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> {
//
//    }
//
/////////////////////////////////////////////////////////////
//    public class FruitBoxEx2 {
//
//      public static void main(String[] args) {
//
//        //Fruit2 class 에 interface를 구현한 상태임.
//      FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
//      FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
//      FruitBox2<Grape2> grapeBox = new FruitBox2<Grape2>();
//
//      fruitBox.add(new Fruit2());
//        fruitBox.add(new Apple2());//메서드의 적용성이적영되서
//        fruitBox.add(new Grape2());
//        fruitBox.add(new Fruit2());
//
//        appleBox.add(new Grape());
//
//        //객체의 참조변수 타입을 부모타입으로 객체 생성하는것은 가능하다
//        Box2<Fruit2> bow =new Box2<furit>();  //low타입은 가능한데
//        Box2<Fruit2> box2 =new FruitBox2<furit>();//타입변수에 대해서선 항상 같아얗 한다
////
////        Box2<Fruit2> bow =new Box2<furit>();
////        Box2<Fruit2> bow =new Box2<furit>();
//      }
//    }