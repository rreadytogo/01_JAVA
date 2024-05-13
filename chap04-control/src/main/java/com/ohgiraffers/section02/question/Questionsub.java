package main.java.com.ohgiraffers.section02.question;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Questionsub {

        /*
        입력한 숫자 범위 내에서 소수를 찾아 출력하는 프로그램 작성해보자
        사용자로부터 시작숫자와 끝 숫자를 입력 받는다.
        프로그램은 해당 범위 내에 존재하는 모든 소수를 출력한다.
        소수 = 1과 자기 자신을 제외한 수로 나누어 떨어지지 않는 수 1,3,5,7 이런거...
         */


    public void writenum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작 숫자를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("끝 숫자를 입력하세요.");
        int b = sc.nextInt();
//        int num = 0;
//        int result = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
                for (int j = 2; j <= i && j != i; j++)
                    //j<=b가 아니라 j<=i임

                    System.out.println(i % j != 0);
                //                result = i%j!=0;
                //이렇게 두번 대입은 안됨 한번씩만. ? 무슨 소리지ㅠㅠ

                System.out.println(i);
                //j로 출력했을 때 왜 빨간색 나왔지?
//                System.out.println(result);


            }


////        int num = 0;
//            for(int i=2;i<=
//                    //b가 더 크다는 보장은 없는데)
//                    && i!=array;i++){
//                array = array/i;
//                System.out.println(array);
        }


    }
}

