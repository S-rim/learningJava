// extends

class Car extends Machine {
    // Machine 클래스를 상속받는 Car
}

// 접근 제한자

public class CarExam {
    public static void main(String[] args) {
        Car car = new Car("포니", 1234);
        
        System.out.println("name: " + car.name);
        System.out.println("number: " + car.number);
    }
}

public class Car {
    public String name;
    public int number;
    
    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}

// 추상 클래스
// 추상 클래스를 상속받은 클래스는 추상 클래스가 가진 
//추상 메소드를 반드시 구현해야 합니다. 
//그렇지 않으면 해당 클래스도 추상 클래스가 됩니다.

public abstract class Machine {
    public abstract void turnOn();
    public abstract void turnOff();
}

class Car extends Machine {
    // Machine 클래스를 상속받고, 추상 메소드를 구현하세요.
    public void turnOn() {
        System.out.println("");
    }
    
    public void turnOff() {
        System.out.println("");
    }
}

// Super
//super()를 이용하면 부모 클래스의 생성자를 호출할 수 있습니다.

public class Car {
    String name;
    int number;
    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}

public class Car {
    String name;
    int number;
    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}

// 오버라이딩

public class Car {
    public void run() {
        System.out.println("차가 달립니다.");
    }
    
    public void stop() {
        System.out.println("차가 멈춥니다.");
    }
    
    public void horn() {
        System.out.println("경적을 울립니다.");
    }
}

public class Bus extends Car {
    public void run() {
        System.out.println("차가 달리면서 다음 정거장을 안내합니다.");
    }
}