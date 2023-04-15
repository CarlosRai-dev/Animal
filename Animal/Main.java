package Animal;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal galo = new Galo();
        Animal pato = new Pato();
    
        galo.emitirSom();
        galo.comer();
        gato.emitirSom();
        gato.comer();
        pato.emitirSom();
        pato.comer();
        cachorro.emitirSom();
        cachorro.comer();
    }
          
}
