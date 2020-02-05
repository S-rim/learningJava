//static

class Main {
	public static void main(String[] args) {
		System.out.println(수학.PI);
		
		System.out.println(수학.더하기(10, 20));
	}
}

class 수학 {
    static double PI = 3.141592;
    static int a;
    static int b;

    static int 더하기(int a, int b)
    {
        return a+b;
    }
}

// static의 특성

// 이 코드를 출력 시 
// 저는 22살 홍길동 입니다.
// 저는 25살 홍길순 입니다.
// 저는 25살 홍길순 입니다.
// 이렇게 출력된다. 하지만 static을 지우면 조건대로 출력할 수 있다.

class Main {
	public static void main(String[] args) {
		사람 a사람1 = new 사람();
		a사람1.이름 = "홍길동";
		a사람1.나이 = 22;
		
		a사람1.자기소개();
		// 출력 : 저는 22살 홍길동 입니다.
		
		사람 a사람2 = new 사람();
		a사람2.이름 = "홍길순";
		a사람2.나이 = 25;
		
		a사람2.자기소개();
		// 출력 : 저는 25살 홍길순 입니다.
		
		a사람1.자기소개();
		// 출력 : 저는 22살 홍길동 입니다.
	}
}

class 사람 {
    // static을 지우면 원하는 대로 출력할 수 있는 이유는 
    // static 변수는 같은 곳의 메모리 주소만을 바라보기 때문에 변수의 값을 공유하기 때문이다.
	static int 나이;
	static String 이름;
	
	void 자기소개() {
		System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
	}
}

// 메서드에 static을 붙이면 인스턴스 변수는 사용할 수 없다.
// static이 붙은 메서드에서는 static 변수만 사용할 수 있다.
// 그 반대는 된다.

class Main {
	public static void main(String[] args) {
		출력("안녕");
		// 출력 : 안녕
		
		출력(5);
		// 출력 : 5
	}
  static String a;
  static int b;

  static void 출력(String a)
  {
    System.out.println(a);
  }

  static void 출력(int b)
  {
    System.out.println(b);
  }
}
