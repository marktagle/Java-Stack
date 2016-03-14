import java.util.*;
    class Stack1 {
        public static Stack <String> lst1 = new Stack <String>();
        public static String m = ""; public static int n = 0;
        public static Scanner scan = new Scanner(System.in);

        public static void main(String []args) {
            holder();
        }

        public static void holder() {
            Scanner scan=new Scanner(System.in);
            System.out.println("1,Push\n2,Pop\n3,Peek\n4,Exit\n");
            System.out.print("Choose from 1-4 ");
            n=scan.nextInt();

            if(n==1) {
                push();
            }
            else if(n==2) {
                pop();
            }
            else if(n==3) {
                peek();
            }
            else if(n==4) {
                System.exit(0);
            }
        }
        public static void push() {
            System.out.print("Enter a string: ");
                m=scan.nextLine();
            lst1.push(m);
            System.out.println(lst1);
            holder();
        }
        public static void pop() {
            lst1.pop();
            System.out.println(lst1);
            holder();
        }
        public static void peek() {
            System.out.println(lst1.peek());
            holder();
        }
}
