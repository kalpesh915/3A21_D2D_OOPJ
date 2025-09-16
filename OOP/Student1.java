public class Student1 {
    int id;
    String fname, lname;

    public void setData(){
        id = 1;
        fname = "Priyank";
        lname = "Pathak";
    }

    public void getData(){
        System.out.println("Welcome "+fname+" "+lname+" Id is "+id);
    }
}
