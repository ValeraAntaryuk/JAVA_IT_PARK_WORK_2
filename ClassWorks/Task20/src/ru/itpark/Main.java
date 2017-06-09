package ru.itpark;
import java.io.IOException;
import java.io.OutputStream;
public class Main {

    public static void main(String[] args) throws IOException {
	    HouseBook dom1 = HouseBook.getHouseBook();
        Roomer ivan = new Roomer("Ivan",437);
        Roomer semen = new Roomer("Semen",126);

        try {
            dom1.log(ivan.getRoomerName() + " " + String.valueOf(ivan.getFlatNumber()));
            dom1.log(semen.getRoomerName() + " " + String.valueOf(semen.getFlatNumber()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
