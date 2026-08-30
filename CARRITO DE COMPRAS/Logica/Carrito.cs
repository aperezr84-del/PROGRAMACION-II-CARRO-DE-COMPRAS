using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using CarritoLogica.Models;

public class Carrito
{
    public List <detalle> lstDetalle {get; set;} 
}

// constructor 

public Carrito ()
{
    this.lstDetalle = new List<detalle> ();   
}

{public bool agregar Carrito (int Cantidad, Producto objProducto)
 }

 // Validaciones 

{if (!objProducto.verificarStock(cantidad)) 
    Console.WriteLine("Sin stock"); 
    return false }

    < stDetalle.add (new Detalle (objProducto, Cantidad)); }

    public void mostrarCarrito ()
{
    if (lstDetalle.count == 0) 
    return ;}
// Error

foreach (var item in lstDetalle)
{
    item MostrarDetalle()
}
