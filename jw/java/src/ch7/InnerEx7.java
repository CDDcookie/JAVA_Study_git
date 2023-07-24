//package ch7;
//
//import java.awt.*; //윈도우 애플리케이션 개발시 사용하는 package.
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.beans.EventHandler;
//
///*
//  익명 클레스 작성 - interface 를 활용하는 예제
// */
//
//public class InnerEx7 {
//
//  public static void main(String[] args) {
//
//    //윈도우 화면의 버튼 객체 생성
//    Button b = new Button("Start");
//
//    //버튼이 눌러졌는지를 확인하고 (=Event 감지)
//    //=> 눌러졌으면 어떤 기능을 수행 가능함.
//    //=>EventHandler를 구현 해야됨
//
//    //1.Event 감지는 ->Listner
//    //2.기능동작 ->EventHandler
//
//    //구현
//    //1.event 감지를 위해서 Button 객체에 Listner를 추가
//    b.addActionListener((ActionListener) new EventHandler(b, null, null, null));
////  ㄴ익명 클레스 입장에서의 코드설명 -> 7-38코드와 같이 확인해야한다
////    언제 버튼이 click될지 알수없다.
////    그래서, 미리EventHandler객체를 생성하는게 아니라
////    버튼이 click이 되었을때, 이떄 한 번만 객체를 생성해서 사용한다
////    -익명클레스는 => 7-38예제코드이고
////    -익명클레스의 이해를 돕기 위하여 => 7-37코드
////    -이런 event와 관련된 익명클래스는 android에서 정말 많이 사용한다
////    -또는 자바윈도우s application에서 많이 사용된다
//
//  }
//
//  //2.EventHandler 구현
//  class EventHandler implements ActionListener{
//    public void actionPerformed(ActionEvent e){
//
//      System.out.println("ActionEvent occurred!");
//    }
//  }
//
//
//}
