package classBuilding.package_example;
import java.nio.file.Path;
import java.nio.file.Files;

//import java.nio.*; a wildcard only matches class names not files or packages
// import java.nio.*.*; // you can only have one wildcard and it must be at the end
//import java.nio.files.Paths.*; you can only import classes not methods
// we can not import 2 classes with the same name; we can not import  * for the same names of classes bcs java ll not know what exactly u need

public class InputImports {
    public void read(Files files){
        Path.of("name"); // java.nio.file
    }
}
