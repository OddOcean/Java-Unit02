// Lab02CStudentsLastName.java
// Student Name:             Date:
// Purpose of Program: 
// Demonstrate knowledge of for loops and canvas x&y coordinates and use of graphics draw methods 

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Lab02C_Weygandt extends Canvas{
   
   /* We need to create the JFrame object that will contain the Canvas Object*/
   public static void main(String[] args){
        JFrame frame = new JFrame("Lab 02C Drawing Lines with Loops");/*Creates the JFrame and gives it a title */
        Canvas canvas = new Lab02C_Weygandt();/*This class extends Canvas so it is itself a canvas class and inherits everything Canvas has, so the consructor call has to be the same name as the class we are in */
        canvas.setSize(1000, 650);/*Set dimensions of canvas changing these numbers will change the size of your canvas */
        canvas.setBackground(Color.white);/* Set the background color of the canvas */
        frame.add(canvas);/* add the canvas object to the frame object */
        frame.pack();/* pack the canvas object into the frame object based on the canvas objects size and other settings */
        frame.setVisible(true);/* display the thing*/
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);//will end the application on close
        
   }
	public void paint(Graphics g){
		int width = 980;//total rectangle width
		int height = 630;//total rectangle height
		int x1 = 10;//top left corner of rectangle
		int y1 = 10;//top left corner of rectangle
		int x2 = 990;//bottom right corner of rectangle
		int y2 = 640;//bottom right corner of rectangle
		g.drawRect(x1,y1,width,height);//draws rectangle
      
      int inner_x1 = x1 + (width/4);//uses first rectangle stats, halfs the size and keeps it centered
      int inner_y1 = y1 + (height/4);
      int inner_x2 = x2 - (width/4);
      int inner_y2 = y2 - (height/4);
      int inner_width = inner_x2 - inner_x1;//finds width and height by taking difference of rectangle edges
      int inner_height = inner_y2 - inner_y1;
      
      //code for upper right corner
      g.setColor(Color.BLUE);//sets drawing color
      for (double i = 0; i < 51; i = i+1){//repeats 50 times
         g.drawLine(x1+(width/50*i), y1, x2, y1+(height/50*i));//adds/minuses i/50 of length/width to move the x/y incrementally and draws a line between the pionts
         delay();//delays between each line for 50 milliseconds
      } 
      
      //code for lower right corner
      g.setColor(Color.RED);
      for (int i = 0; i < 51; i = i+1){
         g.drawLine(x1+(width/50*i), y2, x2, y2-(height/50*i));
         delay();
      } 

      
      //code for upper left corner
      g.setColor(Color.ORANGE);
      for (int i = 0; i < 51; i = i+1){
         g.drawLine(x2-(width/50*i), y1, x1, y1+(height/50*i));
         delay();
      }
      
      //code for lower left corner
      g.setColor(Color.MAGENTA);
      for (int i = 0; i < 51; i = i+1){
         g.drawLine(x2-(width/50*i), y2, x1, y2-(height/50*i));
         delay();
      }
      
      //******* Code for innerbox ***********
      
      
      //code for upper right corner
      g.setColor(Color.MAGENTA);
      for (int i = 0; i < 54; i = i+1){//does same thing as large rectangle but uses inner rectangle stats
         g.drawLine(inner_x1+(inner_width/50*i), inner_y1, inner_x2, inner_y1+(inner_height/50*i));
         delay();
      }
      
      //code for lower right corner
      g.setColor(Color.BLUE);
      for (int i = 0; i < 54; i = i+1){
         g.drawLine(inner_x1+(inner_width/50*i), inner_y2, inner_x2, inner_y2-(inner_height/50*i));
         delay();
      }
      
      //code for upper left corner
      g.setColor(Color.ORANGE);
      for (int i = 0; i < 54; i = i+1){
         g.drawLine(inner_x2-(inner_width/50*i), inner_y1, inner_x1, inner_y1+(inner_height/50*i));
         delay();
      }
      
      //code for lower left corner
      g.setColor(Color.RED);
      for (int i = 0; i < 54; i = i+1){
         g.drawLine(inner_x2-(inner_width/50*i), inner_y2, inner_x1, inner_y2-(inner_height/50*i));
         delay();
      }
	}
   //this is a delay method that will allow you to watch your program do its drawing
   //you should call this at the end of your loops to delay your program before it excutes the next loop
   //delay() - is the code you need to make this work
   public static void delay()
   {
      int delaytime = 50;
      long startDelay = System.currentTimeMillis();
      long endDelay = 0;

      while (endDelay - startDelay < delaytime)
         endDelay = System.currentTimeMillis();
   }
   
   //this is another version of the delay method that will allow you to watch your program do its drawing
   //you should call this at the end of your loops to delay your program before it excutes the next loop
   //delay(50) - is the code you need to make this work, the number in the parentheses is how long the delay will last.
   public static void delay(int delay)
   {
      int delaytime = delay;
      long startDelay = System.currentTimeMillis(); 
      long endDelay = 0;

      while (endDelay - startDelay < delaytime)
         endDelay = System.currentTimeMillis();

   }

        

}