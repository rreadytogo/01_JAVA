package main.java.com.ohgiraffers.section01.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application01 {

    public static void main(String[] args) {
        //저장순서 유지 x 인덱스 x

        /*

        Set 인터페이스를 구현한 Set 컬렉션 클래스
        1. 요소의 저장 순서를 유지하지 않는다
        2. 같은 요소의 중복 저장을 허용하지 않는다
           (Null 값도 중복하지 않게 하나만 저장함)

         */

        //고유성 보장 -> 데이터테스트에 효율적. 많이 사용함.

        /*

        HashSet
        set 컬렉션에서 가장 많이 사용되는 클래스 중 하나이다.
        jdk 1.2부터 제공하고 있으며 해시 알고리즘을 사용하여
        -> 검색 속도가 빠르다는 장점을 가짐.

         */

        HashSet<String> hset = new HashSet<>();

        hset.add(new String("java"));
        hset.add(new String("jdbc"));
        hset.add(new String ("oracle"));
        hset.add(new String ("css"));

//        hset.add("java");
        System.out.println(hset);
        System.out.println(hset.size());
        //size로 요소의 길이 측정 가능
        System.out.println(hset.contains("java"));
        //true반환. 다른 쥬속밧 가진 거 해도 값이 중복이라 true 출력
        System.out.println(hset.contains(new String("java")));

        //인덱스가 없어 한나씩 껀내줄 수 x
        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "  : " + arr[i]);
        }

        Iterator<String> iter = hset.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        //next 역시 반환 후 삭제됨.





    }
}
