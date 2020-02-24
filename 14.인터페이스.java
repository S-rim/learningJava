// 인터페이스에서 단순히 public void 메소드명(); 이렇게 되어있지만 사실 앞에 public abstract가 생략되었다.
//모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다.
//모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다.

class Main {
	public static void main(String[] args) {
	Fruit afruit = new Apple();
    a도구.sweet();
    // 출력: 달콤한 열매
		
    Root a무기 = new Apple();
    a무기.under();
    // 출력: 뿌리는 아래에

	Seed a공구 = new Apple();
    a공구.small();
    //출력: 작은 씨앗
	}
}

//인터페이스도 추상클래스처럼 그 자체로는 인스턴스를 생성할 수 없다.
interface Fruit {
  void sweet(); 
}

interface Root {
  void under(); 
}

interface Seed{
  void small(); 
}


//인터페이스를 구현하는 클래스에 있는 추상메서드 public void sweet,under,small();를 구현해주어야 한다.
//인터페이스는 인터페이스로부터만 상속받을 수 있으며, 클래스와 달리 다중상속이 가능하다.
//추상클래스가 상속을 통해 추상메서드를 완성하는 것처럼, 'implements'라는 키워드를 활용한다.
class Apple implements Fruit, Root, Seed {
  public void sweet() {
    System.out.println("달콤한 열매");
  }

  public void under() {
    System.out.println("뿌리는 아래에");
  }

  public void small() {
    System.out.println("작은 씨앗");
  }
}

