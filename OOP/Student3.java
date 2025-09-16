public class Student3 {
    private int id;
    private String fname, lname;

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getId(){
        return id;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public String getFname(){
        return fname;
    }
}
