package Week3;

public class ArrayBlocks22 {
    public static void main(String[] args) {
        Blocks22[] blArray = new Blocks22[3];

        blArray[0] = new Blocks22(100, 30, 12);
        blArray[1] = new Blocks22(120, 40, 15);
        blArray[2] = new Blocks22(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume blocks - " + i + " : " + blArray[i].countVolume());
        }
    }
}