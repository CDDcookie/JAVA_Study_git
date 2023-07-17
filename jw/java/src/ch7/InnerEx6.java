package ch7;
/*
  익명클레스 사용 예제 => (인스턴스 맴버, static맴버, 지역형태)의 익명 클레스
  -익명 클레스 작성 방법 : 조상 클레스 인터페이스를 이용
                          => 자기자신이 이름이 없으므로, 부모 도는
                            인터페이스의 이름을 빌려서 사용

 */


public class InnerEx6 {
  //인스턴스///
    //익명 클레스의 객체를 생성하기 위함
    //Object() 생성자로 끝난게 아니다!! => 이름을 사용하고 싶은데 사용못하니 부모이름을 씀
  Object iv = new Object(){ };// 새로배우는 문법인데 부모이름을 쓴것
                              //이게 인스턴스 타입의 익명 클레스
                              Object iv2 = new Object(){void method(){} }; //형식도 가능

  //Object 생성자를 이용한 객체 생성
  Object obj = new Object(); //Object의 객체생성 문법
                             //Object 클래스의 기본 생성자 호출


  //static///
  static Object iv3 =new Object(){};

  //지역
  void mtMethod(){
    Object iv3 = new Object(){};
  }

  public static void main(String[] args) {
  }
}
