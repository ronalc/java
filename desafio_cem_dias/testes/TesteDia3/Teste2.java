package TesteDia3;

import dia3.Churras;

import java.util.Arrays;
import java.util.List;

public class Teste2 {
    public static void main(String[] args) {
        Churras churras = new Churras();
        List<Object> churrasqueira = Arrays.asList("--ooo-ooo--","--xxxxxxxxx--","--oo---","--o-----o---x--","--o---o-----");
        int contCarne = 0;
        int contVeg = 0;
        for(Object c : churrasqueira){
            if(churras.buscaCarne(c.toString())==true){
                contCarne += 1;
            }else if (churras.buscaVegetariano(c.toString())==true){
                contVeg += 1;
            }
        }
        System.out.printf("[%d, %d]", contVeg,  contCarne);
    }
}
