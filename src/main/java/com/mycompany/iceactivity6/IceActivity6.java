/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iceactivity6;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class IceActivity6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("enter a sentence:");
        String sentence = sc.nextLine();
       int vowelCount = IceActivity6(sentence);
       System.out.println("Number of the vowles: "+ vowelCount);
    }
       public static int
         IceActivity6(String sentence){
       sentence = sentence.toLowerCase();
       int count = 0;
       for(int i=0;i< sentence.length();i++){
       char c = sentence.charAt(i);
       if(c=='a'|| c =='e'|| c =='i' || c=='o' || c=='u')
       {
           count ++;
       }
       }
       return count;
    }
}
