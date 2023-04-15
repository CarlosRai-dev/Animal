package Animal;

public class Cachorro implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Auu Auu Auu Auu");    }

    @Override
    public void comer() {
        System.out.println("Carne, Arroz, Ração");    }
    
}
