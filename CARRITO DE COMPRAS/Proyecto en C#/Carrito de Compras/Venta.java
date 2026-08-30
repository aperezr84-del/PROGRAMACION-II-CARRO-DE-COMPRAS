
import java.util.ArrayList;

public class Venta
{
    private int idVenta;
    private Cliente cliente;
    private ArrayList<DetalleVenta> detalles;

    public Venta(int idVenta, Cliente cliente)
    {
        this.idVenta = idVenta;
        this.cliente = cliente;
        detalles = new ArrayList<DetalleVenta>();
    }

    public void agregarDetalle(DetalleVenta detalle)
    {
        detalles.add(detalle);
    }

    public double calcularTotal()
    {
        double total = 0;

        for(DetalleVenta d : detalles)
        {
            total = total + d.calcularSubtotal();
        }

        return total;
    }

    public void mostrarVenta()
    {
        System.out.println("Venta No. " + idVenta);
        System.out.println("Cliente: " + cliente.getNombre());

        for(DetalleVenta d : detalles)
        {
            System.out.println(d);
        }

        System.out.println("Total: Q" + calcularTotal());
    }
}