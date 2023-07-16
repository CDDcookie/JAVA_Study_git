package ch7;

/*
 [ final ]
변수에 final 을 사용하면 -> 상수가 되는데 ->상수는 선언과 동시에 초기화해서
생성자를 통해서 상수를 초기화 하는 예제를 통해서
특징: 생성된 객체별로 상수의 초기화 값을 모두 다르게할수있다
 */

class Card2 {

  static int width = 100;
  static int height = 250;
  //상수 선언, 초기화는 하지 않음
  final int NUMBER;
  final String KIND;

  //매개변수가 있는 생성자
  //초기화 하지 않은 상수를 생성자에게 초기화함
  //생성자는 객체생성시 한 번만 호출됨으로
  //생성자를 통해서의 상수의 초기화는 단 한번만 가능
  Card2(String kind, int number) {
    KIND = kind;
    NUMBER = number;
  }

  //기본생성자
  Card2() {
    this("DIAMOND", 1);
  }


  //카드정보 출력하는 매소드
  //Object class의 toString 매서드를 재정의 한것이다 => 즉 오버라이딩 한것
  public String toString() {
    return "카드 무늬 : " + KIND + ", 카드 번호 : " + NUMBER;
  }

}

public class Final {

  public static void main(String[] args) {

    Card2 c = new Card2("HEART", 13);
    //상수를 출력
    System.out.println(c.KIND);
    System.out.println(c.NUMBER);
    System.out.println(c);

    Card2 c2 = new Card2("DIAMOND", 7);

    System.out.println(c2.KIND);
    System.out.println(c2.NUMBER);
    System.out.println(c2);
  }

}
