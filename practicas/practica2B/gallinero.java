public class gallinero {
    gallina gallina1,gallina2,gallina3,gallina4,gallina5;

    // constructor
    public gallinero(){
    }

    // metodos
    public void gallinero1(){
        gallina1 = new gallina("rojo",400,50.5,50.0,"grande","negro","negro");
        gallina2 = new gallina("negro",450,52.5,52.5,"pequeño","amarillo","amarillo");
        gallina3 = new gallina("rojo",500,60.5,55.5,"grande","blanco","negro");
        gallina4 = new gallina("blanco",600,55.5,55.5,"pequeño","amarillo","amarillo");
        gallina5 = new gallina("rojo",550,40.0,40.0,"grande","negro","negro");
    }

    public void verGallinas(){
        System.out.println("");
        gallina1.verInfo();
        gallina2.verInfo();
        gallina3.verInfo();
        gallina4.verInfo();
        gallina5.verInfo();
    }
}