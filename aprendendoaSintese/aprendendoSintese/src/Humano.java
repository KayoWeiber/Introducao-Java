public class Humano extends SerVivo {
    public Humano(){
        super(21);
    }
    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Inalando e exalando ar.");
    }

}
