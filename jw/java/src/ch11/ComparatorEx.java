package ch11;

import java.util.Arrays;
import java.util.Comparator;
/*
  1. Arrays.sort()

  2. 정렬을 위한 interface
    -Comparable : 기본정렬 (오름차순)
    -Comparator : 다른 기준의 정렬을 위한 것

  3. Arrays.sort( 배열, Comparator )
    -Comparator 를 직접 구현해서 사용하면 됨.
    -Arrays 가 정렬시 Comparator 를 새로운 기준으로 정렬을 하게됨

  4. Comparator 를 구현시
    Comparable의 compareTo() 를 사용하면 편하게 비교를 할수있다.

*/

public class ComparatorEx {

  public static void main(String[] args) {

    String[] strArr= {"A","D","E","C","F"};

    //기본정렬(오름차순)
    Arrays.sort(strArr);
    System.out.println("기본 정렬 : " + Arrays.toString(strArr));

//    //새로운 정렬(내림차순)
    Arrays.sort(strArr, new Descending());
    System.out.println("내림차순 정렬 : " + Arrays.toString(strArr) );


  }

}

//새로운 정렬을 위한 Comparator을 구현한 class
class Descending implements Comparator{

  @Override
  public int compare(Object o1, Object o2) {
    //    Comparable의 compareTo() 를 사용하면 편하게 비교를 할수있다.
    if(o1 instanceof Comparable && o2 instanceof Comparable){
      Comparable c1 = (Comparable) o1;
      Comparable c2 = (Comparable) o2;

      //오름차순 조건임
      //비교 후 값이 크면 -1, 같으면 0 , 작으면 1(Arrays 에서 사용하는 오름차순 조건 => Comparable)
      //내림차순을 구현하려고 하기떄문데
      //기존의 오름차순의 조건을 반대로 만들면 내림차순이됨
      //비교 후 값이 크면 -1, 같으면 0 , 작으면 1 을 => 비교 후 값이 크면 1, 같으면 0 , 작으면 -1 로
      //c1.compareTo(o2);->
      return c1.compareTo(o2)*-1;
    }
    return 0;
  }
}