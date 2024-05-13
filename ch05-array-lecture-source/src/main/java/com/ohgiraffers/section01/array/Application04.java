package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args) {
        //main만 쳐도 나옴
        // 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램.

        Scanner src = new Scanner(System.in);
//        int a = src.nextInt();
        System.out.println("점수를 입력하세요.");
        //입력받을걸 배열에 저장할거야.
        //배열부터 만들 것
        int[] scores = new int[5];
        for (int i = 0; i < scores.length  ; i++) {
            System.out.println((i+1) + "번 째 학생의 자바 점수를 입력 해주세요 : ");
            //비개발자 입장에서 0번째 개념은 없기 때문에 +1을 해준 것. ++i로 해도 될 듯?
            scores[i] = src.nextInt();

            //합계와 평균을 담아줄 dobule 변수 생성
            double sum = 0.0;
            //실수 기본값이 0.0이니까.
            double avg = 0.0;
            //? 2:16
            //배열 하나씩 접근해서 복합연산자에 넣어주면 됨



            //# 왜 여기서부터 int i가 안되는거지?
            for(int i2 = 0; i2 < scores.length ; i2++){
                sum += scores[i2];
            }
            //2:17
            //5개 점수 있고 하나씩 빼가면서 더해주는 것


            avg = sum / scores.length;

            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + avg);
        }

    }

}
