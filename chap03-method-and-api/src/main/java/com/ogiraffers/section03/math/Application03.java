package main.java.com.ogiraffers.section03.math;

import java.util.Random;

public class Application03 {

    public static void main(String[] args) {

        /*
        java.util.Random 클래스
        Random 클래스의 nextInt() 메소드를 이용한 난수 발생
        nextInt(int bound)  : 0부터 매개변수로 전달받은 정수범위까지의 난수를 발생시키는 메소드
        * */

        /*
        원하는 방식의 난수를 구하는 공식
        random.nextInt(구하려는 난수의 범위)
         */

        Random random = new Random();

        //0부터 9까지의 난수 발생
        int randomNumber1 = random.nextInt(10);
        System.out.println("0부터 9까지의 난수 : " + randomNumber1);

        // 1부터 10까지의 난수 발생
        int randomNumber2 = random.nextInt(10)+1;
        System.out.println("1부터 10까지의 난수 : " + randomNumber2);

        //20부터 45까지의 난수 발생
        int randomNumber3 = random.nextInt(26)+20;
        System.out.println("20부터 45까지의 난수 발생 : " + randomNumber3);

        // 범위
        // int ~ (범위 개수 n~m 범위 구하기 : m-n+1) + 최초값 n;




    }
}
