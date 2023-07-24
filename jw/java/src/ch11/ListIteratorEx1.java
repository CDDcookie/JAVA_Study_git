package ch11;

import java.util.*;
/*
  Iterator interface 구현을 Collection interface에 구현

  ArrayList 는 list interface를 구현한 클레스이고
  List interface는 Collection으로 형변환이 가능하다

  Iterator 을 사용하기위해서 Collection에 구현된 iterator() 메소드를 사용하면됨
*/

public class ListIteratorEx1 {

  public static void main(String[] args) {
    ArrayList list = new ArrayList(); //Arraylist의 특징 중복ㅇ,순서ㅇ
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");

    ListIterator it = list.listIterator();

    //순방향 탐색
    System.out.println("순방향 탐색");
    while (it.hasNext()) {
      System.out.println(it.next());

      //역방향 탐색
      System.out.println("역방향 탐색");
      while (it.hasPrevious()) {
        System.out.println(it.previous());
      }
    }
  }

}
