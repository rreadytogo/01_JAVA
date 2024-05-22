package main.java.com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args) {
        
        /*
        컬렉션 프레임워크
        자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        표준화된 방법을 제공하는 클래스들의 집합을 의미
        
        => 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스.
        
         */
        
        /*
        Collection Framework는 크게 3가지 인터페이스 중 한 가지를 상속받아 구현해놓았다.
        1. List 인터페이스
        2. Set 인터페이스
        3. Map 인터페이스
        
        List 인터페이스와 Set 인터페이스의 공통 부분을 컬렉션 인터페이스에서 정의하고 있다
        But map은 구조상의 차이로 컬렉션 인터페이스에서 정의 X
               
         */
        
        /*
        
        각 인터페이스의 특징
        1. List 인터페이스
        순서있는(인덱스있는) 데이터의 집합으로 데이터의 중복 저장 허용
        ex) vector, ArrayList, LinkedList, Stack, Queue 등
        
        2. Set 인터페이스
        순서가 없는 데이터의 집합으로 데이터의 중복 저장 X
        ex) HashSet, TreeSet 등
        
        3. Map 인터페이스
        키와 값 한 쌍으로 이루어지는 데이터 집합
        key를 set방식으로 관리하기 때문에 데이터의 순서를 관리 X & 중복된 키 허용 X
        Value는 중복된 값 저장할 수 있음.
        ex) HashMap, TreeMap, HashTable, Properties 등



        
         */

        /*

        List 인터페이스를 구현한 모든 클래스는 요소의 저장 순서가 유지되며, 중복저장 허용
        ArrayList, LinkedList, Vector, Stack, Queue

         */

        /*

        ArrayList
        가장 많이 사용되는 컬렉션 클래스.
        jdk 1.2버전부터 제공
        내부적으로 배열을 이용하여 요소를 관리,
        인덱스를 이용하여 배열요소에 빠르게 접근.

        배열의 단점을 보완하기 위해 만들어짐.
        배열은 크기를 변경할 수 없고, 요소의 추가/삭제/정렬 등이 복잡하다는 단점.
        어레이리스트는 그런 단점을 보완하고자 크기 변경/요소추가/삭제/정렬 기능들을 미리 메소드로 구현해서 제공함.
        (자동으로 수행되는 것이지 속도가 빨라지는 것은 아니다)

         */


        ArrayList alist = new ArrayList();


        List list = new ArrayList();
        // 이걸 가장 많이 쓰긴 함

        Collection clist = new ArrayList();
        //리스트- Set 호환하기도.
        //그 위에 컬렉션.

//        ============================================================================

        list.add("apple");
        //리스트에서는 인덱스에서 지정해준 걸 add에서 정의!
       list.add(45.67);
        list.add(123);
        list.add(new Date());
        //어떤 타입이든 들어가는 것을 확인할 수 있다

        System.out.println("list : " + list);
        //순서 ㅇ

        //요소는 확인할 수 없지만 들어간 요소들의 길이를 확인하는 방법은 있다

        System.out.println("list의 size : "  + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+" : " + list.get(i));
        }

        // 어레이리스트 기능 써보기 //

        //  ㄱ. 값 추가

        list.add("apple");
        System.out.println("list = " + list);
        System.out.println("list = " + list);
        //마지막 인덱스에 애플추가된 것을 볼 수 있다.
        //값을 인덱스로 관리해서, 중복되는 것은 신경쓰지 않는 것.
        //근데 이건 배열도 마찬가지 아니야?ㅁㅇㄻㄴㄻㄴㅇㄻ


        // ㄴ.원하는 인덱스에 값추가
        list.add(1,"banana");
        System.out.println("list = " + list);

        // ㄷ. 값 삭제
        list.remove(2);
        System.out.println("list = " + list);

        // ㅁ. 수정 가능
        list.set(1,Boolean.valueOf(true));
        System.out.println("list = " + list);

        // 모든 컬렉션은 제네릭으로 되어있다?  ㅁㄹㅇㄻㄴㅇㄹㅁㅇㄹㅇㅁㄴ 엥???

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
//        stringList.add(123);
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
        System.out.println("stringList = " + stringList);

        // ㅂ. 정렬 - 오름차순
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);

        //   ㅂ-2. 정렬 - 내림차순
        //어레이리스트에서 기본 제공x
        //=> 링크드리스트로 형변환 해서 사용할 것.
        stringList = new LinkedList<>(stringList);
        //뉴 링크드리스트해서. 스트링리스트 넣어서 링크드리스트로 형변환!
        //자료타입 : list

        /*
        
          Iterator 란?
          Collection 인터페이스 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
          컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
          반복자라고 불리우며, 반복문을 통해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
          인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 이용해서 요소에 하나씩 접근할 수 없기 떄문에
          인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
          
           => 반복문을 못쓰는 곳에서 반복문을 쓰기 위해 사용한다.
          
          hasNext() : 다음 요소를 가지고 있는 경우 true, 없는 경우 false 변환
          next()    : 다음 요소를 반환
          

         */
        
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();



        List<String> descList = new ArrayList<>();
        //어레이리스트 : 알아서 늘어난다
        //애들 할 때마다 인덱스 알아서 늘어남


        while (dIter.hasNext()){
            descList.add(dIter.next());
//
        }
// 디센딩인터레이터로 내림정렬 한 후, 반복자(Iterator<String>에 담아서 어레이리스트에 담는 과정.

        System.out.println("descList = " + descList);









    }
}
