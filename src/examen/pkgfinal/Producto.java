
package examen.pkgfinal;


public class Producto implements ProductosPepsi{

    @Override
    public String mirinda() {
        String mirinda = "Tenemos Producto Mirinda a la venta" + "\n";
       return mirinda;
       }
    @Override
       public String seven() {
        String seven = "El producto 7up se encuentra agotado." + "\n";
       return seven;
    }

    /**
     *
     * @return
     */
    @Override
       public String lipton() {
        String lipton = "El producto Lipton se encuentra entre los productos mas solicitados.";
       return lipton;
    }
    }

