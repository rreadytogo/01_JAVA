package method;

public class Application03 {

    int test = 10;

    public static void main(String[] args) {

        /* 변수의 종류
        1) 지역변수 2) 매개변수 3) 전역변수(필드) 4) 클래스(static)변수

         */

        int a = 10;
        int b = 20;

        // main -> testmethod, 즉 static -> staticX를 호출하려면 Class에 공간 할당

        Application03 app3 = new Application03();
        app3.testMethod(28);
//        app3.testMethod(20,30); 이처럼 전달인자의 개수가 차이나면 Error!
//        app3.testMethod("40"); 테스트메서드에 int라고 정해져있는데, "" 문자를 보내려고하니 Error!
//        app3.testMethod(); Error!
        //매개변수가 있으면 꼭  넣어서 전달해줘야 함.

        //변수에 저장한 값 전달 테스트
        int age = 20;
        app3.testMethod(age);
        //당신의 나이는 20세입니다 출력

        //자동 형 변환을 이용한 값 전달 테스트
//        더 작은 자료형 -> 큰 자료형일 때
        byte byteAge = 28;
        app3.testMethod(byteAge);
        //28세 출력됨.

        // 강제 형 변환을 이용한 값 전달 테스트
//        큰 자료형 -> 작은 자료형일때.
        long longAge = 30;
//        app3.testMethod(longAge); error!
        app3.testMethod((int)longAge);

        //연산 결과를 이요한 값 전달 테스트
        app3. testMethod(byteAge*2);




        



    }

//   /* public void methodA(){
//        /*1. 지역변수
//        이 안에선 int a를 찾을 수 없다.
//        왜? a는 메인 메서드에서만 존재.
//        같은 클래스에 있어도 다른 메서드에서 찾을 수 없다.
//
//       2. 매개변수
//       다른 메서드로 넘겨주는 변수 => 매개변수
//       계산기 만들 때,
//       public void methodA(int a, int b) 이렇게 만들었었는데.
//       값을 전달할 수 있는 그런 변수라고 보면 됨.
//       이거 역시 일종의 ㅣㅈ역변수.
//       변수를 받은 메서드A 내부에서만 사용가능.
//       int a, int b로 자료형 언급된 이유: 전달인자(메인메서드 내 int a,b)와 매개변수
//        ---(int a, b 메소드( ) 괄호 안에 위치.---
//        는 같은 자료형이여야만.
//
//       3. 전역변수
//       int test.
//       class 전체에서 사용할 수 있는 변수.
//       클래스와 메인메서드 사이에 선언한다.
//       class 내 모든 메서드 전체에서 접근할 수 있다.
//
//       1~3을 많이 사용한다.
//
//       4. 클래스(static) 변수
//
//
//
//         */
//
//
//
//
//    } */

    //        전달인자로 매개변수로 값을 전달하는 것을 해볼 것.

    public void testMethod(int age) {
        //(int age) : int age 정수를 받아야한다.
       /* int age 해서 나이를 받아볼거고.
       //        나이드를 메서드에 전달하면, 이러한 메세지를 출력하게 만드는 메서드!
 */

        System.out.println("당신의 나이는 " + age + "세 입니다.");
//        나이드를 메서드에 전달하면, 이러한 메세지를 출력하게 만드는 메서드!

    }
}
