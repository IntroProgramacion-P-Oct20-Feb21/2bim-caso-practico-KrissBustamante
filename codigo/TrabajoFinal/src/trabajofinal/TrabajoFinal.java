/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TrabajoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String cadena;
        String salida;
        boolean bandera = true;
        int indice = 0;

        while (bandera) {

            System.out.println("Ingrese 1 para crear una cuenta de Facebook\n"
                    + "Ingrese  2 para crear una cuenta de Whatsapp\n"
                    + "Ingrese  3 para crear una cuenta de Telegram\n"
                    + "Ingrese  4 para crear una cuenta de Signal\n"
                    + "Ingrese 5 para crear una cuenta de Instagram\n"
                    + "Ingrese  6 para crear una cuenta de Flickr \n"
                    + "Ingrese  7 para crear una cuenta de Twiter");
            opcion = entrada.nextInt();
            
            if (opcion == 1) {
                indice = indice + 1;
                crearFacebook();
            } else {
                if (opcion == 2) {
                    indice = indice + 1;
                    crearWhatsapp();
                } else {
                    if (opcion == 3) {
                        indice = indice + 1;
                        crearTelegram();
                    } else {
                        if (opcion == 4) {
                            indice = indice + 1;
                            crearSignal();
                        } else {
                            if (opcion == 5) {
                                indice = indice + 1;
                                crearInstagram();
                            } else {
                                if (opcion == 6) {
                                    indice = indice + 1;
                                    crearFlickr();
                                } else {
                                    if (opcion == 7) {
                                        indice = indice + 1;
                                        crearTwitter();
                                    } else {
                                        System.out.println("Opcion incorrecta");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            entrada.nextLine();
            System.out.println("Ingrese (si) si desea salir del ciclo");
            salida = entrada.nextLine();
             
            if (salida.equals("si")) {
                bandera = false;
            }
        }
        System.out.printf("Resultado de Campaña es: %s \n" , obtenerMensaje(indice));

    }

    public static void crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String correo;
        String ciudad;
        String pais;
        int edad;

        System.out.println("Ingrese su Usuario");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su pais");
        pais = entrada.nextLine();

        System.out.println("Ingrese su correo electrónico");
        correo = entrada.nextLine();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        System.out.printf("Datos Ingresados" + "\n"
                + "Usuario: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Ciudad: " + ciudad + "\n"
                + "País: " + pais + "\n"
                + "Correo Electrónico: " + correo + "\n");

    }

    public static void crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String pais;
        int edad;
        int numero;

        System.out.println("Ingrese su Usuario");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su pais");
        pais = entrada.nextLine();

        System.out.println("Ingrese su número de télefono");
        numero = entrada.nextInt();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        System.out.printf("Datos Ingresados" + "\n"
                + "Usuario: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Ciudad: " + ciudad + "\n"
                + "País: " + pais + "\n"
                + "Número de Télefono: " + numero + "\n");

    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String pais;
        String area;
        int numero;

        System.out.println("Ingrese su Usuario");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su pais");
        pais = entrada.nextLine();

        System.out.println("Ingrese su área de interés");
        area = entrada.nextLine();

        System.out.println("Ingrese su número de télefono");
        numero = entrada.nextInt();

        System.out.printf("Datos Ingresados " + "\n"
                + "Usuario: " + nombre
                + "Área de Interés: " + area
                + "Ciudad: " + ciudad
                + "País: " + pais
                + "Número de teléfono: " + numero);

    }

    public static void crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String pais;
        String hobby;
        int numero;

        System.out.println("Ingrese su Usuario");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su pais");
        pais = entrada.nextLine();

        System.out.println("Ingrese su Hobby Principal");
        hobby = entrada.nextLine();

        System.out.println("Ingrese su número de télefono");
        numero = entrada.nextInt();

        System.out.printf("Datos Ingresados "
                + "Usuario: " + nombre
                + "Hobby Principal: " + hobby
                + "Ciudad: " + ciudad
                + "Pais: " + pais
                + "Numero de telefono: " + numero);

    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String correo;
        int edad;

        System.out.println("Ingrese su Usuario");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su correo electrónico");
        correo = entrada.nextLine();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        System.out.printf("Datos Ingresados" + "\n"
                + "Usuario: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Ciudad: " + ciudad + "\n"
                + "Correo Electrónico: " + correo + "\n");

    }

    public static void crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String correo;

        System.out.println("Ingrese su Usuario");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su correo electrónico");
        correo = entrada.nextLine();

        System.out.printf("Datos Ingresados" + "\n"
                + "Usuario: " + nombre + "\n"
                + "Correo Electrónico: " + correo + "\n");

    }

    public static void crearTwitter() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String pais;
        String apellidos;
        String idioma;
        String correo;
        int edad;

        System.out.println("Ingrese su Usuario");
        nombre = entrada.nextLine();

        System.out.println("Ingrese sus Apellidos");
        apellidos = entrada.nextLine();

        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su pais");
        pais = entrada.nextLine();

        System.out.println("Ingrese su idioma");
        idioma = entrada.nextLine();

        System.out.println("Ingrese su correo electrónico");
        correo = entrada.nextLine();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        System.out.printf(" Datos Ingresados" + "\n"
                + "Usuario: " + nombre + "\n"
                + "Apellidos: " + apellidos + "\n"
                + "Edad: " + edad + "\n"
                + "Ciudad: " + ciudad + "\n"
                + "Pais: " + pais + "\n"
                + "Idioma: " + idioma + "\n"
                + "Correo Electrónico: " + correo);

    }

    public static String obtenerMensaje(int num) {

        String cadena = "";
        String[] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante",
            "Excelente campaña"};

        if ((num >= 1) && (num <= 5)) {
            cadena = mensajeFinal[0];
        } else {
            if ((num >= 6) && (num <= 15)) {
                cadena = mensajeFinal[1];
            } else {
                if (num >= 16) {
                    cadena = mensajeFinal[2];

                }
            }
        }
        return cadena;

    }

}
