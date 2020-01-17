// 클래스 선언

public class CarExam{
    public static void main(String[]args){
        // c1에 Car 객체를 생성해서 넣어주세요.
        Car c1 = new Car();
    }
}

// String 클래스

public class StringExam {
    public static void main(String[] args) {
        String str1 = new String("Hello world");
        String str2 = new String("Hello world");
        
        if(str1 == str2){
            System.out.println("str1과 str2는 같은 인스턴스를 참조합니다.");
        }
        else{
            System.out.println("str1과 str2는 다른 인스턴스를 참조합니다.");
        }
    }
}

//equals 메소드

public class StringExam {
    public static void main(String[] args) {
        String str1 = new String("Hello world");
        String str2 = new String("Hello world");
        
        if( str1.equals(str2) ){
            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
        }
        else{
            System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
        }
    }
}

// 필드 선언

public class SongExam {
    public static void main(String[] args) {
        Song song = new Song();
        song.songTitle = new String("곡명");
        song.singer = new String("가수");
        song.albumName = new String("앨범");
        song.trackNumber = 5;
    }
}

public class Song {
    String songTitle;
    String singer;
    String albumName;
    int trackNumber;
}

// 메소드 선언

public class ClassExam{
    public static void main(String[]args){
        MyClass mc = new MyClass();
    }
}

public class MyClass{
    public int myMethod(int a){
        return 10;
    }
}

// 메소드 사용하기

class Car{
    void run(){
        System.out.println("차가 달립니다.");
    }
}

class CarExam {
    public static void main(String [] args) {
        Car car = new Car();
        car.run();
    }
}

// String 클래스의 메소드

public class StringExam {
    public static void main(String[] args) {
        String str1 = "안녕하세요. ";
        String str2 = "벌써 여기까지 오셨네요. 끝까지 화이팅!!";
        
        String concatResult;
        String substringResult;
        
        concatResult = (str1.concat(str2));
        substringResult = str1.substring(2);
    }
}

// 변수의 scope와 static

public class VariableScopeExam{
    static int value = 10;
    public static void main(String []args){
        System.out.println(value);
    }
}

//2

public class StaticExam{
    public static void main(String []args){
        Car taxi = new Car();
        Car suv = new Car();
        
        taxi.wheelCount = 10;
        suv.wheelCount = 4;
        
        System.out.println("taxi의 바퀴수:"+ taxi.wheelCount);
        System.out.println("suv의 바퀴수:"+ suv.wheelCount);
    }
}

public class Car{
    static int wheelCount;
}