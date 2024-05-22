package main.java.com.ohgiraffers.section05.calendar;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application02 {

    public static void main(String[] args) {
        /*

        API 문서를 살펴보면 Calendar 클래스는 abstract 클래스로 작성되어 있다.
        따라서 Calendar 클래스를 이용해서 인스턴스 생성하는 것이 불가능함

        Calendar 클래스를 이용한 인스턴스 생성 방법 2가지
        1. getInstance() static 메서드를 이용해서 인스턴스를 반환받는 방법
        2. 후손클래스인 GregorianCalendar(국제표준시간 상속받아 구현한것)  클래스를 이용해서 인스턴스를 생성하는 방법

         */

        //1. getInstance() 메소드 이용
        Calendar calendar = Calendar.getInstance();
        //static이니까 new 없이



        /*

        toString()이 오버라이딩 되어 있어 모든 필드값을 확인할 수 있다.
        Date 클래스에 비해 매우 많은 필드들이 값을 가지고 있다.

        또한 생성된 인스턴스의 타입이 후손 클래스 타입인 GregorianCalendar 타입인 것을 확인할  수 있다
        이 방식으로 인스턴스 생성하면 운영체제의 날짜 / 시간 정보를 이용해서 인스턴스 생성하게 됨

        month는 0부터 시작하기 때문에 5월이면 4로 출력됨.
        ,MONTH=4,
         */
        System.out.println(calendar);

        // 특정 날짜 / 시간 정보를 이용해서 인스턴스를 생성하는 방법을 그레고리안캘린더의 생성자로 제공.
        //날짜를 매개변수로 받는게 있다. 원하는 날짜를 입력할 수 있는 것

        Calendar gregorianCalendar = new GregorianCalendar();
        //자식을 부모에게 넣어준 것.

        System.out.println(gregorianCalendar);
        //똑같은 내용 출력됨. 캘린더도 그레고리안캘린더로 만들어줌
        
        // 연 월 일 시 분 초 정보를 이용하여 인스턴스를 생성해볼 것.
        // 2014 년 9월 8일 16:42:00
        
        //인스턴스 : 한 프로그램을 구성하는 인자/기능들..!?
        
        int year = 2014;
        int month = 8;
        //0부터 시작이니까 8
        int dayOfMonth = 8;
        int hour = 16;
        int min = 42;
        int second = 0;
        
        Calendar choiceDay = new GregorianCalendar(year,month,dayOfMonth,hour,min,second);

        System.out.println("choiceDay = " + choiceDay);

        /*
        상황에 따라 특정 일자를 기준으로 한 Date 타입의 인스턴스가 필요한 경우도 있다.

        먼저 GregorianCalendar를 이용해서 특정 날짜 / 시간 정보로 인스턴스를 생성한 후
        1970년 1월 1일 0시 0분 0초를 기준으로 지난 시간을 millisecond로 계산해서 long형으로 반환하는 메소드가 있다

         */

        System.out.println(choiceDay.getTimeInMillis());

        Date date = new Date(choiceDay.getTimeInMillis());

        System.out.println("date = " + date);

        //실제 사용시 형태
        Date date2 = new Date(new GregorianCalendar(year,month,dayOfMonth,hour,min,second).getTimeInMillis());

        System.out.println("date2 = " + date2);

        //생성된 인스턴스의 필드 정보를 Calendar 클래스에 있는 get() 메소드를 사용하여 반환받을 수 있다

        int choiceYear = choiceDay.get(1);
        int choiceMonth = choiceDay.get(2);
        int choiceDayOfMonth = choiceDay.get(5);

        //2014.9.8
        System.out.println(choiceYear); //2014
        System.out.println(choiceMonth); //8
        System.out.println(choiceDayOfMonth); //8

        /*

        인자로 전달하는 정수에 따라 필드 값을 반환받을 수 있지만
        각 필드에 매칭되는 매개변수의 위치 정수를 다 외워야 사용이 가능해지기 때문에
        상수필드형태로 제공하고 있다.

         */

        System.out.println(choiceDay.get(Calendar.YEAR));
        System.out.println(choiceDay.get(Calendar.MONTH));
        System.out.println(choiceDay.get(Calendar.DATE));
        System.out.println(choiceDay.get(Calendar.DAY_OF_WEEK)); //요일을 정수로 표현해주는것. 2로 출력됨.
        //일요일부터 시작함.

        System.out.println(choiceDay.get(Calendar.AM_PM)); //0 : 오전 1: 오후

        System.out.println(choiceDay.get(Calendar.HOUR));        //12시간 표기
        System.out.println(choiceDay.get(Calendar.HOUR_OF_DAY)); //24시간 표기







        
        
        








    }
}
