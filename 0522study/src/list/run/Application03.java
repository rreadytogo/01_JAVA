package list.run;

import java.util.LinkedList;
import java.util.List;

public class Application03 {

    public static void main(String[] args) {


        //인스턴스 생성

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size());
        //요소들의 길이를 사이즈로 받을 수 있다.

        //얘도 리스트기 때문에 FOR문으로 받을 수 있다.
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList.get(i));
            //get(i)으로 꺼냄!
            //get으로 꺼내는 것도 똑같다.
        }

        linkedList.remove(1);
        for(String s:linkedList){
            System.out.println(s);
        }
        //향상되 for문 쓸 수 있다는 것 보여주려고 씀

//        linkedList.set(0, "fineapple");


    }
}