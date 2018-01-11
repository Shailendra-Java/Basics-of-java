import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathProgram {
	public static void main(String... strings) {
		// instantiate a relative path
		Path p1 = FileSystems.getDefault().getPath("libs", "jdbc-oracle.jar");

		// instantiate a absolute path - windows OS
		Path p2 = Paths.get("C:\\Users\\Java\\examples");

		// get current working directory
		Path currentDirectory = Paths.get("").toAbsolutePath();
		System.out.println(currentDirectory.toAbsolutePath());

		// resolve path in Windows OS
		Path path1 = Paths.get("C:\\Users\\Java\\examples");
		// Output is C:\Users\Java\examples\Test.java
		System.out.println(path1.resolve("Test.java"));

		// relativize
		Path path3 = Paths.get("C:\\Users");
		Path path4 = Paths.get("C:\\Users\\Java\\examples");
		// outcome is Java\examples
		Path path3_to_path4 = path3.relativize(path4);
		System.out.println(path3_to_path4);
		// outcome is ..\..
		Path path4_to_path3 = path4.relativize(path3);
		System.out.println(path4_to_path3);
		
		//normalize
		Path path5 = Paths.get("C:\\Users\\Java\\.\\examples");	
		//output C:\Users\Java\examples
		System.out.println(path5.normalize());		
		//output C:\Users\examples
		Path path6 = Paths.get("C:\\Users\\Java\\..\\examples");
		System.out.println(path6.normalize());		
	}
}