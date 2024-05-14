package main.java.com.ohgiraffers.section03.copy;

public class Application01 {

    public static void main(String[] args) {

        /*
        @@@@@면접 단골질문이기도 함!@@@@@@@


        배열의 복사는 크게 1) 얕은복사 2) 깊은복사
        1. 얕은복사
                /*
        얕은 복사는 stack에 저장되어 있는 배열의 주소값만 복사한다는 것이다
        따라서 두 개의 변수는 동일한 주소값을 가지고 있다
        한 배열 변경하면 다른 배열도 변경됨.
         */

        int[] originArr = {1,2,3,4,5};
        int[] copyArr = originArr;
        //copy를 만들어 origin을 복사한다

        //주소값 같은지 보려면 해시코드

        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());
        //둘의 해시코드가 같다 = 같은 배열을 참조하고 있다.

        System.out.println("=====================================");

        copyArr[0] = 99;
        //카피어레이의 값을 변경햇는데도 origin도 바뀌어있다.

        //향상된 for문


        for(int x : originArr){
            System.out.println(x);
        }
        System.out.println();
//        System.out.println("========================");
////스코프가 달라서 x를 중복해서 쓸 수 잇음
//        for(int x : copyArr){
//            System.out.println(x);
//        }
//        //배열의 인덱스 하나씩 꺼내서 담고 내용 실행
//        //이걸로 배열의 내부 확인해볼것
//        System.out.println("========================");















    }

}
