package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application03 {

    public static void main(String[] args) {




        TreeSet<String> tset = new TreeSet<>();

        Set<String> tset2 = new TreeSet<>();
        /*

         Set<String> tset2 = new TreeSet<>();
        얘도 이렇게 쓸 수 있다.
        set에다가 new treeset으로 넣을 수 있다.
        set의 자식이기 때문에.

         */

        tset.add("java");
        tset.add("oracle");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");
        System.out.println(tset);

        //연속처리 해주려면 set자체론 할 수 없다. iterator!
        Iterator<String> iter = tset.iterator();

        while(iter.hasNext()){
            //while문으로(이터가 next가 있으면)
            System.out.println(iter.next().toUpperCase());
            //이터의 넥스트 이걸 toUpperCase로.
        }
        //next는 제거, iter는 비어있다. (next로 제거되어 -> iter가 비게 됨)
        //또 다른 배열을 만들려면

        Object[] arr = tset.toArray();
                //티셋을 가져다 써야 함.

        for (Object obj : arr) {
            System.out.println(((String)obj).toUpperCase());
            /*
            투 어퍼케이스는 스트링이 가진 기능.
            api에서 봤듯
            형변환을 해야한다. 강제로
             */
            //형변환, 스트링 관련 메서드 등 이용.
        }

        //트리셋으로 로또번호 발생시키기

        Set<Integer>lotto = new TreeSet<>();
//     셋에 인티저 넣고

        while(lotto.size() < 6){
            //로또라는 셋의 사이즈가 6보다 작을 때까지.
            lotto.add(((int)(Math.random() * 45))+1);
        }
        System.out.println(lotto);

        //내일 로또 프로그램 만들어볼 것!


    }
}
