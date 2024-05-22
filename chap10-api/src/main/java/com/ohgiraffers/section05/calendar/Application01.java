package main.java.com.ohgiraffers.section05.calendar;

import java.util.Date;

public class Application01 {

    public static void main(String[] args) {

        /*
        1. Date 클래스
        jdk 1.0부터 날짜를 취급하기 위해 사용되던 date 클래스는
        생성자를 비롯하여 대부분의 메소드가 deprecated 되어 있다

        cf.Deprecated?
        향후 버전이 업데이트 되면서 사라지게 될 기능이니,
        가급적이면 사용을 권장하지 않는다는 의미이다.
        하지만 하위 버전의 호환성 때문에 한 번에 제거되는 것은 아니고
        남겨두었기 때문에 사용하는 것이 가능하다
        ->jdk1.1부터 :  새롭게 제공되는 calendar 클래스를 이용하여 날짜와 시간에 관한 처리를 하게 된다


        BUT
        2. calendar 클래스의 문제점
        ㄱ. Calendar 인스턴스는 불변객체가 아니기 때문에 값을 수정할 수 있다.
        ㄴ. 윤초(leep second)는 고려하지 않는다
           ex. 2012 링크드인 대규모 서비스 서버 마비 발생
        ㄷ. Calendar 클래스는 월을 0부터 11까지 표현하는 불편함이 있다.
            사용자를 위해 볼 때 +1, 쓸 때 -1 하는 불편함.
            -> jdk 8 이상 : 이러한 문제를 해결할 수 있는 time 패키지 제공
        ㄹ.

         */

        Date today = new Date();
        System.out.println(today);
        System.out.println(today.getTime());

        Date time = new Date(1716270840946L);
        System.out.println(time);
    }
}
