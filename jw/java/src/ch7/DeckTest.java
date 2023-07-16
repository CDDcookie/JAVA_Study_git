package ch7;
/*
카드포커게임 만들기 구현하기 의 클레스 나구기전에 생각해보기
------------------------------------------------------------------------
====entity class 의 특징:
  -데이터적 성격이 강하다 그래서 파일 및 데이터베이스에 저장되는 데이터를 보유
  -프로그램 상에서 관리되고있는 데이터의 종류를 알수있다
  -프로그램의 기능을 분석하는데 도움이 된다
====controller class
  -프로그램 전체의 기능을 담당한다, 따라서 기능적 성격이 강하다
  -컨트롤 클래스의 흐름만 파악하면 프로그램의 전체 흐름을 파악할수있다.
------------------------------------------------------------------------
 - 카드한장한장에 대한 클레스 생각  ====>> entity class
 - 게임에 필요한 카드모두를 관리 및 제어하는 class ====>> controller class
 - 게임을 테스트하는 class
------------------------------------------------------------------------
 */


class Card {

  //카드의 무늬 종류
  final static int KIND_MAX = 4;
  //무늬별 카드수
  final static int NUM_MAX = 13;
  //무늬별 번호
  final static int SPADE = 4;
  final static int DIAMOND = 3;
  final static int HEART = 2;
  final static int CLOVER = 1;

  //인스턴스변수 (재사용성을 위하여)
  int kind;
  int number;

  //기본생성자 형태
  //기본생성자로 객체생성시 , 무조건SPADE의 1 카드로 하겠다는의미. 기본초기화
  //카드객체의 기본 초기화 방법이다
  Card() {
    this(SPADE, 1);
  }

  //매개변수가 있는 생성자 ->실제적으로 쓸떈 이거씀
  Card(int kind, int number) {
    this.kind = kind;
    this.number = number;
  }

  //카드정보 출력하는 매소드
  public String toString() {
    return "카드 무늬 : " + this.kind + ", 카드 번호 : " + this.number;
  }

}

class Deck {

  /*관계결정
    -덱은 카드이다? vs 덱은 카드를 가지고있다 => has 라 상속말고 '포함' 인스턴스 변수로
     ㄴ> 덱이 카드를 가지고있게 만들어야한다
  */
  //포함관계를 표현.구현 -> 인스턴스변수로 구현하자
  final int Card_NUM = 52;  //final은 이거설정된걸로 끝낸다-> 수정불가라서 ->상수가 된다
  //ㄴ 그냥하면 재사용성이 떨어져서 static을 붙여주는게 좋다 -> final static int Card_NUM =52;
  Card[] cardArr = new Card[Card_NUM];
  //ㄴ이렇게 직접 넣는건 별로 안좋다-psvm의 args에서 실행시받아서 하는게 좋다

  //기본 생성자
  //게임을 위한 카드무늬별 카드 장수만큼의 객체 생성이 필요하다.
  Deck() {
    int i = 0;
    for (int k = Card.KIND_MAX; k > 0; k--) //무늬제어 (4가지: 1,2,3,4)
    {
      for (int n = 0; n < Card.NUM_MAX; n++) //무늬별 카드제어 (13장필요)
      {
        cardArr[i++] = new Card(k, n + 1); //무늬별 카드객체 생성
      }
    }
  }
  //---------------------------------------------------------------
  //카드뽑기 매소드->2가지필요  =>>>>    1. 골라서뽑기 2.그냥순서대로 뽑기
  //카드 섞기 메소드 만들기
  //---------------------------------------------------------------

  /*
    pick 메소드는 오버로딩으로 구현
    가독성,유지보수성
   */
  //카드뽑기 매소드->골라서뽑기
  Card pick(int index) {//Card 클래스의 pick(int index) 메소드는 주어진 인덱스에 해당하는 카드를 반환하는 역할을 합니다.
    return cardArr[index];
  }


  //카드뽑기 매소드-> 그냥순서대로 뽑기
  Card pick() {
    int index = (int) (Math.random() * Card_NUM);
    //index라는놈은 int타입의 랜덤값(0~0.999,,)*52=> 0~52의 정수값
    return pick(index);
  }


  //카드 섞기 메소드 만들기
  void shuffle() {
    for (int i = 0; i < cardArr.length; i++) {
      //카드 배열에 52장의 카드가 저장된상태
      //카드 배열의 인덱스가 필요하다
      int r = (int) (Math.random() * Card_NUM);

      //실제 카드섞는부분
      Card temp = cardArr[i];
      cardArr[i] = cardArr[r];
      cardArr[r] = temp;
    }
  }
}


public class DeckTest {

  public static void main(String[] args) {

    //Deck()생성자 호출시 바로 카드52장 준비완료=>게임시작준비완료
    Deck d = new Deck();

    //카드게임 시작
    Card c = d.pick(0);
    //잘 봐두어야하는 코드!! => 현제의 코드의 내부적인 의미를 파악해야됨
    System.out.println(c);
    //ㄴSystem.out.println(c.toString()); 과같다 c는 toString을 찾아감

    //카드 섞기 테스트
    d.shuffle();
    c = d.pick(0);
    System.out.println(c);

  }
}