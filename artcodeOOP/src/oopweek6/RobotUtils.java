package oopweek6;

import java.io.*;

public class RobotUtils {

    public static void writeRobot(Robot robot) throws IOException {

        try (Writer writer = new FileWriter(robot.getLocation())) {
            writer.write(String.format("id: %s, price: %.2f", robot.getId(), (double) robot.getPrice()));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readRobot(String location) throws IOException {

        StringBuilder sb = new StringBuilder();

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
}
