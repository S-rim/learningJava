// 정수형 변수

        public class VariableExam {
            public static void main(String[] args) {
                
        int number = 3;

                System.out.println(number);
            }
        }


// 상수

        public class ConstantExam {
            public static void main(String[] args) {
                
            final double PI = 3.14159;

                    int radius = 5;
                    double result = radius * 2 * PI;
                    System.out.println(result);
                }
            }


// 기본형 타입

        public class PrimitiveDataTypeExam {
            public static void main(String[] args) {
        
            boolean
            isFun = false;
                    
            char
            charValue = 'a';
                    
            int
            intValue = 20;
                    
            long
            longValue = 2147483648L; 

                    System.out.println(isFun);
                    System.out.println(charValue);
                    System.out.println(intValue);
                    System.out.println(longValue);
                }
            }


// 기본형 타입 변환

        public class TypeCastingExam {
            public static void main(String[] args) {
                long longValue = 20;

            int intValue = (int)longValue;
                    
                    System.out.println(intValue);
                }
            }


// 산술연산자

        public class OperatorExam {
            public int[] calculate() {
                int a = 7; 
                int b = 3;

                //c는 a와 b의 합 
                int c = 
        a+b;

                //d는 a와 b의 차
                int d = 
        a-b;

                //e는 a와 b의 곱
                int e = 
        a*b;

                //f는 a를 b로 나눈 나머지 
                int f = 
        a%b;


                System.out.printf("c는: %d\n", c);
                System.out.printf("d는: %d\n", d);
                System.out.printf("e는: %d\n", e);
                System.out.printf("f는: %d\n", f);

                int ret[] = {c, d, e, f};
                return ret;
            }

            public static void main(String []args){
                new OperatorExam().calculate();
            }
        }

// 비교연산자

        int i = 10; 
        int j = 10;    

        // i와 j가 같은지 비교하는 연산자
        System.out.println(i == j );    // true
        // i와 j가 다른지 비교하는 연산자
        System.out.println(i != j );    // false
        // i가 j보다 작은지 비교하는 연산자
        System.out.println(i < j);      // false
        // i가 j보다 작거나 같은지 비교하는 연산자
        System.out.println( i <= j);    // true
        // i가 j보다 큰지 비교하는 연산자
        System.out.println(i > j);      // false
        // i가 j보다 크거나 같은지 비교하는 연산자
        System.out.println(i >= j);     // true