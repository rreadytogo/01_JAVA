package main.java.com.ohgiraffers.section02.looping;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//메서드 간 for(int i) 중복은 괜찮은 것 같다!
// #
public class B_while {

    public void testSimpleWhileStatement() {

        /*
        [ while문 표현식 ]

        초기식;
        while(조건식){
        조건을 만족하는 경우 수행할 구문(반복할 구문);
        증감식;
        }
         */

       /*
       초기식;
        while(조건식){
            출력
            증감식

        }

        조건이 완료(?)까지 for문 사용


        */

        //1~10까지 증가시키면서 출력하는 기본 반복문

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            //증감식이 없으면 무한 반복될거야 하는 조건문에 노란줄이 뜸.
        }


    }

    public void testWhileExample() {
        //입력한 문자열의 인덱스를 이용하여 하나씩 출력하기

        //문자열 입력 받는 것
        Scanner scr = new Scanner(System.in);
        System.out.println("문자열 입력 : ");

        String str = scr.nextLine();

        /*
        10:13 듣기
        charAt() - 문자열에서 인덱스에서 해당하는 문자를 char형으로 바꿔주는 기능
        # char과 string의 차이를 모르겠다
            -> String과 char은 모두 문자열을 다루는 데 사용되지만, String은 여러 문자들의 시퀀스를 나타내는 자료형이고,
                char은 단일 문자를 나타내는 자료형입니다.
                 문장 입력하면 스펠링 하나하나 출력되는듯

        length() - String 문자열의 길이를 반환


        !!!!!! index는 0부터 시작 !!!!!!

         */


        System.out.println("----------for문-----------");
        for (int i = 0; i < str.length(); i++) {
            //char는 인덱스로 받고, 인덱스는 0부터 시작하기 때문에 <작다로 한 것.
            char ch = str.charAt(i);
            System.out.println(ch + " " + i);


        }

        System.out.println("--------------while문--------------");
        int index = 0;
        while (index < str.length()) {
            char ch = str.charAt(index);

            System.out.println(ch + " " + index);

            index++;

        }
    }

    //정수 하나 입력받아 1부터 입력받은 정수까지 합계 구하기!
    public void whilesum(){
    Scanner scr = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
    int num = scr.nextInt();

    int i = 1;
    int sum = 0;
    while(i<=num)

    {
        sum += i;
        i++;
    }

        System.out.println(sum);
}





}


//    public void testWhileExample2(){
//        Scanner scr = new Scanner(System.in);
//        String text = scr.nextLine();
//        System.out.println("문자를 입력하세요.");

//    for
//

//        }








