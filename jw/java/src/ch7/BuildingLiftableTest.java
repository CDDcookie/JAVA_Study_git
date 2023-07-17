package ch7;
/*
  예제의 특징
  1. interface를 직접구현한 interface class를 작성
  2. 각 Unit 의 맴버변수로 interface class 객체를 사용

  장점
    -interface class 객체를 맴버변수를 가지고있는 모든 Unit class의 동작을 하나로 동일
    -이 모든 Unit class에 대해서 게임 유저들의 요청이 발생. 이동 속도를 올리기를 원함
     -> 빠른개발과, 빠른테스트, 빠른 운용환경의 적용
    -interface 를 직접구현한 interface class를 사용하면 interface class만 수정하면
     모든 Unit class 자동 반영됨
    -interface class만 수정후 , 이 클레스만 컴파일 하면됨!!!
 */




interface Liftable {
  public abstract  void liftOff(); //건물을 들어올림
  public abstract  void move(int x,int y); //건물을 이동시킴
  public abstract  void stop(); //건물의 이동 정지
  public abstract  void land(); //
}
/////////////////////POINT1!!!//////////////////////////
//Liftable interface 직접구현한 class작성               //
//이런 형태의코드가 Spring F/W 에서 많이 사용되는 패턴이다  //
////////////////////////////////////////////////////////
class LiftableImpl implements Liftable{


  @Override
  public void liftOff() {
    System.out.println("건물속도를 일괄개선합니다.test");
    System.out.println("건물을 들어올립니다");
  }

  @Override
  public void move(int x, int y) {
    System.out.println("건물을 이동합니다");
  }

  @Override
  public void stop() {
    System.out.println("건물을 멈춥니다");
  }

  @Override
  public void land() {
    System.out.println("건물을 착륙합니다");
  }
}

// 각각의 building Unit : Building, Barrack, Factory,
class Building{}
class Barrack extends Building implements Liftable{

  //현제 예제에서 가장 중요한 POINT2 인 코드임
  //interface를 구현한 클레스를 맴버변수로 설정
  LiftableImpl l = new LiftableImpl();


  @Override
  public void liftOff() {
    l.liftOff();
  }

  @Override
  public void move(int x, int y) {
    l.move(x,y);
  }

  @Override
  public void stop() {
    l.stop();
  }

  @Override
  public void land() {
    l.land();
  }
}

class Factory extends Building implements Liftable{
  LiftableImpl l = new LiftableImpl();

  @Override
  public void liftOff() {
    l.liftOff();

  }

  @Override
  public void move(int x, int y) {
    l.move(x,y);
  }

  @Override
  public void stop() {
    l.stop();
  }

  @Override
  public void land() {
    l.land();
  }
}
///////////////////////////////////////////////////////


public class BuildingLiftableTest {

  public static void main(String[] args) {
    Barrack b = new Barrack();
    b.liftOff();


    Factory f = new Factory();
    f.liftOff();
  }

}
