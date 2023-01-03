package dia3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Churras {
    public boolean buscaVegetariano(Object espeto){
        Pattern pattern = Pattern.compile("o",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher((CharSequence) espeto.toString());
        boolean achou = matcher.find();
        return achou;
    }
    public boolean buscaCarne(Object espeto){
            Pattern pattern = Pattern.compile("x",Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher((CharSequence) espeto.toString());
            boolean achou = matcher.find();
            return achou;
        }
}
