/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Stefania
 */
public class Empleado {
    //atributos =datos = variable
    int  id;
    String nombre;
    String cargo;
    int salario;
    String telefono;
    String direccion;
    
    //metodo especial = fotocopiadora = iniciar la clase    
     public Empleado() {
    }

    public Empleado(int id, String nombre, String cargo, int salario, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
    
    //metodos = acciones = funcuones
    public int calcularSalario(){
        return(0);
    }

    

   
    
}
