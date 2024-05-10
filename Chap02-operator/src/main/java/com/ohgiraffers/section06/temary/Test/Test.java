package main.java.com.ohgiraffers.section06.temary.Test;

public class Test {

    public static void main(String[] args) {

        /*영어시험을 본 결과 1번 학생은 90점, 2번 학생은 95점, 3번 학생은 81점, 4번 학생은 88점.
        평균을 구한 후 90~100점 사이에 있는 학생은 합격, 아니라면 불합격을 출력하시오.

         */

        int stu1 = 90;
        int stu2 = 95;
        int stu3 = 81;
        int stu4 = 88;
        int aver = (stu1+stu2+stu3+stu4) / 4;
        System.out.println("4명 학생의 평균은 " + aver);

        System.out.println("-------------------------------");


        String result1 = (stu1>=90 && stu1<=100)? "합격" : "불합격";
        String result2 = (stu2>=90 && stu2<=100)? "합격" : "불합격";
        String result3 = (stu3>=90 && stu3<=100)? "합격" : "불합격";
        String result4 = (stu4>=90 && stu4<=100)? "합격" : "불합격";

        System.out.println("1번 학생의 결과는 " + result1);
        System.out.println("2번 학생의 결과는 " + result2);
        System.out.println("3번 학생의 결과는 " + result3);
        System.out.println("4번 학생의 결과는 " + result4);

    }
}
