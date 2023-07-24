package ch9; //504p
import java.util.*;
/*
  DB의 테이블에 테스트용 데이터를 Inser 하기위한 임의의 SQL Insert문 작성하기
 */
public class RandomEx4 {

  final static int RECORD_NUM = 10; //작성할 Insert SQL 문자수
  final static String TABLE_NAME = ""; //INSERT 될 테이블명
  //테이블 이 -> col1(=칼럼,항목,필드) ,col2 ,col3 이런식이면
  //insert into table (col1, col2, col3) values ( '홍길동' , 1 ,3 ) =>이런한줄을 row라고함
  //배열을 통해 해당 칼럼들에 값 넣어주기
  //테이블의 항목들

  //final  static String[] CODE1 ={}; //테이블에 저장될 항목1번
  final  static String[] CODE1 ={"010","011","017","018","019"}; //테이블에 저장될 항목1번 //length가5
  final  static String[] CODE2 ={"남자","여자"}; //항목2번 -> length가2
  final  static String[] CODE3 ={"10대","20대","30대","40대","50대"}; //항목3번 -> length가5

  //난수 발생시 범위가 : 0.0 <= x <1.0 이라서 정수를 만을어서 정수값을 뽑기
  //3개의 배열에서 필요한 정수 인덱스 값을 생성
  //length가 5인 경우의 idx범위는 : 0~4
  //length가 2인 경우의 idx범위는 : 0~1
  //ㄴ>이게 알고리즘이다

  public static void main(String[] args) {

    /*
      insert into table_name
      values(
      '',                     //CODE1 -> idx 범위가 :0~4 ->이게 난수를 발생할 케이스1번
      '',                     //CODE2 -> idx 범위가 :0~1 ->이게 난수를 발생할 케이스2번
      '',                     //CODE3 -> idx 범위가 :0~4 ->이게 난수를 발생할 케이스3번
      100~200,                //의 난수
      )

    ->이게 데이터 한건넣는 sql문장이다
    ->위 문장을 10번 반복할거다
    -> 이렇게 하기위해선 순서가
     */


    //[3]sql문장 작성하기
    for(int i=0; i<RECORD_NUM ; i++){
      System.out.println(
          "INSERT INTOP" + TABLE_NAME
          + "VALUES ("
          + "'" + getRandArr(CODE1) + "'" //여기까지가 case1-> 난수값발생시키고 요소값가져와서 바로 넣음 //column1
          + "'" + getRandArr(CODE2) + "'" //여기까지가 case1-> 난수값발생시키고 요소값가져와서 바로 넣음 //column2
          + "'" + getRandArr(CODE3) + "'" //여기까지가 case1-> 난수값발생시키고 요소값가져와서 바로 넣음 //column3
          + "," + getRand(100,200) //column4
          + ");"
      );
    }
  }

  //[2]. 3개의 칼럼에 해당하는 배열을 매개변수로 사용------------------------
  //난수를 이용한 index값으로 매개변수 배열의 요소값을 추출한다
  public static  String getRandArr(String[] arr){

    return arr[getRand(arr.length-1)];
  }
  //case1, case2 가 대상이다
  public static int getRand(int n){
    return getRand(0,n);
  }
  //-----------------------------------------------------------------

  //[1]. 임의의 idx값 추출하기-----------------------------------------------
  //case3는 케이스1,2랑 달리 바로 들어온다
  public static int getRand(int from, int to){
    //case1은 idx 범위가 0~4 라서 난수의 범위는 0~5가 되야함
    //case2은 idx 범위가 0~1 라서 난수의 범위는 0~2가 되야함
    //case3은 idx 범위가 100~200 라서 난수의 범위는 0~2가 되야함

    return (int)Math.random()*(Math.abs(to-from)+1) + Math.min(from, to);
    //0,4가 들어올거고 나오는값이 0~5가되야하니 +1
    //0,1가 들어올거고 나오는값이 0~2가되야하니 +1
    //이게 case1,2에 해당한다
    // -----------------------------------------------------------------
  }
}




