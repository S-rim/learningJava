// if문

public class ConditionalExam {
    public static void main(String[] argv) {
        int value = 18;        

        if( value % 3 == 0 ) {
            System.out.println("value는 3의 배수입니다.");
        }
    }
}

// 논리연산자

public class LogicalOperatorExam {
    public boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;

        if(age<=19 || age >=60) {
            isDiscount = true;
        }
        else {
            isDiscount = false;
        }
        return isDiscount;
    }

    public static void main(String[]args) {
        LogicalOperatorExam exam = new LogicalOperatorExam();
        exam.isAgeDiscountable(15);
        exam.isAgeDiscountable(27);
    }
}

// switch문

import java.util.Calendar;
public class SwitchExam {
    public static void main(String[] args) {
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        
        switch(month) {
            case 1:
            case 2:
            case 12:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
        }
        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
    }
}

// while문

public class WhileExam{
    public static void main(String[] args){
        int i = 1;
        while(i < 11){
            if(i%2==0)
            System.out.println(i);
            i++;         
        }
    }
}

//for문

public class ForExam {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++)
        {
            if(i%2==0) System.out.println(i);
        }
    }
}