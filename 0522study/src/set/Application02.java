package set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application02 {

    public static void main(String[] args) {

        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        // 오름차순 정렬

        TreeSet<String> tset = new TreeSet<>(lhset);
        System.out.println(tset);
        //트리셋에 lhset을 넣으면 알아서 오름차순 정렬을 해줌!
    }
}
