public class ejecutaAgenda {
    public static void main(String[] args){
        // crear la agenda "asociación" y "uso"
        agenda agenda1 = new agenda();
        agenda agenda2 = new agenda();

        // crear objetos personas 
        persona objeto1 = new persona("Ana","femenino","2221654810","calle no inventada No.25",25);
        persona objeto2 = new persona("Rogelio","Hombre","2221871526","calle que si existe No.1",22);
        persona objeto3 = new persona("Ana","Femenino","2221871656","calle 100% real No.1",18);
        persona objeto4 = new persona("juan","Hombre","222151656","calle 100% real No.15",20);

        // agregamos los objetos a la lista de agenda "agregacion"
        agenda1.agregarContacto(objeto1);
        agenda1.agregarContacto(objeto2);
        agenda2.agregarContacto(objeto3);
        agenda2.agregarContacto(objeto4);

        // agenda 1
        System.out.println("Agenda 1");
        System.out.println("");
        agenda1.MostrarDatos();

        // agenda 2
        System.out.println("Agenda 2");
        System.out.println("");
        agenda1.MostrarDatos();

        // contadores
        System.out.println("numero de personas: " + persona.numPer);
        System.out.println("numero de agendas: " + agenda.numAgenda);
        System.out.println("");

        // metodos extras
        System.out.println("agenda 1");
        agenda1.buscar("Ana");
        System.out.println("agenda 2");
        agenda1.buscar("Ana");
    }
}
