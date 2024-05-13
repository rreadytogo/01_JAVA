package main.java.com.ohgiraffers.section01.array;
//# 출력안됨
import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        /* 배열의 사용 방법
        자료형[] 변수명;
         */
        //힙영역에 주소값을 넣어줄 공간이 생김 new 할당 ->1:47
//        메모리영역은 코딩할 때 와닿지 않지만 이렇게 사용한다 정도만 생각하기

        int [] iarray;  //1
        int array[];    //2
        // 1,2 2가지 방법으로 가능.

        /*
        new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자
        발생한 주소를 레퍼런스 주소에 저장하여 이것을 사용하기 때문에 참조자료형(레퍼런스 타입)이라고 한다
         */

        //배열 할당할 시에는 반드시 크기를 지정해 주어야 한다.
        iarray = new int[5];
        array = new int[5];
        //선언과 동시에 할당 가능.

        int[] iarr = new int[5];
        System.out.println(iarray);
        //주소값으로 출력됨 ([I@4c873330)
        //이 주소값으로 heap영역 찾아가는 것
        System.out.println(array);
        //[I@119d7047
        System.out.println(iarr);
        //[I@776ec8df

        //16진수다보니 보기 어렵다. 10진수로 바꿔주는 것
        //hashCode() : 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
        System.out.println(iarray.hashCode());
        System.out.println(array.hashCode());
        System.out.println(iarr.hashCode());

        //스캐너를 통해 입력받은 정수로 배열 길이를 지정

        // 밑부터 출력 안 됨 ㅠ

        System.out.println("============================");

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");
        int size = sc.nextInt();



        int [] darr = new int[size];

        System.out.println("darr의 hashCode : " + darr.hashCode());
        System.out.println("darr의 length : " + darr.length);

        darr = new int[50];
        System.out.println("바뀐 해시코드 : " + darr.hashCode());
        System.out.println("바뀐 length : " + darr.length);

//        System.out.println(darr[size]); 이건 왜 0이 나오지?










    }

}
