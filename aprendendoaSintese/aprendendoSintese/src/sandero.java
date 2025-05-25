public class sandero implements Carro {
    @Override
    public void acelerar() {
        System.out.println("Acelerando o Sandero a 50km/h");
    }

    @Override
    public void frear() {
        System.out.println("Freando o Sandero");
    }

    @Override
    public void parar() {
        System.out.println("Parando o Sandero");
    }

}
