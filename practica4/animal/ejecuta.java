public class ejecuta {
    public static void main(String[] args){
        vaca maria = new vaca();
        animal juanita = new cerdo();
        serpiente sofia = new serpiente();
        animal ana = new perro();


        System.out.println("Maria dice: "+ maria.habla());
        System.out.println(maria.peso(15) + "\n");
        System.out.println("Juanita dice: "+ juanita.habla());
        System.out.println(juanita.peso(11) + "\n");
        System.out.println("Sofia dice: "+ sofia.habla());
        System.out.println(sofia.peso(8) + "\n");
        System.out.println("Ana dice: "+ ana.habla());
        System.out.println(ana.peso(4) + "\n");
    }
}
