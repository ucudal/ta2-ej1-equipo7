/**
 *
 * @author abadie
 */
public class Main {

    private static long vender(String rutaArchivo, Almacen almacen) {
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(rutaArchivo);

        long valorStockInicial = almacen.obtenerValorStock();

        for (String linea : lineas) {
            String[] partes = linea.split(",");

            String codProducto = partes[0];
            int cantidad = Integer.parseInt(partes[1]);

            almacen.restarStock(codProducto, cantidad);
        }

        long valorStockActual = almacen.obtenerValorStock();

        return valorStockInicial - valorStockActual;
    }

    public static void main(String[] args){
        // TODO:
        /**
         * Instanciar almacen
         * Agregar: productos y cantidades (altas.txt)
         * Emitir listado de productos y cantidades
         * Emitir valor de stock de todo el almacen
         * Vender: restar stock de productos indicado en ventas.txt
         * Emitir valor de stock de todo el almacen
         **/
        System.err.println("TBD");
    }

}
