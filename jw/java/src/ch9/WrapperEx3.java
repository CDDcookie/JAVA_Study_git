package ch9;
/*
[레퍼클레스의 활용]
  오토박싱 ,언박싱
 */

public class WrapperEx3 {

  public static void main(String[] args) {
    int i= 10;
    Integer intg2 = (Integer)i; //원래는 이래해야하는데
    Integer intg =1; //오토박싱 int -> Integer 로 자동 형변환
    Object obj =i; //이것도 자동형변환 -> (자식 에서 부모 로) 업케스팅하는경우는 형변환 생략이 가능하다

    Long lng2 = new Long(100L); //원래는 이래해야하는데
    Long lng = 100L; //이렇게 바로도 가능하다 (오토박싱)
    int i2 = intg + 10; //이건 언박싱(기본타입으로 반환)이다
  }

}
