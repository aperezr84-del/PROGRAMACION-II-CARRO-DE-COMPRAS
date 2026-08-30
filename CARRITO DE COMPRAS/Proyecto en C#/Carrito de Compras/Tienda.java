
import java.util.ArrayList;

public class Tienda
{
    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Venta> ventas;

    public Tienda()
    {
        productos = new ArrayList<Producto>();
        clientes = new ArrayList<Cliente>();
        ventas = new ArrayList<Venta>();
    }

    public void agregarProducto(Producto p)
    {
        productos.add(p);
    }

    public void agregarCliente(Cliente c)
    {
        clientes.add(c);
    }

    public void agregarVenta(Venta v)
    {
        ventas.add(v);
    }

    public Producto buscarProducto(int codigo)
    {
        for(Producto p : productos)
        {
            if(p.getCodigo() == codigo)
            {
                return p;
            }
        }

        return null;
    }

    public Cliente buscarCliente(int id)
    {
        for(Cliente c : clientes)
        {
            if(c.getId() == id)
            {
                return c;
            }
        }

        return null;
    }

    public void mostrarProductos()
    {
        for(Producto p : productos)
        {
            System.out.println(p);
        }
    }

    public void mostrarClientes()
    {
        for(Cliente c : clientes)
        {
            System.out.println(c);
        }
    }

    public void mostrarVentas()
    {
        for(Venta v : ventas)
        {
            v.mostrarVenta();
        }
    }
}