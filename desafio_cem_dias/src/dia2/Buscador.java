package dia2;

import java.util.Arrays;

public class Buscador {
    public void findingNemo(String frase){

        var fraseFatiada = Arrays.asList(frase.split(" "));

        int posicaoNemo = fraseFatiada.indexOf("Nemo") + 1;

        if (frase.contains("Nemo")) {

            System.out.printf("I found Nemo in the position %d!!!", posicaoNemo);

        }else{
            System.out.println("I didn't find Nemo!!!");
        }
    }
}
