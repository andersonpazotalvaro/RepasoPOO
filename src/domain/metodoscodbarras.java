package domain;
import java.util.List;
import java.util.ArrayList;

public class metodoscodbarras {
    public codigoBarras codigos;
    public List<codigoBarras> codigo;

    long pares=0;
    long impar=0;
    long resultado=0;
    long redondeo=0;
    public void validarPais() {

        codigo.forEach(codigo -> {
            pares=0;
            impar=0;
            resultado=0;
            redondeo=0;
            for(int i=0; i<codigo.numero.length();i+=2){
                pares=codigo.numero.charAt(i);
                System.out.println(codigo.numero.charAt(i));
                System.out.println(pares);
            }
            resultado=pares+(impar*3);
            //redondeo= (int) Math.ceil(resultado/10)*10;
           //System.out.println(pares);
            //System.out.println(impar);
           // System.out.println(resultado);
           // System.out.println(redondeo);



        });
    }


}
