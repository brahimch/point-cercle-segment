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

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }
}
