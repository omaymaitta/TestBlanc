import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Figures extends Dessin {
   private List<Dessin> dessins=new ArrayList<Dessin>();
    @Override
    double perimetre() {
        for(int i=0;i<dessins.size();i++)
          for(Dessin d:dessins)
            System.out.println( d.perimetre()+" ");
        return 0;
    }

    @Override
    double surface() {
        for(int i=0;i<dessins.size();i++)
            for(Dessin d:dessins)
                System.out.println( d.surface()+" ");
        return 0;
    }

    @Override
    void update(ParametrageObsarvable po) {

    }
    public void add(Dessin d){
        dessins.add(d);
    }
    public void remove(Dessin d){
        dessins.remove(d);
    }
    public List<Dessin> getChilds(){
        return dessins;
    }
    public void serialise() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("serialise.serial");

    }
}
