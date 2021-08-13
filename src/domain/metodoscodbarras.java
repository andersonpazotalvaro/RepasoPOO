package domain;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class metodoscodbarras {
    public codigoBarras codigos;
    public List<codigoBarras> codigo;


    long pares=0;
    long impar=0;
    long resultado=0;
    long redondeo=0;
    long control=0;
    int swch;
    int numeroCeros;
    String ceros="";
    public void validarPaisyControl() {

        codigo.forEach(codigo -> {
            pares=0;
            impar=0;
            resultado=0;
            redondeo=0;
            swch=0;

            if (codigo.numero.length()<13){
                numeroCeros=13-codigo.numero.length();
                for (int i=0;i<numeroCeros;i++){
                    ceros=ceros+"0";
                }
                codigo.numero= ceros+codigo.numero;
                swch=1;
            }
                for(int i=0; i<codigo.numero.length()-1;i+=2){
                //System.out.println(codigo.numero.charAt(i));
                pares = Long.parseLong(String.valueOf(codigo.numero.charAt(i)))+pares;
                //System.out.println(pares);
                }
                 for(int i=1; i<codigo.numero.length()-1;i+=2){
                //System.out.println(codigo.numero.charAt(i));
                impar = Long.parseLong(String.valueOf(codigo.numero.charAt(i)))+impar;
                //System.out.println(impar);
                }
                resultado=pares+(impar*3);
                 redondeo= (long) Math.ceil(resultado/10)*10;
                 redondeo = redondeo+10;
                 control = redondeo - resultado;

                 if (control==Long.parseLong(String.valueOf(codigo.numero.charAt(12)))){
                     if(Long.parseLong(String.valueOf(codigo.numero.charAt(0)))==0 && swch==0){
                         JOptionPane.showMessageDialog(null,"YES EEUU");
                     }
                     if(Long.parseLong(String.valueOf(codigo.numero.charAt(0)))==3 && Long.parseLong(String.valueOf(codigo.numero.charAt(1)))==8 && Long.parseLong(String.valueOf(codigo.numero.charAt(2)))==0){
                         JOptionPane.showMessageDialog(null,"YES Bulgaria");
                     }
                     if(Long.parseLong(String.valueOf(codigo.numero.charAt(0)))==5 && Long.parseLong(String.valueOf(codigo.numero.charAt(1)))==0){
                         JOptionPane.showMessageDialog(null,"YES Inglaterra");
                     }else{
                         JOptionPane.showMessageDialog(null,"YES Desconocido");
                     }
                 }else{
                     JOptionPane.showMessageDialog(null,"NO");
                 }



        });
    }



}
