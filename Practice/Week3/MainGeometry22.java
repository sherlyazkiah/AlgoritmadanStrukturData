package Week3;

import java.util.Scanner;

public class MainGeometry22 {
    public static void main(String[] args) {
        Sphere22[] sp = new Sphere22[3];
        SquarePyramid22 sqp[] = new SquarePyramid22[3];

        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("Radius sphere = ");
            int rSphere = sc.nextInt();
            sp[i] = new Sphere22(rSphere);

            System.out.print("Side square pyramid = ");
            int ssPyramid = sc.nextInt();
            System.out.print("Height square pyramid = ");
            int hPyramid = sc.nextInt();
            sqp[i] = new SquarePyramid22(ssPyramid,hPyramid);
        }


        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Sphere " + i + " - Volume: " + sp[i].calcVol() + ", Surface area: " + sp[i].calcSurface());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Square pyramid " + i + " - Volume: " + sqp[i].calcVol() + ", Surface area: " + sqp[i].calcSurface());
        } 

        sc.close();
    }
}