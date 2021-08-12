package complejidad.codigoBarras;
import domain.metodoscodbarras;
import domain.codigoBarras;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
public class app {
    public static void main(String[] args) {

        metodoscodbarras metodos=new metodoscodbarras();
        metodos.codigo= new ArrayList<>();


        int bienvenida = JOptionPane.showOptionDialog(null, "Bienvenido  \n que quieres ingresar?", "Codigos", 0,
                0, null, Arrays.asList("codigo barras", "codigo tarjeta").toArray(), "codigo barras");

        if (bienvenida==0){


            metodoscodbarras codigos=new metodoscodbarras();
            codigoBarras codigoNuevo;

            String numeroCodigo="";
            long numeroCodigo2;
            do{

                numeroCodigo=JOptionPane.showInputDialog(null, "ingrese codigo");
                numeroCodigo2 = Long.parseLong(numeroCodigo);
                codigoNuevo=new codigoBarras(numeroCodigo);
                metodos.codigo.addAll(Arrays.asList(codigoNuevo));


            }while (numeroCodigo2 != 0);


                metodos.validarPais();


        }else{
            JOptionPane.showMessageDialog(null,"instruciones asdasd");
        }


    }
}
