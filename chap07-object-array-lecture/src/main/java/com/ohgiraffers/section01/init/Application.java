package main.java.com.ohgiraffers.section01.init;

import java.security.spec.RSAOtherPrimeInfo;

public class Application {

    public static void main(String[] args) {
        /*
        객체 배열은 레퍼런스 변주에 대한 배열.
        생성한 인스턴스도 배열을 이용해서 관리하면
        동일한  타입의 여러 개의 인스턴스를 각각 취급하지 않고
        연속처리할 수 있어서 유용함

        또한 반환값은 1개의 값만 반환할 수 있음 ->
        동일한 타입의 여러 인스턴스를 반환해야하는 경우 : 객체배열 이용할 수 있음

        => 여러 객체들을 한 번에 관리하고 싶어서 배열을 사용하는 것
        */

        System.out.println("객체배열 안 쓴 Ver.");
        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티", 400);
        Car car5 = new Car("포터", 120);

        //각각 개체 생성해서, drivemaxspeed 호출한 것.
        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();
        //같은 타입의 객체, 동일한 메서드인데 반복해서 사용 -> 불편

        Car[] carArray = new Car[5];

        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 250);
        carArray[3] = new Car("부가티", 400);
        carArray[4] = new Car("포터", 120);

        System.out.println("-----------------------------");

        //FOR문으로 drivemaxspeed 부를 수 있다


        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }

        System.out.println("------------배열 선언 다른 버전-----------------");

        Car[] carArray2 = {
                //세미콜론 아니고 , 로 엮어주고 마지막에 ;
                new Car("페라리",300),
                new Car("티코",120),
                new Car("포터",100)
        };

        //향상된 for문으로 출력
        for(Car car: carArray2) {
            //10:08
            car.driveMaxSpeed();
            //포터 마지막으로 들어가서 시속 나오고 끝남.
        }





    }
}
