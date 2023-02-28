package homeworks.lesson6;

public class Program {
    public static void main(String[] args) {
        
    }
}

class MapGenerator {
    int[][] field;

    public MapGenerator() {
        int[][] field = {
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
            { -1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, -1 },
            { -1, -1, -1, -1, -1, 00, 00, -1, -1, -1, -1, 00, -1, 00, -1 },
            { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, -1, 00, -1 },
            { -1, -1, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, -1 },
            { -1, 00, 00, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, -1, -1, 00, -1, -1, -1, -1, -1, 00, -1, 00, -1 },
            { -1, 00, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, -1, -1, -1 },
            { -1, 00, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, -1, 02, -1 },
            { -1, 00, -1, -1, -1, -1, -1, 00, -1, 00, -1, -1, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, 00, 00, -1, 00, -1, 00, 00, 00, -1 },
            { -1, 00, -1, 00, -1, -1, -1, -1, -1, 00, -1, 00, 00, 00, -1 },
            { -1, 01, -1, 00, 00, 00, 00, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };
    this.field = field;
    }

    public int[][] getField() {
        return field;
    }

    

}

class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
