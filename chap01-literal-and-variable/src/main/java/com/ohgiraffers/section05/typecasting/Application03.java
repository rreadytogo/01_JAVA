package main.java.com.ohgiraffers.section05.typecasting;

public class Application03 {


    public static void main(String[] args) {

        /*
        자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산 처리

         */

        int inum = 10;
        long lnum = 10L;

        int isum = inum + (int)lnum;
        System.out.println(isum);

        isum = (int)(inum+lnum);
        System.out.println(isum);
                //위와 같이 INT로 변환해서 초기화시키는 방법.

        byte bnum = 1;
        short snum = 2;
        short sum2 = 3;
        short snum3 = 4;

        int result1 = bnum + snum;
        int result2 = sum2 + bnum;
        int result3 = bnum + result1;







    }
}
