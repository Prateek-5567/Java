package com.JavaBasics.ControlFlow;

public class two {
    public static void main(){
        try{
            int res = 10/0;
            System.out.println(res);
        } catch (Exception e) {
//            throw new RuntimeException(e);  //  to actually throw error.
            System.out.println("divide by 0 error!!");
        }
        finally {
            System.out.println("error catched!!");
        }
    }
}
