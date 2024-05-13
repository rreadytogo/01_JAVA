package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {

   public void dowhile(){

/*
    [ do - while 표현식 ]
    초기식 ;
    do {
    실행문;
        cf. 1회차에는 무조건 실행, 이후에는 조건식 만족해야만 실행.
    증감식;
    } while(조건식);

 */

       do{
           System.out.println("최초 한 번 동작");
       } while(false);
       //while에서는 조건문이 false면 안하잖아. do while은 false여도 한다는걸 보여주려고 하는 것
       System.out.println("반복문 종료 확인");



   }
   
   public void testDowhile(){
       //문자열을 입력 받아 반복적으로 출력
       // 단, exit가 입력되면 반복문 종료.

       Scanner sc = new Scanner(System.in);
//       String text = sc.nextLine(); 이 아니네
       String str = "";
//       빆에 쓴 이유? while문에서 10:50 
//       do 안에서 변수는 do 밖에서 못씀
//           while에서 찾아야하니까.
       
       do {
           System.out.println("문자열을 입력하세요 : ");
           str = sc.nextLine();
           System.out.println(str);
       }while(!str.equals("exit"));
       //str이 exit이 같을때만 종료하는거니까.??? 엥??? 10:51

       System.out.println("프로그램을 종료합니다");

       
   }

}
