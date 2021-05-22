class ArregloObjetos {
    private Object[] c;

    ArregloObjetos() {
        c = null;
    }

    ArregloObjetos(Object[] ar) {
        c = ar;
    }

    int Longitud() {
        if (c != null)
            return c.length;
        return 0;
    }

    void Imprime() {
        int i;
        if (c != null) {
            for (i = 0; i < c.length; i++)
                System.out.print("c[" + i + "]=" + c[i] + " ");
            System.out.println();
        }
    }
}
