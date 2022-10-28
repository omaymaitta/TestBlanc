public class Cercle extends Dessin{
   private Point center;
   private double rayon;
    @Override
    double perimetre() {
        return 2*(this.rayon)*Math.PI;
    }

    @Override
    double surface() {
        return Math.pow(this.rayon,2)*Math.PI;
    }

    @Override
    void update(ParametrageObsarvable po) {
        int etatNew=((ParametrageObsarvableImpl)po).getBorderColor()+1;
        System.out.println("la couleur du contour est changée"+etatNew);
    }
}
