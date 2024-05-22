package main.java.com.ohgiraffers.section01.section02.set.run;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application02 {

    public static void main(String[] args) {
        /*

        LinkedHashSet 클래스
        HashSet이 가지는 기능을 모두 가자ㅣ고 있고
        추가적으로 저장 순서를 유지하는 특징을 가지고 있다
        jdk 1.4 부터 제공하고 있다.

         */

        LinkedHashSet<String>lhset = new LinkedHashSet<>();
        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset = " + lhset);

        //오름차순 정렬

        TreeSet<String> tset = new TreeSet<>(lhset);
        System.out.println(tset);
        //트리셋에 넣으면 알아서 오름차순 정렬을 해준다.


    }
}
