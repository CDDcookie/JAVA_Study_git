package ch9;
/*
  래퍼(wrapper) 클래스 사용
*/

public class WrapperEx1 {

  public static void main(String[] args) {

    Integer i = new Integer(100);
    Integer i2 = new Integer(100);

    System.out.println("i == i2 : " + (i==i2)); //false 서로다른 메모리에 객체가 생성된다
    System.out.println("i.equals(i2)" + i.equals(i2)); //true 이건 안의 값을 비교하는거라서
    System.out.println(i.compareTo(i2));//0은 두 인스턴스의 값이 동일하다는것
    System.out.println(i.toString());

    System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE );
    System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
    System.out.println("Integer.SIZE : " + Integer.SIZE ); //32-> 4바이트라서,,?
    System.out.println("Integer.TYPE : " + Integer.TYPE);

  }

}
