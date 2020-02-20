// 추상 클래스란? 실체클래스의 공통적인 부분(변수,메서드)를 추출해서 선언한 클래스

// 추상클래스를 사용하는 이유?
//추상클래스에서 미리 정의한 필드와 메서드가 있다면 
//실체클래스는 추상클래스의 필드와 메서드명을 변경할 수 없고 무조건 해당 명명으로 구현해야한다. 
//따라서, 필드와 메서드 이름을 통일하여 유지보수성을 높이고 통일성을 유지할 수 있다.
//설계시간이 줄어 시간이 절약된다.

class Main {
    public static void main(String[] args) {
      
      Person person1 = new Cook();
      person1.work();
  
      Person person2 = new Farmer();
      person2.work();
      
      Person person3 = new Police();
      person3.work();
    }
  }
  abstract class Person {
    abstract void work();
  }
  
  class Cook extends Person {
    void work() {
      System.out.println("요리를 합니다.");
    }
  }
  
  class Farmer extends Person {
    void work() {
      System.out.println("농사를 짓습니다.");
    }
  }
  
  class Police extends Person {
    void work() {
      System.out.println("범인을 잡습니다.");
    }
  }

//person 이라는 추상클래스를 구현했다. 
//person 클래스 앞에 abstract 키워드가 있기 때문에 해당 클래스는 추상클래스임을 알 수 있다. 
//내부를 보면 abstract 키워드를 붙인 work() 추상메서드가 있다.
//여기서 해당 추상클래스를 상속받는 실체클래스들은 반드시 추상메서드를 상속받아 재정의(오버라이딩)해야한다.

 