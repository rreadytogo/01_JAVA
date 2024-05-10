package main.java.com.ohgiraffers.section06.temary;

public class Application01 {

    public static void main(String[] args) {

        /*
        삼항 연산자
        자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        항목이 3개임 : (조건식)? 참일때 사용값 : 거짓일때 사용값
        조건식은 반드시 결곽 true or false가 나오게 작성해야 함
        앞에서 배운 비교 / 논리 연산자 주로 사용됨
         */

        //1. 삼항연산자 단독 사용
        int num1 = 10;
        int num2 = -10;
        String result1 = (num1 > 0)? "양수" : "음수";
        String result2 = (num2 > 0)? "양수" : "음수";
        System.out.println(result1);
        System.out.println(result2);
        //출력 안만들어놓고 왜 출력 안될까 하고 있었음 ㅠ

        //2. 삼황연산자 중첩 사용 (연속으로 몇 번이나 사용가능)
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3>0)? "양수" : (num3==0)? "0" : "음수";
        String result4 = (num4>0)? "양수" : (num4==0)? "0" : "음수";
        String result5 = (num5>0)? "양수" : (num5==0)? "0" : "음수";

        System.out.println(
                "result3의 판단값은 " + result3);
        System.out.println("result4의 판단값은 " + result4);
        System.out.println("result5의 판단값은 " + result5);

















    }
}
