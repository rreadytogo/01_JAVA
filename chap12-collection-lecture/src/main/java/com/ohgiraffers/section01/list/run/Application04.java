package main.java.com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application04 {

    public static void main(String[] args) {

        /*
        Stack

        리스트 계열 클래스의 vector 클래스를 상속받아 구현하였다.
        스택  메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        후입 선출 (LIFO - Last in First OUT)방식의 자료 구조라 불림.

         */

        //인스턴스 생성
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);
        //오버라이딩.

        // 요소를 찾을 때
        System.out.println(integerStack.search(5));
        //순서가 아니라 순번.
        // 값이 1,2,3,4,5 인데 제일 나중에 들어온게(가장 상단의 값. 5개의 계단 중 가장 밑의 값이 1. )
        // 1이라 다섯번째 순서인 1 출력됨.

        /*
        peek() : 해당 스택의 가장 마지막에 있는 요소(가장 상단에 있는) 요소 반환
        pop()  : 해당 스택의 가장 마지막에 있는 요소 반환 후 제거
         */

        System.out.println(integerStack.peek());
        System.out.println(integerStack.peek());
        //내부의 값을 보는게 아니라 제일 위에 있는 값을 봄.
        System.out.println(integerStack);

        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
//        System.out.println(integerStack.pop());
        //컴파일상 오류는 나지않지만, 실행하면 오류!





    }
}
