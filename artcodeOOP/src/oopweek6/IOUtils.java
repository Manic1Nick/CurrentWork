package oopweek6;

import com.sun.xml.internal.ws.util.ByteArrayBuffer;

import java.io.*;

public class IOUtils {

    public static byte[] readBytes(String location) throws FileNotFoundException {

        InputStream is = new FileInputStream(location);
        ByteArrayBuffer resultArray = new ByteArrayBuffer();

        try {
            int next = -1;
            while((next = is.read()) != -1) {
                resultArray.write(next);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultArray.getRawData();

    }

    public static byte[] readBytes(String location, int buffSize) throws FileNotFoundException {

        InputStream is = new FileInputStream(location);
        ByteArrayBuffer resultArray = new ByteArrayBuffer();

        byte[] buff = new byte[buffSize];
        int last = 0;

        try {
            int count = -1;
            while((count = is.read(buff)) != -1) {
                resultArray.write(buff, 0, count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultArray.getRawData();

    }

    public static void writeBytes(byte[] array, String location) throws IOException {

        OutputStream os = new FileOutputStream(location);
        
        try {
            for (byte b : array) {
                os.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            os.close();
        }

    }

    private static void writeBytesCloseResources(byte[] array, String location) throws IOException {

        try (OutputStream os = new FileOutputStream(location)) {
            for (byte b : array) {
                os.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readString(String location) throws FileNotFoundException {

        StringBuilder sb = new StringBuilder();
        //chat[] buff = new char[1000];
        
        int last = -1;

        try (Reader reader = new FileReader(location)) {
            while ((last = reader.read()) != -1) {
                sb.append((char) last);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public static void writeString(String source, String location) throws FileNotFoundException {

        try (Writer writer = new FileWriter(location)) {
            writer.write(source);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
