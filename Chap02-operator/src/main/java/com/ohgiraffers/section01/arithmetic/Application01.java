package main.java.com.ohgiraffers.section01.arithmetic;

public class Application01 {

    public static void main(String[] args) {

    /*
    산술 연산자
    산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서
    가장 많이 사용되는 연산자.

    연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이상 연산자(연산자 2개)로 분류되며
    피연산자들의 방향은 왼->오


     */
        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 : " + num1 + num2);
        // 27이 아닌 207로 됨. 문자열이 더 커서 문자열로 인식되기 때문

        System.out.println("num1 + num2 : " + (num1 + num2));
        //27로 출력

//        System.out.println("num1-num2 = " + num1-num2;
        // 문자열은 +만 가능하기 때문

        System.out.println("num1 * num2 =" + num1 * num2);
        //140으로 출력. 곱하기를 먼저 했기 때문에, 정수*정수 후 문자열로 형변환 된 것.

        System.out.println("num1 / num2 =" + num1 / num2);


        System.out.println("num1 % num2 =" + num1 % num2);
        //%는 나머지 출력.






    }
}
