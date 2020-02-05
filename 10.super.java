class Main {
	public static void main(String[] args) {
		new 사람();
		
		new 청둥오리();
	}
}

class 생물 {
	생물() {
		// 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
		System.out.println("생물이 생성되었습니다.");
	}
}
// super() 는 부모 클래스의 생성자를 자동으로 호출한다.

class 동물 extends 생물 {
	동물() {
		// super(); // 부모 클래스의 생성자를 호출한다. 생략가능하다.
		
		System.out.println("동물이 생성되었습니다.");
	}
	
}
class 사람 extends 동물 {
	
	사람() {
		super();
		System.out.println("사람이 생성되었습니다.");
	}
}

class 오리 {
  오리()
  {
    System.out.println("오리가 생성되었습니다.");
  }
}

class 청둥오리 extends 오리{
  
  
  
  청둥오리()
  {
    super();
    System.out.println("청둥오리가 생성되었습니다.");
  }
}


// super 직접 이용하기.

class Main {
    public static void main(String[] args) {
      new 사람();
    }
  }
  
  class 동물 {
    동물(String 이름) {
      System.out.println("동물(String 이름) 실행됨!");
      System.out.println("이름 : " + 이름);
    }
    동물(String 이름, int 나이) {
      System.out.println("동물(String 이름, int 나이) 실행됨!");
      System.out.println("이름 : " + 이름);
      System.out.println("나이 : " + 나이);
    }
  }
  
  class 사람 extends 동물 {
    사람()
    {
      super("홍낄동",18);
    }
  }