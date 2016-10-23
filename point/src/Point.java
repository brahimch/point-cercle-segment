/**
 * Created by brahim on 10/22/16.
 */
public class Point {
    private int abscisse;
    private int ordonnee;
    public  Point(){
        this.abscisse =0;
        this.ordonnee =0;
    }
    Point(int x) {
        this.abscisse = x;
        this.ordonnee = x;
    }
    Point(int x, int y) {
        this.abscisse = x;
        this.ordonnee = y;
    }
    public int getAbscisse() {

        return abscisse;
    }

    public int getOrdonnee()
    {
        return ordonnee;
    }

    
    public String symetrie() {
        
        return "("+(-this.abscisse)+","+this.ordonnee+")";
    }


    @Override
    public String toString() {
        return "(" + abscisse + ";" + ordonnee + ")";
    }
}
