package Week3;

public class SquarePyramid22 {
    int side, height;

    double calcVol() {
        double vol = 0;
        vol = (1.0/3.0)*(side*side)*height;
        return vol;
    }

    double calcSurface() {
        double sur = 0;
        double baseArea = side*side;
        double hypotenuse = Math.sqrt((height*height)+(0.5*side*0.5*side));
        double lsgtg = ;
        return sur;
    }
}
