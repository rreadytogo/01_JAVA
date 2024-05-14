package main.java.com.ohgiraffers.section04;

public class Application02 {
    public static void main(String[] args) {

        // 순차정렬

        // 초기 배열 선언
        int[] iarr = {2,5,4,6,1,3};

        for(int i = 1; i < iarr.length ; i++){

            for(int j = 0; j < i ; j++) {
                //자기자신이 큰지 비교하는 반복문.

                if(iarr[i] < iarr[j]){
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }
        //↓for 문 밖에서
        for (int i = 0; i < iarr.length ; i++) {
            System.out.println(iarr[i] + " ");

        }
        //여기서  for 반복문 안쓰고 바로 실행시킬 순 없나? for 반복문을 새로 써야 새로 만들어진 배열이 출력?

    }
}
