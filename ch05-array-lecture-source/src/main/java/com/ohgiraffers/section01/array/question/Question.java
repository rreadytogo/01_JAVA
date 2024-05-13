package main.java.com.ohgiraffers.section01.array.question;
// +
import java.util.Scanner;

public class Question {

    public static void main(String[] args) {

        //배열의 최솟값, 최댓값 찾기

        //배열 길이는 스캐너로 입력받아서 요소마다 정수를 넣어줄 것.

        // 해당배열의 최솟값과 최댓값을 출력해주는 기능 만들어 주세요.

        // 두번째로 큰 값 (max보다 크고 들어오는 값보다 작으면 된다)


        Scanner sc = new Scanner(System.in);
        System.out.println("배열 길이를 입력해주세요.");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "배열의 요소를 입력해주세요 ");
            arr[i] = sc.nextInt();
        }

//            int max = 0;
        int max = arr[0];
//        int min = 0;
        int min = arr[0];

//            max min 대소비교가 되지 않은 점?

        for (int i = 0; i <
//                max
                size
                ; i++) {
            if (arr[i] < min){
//            System.out.println(max);
                min = arr[i];

        }
//            if (int j = 0; j >= min; j++) {
            if(arr[i] > max){
               max = arr[i];
            }
//            System.out.println(min);
        }

        System.out.println(max);
        System.out.println(min);


//        int score = sc.nextInt();
//        System.out.println("정수를 입력해주세요");

    }

}
