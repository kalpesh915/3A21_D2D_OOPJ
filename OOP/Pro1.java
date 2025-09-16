class Demo{
    int id;
    String fname, lname;
}

public class Pro1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.id = 10;
        d.fname = "Naman";
        d.lname = "Shah";

        Demo d1 = d;
        System.out.println(d.id+ d.fname+ d.lname);
        System.out.println(d1.id+ d1.fname+ d1.lname);
        d = null;
        System.out.println(d1.id+ d1.fname+ d1.lname);
        d1 = null;
        System.out.println(d1.id+ d1.fname+ d1.lname);
    }
}
