package list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application05 {

    public static void main(String[] args) {

        /*Queue는 인터페이스이기 때문에, 인스턴스를 만들 수 없다.
        오버라이드 해야만 만들 수 있다.
        인터페이스는 자손들을 가지고 생성한다.

        큐는 특이하게 링크드리스트로 많이 구현한다.
         */

        Queue<String> que = new LinkedList<>();
        //링크드리스트자료형을 객체로 생성해서 넣어줌.

        //que에 값 넣기 (add아니고 offer!)
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);
        //오러라이드 되어있음. 이름으로 출력하면 내용물이 나오게 됨.
        //리스트들은 보통 오버라이드 되어있어서, 이름만으로 출력 가능.




    }
}
