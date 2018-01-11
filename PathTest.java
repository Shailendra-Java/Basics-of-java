import java.nio.file.*;
public class PathTest
{
	public static void main(String[] args) 
	{
		Path p1 = Paths.get(args[0]);
		System.out.format("getFileName:%s%n",p1.getFileName());
		System.out.format("getParent:%s%n", p1.getParent());
		System.out.format("getNameCount:%d%n",p1.getNameCount());
		System.out.format("getRoot: %s%n", p1.getRoot());
		System.out.format("isAbsolute:%b%n",p1.isAbsolute());
		System.out.format("toAbsolutePath:%s%n",p1.toAbsolutePath());
		System.out.format("toURI: %s%n", p1.toUri());
    }
 }
