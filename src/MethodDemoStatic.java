
public class MethodDemoStatic {

	static int x;

	static void sum() {

		int c = 100;
		System.out.println("sum called..." + x);
		System.out.println(c);

	}

	static String name() {

		return "samir";
	}

	public static void main(String[] args) {

		// MethodDemoStatic m = new MethodDemoStatic();
		// m.sum();

		MethodDemoStatic.sum();
		System.out.println(MethodDemoStatic.name());
	}

}
