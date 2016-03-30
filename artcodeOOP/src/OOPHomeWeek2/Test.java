package OOPHomeWeek2;

import util.NumberUtils;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of subjects in course:");

        Subject[] subjectList = new Subject[sc.nextInt()];

        Student student = new Student("Nickolay", "Kiev, Starokievskaya, 10", subjectList);


        if (test(subjectList) == true) {
            System.out.print("\nCongratulation! Test was successful");
        } else {
            System.out.print("\nLook above for search mistakes");
        }

    }

    public static boolean test(Subject[] subjectList) {

        String[] examples = {"PHP", "JavaScript", "C#", "C++", "Python", "Java", "Perl", "Ruby", "Delphi", "Scala"};

        for (int i = 0; i < subjectList.length; i++) {
            subjectList[i].setName(examples[NumberUtils.generateNum(0, 9)]);
            subjectList[i].setHoursTotal(NumberUtils.generateNum(50, 100));
        }

        //study



        //show info about subject
        System.out.println("\n\nSubjects in course are:\n");
        for (int i = 0; i < subjectList.length; i++){
            subjectList[i].showInfoSubject();
        }

        int[] resTrue = new int[subjectList.length];
        int[] resFact = new int[subjectList.length];
        int countTrue = 0;
        int countBig = 0;

        //pass exam
        System.out.println("\n\nResult of test passExam:\n");
        for (int i = 0; i < subjectList.length; i++) {

            resTrue[i] = (subjectList[i].getHoursWorked() >= 50 &&
                                subjectList[i].getHoursWorked() <= 100) ? 1 : 0;

            resFact[i] = subjectList[i].passExamSubject(NumberUtils.generateNum(0, 100)) == true ? 1 : 0;

            System.out.printf("method %s, exp = %d, fact = %d, %s",
                    "passExam", resTrue[i], resFact[i], resFact[i] == resTrue[i]);

            if (resFact[i] == resTrue[i]) {
                countTrue++;
                System.out.print(" ... OK\n");
            } else {
                System.out.print(" ... mistake!\n");
            }

            countBig = countTrue == subjectList.length - 1 ? countBig + 1 : countBig ;
            countTrue = 0;
        }

        //get score
        System.out.println("\n\nResult of test getScore:\n");
        for (int i = 0; i < subjectList.length; i++) {

            if (subjectList[i].getHoursWorked() >= 50 && subjectList[i].getHoursWorked() <= 100) {
                subjectList[i].setScoreSubject(NumberUtils.generateNum(1, 10));
            } else {
                subjectList[i].setScoreSubject(0);
            }

            resTrue[i] = (subjectList[i].getHoursWorked() >= 50 &&
                                subjectList[i].getHoursWorked() <= 100) ? 1 : 0;

            resFact[i] = (subjectList[i].getScoreSubject() >= 1 &&
                                subjectList[i].getScoreSubject() <= 10) ? 1 : 0;

            System.out.printf("method %s, exp = %d, fact = %d, %s",
                    "passExam", resTrue[i], resFact[i], resFact[i] == resTrue[i]);

            if (resFact[i] == resTrue[i]) {
                countTrue++;
                System.out.print(" ... OK\n");
            } else {
                System.out.print(" ... mistake!\n");
            }

            countBig = countTrue == subjectList.length - 1 ? countBig + 1 : countBig ;
            countTrue = 0;
        }


        return countBig == 2 ? true : false;
    }






}
