package main.java.com.ohgiraffers.section03.stringbuilder;

public class Application01 {

    public static void main(String[] args) {
        //스트링과 스트링빌드, 스트링버퍼의 차이점

        /*
        두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.
        StringBuilder : 스레드 동기화 기능 제공 X
                        스레드 동기화 처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음

         StringBuffer : 스레드 동기화 기능 제공 O
                        성능면에서는 스트링빌더보다 느림

        두 개의 차이는 스레드 동기화 유무이고, 기능의 차이 X

        #면접
        스레드 동기화 여부.

         */

        /*
        String과 StringBuilder

        String = 불변이라는 특징을 가지고 있다
                 문자열에 + 연산으로 합치는 경우, 기존 인스턴스를 수정x
                 새로운 인스턴스 반환

                 -> 따라서, 문자열 변경이 자주 일어나는 경우는 성능면에서 좋지x
                 but, 변하지 않는 문자열을 자주 읽어들이는 경우에는 오히려 좋은 성능 기대할 수 있다

        String builder = '가변'이라는 특징
                          문자열에 append() 메소드를 이용하여 합치는 경우
                          기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성 X
                          -> 따라서, 잦은 문자열 변경이 일어나는 경우 String 보다 성능이 좋다.

        단, jdk 1.5 이후 버전에서는 문자열의 + 연산이 StringBuilder의 append()로 컴파일된다.
        -> 따라서 성능에 큰 차이 X

        but 반복문에서 문자열의 + 연산을 수행하는 경우 StringBuilder 인스턴스를
        반복루프 시마다 생성하기 때문에 성능에는 좋지 않은 영향.


        * jdk 1.4 이하
        * ----------------------------------------------
        * String str1 = "java";
        * String str2 = "oracle";
        * String str3 = str1 +str2;
        * String str4 = "";
        * * for(int i = 0; i < 10; i ++){
         *       str4 += str1;
         *   }

        * jdk 1.5 이상
        * ----------------------------------------
         * String str1 = "java";
         * String str2 = "oracle";
         * String str3 = new StringBuilder(str1).append(str2).toString();
         * String str4 = "";
         * * for(int i = 0; i < 10; i ++){
         *       str4 += new StringBuilder(str4).append(str1).toString();
         *   }
         *
         * 직접 이용
         * --------------------------------------------------
         * String str1 = "java";
         * String str2 = "oracle";
         * String str3 = new StringBuilder(str1).append(str2).toString();
         * StringBuilder str4 = new StringBuilder("");
         * *for(int i = 0; i < 10; i ++){
         *       str4.append(str1);
         *   }

         인스턴스 1번만 추가 되어, 효율적인 코드 작성이 가능하다.
         (cf 기존 : 인스턴스 10번 만들어지는건 1.4이하나 1.5이상이나 똑같아, 비효율성 초래함)
         */

        // 인스턴스 생성
        StringBuilder sb = new StringBuilder("java");

        //tostring 오버라이딩 되어있음.
        System.out.println("sb = " + sb);

        //hashcode는 되어있지 않음
        System.out.println("sb.hashCode() = " + sb.hashCode()) ;
        //동일객체만 같은 해쉬코드 나옴.

        //문자열 수정
        sb.append("oracle");
        System.out.println("sb = "+sb);
        System.out.println("sb.hashCode() = "+sb.hashCode());

        //같은 해쉬코드를 가지고 있음. 1:33
        //문자에 추가되어도 주소값이 변하지 않는다는 것을 보여줌.









    }
}
