//6. Accept the name, physics, chemistry and math marks of 25 students. Then display a list of the given data with Total and Average.

import java.util.*;
public class arraysubjects {
    public static void main(String[] args) {

        /*Initialising variables*/
        Scanner sc=new Scanner(System.in);
        int numberOfStudents = 2;
        String names[] = new String[numberOfStudents];
        int physics[] = new int[numberOfStudents];
        int maths[] = new int[numberOfStudents];
        int chem[] = new int[numberOfStudents];
        int physics_sum = 0, chem_sum = 0, maths_sum = 0;

        /* INPUT */
        for(int i = 0; i < numberOfStudents; i++){
            System.out.println("Enter your name: ");
            names[i] = sc.next();

            System.out.print("Enter your physics marks: ");
            physics[i] = sc.nextInt();

            System.out.print("Enter your maths marks: ");
            maths[i] = sc.nextInt();

            System.out.print("Enter your chem marks: ");
            chem[i] = sc.nextInt();
        }

        sc.close();

        /*Calculating the total*/
        for(int i = 0; i < numberOfStudents; i++){
            physics_sum = physics_sum + physics[i];
            chem_sum = chem_sum + chem[i];
            maths_sum = maths_sum + maths[i];
        }

        System.out.println("NAME \t PHYSICS CHEMISTRY MATH"); //The "\t" here is just for formatting, so that it looks good.

        for(int i = 0; i < numberOfStudents; i++) {
            System.out.println(names[i] + " \t    " + physics[i] + " \t     " + chem[i] + " \t    " + maths[i]);
        }

        /*Printing out the name, total and the average. The average is calculated here itself because it's just total divided by number of items (array length)*/
        System.out.println("Physics total: " + physics_sum + "\nPhysics avg: " + (physics_sum/physics.length));
        System.out.println("Maths total: " + maths_sum + "\nMaths avg: " + (maths_sum/physics.length));
        System.out.println("Chem total: " + chem_sum + "\nChem avg: " + (chem_sum/physics.length));
    }

}
