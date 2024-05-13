package main.java.com.ohgiraffers.section02.looping;
/*#
##
##*/
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine() {

        // 2단부터 단을 1단씩 증가시키는 반복문

        // 논리과정_1단씩 증가

        //1부터 9까지 곱해주기

        for (int dan = 2; dan < 10; dan++) {


            //1~9까지 단에 곱해주기 중첩 for문
            for (int su = 1; su<10 ; su++) {
                System.out.print(dan + " * " + su +  " = " + dan*su);
            }
            System.out.println(" ");

        }
        }

        public void printUpgradeGugudan() {
//        appli에서  이걸 실행해야함

        //2~9단 증가

            //단을 매개변수로 전달
            for (int dan = 2; dan < 10; dan++) {

                printGugudan(dan);
                System.out.println(" ");


            }


        }

        // 넘겨받을 메서드 작성
    //근데 어디서는 appli 따로 파고.. 뭐지?ㅠㅠ 왜 넘겨받을 메서드를 같은 클래스 내에서 작성했지?ㅠ


    public void printGugudan(int dan){
        //dan을 받으니까 (int dan)설정해줌.

        for (int su = 1; su < 10 ; su++) {
            System.out.println(dan+ " * " + su +  " = " + (dan*su));
        }
    }

    public void printTriangleStars(){
        //키보드로 정수를 하나 입력받아 해당 정수만큼 한 행에 "*"를
//        행의 번호개씩 출력하세요
        //1행은 1개 2행은 2개.. 이렇게
        //별찍기..?

        Scanner scr  = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요.");
        int row = scr.nextInt();

        //출력할 행

        //행 수만큼 별 출력
        for(int i=1; i<=row ; i++){ //#행마다반복할행개수????
            for(int j = 1; j<=i; j++){ //##반복할 별개수???
                System.out.print("*");
                //println:출력할때마다 줄넘김
                //print : 개수만큼 별이 찍히고 넘어감.


            }
                //별이 1개부터 시작해야지
            System.out.println("*");


        }
            //범위가 없는데 아 row만큼 행 반복.
        //###@@@@@왜 여기서 * 하나만 출력 안되는거지?


    }







    }
