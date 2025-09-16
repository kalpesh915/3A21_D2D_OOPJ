public class Student5 {
    int id;
    String fname, lname;

    public Student5(){
        id = 1;
        fname = "Naman";
        lname = "Shah";
    }

    public Student5(int id, String fname, String lname){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Student5{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
