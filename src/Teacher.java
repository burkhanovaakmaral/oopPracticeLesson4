public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }

    @Override
    public void do1() {
        System.out.println("teaches");
    }
}
