
public class MethodDemo {

	// non static
	// non static method must call by object only.....
	// instance variable...
	// it is not compulsary to inti....
	int x; // multypule
	static int y; // single copy

	void sum() {

		int a = 10;
		// static int p = 15; error...
		System.out.println("without return type without argument" + x);
		System.out.println(a);
	}

	void sub(int x) {

		System.out.println("without return with args  " + x + "--" + y);
	}

	int mul(int x) {

		return x * x;
	}

	float div() {

		return 10 / 2.6f;
	}

	public static void main(String[] args) {

		MethodDemo m = new MethodDemo();
		m.sum();
		m.sub(150);
		int ans = m.mul(10);
		System.out.println("mul = " + ans);
		System.out.println(m.mul(15));
		System.out.println(m.div());

	}

}
