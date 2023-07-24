//package ch9;
///*
//  1. Object class 가 누구이고 ,어떤 역활을 하는가?
//  2. equals() 동작 이해하기
//  3. String
// */
//
//public class EqualExEx1 {
//
//  public static void main(String[] args) {
//
//    Value v1 = new Value(10);
//    Value v2 = new Value(10);//는 새로운 객체를 만듬
//
//    if (v1.equals(v2)) {
//      System.out.println("v1,v2는 같음");
//    } else {
//      System.out.println("v1,v2는 다름");//pick 맴버변수값은 같으나 참조변수의 주소값을 비교한거라 다름
//    }//즉 두 객체의 메모리 공간이 다르다
//
//    v2=v1;  // v1의 주소값으로 v2를 초기화 시켜준다
//
//    if (v1.equals(v2)) {
//      System.out.println("v1,v2는 같음");//pick
//    } else {
//      System.out.println("v1,v2는 다름");
//    }
//
//    //equals는 참조변수의 주소값을 비교한다.
//    //경우에 따라선 주소값 비교가 의미가 없을 수있음 => 오버라이딩해서 써라
//    // => String.equals()
//
//    Person p1 = new Person(10000L);
//    Person p2 = new Person(10000L);
//
//    if (p1==p2){
//      System.out.println("p1,p2는 같음");
//    } else {
//      System.out.println("p1,p2는 다름");
//
//    if (p1.equals(p2)) {
//      System.out.println("p1,p2는 같음");
//    } else {
//      System.out.println("p1,p2는 다름");
//    }
//
//
//
//
//  }
//
//}
//
////1 -> Value(int value){
////    this.value = value;
//// 이부분 이해좀,,,????????????????????????????????????????????????????????????
//class Value{
//  int value;
//  Value(int value){ //여기서 생성자로 만들고
//    // 위에서 Value v1 = new Value(10); 로 생성자 호출해서 v1객체를 만듬
//    this.value = value;
//  }
//}
//
//class Person {
//  long id;
//  Person(long id){ //생성자 만들기
//    this.id=id;
//  }
//  //Object class의 equals()를 재정의. 주소값 비교가  의미가없는 경우
//  public boolean equals(Object obj){
//    if( obj != null && obj instanceOf Person){
//      return id == ((Person)obj).id; //??????????
//    }else{
//      return false;
//    }
//  }
//}