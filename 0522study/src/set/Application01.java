package set;

import java.util.HashSet;
import java.util.Iterator;

public class Application01 {

    public static void main(String[] args) {

        //인스턴스 생성하기
        HashSet<String> hset = new HashSet<>();

        hset.add(new String("java"));
        hset.add(new String("jdbc"));
        hset.add(new String ("oracle"));
        hset.add(new String ("css"));

//        hset.add("java");
        //컴파일상 오류는 안나지만, 중복값이라 추가X
        //기존에 있던 자바 제거하고 이 자바 넣는 것.
        System.out.println(hset);

        System.out.println(hset.size());
        //이 친구도 사이즈 메서드 가지고 있다.

        System.out.println(hset.contains("java"));
        /*우리가 입력하는 값이 안에 존재하는지 판단.
        //우리가 new로 넣었어도 같은 값을 가지고 있기 때문에,
        //true! 객체로 다른 주소값을 만들어서 넣었어도
        //같은 값을 가지고 있으면 있다고 판단해버림.*/

        System.out.println(hset.contains(new String("java")));
        /*주소값 비교긴 하지만, 문자값을 동일한 걸 넣어버리면
        //우리 오버라이딩 했을 때. 주소값 맞춰주는거
        //이미 적용되어있음.
        문자열과 똑같은 값 들어오면 그걸로 비교해서 같은 값이면 true!
        오버라이딩 주소값 맞춰주기에서 했음 (5/11?)
         */

        //set은 인덱스가 없다. 저장된 객체를 하나씩 꺼내는 기능이 없다
        // 어떤 식으로 처리해주느냐?

        //1. toArray 배열로 바꿔서 출력하기
        //hset 안에 있는 투어레이 메서드로 이용한 것.
        //반환타입은 오브젝트배열이라 오브젝트 배열로 받은 것.
        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+" : "+arr[i]);
        }
        //이렇게 array로 바꾸면 안에서 for문 돌릴 수 있다.

        //2. Iterator
        //반복문이 없는 곳에 반복문을 쓸 수 있게 해주는.

        Iterator<String> iter = hset.iterator();

        //이건 hasnext와 next로 보면 된다.
        while(iter.hasNext()){
            //다음값이 있을 때까지 반복
            System.out.println(iter.next());
            //next : 반환 후 삭제되는 것
        }








    }
}
