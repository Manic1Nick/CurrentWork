package oopweek6;

import java.io.IOException;

public class TestBuffWriting {

    public static final String PATH = "/home/jessy/IdeaProjects/ArtCode/artcodeOOP/temp/test_write.txt";

    public static void main(String[] args) throws IOException {

        IOUtils.writeBytes("aaaaaaaa".getBytes(), PATH);

    }

}
