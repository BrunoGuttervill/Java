import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cachorro animal1 = new Cachorro();
        Gato animal2 = new Gato();

        ArrayList<Animal> lista = new ArrayList<>();

        lista.add(animal2);
        lista.add(animal1);

        for(Animal a:lista){
            if (a instanceof Cachorro){
                ((Cachorro)a).fazerBarulho();
            }else {
                ((Gato)a).fazerBarulho();
            }
        }
    }
}
