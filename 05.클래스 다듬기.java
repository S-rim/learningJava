// 생성자

public class PersonExam {
    public static void main(String[] args) {
        Person person = new Person(25);
    }
}

class Person{
    int age;
    Person(int num) {age = num;}
}

// this

public class PersonExam {
    public static void main(String[] args) {
        Person person = new Person("사람", 25);
    }
}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// 메소드 오버로딩

public class CarExam {
    public static void main(String[] args) {
        Car car = new Car();
        
        car.run();
        car.run(100);
    }
}

class Car {
    void run() {
        System.out.println("차가 달립니다.");        
    }

    void run(int x)
    {

    }
}

// 생성자 오버로딩과 this

public class CarExam {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("자동차");
        Car car3 = new Car("자동차", 1234);
    }
}

public class Car {
    String name;
    int number;

    Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    Car()
    {
        this("이름없음",0);
    }
    
    Car(String name)
    {
        this.name = name;
    }
}