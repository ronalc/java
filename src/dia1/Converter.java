package dia1;

public class Converter {
    public int converterIdadeEmDias(int idade, int ano) {
        if ((ano % 400 == 0) && (ano % 4 == 0) && (!(ano % 100 == 0))) {
            return idade * 366;
        } else {
            return idade * 365;
        }
    }
}
