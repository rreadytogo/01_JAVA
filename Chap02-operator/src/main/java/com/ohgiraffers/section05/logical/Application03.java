package main.java.com.ohgiraffers.section05.logical;

public class Application03 {
    public static void main(String[] args) {


        /* 논리식 && : 앞의 결과가 false이면 뒤의 연산을 실행하지 않음.
           논리식 || : 앞의 결과가 true이면 뒤의 연산을 실행하지 않음.
         */

int num1 = 10;
int result = (false && ++num1>0)? num1 : 20;
//false는 뒤에 어떤 것이 와도 실행되지 않는다. 따라서 20이 출력됨 단, &&일떄.
        System.out.println(result);
        System.out.println(num1);

int num2 = 20;
int result2 = (true || ++num2>0)? num2 : 30;
//논리값은 앞뒤로 boolean형으로 나와야해서 >0을 붙인 것
        System.out.println(result);
        System.out.println(num2); //증감연산자가 실행되지 않은 것을 확인할 수 있따.

        System.out.println("============================flase Or편===================");
int numm = 10;
        int resultt= (false || ++num1>0)? num1 : 20;
        System.out.println(resultt);
        System.out.println(numm);
//false
        System.out.println("============================자습");
}}

