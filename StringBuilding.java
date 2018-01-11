import java.io.*;
public class StringBuilding {
public static void main(String[] args){
StringBuilder sb = new StringBuilder(500);
sb.append(",the lightning flashed and the thunder rumbled.\n");
sb.insert(0, "It was a dark and stormy night");
sb.append("The lightning struck...\n").append("[");
for(int i = 1; i < 11; i++){
sb.append(i).append(" ");
}
sb.append("] times");
System.out.println(sb.toString());
}
}
