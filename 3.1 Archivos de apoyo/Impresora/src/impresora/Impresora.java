package impresora;

public class Impresora {
    private String modelo;

    public Impresora() {
        modelo = "";
    }

    public Impresora(String mod) {
        modelo = mod;
    }

    public String getModelo() {
        return modelo;
    }

    public void imprimir(Documento documento) {
        System.out.println("Modelo Impresora: " + modelo);
        System.out.println("Imprimiendo documento:");
        System.out.println(documento.getTexto());
    }

    public static void main(String[] args) {
        Impresora impresora = new Impresora("HP");
        impresora.imprimir(new Documento());
    }
}
