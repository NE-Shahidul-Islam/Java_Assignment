
public class PersonInfo {
    public static void main(String[] args) {
        Person person = new Person();
//      Default name and age
        System.out.println("Before ");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

//        Newly Initialize name and age
        person.setAge(21);
        person.setName("Shahidul");

        System.out.println("After ");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
