package com.automation.smoke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{

    public static boolean getIntValue(String source){
       try{
           int temp=Integer.parseInt(source);
           // System.out.println(temp.getClass().getName());
           //System.out.println("After parsing the value is "+temp);
           return true;
       }
       catch(NumberFormatException e) {
           //System.out.println(e.toString());

       }
       return false;

    }

    public static String[] tokenize(String source){
        String[] target=source.split("\\s+");
        return target;
    }
 public static boolean checkForValidity(){
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     String source= null;
     try {
         source = br.readLine();
     } catch (IOException e) {
         e.printStackTrace();
     }
     //System.out.println("Input String is "+source);
     // System.out.println(source.getClass().getName());

     String[] target=tokenize(source);
     boolean flag=false;
     for (int i=0;i<target.length;) {
         int j=i+2;

         if(j<target.length) {
             int k = i + 1;
             if (getIntValue(target[i]) && getIntValue(target[j]) && !getIntValue(target[k])) {
                 flag=true;
             }
             else{
                 flag=false;
                 break;
             }

         }
            i=i+2;
     }
     return flag;
 }
    public static void main( String[] args )
    {
        System.out.println("Please insert turing string");
      if (checkForValidity()){
          System.out.println("Turing test pass");
      }
      else System.out.println("Turing test fail");


    }
}
