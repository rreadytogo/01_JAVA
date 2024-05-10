package main.java.com.ohgiraffers.section04.comparision;

public class Application01 {

    public static void main(String[] args) {

        /*
        비교 연산자
        비교 연산자는 피연산자 사이에서 상대적인 크기를 판단하여
        참 / 거짓을 반환하는 연산자.
        연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나,
        조건문의 조건절에 많이 사용한다

        ! : 부정문 의미

         */
        System.out.println(!true);
        //false 출력
        System.out.println(!false);

        //true 출력

        int inum1 = 10;
        int inum2 = 20;
        System.out.println("----------------------------");

        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));

        System.out.println("inum1과 inum2가 다른지 비교 : " + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        // 산술연산자가 비교연산자보다 처리 우선순위가 높기 때문에 비교연산자항을 ()로 묶어준다.

        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1>=inum2));
        System.out.println("inum1이 inum2보다 작거나 같은지 비교 : " + (inum1<=inum2));
        // =은 부등호 뒤에 써준다.

        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("==========================문자값 비교==========================");
        System.out.println(ch1); //a로 출력
        System.out.println(ch2); //A로 출력
        
        
        //?char이 문자열 변환 아니었나?***
        // char형 변수의 문자를 선언-> 해당 문자는 아스키코드의 규칙에 맞게 숫자로 치환이 되어 컴퓨터에 저장되게 됩니다.//


        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1==ch2));
        System.out.println("ch1과 ch2가 다른지 비교 : " + (ch1!=ch2));
        System.out.println("ch1이 ch2보다 큰지 비교 : " + (ch1>ch2));
        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1>=ch2));
        System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1<ch2));
        System.out.println("ch1이 ch2보다 작거나 같은지 비교 : " + (ch1<=ch2));

        System.out.println("====================논리값 비교====================");

        boolean bool1 = true;
        boolean bool2 = false;
        //논리값은 대소비교 불가. == 혹은 != 비교만 가능

        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1==bool2));
        System.out.println("bool1과 bool2가 다른지 비교 : " + (bool1!=bool2));
//        System.out.println("bool1이 bool2보다 큰지 비교 : " + (bool1>bool2)); Error! 대소비교 불가


        String str1 = "java";
        String str2 = "java";
        //문자열은 "" 임!

        System.out.println("=======================문자열 값 비교=============================");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1==str2));
        System.out.println("str1과 str2가 다른지 비교 : " + (str1!=str2));
        //문자열은 대소비교 불가. (문자값과 달리) &&&&&&&&이 부분 다시 듣기 &&&&&&&&&&&&

        int x = 10;
        int y = 11;
        boolean result = x <= y;
        System.out.println(result);

    }
}
