// private - 외부로 공개되지 않음. 해당 클래스에서만 사용가능
// protected - 메소드는 동일 패키지내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 사용 가능
// public - 어떤 클래스에서든 접근 가능
// default - 따로 접근제어자를 지정하지 않으면 항상 default. 해당 패키지 내에서 접근가능

class Main {
	public static void main(String[] args) {
		Person a = new Person();
		a.age = 18;
		
		System.out.print("제 나이는 " + a.age + "살 입니다.");
        // 출력 : 제 나이는 18살 입니다.
        // 에러발생 - age has private access in Person
        // private로 지정했기 때문
	}
}

class Person {
	// private => 외부로 공개되지 않는다.
	private int age;
}

// 접근제어자를 이용하면 프로그래머의 코딩 실수를 방지할 수 있고 기타 위험요소를 제거할 수 있는 등의 많은 장점이 있다.

