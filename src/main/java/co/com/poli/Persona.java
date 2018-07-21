/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author Usuario
 */
@Data // setter-getter-toString-hascodeequal
@AllArgsConstructor // Constructor con todos los argumentos
@NoArgsConstructor // constructor vacio}
@RequiredArgsConstructor //Constructor con algun argumento

public class Persona {
    
    @NonNull @EqualsAndHashCode.Include // argumento del constructor y incluye al hascode
    private String codigo;
    @EqualsAndHashCode.Exclude //Excluye del hascode
    private String nombres,apellidos; 
    
    
    
    
    
    
}
