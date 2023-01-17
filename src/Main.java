public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.setName("Cow");
//        animal.setAge(4);
//        System.out.println(animal.getName()+animal.getAge());
//
//        Horse horse = new Horse();
//        horse.setName("moll");
//        horse.setAge(5);
//
//        System.out.println(animal);
          Person person = new Person();
          person.setName("Ady");
          person.setAge(45);
        System.out.println(person.getName()+" \n"+person.getAge());
          person.do1();
        System.out.println();
          Student student =new Student();
          student.setName("Anna");
          student.setAge(23);
        System.out.println(student.getName()+"\n"+student.getAge());
        student.do1();
        System.out.println();
        Teacher teacher = new Teacher();
        teacher.setName("Tod");
        teacher.setAge(54);
        System.out.println(teacher.getName()+"\n"+teacher.getAge());
        teacher.do1();
    }
}