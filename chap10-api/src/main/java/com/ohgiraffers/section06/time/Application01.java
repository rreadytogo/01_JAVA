package main.java.com.ohgiraffers.section06.time;

import java.time.*;

public class Application01 {

    public static void main(String[] args) {
        /*
        time 패키지는 jdk 1.8 버전에서 추가된 기능.
        Date, Calendar가 가지고 있는 단점을 해소하기 위해 탄생됨.

        time 패키지의 하위 패키지
        java.time
            .chrono : ISO-8601(국제표준)에 정의된 달력 시스템을 위한 클래스들을 제공
            .format : 날짜와 시간 파싱과 형식에 대한 클래스 제공
            .temporal :  날짜와 시간 필드 & 관련 단위 관련 클래스 제공
            .zone : 시간대 관련 기능 제공

        자주 쓰는 클래스
        LocalTime, LocalDate, LocalDateTime, ZonedDateTime 등이 있다

         */


        //게시판 :등록일 수정일 등 필요한데 저런 클래스 사용함.

        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNOow = " + timeNow);

        // 물론 시간 지정해줄 수 있다
        LocalTime timeOf = LocalTime.of(18,30,0);
        System.out.println("timeOf = " + timeOf);


        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);

        LocalDate dateOf = LocalDate.of(2023,1,19);
        System.out.println("dateOf = " + dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);

        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow,timeNow);
        System.out.println("dateTimeOf = " + dateTimeOf);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);

//        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf,timeOf, ZoneId.of("Asia/Seoul"));
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf,timeOf, ZoneId.of("America/New_York"));
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);



    }
}
