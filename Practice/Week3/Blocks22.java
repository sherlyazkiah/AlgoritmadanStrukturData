package Week3;

public class Blocks22 {
    public int width, length, height;

    public Blocks22(int p, int l, int t) {
        length = p;
        width = l;
        height = t;
    }

    public int countVolume() {
        return length*width*height;
    }
}