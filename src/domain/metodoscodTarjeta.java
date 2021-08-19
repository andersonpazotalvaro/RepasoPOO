package domain;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class metodoscodTarjeta {
    public codigoTarjeta Tcodigos;
    public List<codigoTarjeta> Tcodigo;
    long numero; /*esta variable guardara el codigo de tarjeta */
    long acumSumaPares; /*esta variable guardara el acumulado de los numeros pares */
    long acumSumaImpares; /*esta variable guardara el acumulado de los numeros impares */
    long acumTotal; /*esta variable guardara el acumulado de los numeros pares */
    long numerosumado;
    long contador;
    public void validarTarjeta(){
        Tcodigo.forEach(Tcodigo -> {
/*aca si el numero es de mas de 9 se separa su decena y se divide en 10 (1) y se suma su otra parte*/
            for(int i=0; i<Tcodigo.numero.length()-1;i+=2){
                numero = Long.parseLong(String.valueOf(Tcodigo.numero.charAt(i)))*2;
                if(numero>9){
                    numerosumado = 0;
                    contador = 0;
                    while (numero != 10){
                        numero= numero - 1;
                        contador = contador + 1;
                        numerosumado = contador + (numero / 10);
                    }
                }else{
                    numerosumado=numero;
                }
                acumSumaImpares=numerosumado+acumSumaImpares;
            }
            for(int i=1; i<Tcodigo.numero.length();i+=2){
                acumSumaPares=Long.parseLong(String.valueOf(Tcodigo.numero.charAt(i)))+acumSumaPares;
            }
            acumTotal=acumSumaImpares+acumSumaPares;
            if (acumTotal%10==0) {
                JOptionPane.showMessageDialog(null,"Tarjeta Valida");
            }
            else {JOptionPane.showMessageDialog(null,"Tarjeta NO Valida");}
        });
    }
}
