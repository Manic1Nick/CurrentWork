package test;

import model.Group;
import model.Student;
import utils.GroupUtils;

import java.util.Scanner;

public class testStudent {

    public testStudent() {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input name of group:");
        String nameGroup = sc.next();
        System.out.println("Input size of group:");
        int sizeGroup = sc.nextInt();
        int numStudents = 0;

        Student[] student = new Student[numStudents];
        Group group = new Group(nameGroup, sizeGroup, student);

        for (int i = 0; ; ) {

            System.out.println("\nYou have next options:\n" +
                    "1. Add students to group\n" +
                    "2. Show all group\n" +
                    "3. Get student from group\n" +
                    "4. Search in group by name\n" +
                    "5. Delete student from group\n" +
                    "0. Exit from program\n");

            System.out.println("Input number from 1 to 5 (or 0 for exit): ");
            int number = sc.nextInt();

            if (number == 1) {
                //generate group
                System.out.println("Input number of students: ");

                int numAddStudents = sc.nextInt();
                if ((numStudents + numAddStudents) > sizeGroup) {
                    System.out.println("Number of students more than size of group!");

                } else {
                    numStudents += numAddStudents;
                    student = new Student[numStudents];
                    student = GroupUtils.addStudentsToGroup(student, sizeGroup, numStudents);
                }

            }

            if (number == 2) {
                //print list of group
                System.out.println(group.getName() + " is:\n");
                GroupUtils.printAllListGroup(student, numStudents);
            }

            if (number == 3) {
                //get from group
                System.out.println("Input number of student from the group list:");
                int getNum =  sc.nextInt();
                System.out.println("[ " + getNum + " ] " + student[getNum].convertStudent());
            }

            if (number == 4) {
                //search in group by name
                System.out.println("Input name of student:");
                int getNum = GroupUtils.searchStudentInGroup(student, sc.next());
                if (getNum >= 0 && getNum <= numStudents) {
                    System.out.println("Search result is:\n" +
                            "[ " + getNum + " ] " + student[getNum].convertStudent());
                } else {
                    System.out.println("Student is absent in group, or try with Upper letter");
                }
            }

            if (number == 5) {
                //delete from group
                System.out.println("Input number of student from the group list:");
                int delNum = sc.nextInt();
                student = GroupUtils.deleteStudentsFromGroup(student, delNum);
                System.out.println("Student [ " + delNum + " ] was deleted from the group " + nameGroup);
            }

            if (number == 0) {
                //exit
                break;
            }
        }
    }
}
