
public class Teacher extends Person {
    private String subject;
    private double salary;

    // TODO
    public Teacher(String name, int age, String subject, int salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
