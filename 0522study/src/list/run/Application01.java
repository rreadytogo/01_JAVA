package list.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

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


        // ☆ㅁㄹㅇㅁㄴㄹㄴ해쉬셋 해쉬맵 같은 것은 코딩테스트 빈출!

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
        //리스트끼리 호환할 수 있음.
        // 부모클래스로 하는 것을 선호함
        // 부모타입으로 정의함.
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
        //정수, 실수 등 기본타입은 오토박싱이 된다.

        System.out.println("list : " + list);
        //넣은 순서대로 들어간 것을 확인할 수 있따.

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

        // 모든 컬렉션은 제네릭으로 되어있다? 11:01 ㅁㄹㅇㄻㄴㅇㄹ

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
//        stringList.add(123);
        // 이거 아까 book이랑 연관된건가?
        // -> ㄴㄴ! 자료타입이 String이어서!
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
        System.out.println("StringList = " + stringList);
        //넣는 순서대로 정의됨
        // 리스트에서는 인덱스에서 지정해준 걸 add에서 정의!

        // 내림차순 정렬하기.
//        stringList = new LinkedList<>(stringList);
//
//        Iterator<String>dIter = ((LinkedList<String>) stringList).descendingIterator();

        stringList = new LinkedList<>(stringList);
        //얘의 자료형은 List.
        //뉴 링크드리스트해서. 스트링리스트 넣어서 링크드리스트로 형변환!
        //자료타입 : list
        //자료형이 바뀐 것이 아니다. 링크드리스트 안에 있는 메서드를 사용하고 있기 때문에 ->  넣어주는 값이 바뀐 것.

        // 링크드리스트 생성하는데, 인자로 스트링리스트를 받은 것. 애가 이값을 가지고 링크드리스트 만들고 그걸 자기자신 스트링리스트에 넣고
        // 자기자신이 링크드리스트로 바ㅜ끼는 것. ㅇㄻㄻㅇㄴㅁㄹㅇㅁㄴㄹㄴㅁㅇㄹㅇㄹ

        Iterator<String>dIter = ((LinkedList<String>)stringList).descendingIterator();
        //자료타입 변수명                           형변환        내림차순정렬 매소드

        //list에선 링크드리스트에 접근하지 못하니까, 접근하기 위해 자식클래스로 형변환 하는 것.
        //인터레이터통해서. 얘도 리스트니까 인덱스가 있음!
        //디센딩~의 반환타입이 인터레이터기 때문에 이렇게 사용하는 것.


        List<String>descList = new ArrayList<>();
        //dIter를 리스트에 담는 과정
        //어레이리스트 : 알아서 늘어난다
        //애들 할 때마다 인덱스 알아서 늘어남

        while(dIter.hasNext()){
            descList.add(dIter.next());
        }

        // while문에 디이터가 해즈넥스트 다음 요소를 가지고 있을 때까지 반복. 없으면 false 나오니까
//         다음요소가 없을 때까지 어레이리스트에 넣어주는 것.

        //어레이는 하나씩 늘어남.
        //이터레이터에 존재하는 메서드들을 가지고 어레이리스트에 하나씩 담아주고 있는 것. add를 통해서.

        // 디센딩인터레이터로 내림정렬 한 후, 반복자(Iterator<String>에 담아서 어레이리스트에 담는 과정.

        System.out.println("descList = " + descList);




    }
}
