package n.space.Files_Fusion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import n.space.Files_Fusion.space.nevik.files.Read_files;

@SpringBootApplication
public class FilesFusionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilesFusionApplication.class, args);
		Read_files lese = new Read_files();
		System.out.println(lese);
	}

}
