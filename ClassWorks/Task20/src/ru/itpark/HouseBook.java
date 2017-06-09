package ru.itpark;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class HouseBook {
    private static HouseBook instance;
    private FileOutputStream fileOutputStream;

    public static HouseBook getHouseBook() {
        return instance;
    }

    static {
        instance = new HouseBook("housebook.txt");
    }
    private HouseBook (String fileName){
        try {
            this.fileOutputStream = new FileOutputStream(fileName);
        } catch (Exception e){
            System.err.println("Проблемы с файлом");
        }
    }
    public void log(String text) throws IOException {
        text = text + "\n";
        try {
            byte textAsButes[] = text.getBytes();
            fileOutputStream.write(textAsButes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
