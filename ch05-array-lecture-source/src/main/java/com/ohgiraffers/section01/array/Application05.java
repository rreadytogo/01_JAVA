package main.java.com.ohgiraffers.section01.array;
//#
public class Application05 {

    public static void main(String[] args) {

        // 랜덤한 트럼프카드 뽑기

        //배열2개 사용

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] number = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};

        int shapesNumber = (int)(Math.random()*shapes.length);
        int chNumber = (int)(Math.random()*number.length);
//        배열에 넣어둔 값 중 하나가 랜덤으로 발생할 것
//        #(int) 이거 왜 붙이더라? -> 정수로 나타내기 위해 (소수점 버림)

        System.out.println(shapes[shapesNumber] + number[chNumber]);








    }
}
