package Week3;

public class ArrayRectangle2D {
    public static void main(String[] args) {
        
        Rectangle2D[][] rectangle2DArray = new Rectangle2D[3][3];

        rectangle2DArray[0][0] = new Rectangle2D(45, 80);
        rectangle2DArray[0][1] = new Rectangle2D(35, 75);
        rectangle2DArray[0][2] = new Rectangle2D(20, 60);
        rectangle2DArray[1][0] = new Rectangle2D(100, 85);
        rectangle2DArray[1][1] = new Rectangle2D(75, 55);
        rectangle2DArray[1][2] = new Rectangle2D(25, 70);
        rectangle2DArray[2][0] = new Rectangle2D(120, 10);
        rectangle2DArray[2][0] = new Rectangle2D(95, 30);
        rectangle2DArray[2][1] = new Rectangle2D(45, 110);
        rectangle2DArray[2][2] = new Rectangle2D(40, 130);

        for (int i = 0; i < rectangle2DArray.length; i++) {
            for (int j = 0; j < rectangle2DArray.length; j++) {
                System.out.println("Rectangle (" + i + "," + j + ") length: " + rectangle2DArray[i][j].length + ", width: " + rectangle2DArray[i][j].width);
            }
        }
    }
}
