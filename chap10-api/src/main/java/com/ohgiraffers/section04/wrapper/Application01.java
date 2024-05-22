package main.java.com.ohgiraffers.section04.wrapper;

import java.util.concurrent.LinkedBlockingDeque;

public class Application01 {

    public static void main(String[] args) {
        //일반자료형을 객체자료형 - 인스턴스로 감싸주는.

        /*

        상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다

                ->메소드가 매개변수로 인스턴스만 받는 경우.
        이 때 기본 타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
        8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를
        래퍼클래스(Wrapper Class)라고 함.

         */

        /*

        기본타입  래퍼클래스

        byte    Byte
        short   Short
        int     Integer
        long    Long
        float   Float
        double  Double
        char    Character
        boolean Boolean

         */

        /*

       박싱(Boxing)과 언박싱(UnBoxing)
       박싱     :  기본 타입을 래퍼클래스의 인스턴스로 인스턴스화
       언박싱   :  래퍼클래스 타입의 인스턴스를 기본 타입으로 변경


         */

        //박싱
        int intValue = 20;
        Integer boxingNumber1 = new Integer(intValue);
        Integer boxingNumber2 = Integer.valueOf(intValue);


        //언박싱
        int unBoxingNumber = boxingNumber1.intValue();
        int unBoxingNumber2 = boxingNumber2.intValue();



        /*

        오토박싱, 오토언박싱
        JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해주는 것.

         */

        Integer boxingNumber3 = intValue;    //오토박싱
        int UnBoxingNumber2 = boxingNumber3; //오토언박싱

        // Wrapper 클래스 값 비교
        int inum = 20;
        Integer integerNum1 = new Integer(20);
        //가능은 함! 앞으로 없어질 수 있다는 경고
        Integer integerNum2 = new Integer(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        // 기본타입과 래퍼클래스 타입 == 연산
        //new 쓴거랑 안쓴거 다 비교해볼 것.
        System.out.println("int와 integer 비교 : "+ (inum==integerNum1));
        System.out.println("int와 integer 비교 : "+ (inum==integerNum3));
        //값가지고 비교하기 때문에, ture가 나옴.


        //생성자를 이용한 인스턴스 == 비교

        System.out.println("integer와 integer 비교 : " + (integerNum1==integerNum2));
        //각각 다른 생성자 사용 -> false!
        System.out.println("integer와 integer 비교 : " + (integerNum1==integerNum3));
        //new연산자 사용한 것과 오토박싱 한 것끼리 : false!
        System.out.println("integer와 integer 비교 : " + (integerNum3==integerNum4));
        //이건 true!

        System.out.println("equals() : " + (integerNum1.equals(integerNum2))); //true
        System.out.println("equals() : " + (integerNum1.equals(integerNum3))); //true
        // 스트링. 래퍼클래스 모두 ==비교보다 equals 비교가 더 정확하다


        /*
        Integer.valueOf()를 이용하여 인스턴스를 생성하는 것을 더 권장함.
        valueOf()는 동일한 값이 동일한 인스턴스임을 보장한다.
         */

        System.out.println("valueOf() : " + (Integer.valueOf(123)==Integer.valueOf(123)));
        //래퍼는 이렇게 하는게 동일한 값을 ? 2:11 ㅇㄻㅇㄻㅇㄻㅇㄹ ㅁㅇㅇㅁㄹ


    }
}
