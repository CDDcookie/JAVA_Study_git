package studyJava;

public class UbClass08 {

    public static void main(String[] args) {
      HamBurger[] hamBurgers = new HamBurger[3];
      //베열타입    배열명       생성자        3공간
      hamBurgers[0] = new HamBurger();
      //0번쨰 배열에    <-객체생성해서 넣음
      hamBurgers[1] = new CheeseBurger();  //위에서 배열이라는 클레스 선언!했으니까   hamBurgers[1]의 공간엔 new생성자로 만들어진 CheeseBurger의 객체의 주소값이 들어감??
      hamBurgers[2] = new ShrimpBurger();

      //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      //HamBurger[] hamBurgers = new HamBurger[3]; 도
      //     Car c =new  Car();      --> 이것처럼 앞에 Car c 한거랑  HamBurger[] hamBurgers 로 '타입+변수명' 선언한거랑 같은효과다
      // int menu = sc.nextInt();  -->  이건 위에선 Car라는 참조변수 타입이면 이건 기본형 타입을 쓴것
      //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

      System.out.println("주문하신 메뉴를 만듭니다.");
      System.out.println("--------------------");
      for (int i = 0; i < hamBurgers.length; i++) {
        hamBurgers[i].name();
        hamBurgers[i].cook();
        System.out.println("--------------------");
      }
      System.out.println("메뉴 준비가 완료되었습니다.");
    }
  }

class HamBurger {

  String name = "기본햄버거";

  public void name(){
   System.out.println(name + "를 만듭니다.");
  }
  public void cook() {
    System.out.println("빵 사이에 들어갈 재료는?");
    System.out.println("> 양상추 \n +피클 \n +패티");
  }
}

class CheeseBurger extends HamBurger {  //상속은 조상의 매소드 맴버를 상속해줌

  String name = "치즈버거";

  public void name(){
    System.out.println(name + "를 만듭니다.");
  }
  public void cook() {
    super.cook();
    System.out.println(" +치즈");
  }
}

class ShrimpBurger extends HamBurger {

  String name = "새우버거";
  public void name() {
    System.out.println(name + "를 만듭니다.");
  }
  public void cook() {
    super.cook();
    System.out.println(name + "를 만듭니다.");
  }
}

