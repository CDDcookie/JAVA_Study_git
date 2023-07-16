package ch6;
/*
  초기화 블록 사용예제
  생성자를 통해서 객체를 생성시, 실제로 초기화 블록이 사용되는지 확인

 */


public class BlockTest {

  //클레스 변수 초기화 블록
  static {
    System.out.println("static {}");
  }

  //인스턴스 변수 초기화 블록
  {
    System.out.println("{ }");
  }

  public BlockTest() {
    System.out.println("생성자호출");
  }

  public static void main(String[] args) {
    BlockTest bt = new BlockTest();
  }
}
