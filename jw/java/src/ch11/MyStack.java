package ch11;
/*
  Stack 구현 : LIFO(후입선출)

  저장메소드 : push()
  가져오기메소드 : pop()
  탐색     : search()
  비우기   : empty()
 */

import java.util.*;

public class MyStack extends Vector {

  public Object push(Object item){ //반환타입도 Object push메소드()
    addElement(item);   //Vector 메소드
    return item;

  }

  public Object pop(){
    Object obj = peek();
    //ㄴ>Object클레스타입 으로 obj객체를 만들고 그안에 peek()메소드의 리턴값을 넣겠다

    //vector에서 가져온 데이터는 vector에서 삭제를 함 => 후입선출동작
    removeElementAt(size()-1); //=>후입선출동작
    return obj;
  }

  public Object peek(){//백터라서 마지막에서 뽑아오는거라서-> 후입선출되도록 만들어야됨
    int len = size(); //데이터 갯수이다

    //더이상 가져올 데이터가 없는 경우, Exception 발생
    if (len ==0)
      throw new EmptyStackException();

    return  elementAt(len -1); //마지막요소를 추출하는것


  }



  public boolean empty(){
    return size() == 0; //벡터에 데이터가 없다면 => 트루를 리턴한다.
                        //마치 stack이 비어있는 것처럼 동작한다

  }

  public  int search(Object obj){
    //stack이라고 생각한다면
    //끝에서 부터 찾는 (후입선출) 으로 동작하게 되므로
    //백터의 끝에서부터 탐색을 시작해야함
    int i = lastIndexOf(obj);//이 문장은 뒤에서 부터 찾는거다
    //데이터를 찾은 경우는
    if( i>=0){
      //stack은 마지막이 첫번쨰이다
      //vector은 첫번쨰가 첫번째라서
      return  size()-i; //이 문장은 뒤에서 부터 찾는거라서-> 스텍처럼 후입선출로 동작할수있다
    }

    return -1; //해당하는 데이터를 탐색하지 못한경우는 -1을 리턴한다
  }






  public static void main(String[] args) {


  }

}
