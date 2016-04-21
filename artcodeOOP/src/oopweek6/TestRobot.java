package oopweek6;

import util.NumberUtils;

import java.io.File;
import java.io.IOException;

public class TestRobot {

    public static void main(String[] args) throws IOException {

        File file = new File("robot.txt");

        Robot robot = new Robot(file.getPath(),
                NumberUtils.generateNum(1000000, 9999999),
                    NumberUtils.generateNum(1000, 9999));
        RobotUtils.writeRobot(robot);
        String res = RobotUtils.readRobot("robot.txt");
        System.out.println("Robot after read from file is: " + res);
    }

}
