package main.java.com.ohgiraffers.section02.assigment;

public class Application01 {

    public static void main(String[] args) {

        /*
        대입 연산자와 산술 복합 대입 연산자
        ' = ' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 대입한다.
        ' += ' : 왼쪽의 피 연산자에 오른쪽의 피연산자를 더한 결과를 대입한다
        ' -= ' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 값을 대입한다
        ' *= ' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 값을 대입한다
        ' /= ' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 값을 대입한다
        ' %= ' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과값을 대입한다

         */
        int num = 12;
        num += 3;
        System.out.println(num);

        num %= 5;
        System.out.println(num);

        num = 12;
        num*= 4.1;
        System.out.println(num);
        // 연산 실행후 형 변환 일어난다. 소수점을 버리고 출력됨





    }
}
