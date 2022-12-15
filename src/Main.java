public class Main {
    public static void main(String[] args) {
         var numeroif = 10;

        if(numeroif<0){
            System.out.println("es negativo");
        } else if (numeroif<=0){
            System.out.println("es cero");
        }else if(numeroif >0){
            System.out.println("es positivo");
        }


        int numeroWhile =1;

        while (numeroWhile <3 ){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }


        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile<=1);


        int numeroFor =0;
        for (numeroFor=0; numeroFor <=3;numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "Verano";

        switch (estacion){
            case "Primavera":
                System.out.println("es Primavera");
                break;

            case "Invierno":
                System.out.println("es Invierno");
                break;

            case "Otoño":
                System.out.println("es Otoño");
                break;

            case "Verano":
                System.out.println("es Verano");
                break;

            default:
                System.out.println("no es una estacion del año");
                break;
        }
    }
}