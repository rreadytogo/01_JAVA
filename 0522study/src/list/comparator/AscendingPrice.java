package list.comparator;

import list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    //정렬기준을 강제로 만들기 위해 만든 클래스.

    // implements Comparator<BookDTO>
    // 임플리먼트로 인터페이스 상속받아야지!
    // BookDTO를 정렬할 것 -> BookDTO를 <>안에 넣어줄 것.


    @Override
    public int compare(BookDTO o1, BookDTO o2) {
//        return 0;
        //()안 o1, o2 순서 의미 있음. 막 설정한 것 아니다!
        //이걸 재정의해주면 정렬이 바뀔 것.
        //북디티오 o1,02 2개를 보내게 되면
        //오름차순으로 정렬했을 때 o1 > o2 ->
        //그럴 때 양수 반환


        int result = 0;
        if(o1.getPrice() < o2.getPrice()){
            result = -1;
        } else if(o1.getPrice() > o2.getPrice()){
            result = 1;
        } else {
            result = 0;

        }
        return result;


    }
    //이 부분만 추상메서드였다(?)
}
