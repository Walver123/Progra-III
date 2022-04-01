/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C8P3;

/**
 *
 * @author jeant
 */
public class principal {
    public static void main(String[] args) {

        
//        ClsLista lista = new ClsLista();
//        
//        lista.insertarCabezaLista(80);        
//        lista.insertarCabezaLista(40);
//        lista.insertarCabezaLista(6);
//        lista.insertarCabezaLista(88);
//        lista.insertarCabezaLista(89);
//        lista.insertarCabezaLista(99);
//        System.out.println("--------------------------------------------");
//        lista.visualizar();
//        lista.insertarLista(6, 10);
//        System.out.println("--------------------------------------------");
//        lista.visualizar();
//        lista.eliminar(88);
//        System.out.println("--------------------------------------------");
//        lista.visualizar();
       

        ClsAlumno alum = new ClsAlumno();
        System.out.println("\n \n -----------\n -Inserta todos los datos por cabeza \n");
        alum.carnet="1";
        alum.nombre="Walver";
        alum.promedio=76;
        ClsLista lista = new ClsLista(alum);
        
        //insertar por cabeza
        alum=new ClsAlumno();
        alum.carnet="2";
        alum.nombre="Daniel";
        alum.promedio=98;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="3";
        alum.nombre="Antoni";
        alum.promedio=79;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="4";
        alum.nombre="Carlos";
        alum.promedio=88;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="5";
        alum.nombre="Maria";
        alum.promedio=23;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="6";
        alum.nombre="Juan";
        alum.promedio=79;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="7";
        alum.nombre="Chomin";
        alum.promedio=54;
        lista.insertarCabezaLista(alum);
        
        alum=new ClsAlumno();
        alum.carnet="8";
        alum.nombre="Diego";
        alum.promedio=38;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="9";
        alum.nombre="Rocio";
        alum.promedio=100;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="10";
        alum.nombre="Kai";
        alum.promedio=100;
        lista.insertarCabezaLista(alum);
        lista.visualizar();
        System.out.println("--------------------------------------------");
        

        //BuscarPorDatoIngresado
        System.out.println("\n \n ---------------\n -Busca segun el carnet \n");
        Nodo DatoEncontradoPorCarnet;
        DatoEncontradoPorCarnet=lista.buscarLista("2");
        System.out.println("El dato encontrado por carnet es: "+ DatoEncontradoPorCarnet.dato.toString());
        System.out.println("--------------------------------------------");


        //insertar por cola y buscar por posicion
        System.out.println("\n \n ---------------\n -Ingresa en la cola de la lista \n");
        Nodo IngresarCola;
       IngresarCola= lista.buscarPosicion(11);
       alum=new ClsAlumno();
       alum.carnet="88";
       alum.nombre="Walver";
       alum.promedio=12;
       lista.insertarUltimoLista(IngresarCola, alum);
       lista.visualizar();
       System.out.println("--------------------------------------------");

       //Eliminar dato de la lista
       System.out.println("\n \n --------------- \n -Elimina un dato segun el carnet enviado en este caso es el carnet 5 \n");
       lista.eliminar("5");
       lista.visualizar();
       System.out.println("--------------------------------------------");

       //Ingresar en medio de dos datos
       System.out.println("\n \n -------------------- \n -Ingresa en medio de dos datos en este caso es despues del 7 \n");
       alum=new ClsAlumno();
       alum.carnet="12";
       alum.nombre="Tamara";
       alum.promedio=100;
       lista.insertarLista("7", alum);
       lista.visualizar();
       System.out.println("--------------------------------------------");
    }
}
