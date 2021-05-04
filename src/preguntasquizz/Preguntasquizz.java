/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntasquizz;

import java.util.Scanner;

public class Preguntasquizz {

    public static void preguntas() {
        preguntas = new String[10][2];
        preguntas[0][0] = "¿Cuál es la sintaxis correcta para generar Hello World en Java?";
        preguntas[0][1] = "0";
        preguntas[1][0] = "¿Cómo se insertan comentarios de una línea en Java?";
        preguntas[1][1] = "1";
        preguntas[2][0] = "¿Qué tipo de datos se utiliza para crear una variable que almacene texto?";
        preguntas[2][1] = "2";
        preguntas[3][0] = "¿Cómo se crea una variable numérica que asigne el valor 5?";
        preguntas[3][1] = "0";
        preguntas[4][0] = "¿Qué operador se utiliza para comparar dos valores?";
        preguntas[4][1] = "1";
        preguntas[5][0] = "¿Para declarar un arreglo, la variable se define como tipo?";
        preguntas[5][1] = "2";
        preguntas[6][0] = "¿Qué instrucción se usa para crear una clase en Java?";
        preguntas[6][1] = "0";
        preguntas[7][0] = "¿Cuál es la sentencia correcta para crear un objeto llamado myObj de MyClass? ";
        preguntas[7][1] = "1";
        preguntas[8][0] = "¿Cuál es el operador que se utiliza para multiplicar números?";
        preguntas[8][1] = "2";
        preguntas[9][0] = "¿Cómo se inicia la sentencia if en Java?";
        preguntas[9][1] = "0";
    }

    public static void incisos() {
        incisos = new String[10][3];
        incisos[0][0] = "System.out.println( Hello World );";
        incisos[0][1] = "echo( Hello World );";
        incisos[0][2] = "print ( Hello World );";
        incisos[1][0] = "/* This is a comment";
        incisos[1][1] = "// This is a comment";
        incisos[1][2] = "# This is a comment";
        incisos[2][0] = "myString";
        incisos[2][1] = "string";
        incisos[2][2] = "String";
        incisos[3][0] = "int x = 5;";
        incisos[3][1] = "num x = 5";
        incisos[3][2] = "x = 5;";
        incisos[4][0] = "><";
        incisos[4][1] = "==";
        incisos[4][2] = "<>";
        incisos[5][0] = "{}";
        incisos[5][1] = "()";
        incisos[5][2] = "[]";
        incisos[6][0] = "class";
        incisos[6][1] = "MyClass";
        incisos[6][2] = "class()";
        incisos[7][0] = "class MyClass = new myObj();";
        incisos[7][1] = "MyClass myObj = new MyClass();";
        incisos[7][2] = "new myObj = MyClass();";
        incisos[8][0] = "%";
        incisos[8][1] = "X";
        incisos[8][2] = "*";
        incisos[9][0] = "if (x > y)";
        incisos[9][1] = "if x > y;";
        incisos[9][2] = "if x > y then;";
    }

    public static void respuestas() {
        String respuesta;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println();
            System.out.println("Pregunta " + (i + 1));
            System.out.println(preguntas[i][0]);
            System.out.println("0.- " + incisos[i][0]);
            System.out.println("1.- " + incisos[i][1]);
            System.out.println("2.- " + incisos[i][2]);
            System.out.println();
            System.out.print("Escribe tu respuesta: ");
            respuesta = entrada.nextLine();
            if (preguntas[i][1].equals(respuesta)) {
                contador++;
            }
        }
    }

    public static int contador() {
        return contador;
    }

    public static void main(String[] args) {

        preguntas();
        incisos();
        respuestas();
        System.out.println();

        System.out.println("Obtuviste un " + contador + " de Calificacion");

    }

    public static String[][] preguntas;
    public static String[][] incisos;
    public static int contador;

}
