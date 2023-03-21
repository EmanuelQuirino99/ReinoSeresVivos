import com.herencia.reinos.Fungi;
import com.herencia.reinos.Vegetal;

public class Main {
    public static void main(String[] args) {
       ServivoFungi();
       System.out.println("--------------------------------------------");
       SerVivoVegetal();

    }
    public static void ServivoFungi(){
             Fungi hongo = new Fungi();
             hongo.setNombre("hongo del maíz");
             hongo.setEcosistema("Bosques");
             hongo.setAlimentacion("heterótrofa");
             hongo.setClase("Cyttaria harioti");
             hongo.setReproduccion("sexual y asexual");
             hongo.setVenenoso(false);

             String InformacionHongo =
                     "Reino Fungi"+
              "\nNombre :" + hongo.getNombre() +
            "\nHabitat:" + hongo.getEcosistema() +
            "\nAlimentacion:" + hongo.getAlimentacion() +
            "\nClase:" + hongo.getClase() +
            "\nReproduccion:" + hongo.getReproduccion() +
            "\nEs venenoso?:" + hongo.isVenenoso() ;
             System.out.println(InformacionHongo);



    }
    public static void SerVivoVegetal(){
        Vegetal vegetal = new Vegetal();
        vegetal.setNombre("Planta sin flor");
        vegetal.setEcosistema("hábitats húmedos y sombríos");
        vegetal.setAlimentacion("absorben agua y minerales");
        vegetal.setClase("briófitas");
        vegetal.setReproduccion("Sexual");
        vegetal.setReino("Plantae");

        String InformacionVegetal =
                            "Reino Vegetal" +
                       "\nNombre :" + vegetal.getNombre() +
                        "\nHabitat:" + vegetal.getEcosistema() +
                        "\nAlimentacion:" + vegetal.getAlimentacion() +
                        "\nClase:" + vegetal.getClase() +
                        "\nReproduccion:" + vegetal.getReproduccion() +
                        "\nClasificaion:" + vegetal.getReino();
                          System.out.println(InformacionVegetal);

    }
}
