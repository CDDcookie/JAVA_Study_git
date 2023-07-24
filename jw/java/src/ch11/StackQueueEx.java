package ch11;
import java.util.*;
/*
  Stack,Queue 사용예제
    stack :LIFO 후입선출
    queue :FiFO 선입선출
 */

public class StackQueueEx {

  public static void main(String[] args) {

    //Stack -> 자바에서 만들걸 쓰면된다 //저장은 push(), 가져오기는 pop()
    Stack st = new Stack();

    //Queue ->                       저장은 offer, 가져오기 poll
    Queue q = new LinkedList();

    st.push("0");
    st.push("1");
    st.push("2");

    q.offer("0");
    q.offer("1");
    q.offer("2");

    System.out.println("Stack");

    while(!st.empty()){
      System.out.println(st.pop());
    }

    System.out.println("Queue");

    while(!q.isEmpty()){
      System.out.println(q.poll());
    }

  }

}
