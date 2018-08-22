/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codec;

import java.util.Arrays;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Haylton
 */
public class Codec {

    public static void main(String[] args) {
        String indicador = "242215/t1076986";

        indicador = Base64.encodeBase64String(indicador.getBytes());

        System.out.println("String codificada: " + indicador);

        //
        // Decodifica uma string anteriormente codificada usando o método decodeBase64 e
        // passando o byte[] da string codificada
        //
        byte[] decoded = Base64.decodeBase64(indicador.getBytes());
        
        //imprime o array codificado
        System.out.println(Arrays.toString(decoded));
        
        //converte o array de byte decodificado para a string original
        String decodedString = new String(decoded);
        System.out.println(indicador + " = " + decodedString);
        
        String ind= decodedString.split("/")[0];
        
        System.out.println("indicador : " + ind);
        
        
        String chave = decodedString.split("/")[1];
        
        System.out.println("Chave : " + chave);
        

    }

}
