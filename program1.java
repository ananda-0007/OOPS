public class program1 {
    String name, department;
    char sec;
    int reg;

    void print() {
        System.out.println("The name is " + name);
        System.out.println("The section is " + sec);
        System.out.println("The reg.no is " + reg);
        System.out.println("The department is " +department);
    }

    public static void main(String[] args) {
        program1 obj = new program1();
        obj.name = "Abiram";
        obj.department = "AI&DS"; // or any department name you want
        obj.sec = 'A';
        obj.reg = 7;
        obj.print();
    }
}