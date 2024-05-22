package main.java.com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application05 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지의 클래스들에 포매팅(형식)을 적용하여 출력할 수 있다. */
        String timeNow = "14:05:10";
        String dateNow = "2022-10-12";
        // 기본 양식

        LocalTime localTime = LocalTime.parse(timeNow);
        //parse : 특정 타입의 객체로 변환하는 메서드.
//        문자열 timeNow를 LocalTime 객체로 변환하여 localTime 변수에 할당하는 것을 의미합니다.
//        변환에 성공하면 localTime 변수에는 해당 시간을 나타내는 LocalTime 객체가 저장됩니다.
        LocalDate localDate = LocalDate.parse(dateNow);
        //객체(인스턴스) : object. ex)관심의 대상
        //               클래스에서 작용하는 대상
//                       클래스 내 특정 작업을 수행하는 하나의 단위

        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);



        System.out.println("timeNow = "+localTime);
        System.out.println("dateNpw = " +localDate);
        System.out.println(localDateTime);

        String timeNow2 = "14-05-10";
        String dateNow2 = "221005";   // 다른 양식

        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        LocalDate localDate2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));

        System.out.println(localTime2);
        System.out.println(localDate2);

        String dateFormat = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH mm"));

        System.out.println(dateFormat);
        System.out.println(timeFormat);


    }
}
