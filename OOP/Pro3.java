public class Pro3 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.setData(1, "Abc", "Xyz");

        s2.setData(2, "AAA", "BBB");

        s1.getData();
        s2.getData();
    }
}
