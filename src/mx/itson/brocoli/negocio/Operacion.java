/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.negocio;

/**
 * Contiene metodos para trabajar con tipos de dato String.
 * @author Jonathan Felix.
 */
public class Operacion {
    /**
     * Separa una cadena de texto a partir de la expresión guion medio.
     * @param valor Cadena de texto que será separada a partir de a expresion dada.
     * @return array de string en donde cada posiucuon representa una division de a cadena de texto.
     */
    public String [] separar (String valor){
        String [] elementos = valor.split("-");
        return elementos;
    }
    }
