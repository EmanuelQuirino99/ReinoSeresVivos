import com.herencia.reinos.*;

public class Main {
    public static void main(String[] args) {
       ServivoFungi();
       System.out.println("--------------------------------------------");
       SerVivoVegetal();
       System.out.println("---------------------------------------------");
       ServivoAnimal();
       System.out.println("----------------------------------------------");
       SerVivoMonera();
       System.out.println("-----------------------------------------------");
       SerVivoProtoctista();




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
    public static void ServivoAnimal(){
        animal animal = new animal();
        animal.setNombre("Tigre");
        animal.setEcosistema("Selva");
        animal.setAlimentacion("Carne");
        animal.setClase("Mamifero");
        animal.setReproduccion("Sexual");
        animal.setClasificacion(" panterinos (familia Felidae)");
        String InformacionAnimal =
                "Reino Animal" +
                        "\nNombre : " + animal.getNombre() +
                        "\nEcosistema : " + animal.getEcosistema() +
                        "\nAlimentacion : " + animal.getAlimentacion() +
                        "\nClase : " + animal.getClase() +
                        "\nReproduccion : " + animal.getReproduccion() +
                        "\nClasificacion : " + animal.getClasificacion();

        System.out.println(InformacionAnimal);

    }
    public static void SerVivoMonera(){
        monera monera = new monera();
        monera.setNombre("Arqueobacterias");
        monera.setEcosistema("suelo, océanos, pantanos y en el colon humano");
        monera.setAlimentacion("compuestos inorgánicos como el hidrógeno, dióxido de carbono, alcoholes, azufre, hierro, entre otros.");
        monera.setTamaño("entre 0,1 µm a más de 15 µm");
        monera.setClasificacion("Metanógenas, Halófilas y Termófilas");
        monera.setReproduccion("asexualmente y se dividen por fisión binaria, fragmentación o gemación");
        String InformacionMonera =
                "Reino Monera" +
                "\nNombre : " + monera.getNombre() +
                "\nEcosistema : " + monera.getEcosistema() +
                "\nAlimentacion : " + monera.getAlimentacion() +
                "\nTamaño : " + monera.getTamaño() +
                "\nClasificacion : " + monera.getClasificacion() +
                "\nReproduccion : " + monera.getReproduccion();
        System.out.println(InformacionMonera);

    }

    public static void SerVivoProtoctista() {
        protoctistas protoctistas = new protoctistas();
        protoctistas.setNombre("Algas Rojas");
        protoctistas.setEcosistema("mares templados y tropicales en las zonas intermareal y submareal, en arrecifes rocosos y de coral. ");
        protoctistas.setAlimentacion("No tiene alimentacion");
        protoctistas.setTamaño("longitud varía de unos pocos centímetros a un metro");
        protoctistas.setHabitat("zona litoral relativamente estrecha que bordea la placa continental");
        protoctistas.setClase("Rhodophyta");
        protoctistas.setReproduccion(" asexual por división mitótica");
        String InformacionProctoctista =
                "Reino Proctoctista" +
                 "\nNombre : " + protoctistas.getNombre() +
                 "\nEcosistema :" + protoctistas.getEcosistema() +
                 "\nAlimentacion : " + protoctistas.getAlimentacion() +
                 "\nTamaño : " + protoctistas.getTamaño() +
                 "\nHabitat : " + protoctistas.getHabitat() +
                 "\nClase : " + protoctistas.getClase() +
                 "\nReproduccion : " + protoctistas.getReproduccion();
                 System.out.println(InformacionProctoctista);


    }


    }


