package ch11;
/*
  HashMap 사용 예제
 */

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

  public static void main(String[] args) {
    HashMap map = new HashMap();

    //데이터 저장 (key는 : id , value는 : pwd)
    map.put("id", "1234");
    map.put("id2", "4567");
    map.put("id3", "9870");
    map.put(null,null);

    //key 가 null에 대한 value 를 출력 => null이 출력됨
    //단 , HashTable에서는 안됨
    System.out.println(map.get(null));

    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("id 및 password 를 입력하세요");
      System.out.println("id : ");
      String id = sc.nextLine().trim();

      System.out.println("password : ");
      String pw = sc.nextLine().trim();

      //map에소 사용자 id를 검색
      if (!map.containsKey(id)) {
        System.out.println("해당하는 id는 존재하지 않습니다");
        continue;
      } else {
        if ((map.get(id)).equals(pw)) {
          System.out.println("비밀번호가 틀립니다");
        } else {
          System.out.println("등록된 사용자 입니다");
          break;
        }
      }
    }

  }
}
