package main.java.com.ohgiraffers.section02.demensional;

import java.security.spec.RSAOtherPrimeInfo;

public class Application01 {

    public static void main(String[] args) {


    /*
    다차원 배열
    다차원 배열은 2차원 이상의 배열을 의미한다

    배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미
    즉, 2차원 배열은 1차원 배열 여러개를 하나로 묶어서 관리하는 배열을 의미한다
    더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 배열은 사용빈도가 현저히 작다.


     */

    /*
    2차원 배열을 사용하는 방법
    1. 배열의 주소를 보관할 레퍼런스 변수를 선언
    2. 여러개의 1차원 배열의 주소를 관리하는 배열을 생성
    3. 각 인덱스에서 관리하는 배열을 할당하여 주소를 보관하는 배열에 저장
    4. 생성한 여러개의 1차원 배열에 차례로 접근해서 사용

     */

    /*new 연산자 이용한 변수 : 레퍼런스 변수
    사용자정의 (우리가 만드는)

     */

        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];
        //선언 3가지 방식 다 가능

        iarr1 = new int[3][];
        //앞의 배열에만 적어주면 된다.
//    iarr1 = new int[][]; error
//    iarr1 = new int[][4]; error

        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];


        iarr2 = new int[3][5];

        //35~42 = 45 같은 말이다
        // #여기서는 int iarr2 = new int[3]5] 이건 에러네

        for (int i = 0; i < iarr1[0].length; i++) {
            System.out.println(iarr1[0][i] + " ");
        }
        for (int i = 0; i < iarr1[1].length; i++) {
            System.out.println(iarr1[1][i] + " ");
        }



        //^  다 0 나오는거 확인


        //여기 필기 X!!!!!!
//        for




    }
}
