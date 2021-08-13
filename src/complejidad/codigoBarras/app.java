package complejidad.codigoBarras;
import domain.metodoscodbarras;
import domain.codigoBarras;
import domain.codigoTarjeta;
import domain.metodoscodTarjeta;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
public class app {
    public static void main(String[] args) {

        metodoscodbarras metodos=new metodoscodbarras();
        metodoscodTarjeta Tmetodos=new metodoscodTarjeta();
        Tmetodos.Tcodigo=new ArrayList<>();
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


                metodos.validarPaisyControl();


        }else{

            metodoscodbarras codigos=new metodoscodbarras();
            codigoTarjeta codigoNuevo;

            String numeroCodigo="";
            long numeroCodigo2;
            do{
            numeroCodigo=JOptionPane.showInputDialog(null, "ingrese codigo");
            numeroCodigo2 = Long.parseLong(numeroCodigo);
            codigoNuevo=new codigoTarjeta(numeroCodigo);
            Tmetodos.Tcodigo.addAll(Arrays.asList(codigoNuevo));
            }while (numeroCodigo2 != 0);
            Tmetodos.validarTarjeta();


        }


    }
}
