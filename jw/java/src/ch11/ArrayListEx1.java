package ch11;//결과가ㅄ보기


import java.util.*;

public class ArrayListEx1 {

  public static void main(String[] args) {
    ArrayList list1= new ArrayList(10);

    // data 저장
    list1.add(new Integer(5));
    list1.add(new Integer(4));
    list1.add(new Integer(2));
    list1.add(new Integer(0));
    list1.add(new Integer(1));
    list1.add(new Integer(3));

    ArrayList list2 = new ArrayList(list1.subList(1,4)); //542013 중 : 420 까지만 나옴
    print(list1, list2);

    //정렬하기
    Collections.sort(list1);
    Collections.sort(list2);
    print(list1, list2);      //542013 중  420 까지만 나온걸 정렬해서 : 024 나옴

    //추가저장
    list2.add("A");
    list2.add("B");
    print(list1, list2);      //542013 중  420 까지만 나온걸 정렬해서 024 나오고 AB추가된  : 024AB

    //데이터를 뒤로 이동후 그자리에 추가
    list2.add(3,"AA");
    print(list1, list2);      //024AB 에서 3번쨰를 지우고 AA 넣음 : 0, 2, 4, AA, A, B

    //걍 덮어쓰기 (그위치에 있던값은 삭제됨)
    list2.set(3,"CC");
    print(list1, list2);      //024AB 에서 3번쨰를 지우고 AA 넣음 : 0, 2, 4, CC, A, B

    //포함된 데이터를 선택해서 삭제
    for (int i = list2.size()-1 ;  i >= 0 ; i--) {
      if(list1.contains(list2.get(i)))
        list2.remove(i);
    }
    print(list1, list2);      // 012345

    //////////////////////////////////////////////////////////////////////

    System.out.println("list1.isEmpty() :" + list1.isEmpty()); //비어서 f
    ArrayList list3 = new ArrayList(10);
    System.out.println("list3.isEmpty() :" + list3.isEmpty()); //t

    System.out.println("list1.size() :" + list1.size());
    System.out.println("list3.size() :" + list3.size());

    //////////////////////////////////////////////////////////////////////

    list1.trimToSize();
    list3.trimToSize();

    System.out.println("list1.size() :" + list1.size());
    System.out.println("list3.size() :" + list3.size());





  }
  static void print(ArrayList list1, ArrayList list2){
    System.out.println("list1 : " + list1);
    System.out.println("list2 : " + list2);
    System.out.println();
  }

}
