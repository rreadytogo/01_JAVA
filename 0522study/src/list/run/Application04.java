package list.run;

import java.util.Stack;

public class Application04 {

    public static void main(String[] args) {

        //인스턴스 생성
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        //정수 자료형 stack 만들었음.

        System.out.println(integerStack);
        //변수명만 넣었는데 나온 이유는 오버라이딩
        //리스트들은 보통 오버라이드 되어있어서, 이름만으로 출력 가능.

        //요소를 찾을 때
        System.out.println(integerStack.search(5));

        //stack은 후입선출.

        System.out.println(integerStack.peek());
        System.out.println(integerStack.peek());



    }
}
