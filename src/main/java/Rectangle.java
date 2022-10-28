public class Rectangle extends Dessin {
    private Point coinGauche;
    private double largeur;
    private double hauteur;

    @Override
    double perimetre() {
        return (hauteur+largeur)*2;
    }

    @Override
    double surface() {
        return largeur*hauteur;
    }

    @Override
    void update(ParametrageObsarvable po) {
        int etatNew=((ParametrageObsarvableImpl)po).borderSize+1;
        System.out.println("la taille du contour est changée"+etatNew);
    }
}
