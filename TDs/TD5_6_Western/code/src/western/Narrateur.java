package western;
import java.util.ArrayList;
import java.util.List;

public class Narrateur {
    private List<String> histoire;
    public Narrateur(){
        this.histoire = new ArrayList<>();
    }

    public void ajouterLignes(String ligne){
        histoire.add(ligne);
    }

    public void raconterHistoire(){
        for(String ligne : histoire){
            System.out.println(ligne);
        }

    }

}
