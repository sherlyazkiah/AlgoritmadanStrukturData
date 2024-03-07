package Week3;

public class SquarePyramid22 {
    int side, height;

    public SquarePyramid22(int side, int height){
        side = this.side;
        height = this.height;
    }

    double calcVol() {
        double vol = 0;
        vol = (1.0/3.0)*(side*side)*height;
        return vol;
    }

    double calcSurface() {
        double sur = 0;
        double baseArea = side*side;
        double hypotenuse = Math.sqrt((height*height)+(0.5*side*0.5*side));
        double lsgtg = 0.5*side*hypotenuse;
        sur = baseArea+4*lsgtg;
        return sur;
    }
}
