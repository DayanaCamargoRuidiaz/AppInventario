/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.model;

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
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor

public class Producto {

    @NonNull
    @EqualsAndHashCode.Include
    private String codigo;
    @EqualsAndHashCode.Exclude
    private String nombre;
    @EqualsAndHashCode.Exclude
    private double stock, cantidad;

}
