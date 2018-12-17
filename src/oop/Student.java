package oop;

/**
 * Created by Student on 17.12.2018.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double avgMark;

    public Student(String firstName, String lastName, String group, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public  double getAvgMark() {
        return avgMark;
    }

    public static void main(String[] args) {
        Student student = new Student("Ivanov", "Van", "group=5", 4);
        Aspirant aspiran1= new Aspirant("Aspirant", "OtStudenta", "group=5", 4, "aspirantura");

        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getGroup() + " " +
                student.getAvgMark());
        System.out.println(aspiran1.getFirstName() + " " + aspiran1.getLastName() + " " + aspiran1.getGroup() + " " +
                aspiran1.getAvgMark() + " " + aspiran1.getWork());


        Student aspirant2 = new Aspirant("Aspirant", "OtStudenta", "group=5", 7, "aspirantura77");
        System.out.println(aspirant2.getFirstName() + aspirant2.getFirstName() + aspirant2.getGroup()+aspirant2.avgMark);

        Student[] students = {student, aspiran1, aspirant2};
        for (Student st:students){
            System.out.println(st.getFirstName() + " 777  " + st.getScholarship());
        }
    }



    public  double getScholarship() {
        return getAvgMark() == 5 ? 200 : 180;
    }
}
