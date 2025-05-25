public class mobi implements Carro {
    final int limitedeVelocidade = 120;
    public int velocidadeAtual = 0;
    @Override
    public void acelerar() {
        if (velocidadeAtual < limitedeVelocidade) {
            this.velocidadeAtual += 20;
            System.out.println("\nAcelerando...");
        } else {
            System.out.println("\nVelocidade máxima atingida");
        }

        System.out.println("Velocidade atual: " + this.velocidadeAtual + "km/h");
    }

    @Override
    public void frear() {
        System.out.println("Freando o Mobi");
    }

    @Override
    public void parar() {
        System.out.println("Parando o Mobi");
    }
}
