package domain;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class metodoscodbarras {
    public codigoBarras codigos;
    public List<codigoBarras> codigo;


    long pares=0; /*esta variable guardara el acumulado de los numeros pares */
    long impar=0; /*esta variable guardara el acumulado de los numeros impares */
    long resultado=0; /*esta variable guarda la multiplicacion de impares por 3 mas los pares */
    long redondeo=0; /*esta variable guardara el redondeo del resultado */
    long control=0; /*esta variable guardara el numero de control para luego confirmar si coincide */
    int swch; /*esta variable es para saber si el programa tuvo que colocar ceros a la izquierda */
    int numeroCeros; /*esta variable determina cuantos ceros se pusieron a la izquierda */
    String ceros="";

    /**
     * @valiarPaisyControl .....
     * variables.....
     * resultado.....
     */
    /*esta variable guarda los ceros para luego ser concatenados a la izquierda */
    public void validarPaisyControl() {

        codigo.forEach(codigo -> {
            pares=0;
            impar=0;
            resultado=0;
            redondeo=0;
            swch=0;
            /*se reinician el valor de las variables despues de cada ciclo del for */
            /*en este condicional se verifica que la cadena tenga 13 o menos digitos ademas si no es de 13 digitos
             se concatenan ceros a la izquierda*/
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
            /*solo entran a este condicional si el digito de control es correcto*/
                 if (control==Long.parseLong(String.valueOf(codigo.numero.charAt(12)))){
           /*si el codigo comienza con cero pertenece a EEUU pero si se concatenaron ceros a la izquierda no */
                     if(Long.parseLong(String.valueOf(codigo.numero.charAt(0)))==0 && swch==0){
                         JOptionPane.showMessageDialog(null,"YES EEUU");
                     }
                     /*si el codigo comienza con 380 pertenece a bulgaria*/
                     if(Long.parseLong(String.valueOf(codigo.numero.charAt(0)))==3 && Long.parseLong(String.valueOf(codigo.numero.charAt(1)))==8 && Long.parseLong(String.valueOf(codigo.numero.charAt(2)))==0){
                         JOptionPane.showMessageDialog(null,"YES Bulgaria");
                     }
                     /*si el codigo comienza con 50 pertenece a inglaterra*/
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
