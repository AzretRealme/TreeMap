import java.util.Comparator;

public class Info {

private String name;
private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Info(){

}

    public Info(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}