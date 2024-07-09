package src;

import com.aluracursos.conversor.modelos.ConsultaAPI;
import com.aluracursos.conversor.modelos.Conversiones;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int idMenu = 0;

        List<String> calculo = new ArrayList<>();

        ConsultaAPI consulta = new ConsultaAPI();
        Conversiones conversiones = new Conversiones(consulta);

        String menu ="""
                <------------------------------------------------------->
                1) Dolar a Peso Mexicano
                2) Dolar a Peso Chileno
                3) Dolar a Peso Colombiano
                4) Dolar a Peso Argentino
                
                5) Salir
                
                <------------------------------------------------------->
                """;

        while (idMenu != 5){
            try{
                System.out.println(menu);
                idMenu = Integer.parseInt(lectura.nextLine());

                switch (idMenu) {
                    case 1:
                        System.out.println("Conversion USD---->MXN");
                        conversiones.extraerValores("MXN", "USD");
                        calculo.add(conversiones.mensajeResultado());
                        break;

                    case 2:
                        System.out.println("Conversion USD---->CLP");
                        conversiones.extraerValores("CLP", "USD");
                        calculo.add(conversiones.mensajeResultado());
                        break;

                    case 3:
                        System.out.println("Conversion USD---->COP");
                        conversiones.extraerValores("COP", "USD");
                        calculo.add(conversiones.mensajeResultado());
                        break;

                    case 4:
                        System.out.println("Conversion USD---->ARS");
                        conversiones.extraerValores("ARS", "USD");
                        calculo.add(conversiones.mensajeResultado());
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Por favor ingresar una opción del menú");
                }

            }
            catch (JsonSyntaxException | NullPointerException e) {
            System.out.println("Error");
            }
            catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Error");
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Hasta luego!!!");
    }
}
