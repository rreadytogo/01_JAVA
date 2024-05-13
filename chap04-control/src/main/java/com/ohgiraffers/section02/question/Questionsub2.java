package main.java.com.ohgiraffers.section02.question;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Questionsub2 {

    public void writenumtwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작 숫자를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("끝 숫자를 입력하세요.");
        int b = sc.nextInt();
        int cnt = 0;
        for (int i= a; i<=b; i++){
            cnt = 0;

            for (int j=2; j<=i; j++) {
                if (i%j == 0)
                { cnt++;
            }


        }
            if (cnt==1) {
                System.out.println(i + "는 소수");    }
        }
}



}

//    선생님 버전
//    public void cnt(){
//        //1은 소수 아님!
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("시작 숫자 입력");
//        int start = sc.nextInt();
//        System.out.println("끝 숫자 입력");
//        int end = sc.nextInt();
//
//        System.out.println(start+"부터"+end+"까지의 소수 : ");
//
//        for (int i=start; i<end ; i++){
//
//            boolean isTrue = true;
//            for(int j = 2; j < i; j++){
//                //자기 자신은 나눠지니까 그 전까지. 자기의 수 이상보다 커져도 int는 정수만 출력되기 때문에 걸러져서 안나옴
//                //그래서 빼도 되는듯
//                if(i%j==0){
//                    isTrue = false;
//                    break;
//                }
//            }
//
//            if(isTrue == true){
//                System.out.println(i+" ");
//            }
//        }
//
//
//    }
//
//}