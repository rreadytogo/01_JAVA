package main.java.com.ogiraffers.section01.method;
// # 다시 넘겨 짚고 갈 것
// 메서드의 기본 개념과 메서드 동작 순서 알아보기

public class Application01 {
    //메인 메소드 실행과 메인 메소드 밖에서 다른 메소드 실행하는 법 - static 설정하기(?)
    public static void main(String[] args) {

        /*
        메소드란?
        메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합
        ★ 메서드는 calls {} 안에서만 존재한다

        ㅇ 메소드

명령문의 집합

더하기 실행하기 위한 명령문들의 집합

메인 매서드 코드 작성 -> 값을 넣고 호출 하면 -> 출력




VOID : 접근허용범위.
PUBLIC : 프로젝트 전체에서 이 메서드에 접근할 수 있게
void : 아무것도 반환하지 않겠다


         */

        System.out.println("main() 메소드 시작됨...");

        Application01 app = new Application01();
        app.methodA();
        //STATIC이 없는..! (???) 뭔말이야



        /*
         * CLASS 자료형.
         자료형의 예인 int의 경우,
         사용하려면 초기화해야 (=값 대입)
         ex. int a = 3;
         So, class 안에 값을 대입해야 사용할 수 있다


         * class안에 뭘 넣을지 몰라.(숫자든..문자든)
//         NEW 이용해서 CLASS 자체 복사해서 넣어주는 것
                ㄴ???이건 또 스태틱유무랑 관계있는거 아닌가? 이게 왜 나왔지??
//         메인메서드 내 다른 메서드 사용하려면 복제해야한다.
         */

        System.out.println("main() 메소드 종료됨...");

    }

    public void methodA() {

        System.out.println("methodA() 호출");


        methodB();
        System.out.println("methodA() 종료");
        // 실행시키면 MAIN만 출력됨
//        a호출하려면? -> static(???)이 없기 때문에 클래스 자가복제.
        //        Application01라는 CLASS 생성.
//        Application01  app   =  new Application01();
//        클래스명       변수명   =  new 클래스명();
//        app.methodA();
//        적어줌.

    }

    public void methodB() {

        System.out.println("methodB() 호출");

        System.out.println("methodB() 종료");
    }

/* 작동순서
MAIN METHOD 시작 -> methodA 호출 -> methodB 호출 -> B종료 -> A종료 -> 메인메소드 종료
 */
//  application01과 달리 여기는 왜 a 호출 -> b 호출이지?
//    그러고보니 여기선 b 호출 없는데도... 됐네? -> mA안에 mB가 있으니까~


}
