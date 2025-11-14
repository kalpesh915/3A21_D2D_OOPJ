public class Pro17 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Welcome to world of Java");
        sb.insert(0,"CSE");
        System.out.println(sb);
        sb.replace(0, 3, "OLD");
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
    }
}
