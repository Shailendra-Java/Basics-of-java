import java.io.FileReader; 
import java.io.FileWriter;
import java.io.IOException; 
import java.io.FileNotFoundException;
public class CharStreamCopyTest {
public static void main(String[] args) {
char[] c = new char[128]; int cLen = c.length;
// Example use of InputStream methods
try (FileReader fr = new FileReader(args[0]);

FileWriter fw = new FileWriter(args[1])) {
int count = 0;
int read = 0;
while ((read = fr.read(c)) != -1) {
if (read < cLen) fw.write(c, 0, read);
else fw.write(c);
count += read;
}
System.out.println("Wrote: " + count + " characters.");
} catch (FileNotFoundException f) {
System.out.println("File " + args[0] + " not found.");
} catch (IOException e) {
System.out.println("IOException: " + e);
}}} 

