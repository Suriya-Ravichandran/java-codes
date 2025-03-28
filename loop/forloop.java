import java.util.Scanner;
public class forloop{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("How many employee to add: ");
        int totalemp=scn.nextInt();
        for(int i=1;i<=totalemp;i++){
            System.out.println("Enter employee name: ");
            String name=scn.next();
            System.out.println("Enter employee age: ");
            int age=scn.nextInt();
            System.out.println("name: "+name);
            System.out.println("age: "+age);
            System.out.println(i+"Employee Add success");

        }

    }
}