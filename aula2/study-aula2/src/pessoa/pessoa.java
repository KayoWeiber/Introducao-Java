package pessoa;

import carro.carro;

public class pessoa {
    carro carros;

    public pessoa(carro carros){
        this.carros = carros;
        this.carros.Acelerar();
    }
}
