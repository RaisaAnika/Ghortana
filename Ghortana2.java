
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.awt.Desktop;
import static java.lang.System.out;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anika
 */


public class Ghortana2 extends JFrame implements KeyListener{
    
    JPanel p=new JPanel();
	JTextArea dialog=new JTextArea(10,40);
	JTextArea input=new JTextArea(4,40);
	JScrollPane scroll=new JScrollPane(
		dialog,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
                );

	

public static void main(String[] args){
	new Ghortana2();
}
public Ghortana2(){
	super("Ghortana");
	setSize(600,400);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	addText("Hi I am Ghortana");

	dialog.setEditable(false);
	input.addKeyListener(this);

	p.add(scroll);
	p.add(input);

	p.setBackground(new Color(0,210,255));

	add(p);
	
	setVisible(true);
}

public void keyPressed(KeyEvent e){
	if(e.getKeyCode()==KeyEvent.VK_ENTER){
		input.setEditable(false);
		//-----grab quote-----------
		String quote=input.getText();
		input.setText("");
		addText("\nYou:\t"+quote);
		quote.trim();
		match(quote);
		}
		
}

public void match(String input){
	String ans=" ";
	 while(true){
         
         //out.println(input);
         input=input.toLowerCase();
         if (input.contains("what languagues do you speak")||input.contains("do you speak")){
           ans="I speak only English for now, but i am learning";
            // name==
         }
         else if(input.contains("good morning")||input.contains("good afternoon")||input.contains("good evening")||input.contains("good noon")||input.contains("good night")){
             Date t= new Date();
                 // out.printf("%1$s %2$tB %2$td, %2$tY", " ", time);
                  String str1 = String.format("Ghortana: "+"Current Time : %tr", t );
                  if((str1.contains("2:")||str1.contains("1:")||str1.contains("3:")||str1.contains("4:"))&&str1.contains("PM")){
                      ans="Good Afternoon";
                  }
                  else if(str1.contains("12:")&&str1.contains("PM")){
                      ans="Good Noon";
                  }
                  else if((str1.contains("6:")||str1.contains("7:")||str1.contains("5:")||str1.contains("8:"))&&str1.contains("PM")){
                      ans="Good Evening";
                  }
                  else if((str1.contains("9:")||str1.contains("10:")||str1.contains("11:"))&&str1.contains("PM")){
                      ans= "Good Night";
                  }
                  else if((str1.contains("12:")||str1.contains("1:")||str1.contains("2:")||str1.contains("3:")||str1.contains("4:"))&&str1.contains("AM")){
                      ans= "Good Night \nIts Midnight staying awake for so long is not good for health";
                  }
                  else{
                      ans= "Good Morning";
                  }}
         else if(input.contains("hi")||input.contains("hello")||input.contains("hey")){
             ans= "Hi";
         }
         else if(input.contains("how are you")||input.contains("howdy")||input.contains("you ok")){
             ans= "I am fine,Thank you \n\tHow are you";
         }
         else if(input.contains("how are you doing")||input.contains("doing well?")){
             ans= "I am doing well \n\tHow are you";
         }
         else if(input.contains("biggest flower")||input.contains("largest flower")){
             ans= "Raflesia";
         }
         else if(input.contains("king")&&(input.contains("fruit")||input.contains("fruits"))){
             ans= "Mango";
         }
         else if(input.contains("meow")||input.contains("purr")){
             ans= "Where are you hiding Mr Pussy?";
         }
         else if(input.contains("woof")||input.contains("bark")){
             ans= "Hey doggy";
         }
         else if(input.contains("cat")&& input.contains("say")){
             ans= "meow";
         }
         else if(input.contains("fox")&& input.contains("say")){
             ans= "awoo";
         }
         else if(input.contains("cow")&& input.contains("say")){
             ans= "moo";
         }
         else if(input.contains("dog")&& input.contains("say")){
             ans= "woof woof!";
         }
         else if(input.contains("search")){
            // ans= "moo");
             try {
                 Desktop desktop = java.awt.Desktop.getDesktop();
                 URI oURL = new URI("http://www.google.com");
                 desktop.browse(oURL);
               } catch (Exception e) {
                 e.printStackTrace();
               }
         }
         else if(input.contains("youtube")){
             // ans= "moo");
              try {
                  Desktop desktop = java.awt.Desktop.getDesktop();
                  URI oURL = new URI("http://www.youtube.com");
                  desktop.browse(oURL);
                } catch (Exception e) {
                  e.printStackTrace();
                }
          }
         
         else if(input.contains("song")||input.contains("music")||input.contains("songs")){
             // ans= "moo");
              try {
                  Desktop desktop = java.awt.Desktop.getDesktop();
                  URI oURL = new URI("http://www.pandora.com");
                  desktop.browse(oURL);
                } catch (Exception e) {
                  e.printStackTrace();
                }
          }
         else if(input.contains("food")||input.contains("eat")||input.contains("eating")||input.contains("restaurant")||input.contains("restaurants")){
             // ans= "moo");
              try {
                  Desktop desktop = java.awt.Desktop.getDesktop();
                  URI oURL = new URI("http://www.foodpanda.com");
                  desktop.browse(oURL);
                } catch (Exception e) {
                  e.printStackTrace();
                }
          }
         else if(input.contains("rhyme")||input.contains("rhymes")){
             // ans= "moo");
              try {
                  Desktop desktop = java.awt.Desktop.getDesktop();
                  URI oURL = new URI("http://www.rhymes.org.uk/");
                  desktop.browse(oURL);
                } catch (Exception e) {
                  e.printStackTrace();
                }
          }
         else if(input.contains("email")||input.contains("emails")){
             // ans= "moo");
              try {
                  Desktop desktop = java.awt.Desktop.getDesktop();
                  URI oURL = new URI("http://mail.google.com/");
                  desktop.browse(oURL);
                } catch (Exception e) {
                  e.printStackTrace();
                }
          }
         else if(input.contains("shop")||input.contains("shops")){
             // ans= "moo");
              try {
                  Desktop desktop = java.awt.Desktop.getDesktop();
                  URI oURL = new URI("http://www.bikroy.com/");
                  desktop.browse(oURL);
                } catch (Exception e) {
                  e.printStackTrace();
                }
          }
         else if(input.contains("weather")||input.contains("temperature")||input.contains("humidity")){
             // ans= "moo");
              try {
                  Desktop desktop = java.awt.Desktop.getDesktop();
                  URI oURL = new URI("https://weather.com/");
                  desktop.browse(oURL);
                } catch (Exception e) {
                  e.printStackTrace();
                }
          }
         else if(input.contains("facebook")){
             // ans= "moo");
              try {
                  Desktop desktop = java.awt.Desktop.getDesktop();
                  URI oURL = new URI("https://www.facebook.com/");
                  desktop.browse(oURL);
                } catch (Exception e) {
                  e.printStackTrace();
                }
          }
         else if(input.contains("quora")){
             // ans= "moo");
              try {
                  Desktop desktop = java.awt.Desktop.getDesktop();
                  URI oURL = new URI("https://www.quora.com/");
                  desktop.browse(oURL);
                } catch (Exception e) {
                  e.printStackTrace();
                }
          }
         
         else if(input.contains("twitter")){
             // ans= "moo");
              try {
                  Desktop desktop = java.awt.Desktop.getDesktop();
                  URI oURL = new URI("https://www.twitter.com/");
                  desktop.browse(oURL);
                } catch (Exception e) {
                  e.printStackTrace();
                }
          }
         else if(input.contains("where") && input.contains("live")){
             ans= "With you";
             }
         else if(input.contains("I love you")){
             ans= "you are making me emotional";
             }
         else if(input.contains("what is your age")||input.contains("age")||input.contains("how old")){
             ans= "a few days ... 6 specifically";
             }
         else if(input.contains("doing well")||input.contains("I am fine")||input.contains("fine")||input.contains("good")){
             ans= "Pleased to hear so :)";
         }
         else if(input.contains("distance")||input.contains("how far")){
             ans= "Opening map ...";
//              try {
//         InetAddress addr;
//         Socket sock = new Socket("maps.google.com", 80);
//         addr = sock.getInetAddress();
//         System.out.println("Connected to " + addr);
//         sock.close();
//      } catch (java.io.IOException e) {
//         System.out.println("Can't connect to " + args[0]);
//         System.out.println(e);
//      }
    try {
      Desktop desktop = java.awt.Desktop.getDesktop();
      URI oURL = new URI("http://maps.google.com");
      desktop.browse(oURL);
    } catch (Exception e) {
      e.printStackTrace();
    }

         }
          else if(input.contains("what is your name")||input.contains("your name")){
             ans= "I am Ghortana";
         }
         else if(input.contains("i am feeling sad")||input.contains("sad")||input.contains("depressed")||input.contains("melancholy")||input.contains("I am feeling down")){
             ans= "Why are you sad? please share";
         }
         else if(input.contains("i am feeling happy")||input.contains("excited")||input.contains("elated")||input.contains("gay")||input.contains("happy")){
             ans= "Thats great :)";
         }
         else if(input.contains("broke")||input.contains("hungry")||input.contains("stole")||input.contains("accident")||input.contains("dead")||input.contains("lost")){
             ans= "I am sorry :(";
         }
         else if(input.contains("ok")){
             ans= ":)";
         }
         else if(input.contains("bye")){
             ans= "bye, expect to talk to you soon again";
             break;
         }
         else if(input.contains("i wish to chat with you")){
             ans=  "please, go ahead I am here to hear out";
             addText("\tWhat is your name");

         }
         else if(input.contains("name")&&input.contains("flowers")){
             ans="ROSE\n\tMARIGOLD\n\tLAVENDER\n\tCHERRYBLOSSOMS";
             //out.println("What is your name");

         }
          else if(input.contains("favourite")&&input.contains("flower")){
             ans= "I love Tuberoses.\n\t They have nice smell";
             //out.println("What is your name");

         }
          else if(input.contains("favourite")&&input.contains("fruit")){
              ans= "I love Mangoes.\n\t They are tasty!";
              //out.println("What is your name");

          }
          else if(input.contains("name")&&input.contains("fruits")){
              ans= "ORANGE\n\tJACKFRUIT\n\tPASSION FRUIT\n\tGRAPES";
              //out.println("What is your name");

          }
         else if(input.contains("what is your name?")){
             ans= "I am ghortana";

             }
         else if(input.contains("where were you born")){
             ans= "I wasnot born in humanian process \n\t I was made at by Raisa ";

             }
         else if(input.contains("date")||input.contains("what is the date")){
             Date date = new Date();
                  ans =  date.toGMTString();

             //out.println(Date);

             }
         else if(input.contains("time")||input.contains("what is the time")){
             Date time= new Date();
                 // out.printf("%1$s %2$tB %2$td, %2$tY", " ", time);
                  String str = String.format("Ghortana: "+"Current Time : %tr\n", time );

                 ans = str;
             //out.println(Date);

             }
         else if(input.contains("do you speak english")||input.contains("do you speak english?")){
             ans= "Yes";

             }
         else if(input.contains("location")||input.contains("where are you")){
             ans= "Bangladesh";

             }
         else if(input.contains("capital of Bangladesh")){
             ans= "Dhaka";

             }
         else if(input.contains("thank you")||input.contains("thanks")||input.contains("thankyou")){
             ans= "Welcome";

             }

         else if(input.contains("news")){
            // ans= "Welcome");
             try{
             Desktop desktop = java.awt.Desktop.getDesktop();
             URI oURL = new URI("http://www.dailystar.net");
             desktop.browse(oURL);
           } catch (Exception e) {
             e.printStackTrace();
           }
             }
         else if(input.contains("do you know math")||input.contains("+")||input.contains("*")||input.contains("/")||input.contains("math") ){
             ans= "Sorry \nI donot get Maths \nOpening claculator ...\n";
             //Calculator();
             try {
                 Desktop desktop = java.awt.Desktop.getDesktop();
                 URI oURL = new URI("https://www.calculator.net/scientific-calculator.html");
                 desktop.browse(oURL);
               } catch (Exception e) {
                 e.printStackTrace();
               }
             }
         else if(input.contains("tv")||input.contains("show")||input.contains("netflix")){
        	 try {
                 Desktop desktop = java.awt.Desktop.getDesktop();
                 URI oURL = new URI("http://www.netflix.com");
                 desktop.browse(oURL);
               } catch (Exception e) {
                 e.printStackTrace();
               }
         }

         else{
           ans= "Sorry I donot know what you are asking,\nLet me  google for you?";
         
             ans= "Acessing google...";
             try {
      Desktop desktop = java.awt.Desktop.getDesktop();
      URI oURL = new URI("http://www.google.com");
      desktop.browse(oURL);
    } catch (Exception e) {
      e.printStackTrace();
    }
             


         }

	 }   
	addText("\nGhortana:\t"+ans);
}

public void keyReleased(KeyEvent e){
	if(e.getKeyCode()==KeyEvent.VK_ENTER){
		input.setEditable(true);
	}
}

public void keyTyped(KeyEvent e){}

public void addText(String str){
	dialog.setText(dialog.getText()+str);
}


}
