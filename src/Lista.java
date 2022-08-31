public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        nodo.setSiguiente(null);
        if (esVacia()){
          primero = nodo;
      }else{
          Nodo<T> ultimo = primero;
            while (ultimo.getSiguiente() != null) {                
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nodo);
      }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        for (Nodo<T> nodo = primero; nodo != null; nodo = nodo.getSiguiente()) {
            if (nodo.getEtiqueta().equals(clave)) {
                    return nodo;
            }
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        /*if (esVacia()){
            return false;
        } else if(primero.getEtiqueta().equals(clave)){
            primero = primero.getSiguiente();
            return true;
        }else {
            for (Nodo<T> anterior = primero; anterior.getSiguiente() != null; anterior = anterior.getSiguiente()){
                Nodo<T> actual = anterior.getSiguiente();
                if (actual.getEtiqueta().equals(clave)){
                    
                }
            }
        }*/
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimir(String separador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantElementos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
