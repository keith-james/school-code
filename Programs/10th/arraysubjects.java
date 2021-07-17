/*6. Accept the name, physics, chemistry and math marks of 25 students. Then display a list of the given data with Total and Average.
bugg no name input so sad :(*/

import java.util.*;
public class arraysubjects {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int physics[] = new int[5];
        int maths[] = new int[5];
        int chem[] = new int[5];
        int physics_sum = 0, chem_sum = 0, maths_sum = 0;
        for(int i = 0; i < physics.length; i++){
            System.out.print("Physics value: ");
            physics[i] = sc.nextInt();
            System.out.print("Maths value: ");
            maths[i] = sc.nextInt();
            System.out.print("Chem value: ");
            chem[i] = sc.nextInt();
        }
        for(int i = 0; i < physics.length; i++){
            physics_sum = physics_sum + physics[i];
            chem_sum = chem_sum + chem[i];
            maths_sum = maths_sum + maths[i];
        }
        System.out.println("Physics total: " + physics_sum + "\nPhysics avg: " + (physics_sum/physics.length));
        System.out.println("Maths total: " + maths_sum + "\nMaths avg: " + (maths_sum/physics.length));
        System.out.println("Chem total: " + chem_sum + "\nChem avg: " + (chem_sum/physics.length));
    }

}
