
    import java.util.Scanner;
    public class Main {

        public static double calc(double a,double b, char op){
            return switch(op){
                case '+'-> a+b;
                case '-' -> a-b;
                case '*' -> a*b;
                case '/' -> {
                    if(b==0){
                        System.out.print("infinity");
                        yield 0;
                    }else{
                        yield a/b;
                    }
                }
                default -> {
                    System.out.print("Invalid op");
                    yield 0;
                }

            };
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("===== Simple Java Calculator =====");

            // Taking input numbers
            while(true) {

                System.out.print("Enter an operator(+,-,*,/) or 'q/Q' to exit:");
                char op = sc.next().charAt(0);

                if(op=='q' || op=='Q'){
                    System.out.print("exiting");
                    break;
                }

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();



                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                double result = calc(a, b, op);


                    System.out.println("Result = " + result);


            }
            sc.close();
        }
    };


