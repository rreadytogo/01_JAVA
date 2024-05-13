package main.java.com.ohgiraffers.section01.array;

public class Application03 {

    public static void main(String[] args) {

        //2:01

        //배열이 초기화되는 기본값을 자료형별로 이해할 수 있다.

        /*
        값의 형태별 기본값
        정수 : 0
        초기화만 하게 되면 0을 가지고 있다
        실수 : 0.0
        논리 : false
        문자 : \u0000
         */

        int[] iarr = new int[5];
        for(int i = 0; i < iarr.length; i++){
            System.out.println("iarr["+ i + "]의 값 : "+iarr[i]);
        }
        //int i = 0인거랑 기본값이 0인거랑은 관계 없음. int i = 1하게 되면 iarr[1]의 값부터 출력하게 된다

        //기본값 외의 값으로 초기화를 하고 싶은 경우 블럭을 이용한다
        //블럭을 사용하는 경우에는 new 연산자를 사용하지 않아도 되며,
        // 값의 갯수만큼 자동으로 크기가 설정된다.

        int[] iarr2 = {11, 22, 33, 44, 55};
        //직접 바로 값을 넣어줄 수 있다는 것.

        int[] iarr3 = new int[]{11,22,33,44,55};

        System.out.println("iarr2 = " + iarr2.hashCode());
        System.out.println("iarr3 = " + iarr3.hashCode());

        //soutv까지 치면 원하는 값 출력 가능.

        System.out.println("iarr2의 길이 = " + iarr2.length);
        System.out.println("iarr3의 길이 = " + iarr3.length);

//같은 값을 넣었지만 다른 배열이라는 것을 보여주기 위해 이렇게 따로 친 것.

        //문자열도 배열을 사용할 수 있다.
        String[] sarr = {"apple", "banana", "grape", "orange" };

        for (int i = 0; i<sarr.length; i++){
            System.out.println("sarr[" + i + "]의 값 : " + sarr[i]);
        }




    }



}
