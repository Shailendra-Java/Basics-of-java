import java.io.*;
public class PrintfExample
{
  public static void main(String[] args)
{
  PrintWriter pw = new PrintWriter(System.out,  true);
  double price = 24.99;
  int quantity = 2;
  String color = "Blue";
  System.out.printf("We have %03d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
   System.out.format("We have %03d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
   String out = String.format("We have %03d %s Polo shirts that cost $%3.2f.", quantity, color, 
   price);
   System.out.println(out);
   pw.printf("We have %03d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
   }
}
