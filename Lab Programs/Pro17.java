import java.util.*;
class Namer {
	private String name;
	public Namer(String name) {
		this.name = name;
	}
	
	//Write your code here
	class Prefixer {
		private String prefix;
		private Prefixer(String prefix) {
			this.prefix = prefix;
		}
		public String getCompleteName() {
			return prefix + " " + name;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, prefix;
		System.out.print("Enter name: ");
		name = scan.nextLine();
		System.out.print("Enter prefix: ");
		prefix = scan.nextLine();
		Namer namer = new Namer(name);
		Namer.Prefixer prefixer = namer.new Prefixer(prefix);
		System.out.println(prefixer.getCompleteName());
	}
}
