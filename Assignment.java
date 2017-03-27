/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author ogechi
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
         JFrame jf=new JFrame("This is JFrame");
        JPanel h=new JPanel();
        h.setSize(1000,1000);

        h.add(new JButton("Button"));
        h.add(new JLabel("this is JLabel"));
        h.setBackground(Color.RED);

        jf.add(h);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        
        String[][] Capital = {
{"abia","umuahia"},
{"adamawa", "yola"},
{ "akwa-aibom"," uyo"},
{"anambra", "awka"},
{"bauchi"," bauchi"},
{"benue", "makurdi"},
{"bayelsa","yenogoa"},
{"borno","maidugri"},
{"cross river","calabar"},
{"delta","asabar"},
         };
      
       int correctans = 0, wrongans = 0;
        double correctansper = 0, wrongansper = 0;
        String ans;
        int i;
   Scanner input = new Scanner (System.in);
       int  sum = 10; 
       
       for(i=0;i<10;i++){
            System.out.println("What is the Capital of"+" " + Capital[i][0] + "\n");
           ans = input.nextLine();
           
           if(ans.equalsIgnoreCase(Capital[i][1])){
               System.out.println("\n Correct Answer !!!!\n");
               correctans  = correctans + 1;
           }
           else{
               System.out.println("\n Wrong Answer !!!! Correct Answer:" + Capital[i][1] + "\n");
               wrongans = wrongans + 1;
           }
        }
        // Printing answer counts
        System.out.println("\n\n Number of Correct Answers: " + correctans + "\n");
        System.out.println("Number of Wrong Answers: " + wrongans + "\n");
        
        //Calculating Answer Percentages
        
        correctansper = (correctans*100)/sum;
        wrongansper = (wrongans* 100) /sum;
        
        //Printing Answer Percentages
        
        System.out.println("\n\n Percentage of Correct answers is:" + correctansper + "\n");
        System.out.println(" Percentage of Wrong Answers is:" + wrongansper + "\n");
        
        //Printing response to scores
         if(correctansper > 90){
             System.out.println("\n Wooow you are a genuis! We owe you a special treat, you name it and it's done! \n");
             
         }
         else if(correctansper > 70){
             System.out.println("\n Very Good Job! I'm proud of you\n");
         }
         else if(correctansper >60){
             System.out.println("\n Good Job! you're doing great \n");
             }   
         else if(correctansper >50){
             System.out.println(" \n Nice Job, I'm optimistic you can better\n ");
         }
    }
    
        
    }
  
    

