import java.lang.reflect.Array;
import java.util.ArrayList;


// public -> acessivel de qualquer lugar
// private -> acessivel apenas dentro da classe
//default -> quando não defino nada, acessivel apenas dentro do pacote
// protected -> acessivel dentro do pacote e em subclasses
public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new sandero();
        Carro meuCarro2 = new mobi();

        meuCarro2.acelerar();meuCarro2.acelerar();meuCarro2.acelerar();meuCarro2.acelerar();meuCarro2.acelerar();meuCarro2.acelerar();
        meuCarro2.acelerar();
        SerVivo meuSerVivo = new Humano();
        meuSerVivo.respirar();


    }
    public static void sintese(String[] args) {
        System.out.println("Hello World!");
        byte b=100;
        short s=10000;
        int i=100000;
        long l=100000L;
        float f=10.5f;
        double d=20.5;
        char c='A';
        String str="Kayo";
        boolean boll=false;



        if(boll){
            System.out.println("KayoLindo");
        }else{
            System.out.println("Falso");
        }
        if (str.isBlank()){
            System.out.println("String Vazia!!");
        } else if (str=="Kayo") {
            System.out.println("String Kayo");
        } else {
            System.out.println("String diferente de Kayo");
        }

        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(vetor[0]);

       // for (int j = 0; j < vetor.length; j++) {
           // System.out.println(vetor[j]);
        //}


        ArrayList<String> lista = new ArrayList<>();
        lista.add("Kayo");
        lista.add("Lindo");
        lista.add("KayoLindo");
        lista.add("KayoLindo2");
        lista.add("KayoLindo3");
        lista.remove(0);

        System.out.println(lista.get(0));

//        for (int k=0; k<lista.size(); k++) {
//            System.out.println(lista.get(k));
//        }
//        for (String nome : lista) {
//            System.out.println(nome);
//        }

        int contador=0;
        while (true){
            System.out.println("Contador: "+contador);
            contador++;
            if (contador==11){
                break;
            }
        }
        System.out.println("-------------------");

        contador=0;
        do {

            System.out.println("Contador2: "+contador);
            contador++;
        }while (contador!=11);

        double resultado = 0.0;
        int resultado2 = (int)resultado;

        String meuString = "10";
        int meuInt = Integer.parseInt(meuString);
        System.out.println(meuInt);

        String MinhaString = String.valueOf(meuInt);

    }




}