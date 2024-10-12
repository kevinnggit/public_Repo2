package n.space.Files_Fusion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class DateiExist {

    protected List<File> files = new ArrayList<>(); // initialisiere eine neue Liste

    public List<File> exist(List<String> namesF) {
        for (int i = 0; i < namesF.size(); i++) {
            File file = new File(namesF.get(i)); // Holt sich die entsprechende Daei
            if (!file.exists() || !file.canRead()) {
                System.out.println("Datei" + namesF + " nicht gefunden oder unlesbar");
            } else {
                files.add(file);
            }
        }
        return files;
    }

    public void lesen() throws IOException {
        for (int i = 0; i < files.size(); i++) {
            FileReader fileReader = new FileReader(files.get(i));
            BufferedReader bufferReader = new BufferedReader(fileReader);

            try {
                String line;
                while ((line = bufferReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Fehler");
            } finally {
                bufferReader.close();
            }
        }
    }
}
