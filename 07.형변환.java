class Main {
    public static void main(String[] args) {

      int i = 20;
  
      double d = 10;
      System.out.println(d); // 3.14가 출력된다.
  
      d = 10;
      System.out.println(d); // 10.0이 출력된다.
  
      // 10이 double로 형변환되어 d에 저장된것.
      // 10이 10.0으로 변환되어도 위험하지 않다고 판단하기에 자바가 자동적으로 형변환해서 저장한다. (자동형변환)
  
      int i = 3.14; 
      // 3.14는 double 타입의 값으로 int형 변수인 i에 절대로 들어갈 수 없다. 때문에 자바는 3.14를 int화 하기 위해 형변환을 시도하는데 int는 3.14를 표현할 수 없기 때문에 자바는 형변환이 불가능하다고 에러를 낸다.
  
      int i = (int) 3.14; 
      // 자바가 거부했지만 개발자가 위험을 감수하고 형변환을 강행할 수 있다. 이는 개발자가 형변환 과정에서 일어나는 위험이 프로그램에 큰 영향을 주지 않는다고 판단할 때 명시적으로 형변환을 시키는 것을 의미(수동형변환)
  
      System.out.println(i); // 출력을 하면 소수점이 제거된 3이 출력된다.
    }
  }



class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		원숭이 a원숭이 = new 원숭이();
		
		// 아래 줄의 코드가 되는 이유?
        동물 a동물 = a원숭이;
        // 형변환 시 작은 것이 큰 것으로 변환되는 것은 자바가 안전하다 생각하여 자동으로 바꿔준 것과 비슷하다.
        // a원숭이의 형은 원숭이이다. 원숭이는 동물을 상속받았다. 그렇기에 원숭이 자신만의 특정메서드를 제외하고는
        // 동물과 일치한다. 그렇기에 자바에서 인정하므로 이 코드가 정상적으로 실행된다.
        
        

		// 아래 줄의 코드가 안되는 이유?
        a원숭이2 = a동물;
        // 형변환 시 작은 것이 큰 것으로 변환되는 것은 자바가 안전하다 생각하여 자동으로 바꿔주고,
        // 큰 것이 작은 것으로 변환 될 때에는 거부했던 것과 비슷하다. 원숭이에만 있는 특정 메서드는
        // 동물은 가지고 있지 않다. 그렇기에 이 코드는 실행되지 않는다.
	}
}
abstract class 동물 {
	void 숨쉬다() {
		System.out.println("동물이 숨을 쉽니다.");
	}
}
class 사람 extends 동물 {
	void 말하다() {
		System.out.println("사람이 말을 합니다.");
	}
}
class 원숭이 extends 동물 {
	void 묘기를하다() {
		System.out.println("묘기를 하다.");
	}
}


// 과일 변수에 사과 객체를 연결하고 해당 변수가 가리킨 사과 객체를 다시 사과 변수로 가리키게 하는 코드 작성하기

class Main {
	public static void main(String[] args) {
    
    과일 a과일 = new 사과();
    사과 a사과 = (사과)a과일;
	}
}

class 과일 {
  void 달다() {
    System.out.println("달리다");
  }
}

class 사과 extends 과일{
  
}