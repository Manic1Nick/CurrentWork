package utils;

import model.Student;

public class GroupUtils {

    public static Student[] addStudentsToGroup(Student[] group, int sizeGroup, int numStudents) {
        for (int i = 0; i < numStudents; i++) {
            group[i] = StudentUtils.generateStudent();
        }
        return group;
    }

    public static void printAllListGroup(Student[] group, int numStudents) {
        for (int i = 0; i < numStudents; i++) {
            if (group[i] != null) {
                System.out.println("[ " + i + " ] " + group[i].convertStudent());
            }
        }
    }

    public static Student getStudentFromGroup(Student[] group, int number) {
        return group[number];
    }


    public static int searchStudentInGroup(Student[] group, String name) {
        int getNum = -1;
        for (int i = 0; i < group.length; i++) {
            if (group[i].getName().equals(name)) {
                getNum = i;
                break;
            }
        }
        return getNum;
    }

    public static Student[] deleteStudentsFromGroup(Student[] group, int delNum) {
        group[delNum] = null;

        return group;
    }

}
