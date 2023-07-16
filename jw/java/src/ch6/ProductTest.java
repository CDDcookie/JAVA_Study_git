package ch6;

/*
  인스턴스변수 초기화 block를 실제 사용 가능한 예제
  제품생산 serialNo를 채번해서 객체에 부여하는 예제=> 코드재활용
 */

class Product {

  static int count = 0;  //클레스변수->Product class로 만들어진 모든 객체간 공유가능
  int serialNo;  //인스턴스 변수->객체별로 식별되서 유일한거라 공유는 안됨

  //인스턴스변수 초기화 block
  //-> 객채가 생성될떄마다 초기화된다=생성자가 호출될떄마다
  {
    ++count;  //클레스변수 라서 계속 공유가됨
    serialNo = count; //인스턴스 변수 라서 제품 시리얼 번호를 부여할수있다.
  }
}

public class ProductTest {

  public static void main(String[] args) {
    //재품생산해서 각 제품별 serialNo을 부여한다
    Product p1 = new Product();//기본생성자 추가한것
    Product p2 = new Product();
    Product p3 = new Product();
    Product p4 = new Product();

    System.out.println("p1의 serialNo :" + p1.serialNo);
    System.out.println("p2의 serialNo :" + p2.serialNo);
    System.out.println("p3의 serialNo :" + p3.serialNo);
    System.out.println("p4의 serialNo :" + p4.serialNo);

    System.out.println("총생산된 수량 " + Product.count);


  }
}
