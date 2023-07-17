package ch7;

interface Moveable{
  void move(int x, int y); //추상메서드
}
interface Attackable{
  void attack(Unit u);  //추상메서드
}
interface Fitghtable extends Moveable, Attackable{};
//여기까진 추상화 레벨=> 은 재사용되는중 =>가독성,유지보수성이 높아짐


//구체화 => 재사용성이 높음
//객체가 될수있으면 구체화가 된거라생각하면된다
class Unit{
  int currentHP;
  int x;
  int y;
}


//실질적인 구체화된 레벨 ->상속도 받고!! 구현도 하고!!
class Fighter extends Unit implements Fitghtable{ //자동완성기능으로 ->매소드 구현하기 ㄱㄱ
  @Override
  public void move(int x, int y) {
  }
  @Override
  public void attack(Unit u) {
  }
}



public class FigherTest {

  public static void main(String[] args) {

    //다형성 생각하기 -> 대상이 부모클레스 ,인터페이스

    Fighter f = new Fighter();
    if (f instanceof Unit){ //Unit이 true면 ->f는 유닛을 상속받은것
          // ture면 FIghter는 Unit이다
      System.out.println("f는 Unit의 자식이다.");
    }

    if (f instanceof Fitghtable){ //Fitghtable이 true면
          //ture면 FIghter는 Fitghtable 타입 이다
      System.out.println("f는 Fitghtable을  구현했다.=> Fitghtable 타입이다");
    }
    if (f instanceof Moveable){ //Unit이 true면 ->f는 유닛을 상속받은것
      // ture면 FIghter는 Unit이다
      System.out.println("f는 Moveable 을  구현했다.=> Moveable 타입이다");
    }
    if (f instanceof Attackable){ //Unit이 true면 ->f는 유닛을 상속받은것
      // ture면 FIghter는 Unit이다
      System.out.println("f는 Attackable 을  구현했다.=> Attackable 타입이다");
    }
    if (f instanceof Object){ //Unit이 true면 ->f는 유닛을 상속받은것
      // ture면 FIghter는 Unit이다
      System.out.println("f는 instanceof을  구현했다.=> instanceof 타입이다");
    }
  }
}


