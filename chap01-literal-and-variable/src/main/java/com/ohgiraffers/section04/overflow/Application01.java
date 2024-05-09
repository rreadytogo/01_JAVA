package main.java.com.ohgiraffers.section04.overflow;

import java.sql.SQLOutput;

public class Application01 {
    public static void main(String[] args) {


       /*
       자료형별 최대 범위를 벗어나는 경우

        */

        byte num1 = 127;
        System.out.println("num1 : " + num1);
        num1++;
        //+1이 됨
        System.out.println(num1);

        /*
        언더 플로우
        오버플로우의 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다

         */

        byte num2 = -128;
        System.out.println("num2 : " + num2);
        num2--;
        //-1이 됨,
        System.out.println(num2);
        //범위를 넘어서서 최대값으로 간 것.

        int firstNum = 1000000;
        int secondNum = 7000000;
        int multi = firstNum * secondNum;
        System.out.println(multi);

        // 오버플로우를 해결하려면?
        // 정수보다 int보다 큰 범위 가진 자료 Long 사용
        long multi2 = (long) firstNum*secondNum;
        System.out.println(multi2);



    }

}
