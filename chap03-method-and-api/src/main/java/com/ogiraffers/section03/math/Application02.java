package main.java.com.ogiraffers.section03.math;

public class Application02 {

    public static void main(String[] args) {

        // 사용자 지정 범위의 난수를 발생시킬 수 있다.

        // 0~9까지 난수 발생
        int random1 = (int)(Math.random()*10);
        //1의 자리 이용할거라서 *10 할 것임
        System.out.println("0부터 9 사이의 난수 : " + random1);

        //1~10 까지의 난수 발생
        int random2 = (int)(Math.random()*10)+1;
        System.out.println("1부터 10사이의 난수 발생 : " + random2);

        //10~15까지의 난수 발생
        int random3 = (int)(Math.random()*6)+10;
                //소수점 절삭 위해 (int)
        System.out.println("10부터 15사이의 난수 발생 : " + random3);


    }
}
