//package ch11;
//import java.util.*;
///*
//  [HashSet 사용예제]
//  -Set interface를 구현한 클레스
//  -순서를 유지하지 않음
//    순서를 유지하려고 하는 경우, LinkedHashSet 을 사용
//  -중복 허용을 하지 않음
// */
//
//public class HashSetEx1 {
//
//  public static void main(String[] args) {
//
//    Object[] objArr = {"1",new Integer(1),"2","3","4"};
//    Set set =new HashSet();
//
//    for(int i =0 ; i < objArr.length ; i++){
//      set.add(objArr[i]);
//    }
//    //"2" 는 중복임으로 하나만 저장됨
//    //"1" 과 Integer(1)은 서로 다른 타입임으로 모두 저장됨
//    System.out.println(set);
//
//    Integer[] intArr = {new Integer(1),new Integer(3),new Integer(2),new Integer(4)};
//    Set intSet =new HashSet();
//    for (int i = 0; i < intArr.length; i++) {
////      intSe.add(intArr[i]);
//
//    }
//  }
//}
