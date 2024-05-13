package main.java.com.ohgiraffers.section01.array;
//# 필기 놓침
public class Application01 {

    public static void main(String[] args) {
        /*
        배열이란?
        동일한 자료형의 묶음 (연속된 메모리 공간에 값을 저장하고 사용하기 위함)
        배열은 heap 영역에 new 연산자 이용하여 할당한다

        배열의 사용 이유
        1. 만약 배열을 사용하지 않는다면 여러 개의 변수를 사용해야 한다.
        2. 만약 배열을 사용하지 않는다면 반복문을 이용한 연속 처리가 불가능하다.


         */
       int num1 = 10;
       int num2 = 20;
       int num3 = 30;
       int num4 = 40;
       int num5 = 50;

       int sum = 0;
//       01:39

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println(sum);

//        int[] array = new int[];
        //오류나는 이유 : 길이를 적어줘야함

        int[] array = new int[5];


        //배열은 공간마다 찾아갈 수 있는 인덱스를 이용해 접근할 수 있다.
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
//        array[5] = 60;  Error ! Out of bound.

//        #하나의 이름으로 여러개의 변수를 관리하면 -> 하나의 반????
            int sum2 = 0;

        for (int i = 0; i < array.length; i++) {
            //fori + 탭 하면 나옴
            sum2 += array[i];
        }
//        for문 해서 1:45

        System.out.println("array = " + sum2);

//        sum2 += array[0];











    }
}
