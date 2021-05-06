import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
public class GetAllFileOfSizeAction implements FileVisitor {
    private final PathMatcher matcher;
    private final long accepted_size;
    public GetAllFileOfSizeAction(String glob, long accepted_size) {
        matcher= FileSystems.getDefault().getPathMatcher("glob:" +glob);
        this.accepted_size=accepted_size;
    }
    void search(Path file) throws IOException {
        long size = (Long) Files.getAttribute(file, "basic:size");
        if(size ==accepted_size) {
            System.out.println(file);
        }
    }
    @Override
    public FileVisitResult postVisitDirectory(Object dir, IOException exc)throws IOException {
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs)throws IOException {
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs)throws IOException {
        search((Path) file);
        return  FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult visitFileFailed(Object file, IOException exc)throws IOException {
        return FileVisitResult.CONTINUE;
    }
    public static void main(String[] args) throws IOException{
        String glob= "*.jpg";
        long size = 1048576;//1M=1024k=1048576字节
        Path fileTree = Paths.get("C:/");
        GetAllFileOfSizeAction walk=new GetAllFileOfSizeAction(glob, size);
        EnumSet opts=EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        System.out.println("C盘中大小等于1M的文件有");
        Files.walkFileTree(fileTree, opts, Integer.MAX_VALUE, walk);
    }
}