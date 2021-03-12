
package com.ocp.day08;

public class BuyBook {
    public static void main(String[] args) {
        //取得出版社
        System.out.println(Book.getPublich());
        //物件成員必須要用new的
        Book b=new Book(100);
        System.out.println(b.getPages());
        System.out.println(new Book(200).getPages());
    }
}
