package com.a_level.exeptions;

public class Main {

    public static void main(String[] args) {
	int nums [] = new int[4];

	try {
        System.out.println("Start");
        nums[9]= 10;
    }catch (ArrayIndexOutOfBoundsException s){
            System.out.println("We have a problem");
        }
	catch (ArithmeticException s){
        System.out.println("We have a problem2");
    }
    }
    //ArrayStoreException несовместимій тип
    //ClassCastException недопустимое приведение типа
    //IllegalArgumentException недопустимій параметр
    //NegativeArraySizeException
    //NullPointerExeption
    //TypeNotPresentException
    //ClassNotFoundException


}
