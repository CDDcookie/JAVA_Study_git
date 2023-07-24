//package ch11;
///*
//HashSet 객체로 저장시 중복해서 저장이됨
//=>중복 저장을 해결하는 방법 : hashCode(), equals(), 메소드를 구현해야함
//
//1.hashCode
//  -객체를 식별하는 정수값
//  -객체의 데이터를 어떤 알고리즘을 이영하여 계산된 정수값
//  -객체의 hashCode 메소드를 호출해서 사용할수있도록 오버라이딩 필요
//  -hashCode가 중복이 되는 경우도 있다
//
//2.hashCode사용목적??
//  -객체를 비교시 발생하는 비용을 낯추기 위해서
//  -객체를 비교시 equals() 를 사용하는데 , hashcode에 비해 많은 시간이 소요됨
//    hashCode가 정수값이라 성이 높다.
//  -그래서 , 컬랙션 프레임 워크중에서 hashmap에서 객체를 탐색시 hashcode를 사용한다
//
//3.객체비교의 기준이 뭐냐??
//  -hashCode가 다르면 두 객체는 다른 객체임
//  -만약 hashCode가 같으면 두 객체는 같거나 다를수 있다
//  -이럴땐 equals를 한번 더 해보고 판단한다
//
//4. 구현해야하는 부분??
//  -hashcode() 를 재정의
//  -equals() 를 재정의
//
//5. HashSet에서 데이터 저장시 , 중복체크시 , hashcode,equals 을 둘다 사용한다
//
// */
//
//import java.util.HashSet;
//import java.util.Objects;
//
//public class HashsetEx4 {
//
//  public static void main(String[] args) {
//    HashSet set = new HashSet();
//
//    set.add("abc");
//
//    set.add("abc");
//
//    set.add(new Person());
//
//  }
//
//}
//class Person{
//  String name;
//  int age;
//
//  @Override
//  public boolean equals(Object o) {
//    if (this == o) {
//      return true;
//    }
//    if (!(o instanceof Person person)) {
//      return false;
//    }
//    return age == person.age && Objects.equals(name, person.name);
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(name, age);
//  }
//
//  Person(String name, int age){
//    this.name = name;
//    this.age = age;
//  }
//
//  public String toString(){
//    this.name = name;
//    this.age = age;
//  }
//
//}
