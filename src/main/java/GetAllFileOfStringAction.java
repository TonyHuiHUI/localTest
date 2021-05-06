import java.io.IOException;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class GetAllFileOfStringAction {

    public static void main(String args[]) throws IOException {
        String glob = "glob:**/*.txt";
        String path = "C:/";
        match(glob, path);
    }

    public static void match(String glob, String location) throws IOException {

        final PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher( glob);

        Files.walkFileTree(Paths.get(location), new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(Path path,
                                             BasicFileAttributes attrs) throws IOException {
                if (pathMatcher.matches(path)) {
                    BufferedReader reader =Files.newBufferedReader(path);//读取文件内的内容
                    String line=null;
                    while((line = reader.readLine()) !=null) {
                        if(line=="asdfghjkl")//若读取的内容等于“asdfghjkl"则输出文件名
                        {
                            System.out.println(path);
                            break;
                        }
                    }
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc)
                    throws IOException {
                return FileVisitResult.CONTINUE;
            }
        });
    }

}