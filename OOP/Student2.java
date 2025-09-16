public class Student2 {
    int id;
    String fname, lname;

    /*public void setData(int id, String fname, String lname){
        id = id;
        fname = fname;
        lname = lname;
    }*/

    /*public void setData(int i, String fn, String ln){
        id = i;
        fname = fn;
        lname = ln;
    }*/

    public void setData(int id, String fname, String lname){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public String toString(){
        //return "Student Object";
        return  "Welcome "+fname+" "+lname+" Id is "+id;
    }

    public void getData(){
        System.out.println("Welcome "+fname+" "+lname+" id is "+id);
    }
}
