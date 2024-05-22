package main.java.com.ohgiraffers.section01.generic;

public class GenericTest<T> {

    //제네릭선언은 <>로, 안에 영문자 아무거나 쓰는데 대문자로.

    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }


}
