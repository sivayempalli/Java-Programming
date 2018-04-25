class Coordinate {
    int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main1 {
    public static void main(String args[]) {
        
        //Coordinate p = new Coordinate();//object Create
        Coordinate p = new Coordinate(2,4);

        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}

//error 
//while creating constructor argument has to send