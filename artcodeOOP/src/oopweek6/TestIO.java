package oopweek6;

import java.io.FileNotFoundException;

public class TestIO {

    public static void main(String[] args) throws FileNotFoundException {

        byte[] arr = IOUtils.readBytes("/home/jessy/IdeaProjects/ArtCode/myfile.txt");

        String converted = "";

        for (byte b : arr) {
            converted += (char) b;
        }
        System.out.println(converted);

        String res = new String(arr);
        System.out.println(res);

    }

}
