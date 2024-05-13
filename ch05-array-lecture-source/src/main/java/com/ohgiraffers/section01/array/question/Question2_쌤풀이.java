package main.java.com.ohgiraffers.section01.array.question;

import java.util.Scanner;

public class Question2_쌤풀이 {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.println("배열의 길이를 입력하세요.");
        int size = src.nextInt();
        int[] arr = new int[size];
        //배열의 길이 정해줬고 .. -> 배열값 입력받기?

        for (int i = 0; i < size; i++) {
//            int text = src.nextInt();
            System.out.println("배열의 값을 입력하세요");
//            int[] arr = arr[i];

            arr[i] = src.nextInt();
        }
        //각 인덱스마다 반복문으로 접근해서 값 넣어주기.

        int max = arr[0];
        int min = arr[0];
        //max, min 변수 생성하기

        int secondNum = arr[0];
        //반복문 안에 조건문을 넣어서 큰 값 혹은 작은 값만 남기기.
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(min);
        System.out.println(max);

//

    }
}
