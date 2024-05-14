package main.java.com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {

        /* 깊은 복사

        heap에 생성된 배열이 가지고 있는 값을
        또 다른 배열에 복사를 해놓은 것.
        서로 다른 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
        하나의 배열을 변경핟러ㅏ도 다른 배열에 영향 주지 X

         */

        /* 깊은 복사 4가지 방법
        1. for문을 이용한 동일 인덱스 복사
        2. object의 clone을 이용한 복사
        3. System의  arraycopy()를 이용한 복사
        4. Array의 copyOF()를 이용한 복사

        이 중 가장 높은 성능을 보이는 것은
        순수배열의 복사를 위해 만들어진 arraycopy()메서드.
        가장 많이 사용되는 방식은 좀 더 유연한 방식인 copy()메소드
        clone()의 경우 이전 배열과 같은 배열밖에 만들 수 없다는 특징을 갖는다.
         */

        int[] originArr = new int[]{1, 2, 3, 4, 5};
        print(originArr);

        //1. for문을 이용한 동일한 인덱스 값 복사
        int[] copyArr1 = new int[10];
        //오리진배열을 카피에 넣고싶어. 5개밖에 없는데 10번이면 남죠.
        //복사받을 길이는 아무거나
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];

        }
        print(copyArr1);
        //1

        System.out.println("======================clone===================");
        // clone() 이용한 복사
        // 한계 : 동일한 길이의 배열만 사용할 수 있음
        int[] copyArr2 = originArr.clone();
        print(copyArr2);
        //2

        System.out.println("===============arraycopy==========================");

        // arrayCopy()를 이용한 복사
        int[] copyArr3 = new int[10];
        System.out.println();
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
                        //복사할배열 복사시작할배열순서 붙여넣을곳
        print(copyArr3);

        System.out.println("===============copyOf=========================");
        //copyof()를 이용한 복사
        int[] copyArr4 = Arrays.copyOf(originArr, originArr.length);
        print(copyArr4);



    }










    public static void print(int[] iarr) {
        System.out.println("iarr의 hashCode : " + iarr.hashCode());

        for(int i =0; i < iarr.length; i++){
            System.out.println(iarr[i] + " ");
        }
        System.out.println();
    }
}
