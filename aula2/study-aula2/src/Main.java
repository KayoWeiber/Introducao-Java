import carro.carro2;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Queue;

public static void main(String[] args) {
//    System.out.print("Hello world!");

    List<String> list=new ArrayList<>();
    list.add("Hello");
    list.add("Kayo");
    list.add("Weiber");
    list.add("Kayo teste");
    list.add("Kayo Weiber");
    list.add("Kayo Freire");list.add("Kayo Martins");



    System.out.println("List: "+list);

    Set<String> setString = new HashSet<>();
    setString.add("Hello");
    setString.add("Kayo");
    setString.add("Weiber");
    setString.add("Kayo");

    System.out.println("setString: "+setString);
    System.out.println("setString: "+setString.contains("teste")); //para mostrar se existe

    Map<String,String> map = new HashMap<>();
    map.put("name","Kayo Weiber");
    map.put("surname","Weiber");

    System.out.println(map.get("name"));

    Queue <String> queue = new LinkedList<>();
    queue.add("Kayo");
    queue.add("Athina");

    System.out.println("Queue: "+ queue);
    System.out.println("Queue: "+ queue.poll());
    System.out.println("Queue: "+ queue.poll());
    //System.out.println("Queue: "+ queue.remove());
    System.out.println("Queue: "+ queue);

    LinkedList<String> linked = new LinkedList<>();

    carro2 sandero= new carro2("sandero","preto",2020,"ABD-1234");
    System.out.println(sandero.ano());
    System.out.println(sandero.modelo());
    System.out.println(sandero.placa());
    //DTO => data transfer objects
    //POJOs => plain old java objects


    //STREAM API
        //realizar operações funcionais nas nossas collections(estruturas de dados)
        //filter, map, reduce, agregações
        //filter - filtra os elementos de uma coleção
        //map - transforma os elementos de uma coleção
        //reduce - reduz os elementos de uma coleção a um único elemento
        //agregações - soma, média, contagem, etc
//    List<String> Kayos= list.stream().filter(nome-> nome.startsWith("Kayo")).toList();
    List<String> Kayos= list.stream().filter(nome-> nome.startsWith("Kayo")).map(String::toUpperCase).toList();
    System.out.println("Kayos: "+Kayos);
    String KayosUnic= list.stream().filter(nome-> nome.startsWith("Kayo")).map(String::toUpperCase).reduce("Kayos: ",(a,b)->a+", "+b).toString();
    System.out.println(KayosUnic);
}
