package main.java.com.ogiraffers.section01.method;
// 정수2개 받아 최소값 리턴, 최대값 리턴하는 메서드 만들기


public class Calculator {

    // 둘 중 최솟값을 리턴

    public int minNumberOf(int first, int second) {
        return (first > second) ? second : first;

    }

// 둘 중 최댓값을 리턴
    public static int maxNumberOf(int first, int second){
        return (first > second) ? first : second;
    }



}
