package OOPHomeWeek2;

public class Student {

    private String name;
    private String address;
    Subject[] subjectList;

    public Student(String name, String address, Subject[] subjectList) {
        this.name = name;
        this.address = address;
        this.subjectList = subjectList;
    }

    public String getNameStudent() {
        return name;
    }

    public String getAddressStudent() {
        return address;
    }

    public Subject[] getSubjectList() {
        return subjectList;
    }

    public void setNameStudent(String nameStudent) {
        this.name = nameStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.address = addressStudent;
    }

    public void setSubjectList(Subject[] subjectList) {
        this.subjectList = subjectList;
    }

    public void doStudy() {
        for (int i = 0; i < subjectList.length; i++) {
            subjectList[i].study();
        }
    }

    //operations





/*    public void studySubject() {

        for (int i = 0; i < subjectList.length; i++) {
            subjectList[i].study();
        }
    }

    public Subject[] addSubject(Subject newSubject) {

        Subject[] newSubjectList = new Subject[subjectList.length + 1];
        newSubjectList[newSubjectList.length - 1] = newSubject;

        return newSubjectList;
    }

    public Subject[] delLastSubjectFromList() {

        Subject[] newSubjectList = new Subject[subjectList.length - 1];
        newSubjectList = Arrays.copyOfRange(subjectList, 1, subjectList.length - 2);

        return newSubjectList;
    }

    public void showInfoSubjectList() {

        System.out.println(Arrays.toString(subjectList).replaceAll("\\},", "\\},\n"));
    }

    public double getAverageScore() {

        int summScore = 0;
        int count = 0;

        for (int i = 0; i < subjectList.length; i++) {

            if (subjectList[i].score() != 0) {
                summScore += subjectList[i].score();
                count++;
            }
        }

        return summScore / count;
    }



   */

}
