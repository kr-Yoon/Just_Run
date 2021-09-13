package JustRunJava;
	// interfaceÀÇ È¿¿ë

interface Talk {
	String talk();
}

class Man implements Talk {
	public String talk() {
		return "i am man";
	}
}

class Woman implements Talk {
	public String talk() {
		return "i am woman";
	}
}

class Human {
	void hello(Talk self) {
		System.out.println("hello! "+self.talk());
	}
}
public class Code162 {
	public static void main(String[] args) {
		Man m = new Man();
		Woman w = new Woman();
		Human h = new Human();
		
		h.hello(m);
		h.hello(w);
	}
}
