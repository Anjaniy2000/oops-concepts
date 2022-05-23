package keywords;

public class This {
    public static void main(String[] args) {
        Student jay = new Student(1, "Jay Shah", "CSE");
        System.out.println("Hi, I'm " + jay.name + "." + " I'm Current Studying In " + jay.branch + " Branch.");

        Student anjaniy = new Student(1, "Anjaniy Salekar", "CSE");
        System.out.println("Hi, I'm " + anjaniy.name + "." + " I'm Current Studying In " + anjaniy.branch + " Branch.");
    }
}

class Student{

    public int enrollmentNumber;
    public String name;
    public String branch;

    public Student(int enrollmentNumber, String name, String branch){
        this.enrollmentNumber = enrollmentNumber;
        this.name = name;
        this.branch = branch;
    }
}
