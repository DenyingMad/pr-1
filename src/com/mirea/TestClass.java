package com.mirea;

public class TestClass {
    public static void main(String[] args){
        testDog();
        testBook();
        testBall();
    }

    private static void testDog(){
        Dog sharik = new Dog("Sharik", 3);
        Dog bobik = new Dog("Bobik");
        bobik.setAge(7);
        sharik.bark();
        bobik.bark();
        sharik.intoHumanAges();
        System.out.println(sharik.toString());
        System.out.println(bobik.toString());
    }

    private static void testBook(){
        Book book1 = new Book("Test Name", "Test Author", 375);
        Book book2 = new Book("Adventure of Tom Soyer");
        book2.setAuthor("Mark Twen");
        book2.setPages(532);
        book2.readBook(35);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }

    private static void testBall(){
        Ball basketball = new Ball(BallType.BASKETBALL, 40);
        System.out.println(basketball.toString());
        Ball football = new Ball();
        football.setBallType(BallType.FOOTBALL);
        football.setSize(30);
        System.out.println(football.toString());
    }
}
