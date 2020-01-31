// 메서드 호출에 따라 바뀌게 만들어보기

class Main {
    public static void main(String[] args) {
      전사 a전사 = new 전사();
  
      a전사.공격(); 
  
      a전사.창_모드로_변경();
      
      a전사.공격();
      
      a전사.지팡이_모드로_변경();
  
      a전사.공격();
    }
  }
  
  class 전사 {
  
    String 무기 = "칼";
  
    void 공격() {
      System.out.println(무기 + "로 공격");
    }
  
    void 창_모드로_변경() {
      무기 = "창";
    }
    
    void 지팡이_모드로_변경() {
      무기 = "지팡이";
    }
  }
  

// 형변환과 메서드 인스턴스 변수 이용해서 만들기

class Main {
    public static void main(String[] args) {
      전사 a전사 = new 전사();
  
      a전사.공격(); 
  
      a전사.창_모드로_변경();
      
      a전사.공격();
      
      a전사.지팡이_모드로_변경();
  
      a전사.공격();
    }
  }
  
  class 전사 {
  
    칼 a무기 = new 칼();
  
    void 공격() {
      a무기.공격();
    }
  
    void 창_모드로_변경() {
      a무기 = (창)new 창();
    }
    
    void 지팡이_모드로_변경() {
      a무기 = (지팡이)new 지팡이();
    }
  }
  
  class 칼 {
    void 공격()
    {
      System.out.println("칼로 공격");
    }
  }
  
  class 창 extends 칼 {
    void 공격()
    {
      System.out.println("창으로 공격");
    }
  }
  
  class 지팡이 extends 창 {
    void 공격()
    {
      System.out.println("지팡이로 공격");
    }
  }