package Week3;

import java.util.jar.Attributes.Name;
import java.util.ArrayList;
public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        
        Student aashish = new Student(22029751," aashish");

        aashish.print();
        
        Student ravleen = new Student (22045363, " ravleen");
        
        ravleen.print();

        Student euan = new Student (22026787, " euan");

        euan.print();

        ArrayList<Student> Students = new ArrayList<Student>();
        




        




    }     
    

   
}
