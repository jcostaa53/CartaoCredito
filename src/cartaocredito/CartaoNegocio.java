/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartaocredito;

/**
 *
 * @author joao.costa3
 */
public class CartaoNegocio {
    
    public void gerarCartao(){
        
    }
    
    private String gerarNumeros(){
        String senha = "";
        int numero;
        for (int i = 0; i < 4; i++) {
            numero = (int) (Math.random() * 10);
            senha += numero;
        }
        return senha;
    }
    
    public String gerarNumeroCartao(){
        return gerarNumeros() + "-" + gerarNumeros() + "-" + gerarNumeros() + "-" + gerarNumeros();
    }
    
    public String gerarSenha(){
        String[] letras = {"a", "b",
            "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String senha = "";
        int numero;
        for (int i = 0; i < 4; i++) {
            numero = (int) (Math.random() * letras.length);
            senha += letras[numero];
        }
        return senha;
    }
}

