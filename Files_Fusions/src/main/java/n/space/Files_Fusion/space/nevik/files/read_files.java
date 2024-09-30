package n.space.Files_Fusion.space.nevik.files;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.io.File;

public class Read_files {

    File docu;
    public boolean a;

    public Read_files(){
    docu = new File("C:/Users/kevin/Desktop/Team17Endbericht.pdf");
    a = docu.isFile();
    System.out.println(docu.isFile());
    }
}
