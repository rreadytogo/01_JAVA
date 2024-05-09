package main.java.com.ohgiraffers.section05.typecasting;

public class Test {
    public static void main(String[] args) {


        /*5명의 학새이 있으며 학생의 키는 각각
        178.5 / 170.3 / 190.7 / 188.67 / 160.8
        우리는 학생의 평균키를 구해서 화면에 보여주고자 한다. (소수자리 절삭)
        화면에 보여지는 양식은 다음과 같다
        1반 학생 5명의 평균 키는 ()cm이다.
         */

        float height = 178.5f;
        float height2 = 170.3f;
        float height3 = 190.7f;
        float height4 = 188.67f;
        float height5 = 160.8f;

        float average = ((height + height2 + height3 + height4 + height5) / 5);
        int iaverage = (int)average;


        System.out.println(average);
        System.out.println("1반 학생 5명의 평균 키는 (" + iaverage + ")cm이다.");

        System.out.println("----------------------------------------");







    }
}
