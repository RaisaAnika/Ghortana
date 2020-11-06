    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author Anika
     */

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


    public class Ghortana {
    //    static String input;
    //    Scanner kb=new Scanner(System.in);
    //    public void getname(){
    //    
    //    }
        String name;
        public static void main(String args []){
            out.println("Hello I am Ghortana");
           String input;
        Scanner kb=new Scanner(System.in);
            boolean x=true;
             while(true){
             out.print("You: ");
             input=kb.nextLine();
             //out.println(input);
             input=input.toLowerCase();
             if (input.contains("what languagues do you speak")||input.contains("do you speak")){
                out.println("Ghortana: "+"I speak only English for now, but i am learning");
                // name==
             }
             else if(input.contains("good morning")||input.contains("good afternoon")||input.contains("good evening")||input.contains("good noon")||input.contains("good night")){
                 Date t= new Date();
                     // out.printf("%1$s %2$tB %2$td, %2$tY", " ", time);
                      String str1 = String.format("Ghortana: "+"Current Time : %tr", t );
                      if((str1.contains("2:")||str1.contains("1:")||str1.contains("3:")||str1.contains("4:"))&&str1.contains("PM")){
                          out.println("Ghortana: "+"Good Afternoon");
                      }
                      else if(str1.contains("12:")&&str1.contains("PM")){
                          out.println("Ghortana: "+"Good Noon");
                      }
                      else if((str1.contains("6:")||str1.contains("7:")||str1.contains("5:")||str1.contains("8:"))&&str1.contains("PM")){
                          out.println("Ghortana: "+"Good Evening");
                      }
                      else if((str1.contains("9:")||str1.contains("10:")||str1.contains("11:"))&&str1.contains("PM")){
                          out.println("Ghortana: "+"Good Night");
                      }
                      else if((str1.contains("12:")||str1.contains("1:")||str1.contains("2:")||str1.contains("3:")||str1.contains("4:"))&&str1.contains("AM")){
                          out.println("Ghortana: "+"Good Night \nIts Midnight staying awake for so long is not good for health");
                      }
                      else{
                          out.println("Ghortana: "+"Good Morning");
                      }}
             else if(input.contains("hi")||input.contains("hello")||input.contains("hey")){
                 out.println("Ghortana: "+"Hi");
             }
             else if(input.contains("how are you")||input.contains("howdy")||input.contains("you ok")){
                 out.println("Ghortana: "+"I am fine,Thank you \n\tHow are you");
             }
             else if(input.contains("how are you doing")||input.contains("doing well?")){
                 out.println("Ghortana: "+"I am doing well \n\tHow are you");
             }
             else if(input.contains("biggest flower")||input.contains("largest flower")){
                 out.println("Ghortana: "+"Raflesia");
             }
             else if(input.contains("king")&&(input.contains("fruit")||input.contains("fruits"))){
                 out.println("Ghortana: "+"Mango");
             }
             else if(input.contains("meow")||input.contains("purr")){
                 out.println("Ghortana: "+"Where are you hiding Mr Pussy?");
             }
             else if(input.contains("woof")||input.contains("bark")){
                 out.println("Ghortana: "+"Hey doggy");
             }
             else if(input.contains("cat")&& input.contains("say")){
                 out.println("Ghortana: "+"meow");
             }
             else if(input.contains("fox")&& input.contains("say")){
                 out.println("Ghortana: "+"awoo");
             }
             else if(input.contains("cow")&& input.contains("say")){
                 out.println("Ghortana: "+"moo");
             }
             else if(input.contains("dog")&& input.contains("say")){
                 out.println("Ghortana: "+"woof woof!");
             }
             else if(input.contains("search")){
                // out.println("Ghortana: "+"moo");
                 try {
                     Desktop desktop = java.awt.Desktop.getDesktop();
                     URI oURL = new URI("http://www.google.com");
                     desktop.browse(oURL);
                   } catch (Exception e) {
                     e.printStackTrace();
                   }
             }
             else if(input.contains("youtube")){
                 // out.println("Ghortana: "+"moo");
                  try {
                      Desktop desktop = java.awt.Desktop.getDesktop();
                      URI oURL = new URI("http://www.youtube.com");
                      desktop.browse(oURL);
                    } catch (Exception e) {
                      e.printStackTrace();
                    }
              }
             
             else if(input.contains("song")||input.contains("music")||input.contains("songs")){
                 // out.println("Ghortana: "+"moo");
                  try {
                      Desktop desktop = java.awt.Desktop.getDesktop();
                      URI oURL = new URI("http://www.pandora.com");
                      desktop.browse(oURL);
                    } catch (Exception e) {
                      e.printStackTrace();
                    }
              }
             else if(input.contains("food")||input.contains("eat")||input.contains("eating")||input.contains("restaurant")||input.contains("restaurants")){
                 // out.println("Ghortana: "+"moo");
                  try {
                      Desktop desktop = java.awt.Desktop.getDesktop();
                      URI oURL = new URI("http://www.foodpanda.com");
                      desktop.browse(oURL);
                    } catch (Exception e) {
                      e.printStackTrace();
                    }
              }
             else if(input.contains("rhyme")||input.contains("rhymes")){
                 // out.println("Ghortana: "+"moo");
                  try {
                      Desktop desktop = java.awt.Desktop.getDesktop();
                      URI oURL = new URI("http://www.rhymes.org.uk/");
                      desktop.browse(oURL);
                    } catch (Exception e) {
                      e.printStackTrace();
                    }
              }
             else if(input.contains("email")||input.contains("emails")){
                 // out.println("Ghortana: "+"moo");
                  try {
                      Desktop desktop = java.awt.Desktop.getDesktop();
                      URI oURL = new URI("http://mail.google.com/");
                      desktop.browse(oURL);
                    } catch (Exception e) {
                      e.printStackTrace();
                    }
              }
             else if(input.contains("shop")||input.contains("shops")){
                 // out.println("Ghortana: "+"moo");
                  try {
                      Desktop desktop = java.awt.Desktop.getDesktop();
                      URI oURL = new URI("http://www.bikroy.com/");
                      desktop.browse(oURL);
                    } catch (Exception e) {
                      e.printStackTrace();
                    }
              }
             else if(input.contains("weather")||input.contains("temperature")||input.contains("humidity")){
                 // out.println("Ghortana: "+"moo");
                  try {
                      Desktop desktop = java.awt.Desktop.getDesktop();
                      URI oURL = new URI("https://weather.com/");
                      desktop.browse(oURL);
                    } catch (Exception e) {
                      e.printStackTrace();
                    }
              }
             else if(input.contains("where") && input.contains("live")){
                 out.println("Ghortana: "+"With you");
                 }
             else if(input.contains("I love you")){
                 out.println("Ghortana: "+"you are making me emotional");
                 }
             else if(input.contains("what is your age")||input.contains("age")||input.contains("how old")){
                 out.println("Ghortana: "+"a few days ... 6 specifically");
                 }
             else if(input.contains("doing well")||input.contains("I am fine")||input.contains("fine")||input.contains("good")){
                 out.println("Ghortana: "+"Pleased to hear so :)");
             }
             else if(input.contains("distance")||input.contains("how far")){
                 out.println("Ghortana: "+"Opening map ...");
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
                 out.println("Ghortana: "+"I am Ghortana");
             }
             else if(input.contains("i am feeling sad")||input.contains("sad")||input.contains("depressed")||input.contains("melancholy")||input.contains("I am feeling down")){
                 out.println("Ghortana: "+"Why are you sad? please share");
             }
             else if(input.contains("i am feeling happy")||input.contains("excited")||input.contains("elated")||input.contains("gay")||input.contains("happy")){
                 out.println("Ghortana: "+"Thats great :)");
             }
             else if(input.contains("broke")||input.contains("hungry")||input.contains("stole")||input.contains("accident")||input.contains("dead")||input.contains("lost")){
                 out.println("Ghortana: "+"I am sorry :(");
             }
             else if(input.contains("ok")){
                 out.println("Ghortana: "+":)");
             }
             else if(input.contains("bye")){
                 out.println("Ghortana: "+"bye, expect to talk to you soon again");
                 break;
             }
             else if(input.contains("i wish to chat with you")){
                 out.println("Ghortana: "+ "please, go ahead I am here to hear out");
                 out.println("\tWhat is your name");

             }
             else if(input.contains("name")&&input.contains("flowers")){
                 out.println("Ghortana: "+"ROSE\n\tMARIGOLD\n\tLAVENDER\n\tCHERRYBLOSSOMS");
                 //out.println("What is your name");

             }
              else if(input.contains("favourite")&&input.contains("flower")){
                 out.println("Ghortana: "+"I love Tuberoses.\n\t They have nice smell");
                 //out.println("What is your name");

             }
              else if(input.contains("favourite")&&input.contains("fruit")){
                  out.println("Ghortana: "+"I love Mangoes.\n\t They are tasty!");
                  //out.println("What is your name");

              }
              else if(input.contains("name")&&input.contains("fruits")){
                  out.println("Ghortana: "+"ORANGE\n\tJACKFRUIT\n\tPASSION FRUIT\n\tGRAPES");
                  //out.println("What is your name");

              }
             else if(input.contains("what is your name?")){
                 out.println("Ghortana: "+"I am ghortana");

                 }
             else if(input.contains("where were you born")){
                 out.println("Ghortana: "+"I wasnot born in humanian process \n\t I was made at by Raisa ");

                 }
             else if(input.contains("date")||input.contains("what is the date")){
                 Date date = new Date();
                      out.printf("Ghortana: "+"%1$s %2$tB %2$td, %2$tY\n", " ", date);

                 //out.println(Date);

                 }
             else if(input.contains("time")||input.contains("what is the time")){
                 Date time= new Date();
                     // out.printf("%1$s %2$tB %2$td, %2$tY", " ", time);
                      String str = String.format("Ghortana: "+"Current Time : %tr\n", time );

                     out.printf(str);
                 //out.println(Date);

                 }
             else if(input.contains("do you speak english")||input.contains("do you speak english?")){
                 out.println("Ghortana: "+"Yes");

                 }
             else if(input.contains("location")||input.contains("where are you")){
                 out.println("Ghortana: "+"Bangladesh");

                 }
             else if(input.contains("capital of Bangladesh")){
                 out.println("Ghortana: "+"Dhaka");

                 }
             else if(input.contains("thank you")||input.contains("thanks")||input.contains("thankyou")){
                 out.println("Ghortana: "+"Welcome");

                 }

             else if(input.contains("news")){
                // out.println("Ghortana: "+"Welcome");
                 try{
                 Desktop desktop = java.awt.Desktop.getDesktop();
                 URI oURL = new URI("http://www.dailystar.net");
                 desktop.browse(oURL);
               } catch (Exception e) {
                 e.printStackTrace();
               }
                 }
             else if(input.contains("do you know math")||input.contains("+")||input.contains("*")||input.contains("/")||input.contains("math") ){
                 out.println("Ghortana: "+"Sorry \nI donot get Maths \nOpening claculator ...\n");
                 Calculator();
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
               out.println("Ghortana: "+"Sorry I donot know what you are asking,\ndo you want me to google for you?");
               out.print("\nYou:");
               input=kb.nextLine();
               input=input.toLowerCase();
               if(input.contains("no")){
                  out.println("Ghortana: "+"Ok");
                 }
               else if(input.contains("yes")){
                 out.println("Ghortana: "+"Acessing google...");
                 try {
          Desktop desktop = java.awt.Desktop.getDesktop();
          URI oURL = new URI("http://www.google.com");
          desktop.browse(oURL);
        } catch (Exception e) {
          e.printStackTrace();
        }
                 }


             }

             }
        }
             public static void Calculator(){
                 out.println("Basic Calculator /nChoose any from below");
              float a, b, res;
            char choice, ch;
            Scanner scan = new Scanner(System.in);

            do
            {
                System.out.print("1. Addition\n");
                System.out.print("2. Subtraction\n");
                System.out.print("3. Multiplication\n");
                System.out.print("4. Division\n");
                System.out.print("5. Exit\n\n");
                System.out.print("Enter Your Choice : ");
                choice = scan.next().charAt(0);
                switch(choice)
                {
                    case '1' : System.out.println("Enter Two Number : ");
                        a = scan.nextFloat();
                        b = scan.nextFloat();
                        res = a + b;
                        System.out.print("Result = " + res);
                        break;
                    case '2' : System.out.println("Enter Two Number : ");
                        a = scan.nextFloat();
                        b = scan.nextFloat();
                        res = a - b;
                        System.out.print("Result = " + res);
                        break;
                    case '3' : System.out.println("Enter Two Number : ");
                        a = scan.nextFloat();
                        b = scan.nextFloat();
                        res = a * b;
                        System.out.print("Result = " + res);
                        break;
                    case '4' : System.out.println("Enter Two Number \n(press ENTER after each input) : ");
                        a = scan.nextFloat();
                        b = scan.nextFloat();
                        res = a / b;
                        System.out.println("Result = " + res);
                        //break;
                   case '5' : System.exit(0);
                        break;
                    default : System.out.print("Wrong Selection!!!");
                       break;
                }
                System.out.print("\n---------------------------------------\n");
            }while(choice != 5);       
             }



    }
