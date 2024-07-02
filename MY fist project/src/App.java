
public class App {
    public static void main(String[] args) throws Exception {
       Students s1 = new Students("Mohit", 20, "Male", 21, 12);
       s1.getStudent();
       s1.getHuman();
       System.out.println();
    }
    public static class Human{
        private String name;
        int age;
        String gender;
        public Human(String name, int age, String gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        private void getHuman(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(gender);
        }
    }
    public static class Students extends Human{
        int rNo;
        int standard;

        public Students(String name, int age, String gender, int rNo, int standard){
            super(name, age, gender);
            this.rNo = rNo;
            this.standard = standard;
        }

        public void getStudent(){
            System.out.println(super.name);
            System.out.println(age);
            System.out.println(gender);
            System.out.println(rNo);
            System.out.println(standard);
        }

        public void getHuman(){
            super.getHuman();
        }
    }
}
