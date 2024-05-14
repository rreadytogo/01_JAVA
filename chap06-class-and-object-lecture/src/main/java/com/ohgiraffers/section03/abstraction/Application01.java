package main.java.com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /* 객체 지향 프로그래밍
        현실세계의 모든 사건(event)는 객체와 객체의 상호작용에 의해 일어난다는 세계관을
        프로그램을 만들 때 이용하여 새로운 세계를 창조하는 방법론.

        현실세계와 닮아있지만 현실 세계와 다른 점은
        객체 간의 상호작용을 한다는 사실은 현실 세계와 동일하지만,

        의인화 기법이 적용되어 현실세계에서 불가능한 무생물이나 개념같은 것들도 하나의 주제로
        본인의 상태를 스스로 제어하고 행동하도록 한다는 것이 현실 세계와 다른 점이다.
        => 나라는 객체가 문이라는 객체에 열리라고 명령을 하는 것.

        ㅇ 객체는 책임을 가지고 자신의 역할을 수행해야 한다.

        ㅇ 하나의 객체는 적정 수준의 책임을 가지고 있어야 한다. (하나의 객체에 너무 많은 역할 부여x)

         */


        /* 추상화
        객체를 설계해서 프로그래밍 하려면 추상화라는 것을 해야한다
        공통된 부분 추출, 공통X부분 제거
        추상화의 목적 : 유연성 확보
        -> 여러 곳에 적용될 수 있는 유연한 객체, 즉 재사용성 ↑
        -> 중복 작성 코드 ↓, 오류 발생 가능성 ↓, 유지보수성 ↑
         */

        /*
        객체와 객체의 상호작용이란?
        객체와 객체는 메세지를 통해 서로 상호작용을 한다.
        송신자 : 메세지 보내는 쪽
        수신자 : 메세지 받는 쪽
        메소드 : 수신자가 그 메세지에 해당하는 내용을 처리하는 방법을
        스스로 결정하고, 그 결정한 방법대로 처리할 명령어들을 순차적으로 기술한 것.

        상호작용에 중요한 것은 메시지를 송수신하고 그 방법을 기술하여 메세지에 응답하는 상호작용을 설계하는 것.
        따라서 객체를 설계할 때 속성은 부가적이며 적절한 책임을 가진 객체들간의 주고 받는 메세지를 이용해
        상호작용하는 것을 설계하는 것을 의미.

        즉, 추상화란
        필드보다는 메소드를 중심으로 추상화기법을 적용하여 객체를 설계하고,
        그 객체를 구현하는 방법으로 설계한 대로 클래스를 작성하는 것.
         */

        //수신자 어플리케이션 몬스터 송신자





        /* 프로그램 개요
        ㅇ 카레이서가 자동차를 운전하는 프로그램

        ㄱ. 시스템 요구사항
           카레이서 : 시동걸기 액셀밟기 브레이크 밟기 시동끄기
           자동차 : 시동걸기 앞으로가기 멈추기 시동끄기
           자동차는 처음에는 멈춘 상태로 대기
           카레이서는 먼저 시동건다. 이미 걸려있는 경우 다시 시동걸 수 X
           카레이서가 액셀을 밟으면 시동이 걸린 상태_자동차는 시속이 10km/h씩 증가하며 앞으로 나감
           자동차가 달리는 중_ 브레이크 밟으면 시속은 0으로 떨어지며 멈춤
           브레이크를 밟을 때 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 안내
           카레이서가 시동을 끄면 더 이상 자동차는 움직이지 않는다
           자동차가 달리는 중이라면 시동을 끌 수 없다

        */

        /*프로그램 설계
        1. 필요한 객체 도출
        - 플레이어(사용자), 플레이어의 명령을 받을 카레이서, 카레이서의 명령을 받을 자동차

        2. 객체 간 상호작용
            cf. 상호작용 : 송수신 주고받는 것

            2-1. 카레이서가 수신할 수 있는 메세지(카레이서가 해야 하는 일)
              1. 시동 걸기 2. 액셀 밟기 3. 브레이크 밟기 4. 시동끄기

            2-2. 자동차가 수신할 수 있는 메세지
               1. 시동 걸기 2. 앞으로 가기 3. 멈추기 4. 시동끄기

        3. 커뮤니케이션 다이어그램

            1. 시동걸기

                사용자 ------> 시동 걸어라 ---- > 카레이서 ------> 시동 걸어라 ---- > 자동차
                      <------------------               <-----------

             2. 가속하기
                             사용자 ------> 액셀 밟아라 ---- > 카레이서 ------> 앞으로 가라 ---- > 자동차
                                         <------------------               <-----------

             3. 정지하기
                             사용자 ------> 브레이크 밟아라 ---- > 카레이서 ------> 멈춰라 ---- > 자동차
                                         <------------------               <-----------

                                                      2. 가속하기


             4. 시동끄기       사용자 ------> 시동 꺼라 ---- > 카레이서 ------> 시동 꺼라 ---- > 자동차

                                         <------------------               <-----------

         4. 클래스 설계하기

            1. 카레이서 클래스
                ㅇ 속성
                자동차가 있어야 함

                ㅇ 행위
                시동 걸어라 / 액셀 밟아라 / 정지해라 / 시동꺼라

            2. 자동차 클래스
                ㅇ 속성
                시동상태 가져야 함 (true / false)
                현재 시속 (10km씩 증가시켜야 하기 때문)

         */

        CarlRacer carRacer = new CarlRacer();

        Scanner scr = new Scanner(System.in);


        loop: while(true){
            System.out.println("----카레이싱 프로그램-----");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동끄기");
            System.out.println("9. 프로그램 종료");
            System.out.println(" 번호 선택 : ");
            int no = scr.nextInt();
            //조건문 사용할건데 12349 받을게 확실.  -> switch!
            //받을게 확실하다가 무슨 말이지




            switch (no) {
                case 1:
                    carRacer.startUp();
                    break;
                case 2:
                    carRacer.stepAccelator();
                    break;
                case 3:
                    carRacer.stepBreak();
                    break;
                case 4:
                    carRacer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                    break loop;


            }
//        if(no==9){break;
////while문 종료하는  break 이렇게 해도 된다.
//        }
            //true 있으면 무한루핑. 시동 끄고 프로그램 종료할 때만 break 걸 것


        }
    }
}
