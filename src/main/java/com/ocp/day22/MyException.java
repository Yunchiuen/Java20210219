package com.ocp.day22;


public class MyException {

    public static void main(String[] args) {
        try {
            checkFood("薯條");
        } catch (BadFoodException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void checkFood(String food) throws BadFoodException{
        String[] badfoods = {"炸雞" , "薯條" , "可樂"};//垃圾食物
        for (String bad : badfoods) {
            if (food.equals(bad)) {
                String error=bad+"是垃圾食物";
                BadFoodException e=new BadFoodException(error);
                throw e;
                
            } 
        }
        
        System.out.println(food+"不是垃圾食物"); 
    }
}
