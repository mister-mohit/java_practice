package OOPsinJava;


public class testing {

    public static class Human {
        private String name;
        int age;
    }
    public static void main(String[] args){
       Student s = new Student("Mohit", 21, 100);
       s.name = "mohit";
       s.age = 20;
       s.percentage = 98;

       System.out.println(s.name);
       System.out.println(s.age);
       System.out.println(s.percentage);
    }
}
