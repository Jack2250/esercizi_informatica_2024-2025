public class Main {
    public static void main(String[] args) {

        Persona p = new Persona("Pippo", "Pluto", 99, "Rovigo", "Rosso", "");
        Studente s = new Studente("Bazaj", "Francesco", 33, "Napoli", "Nero", "");
        //System.out.println(s.getSquadraDelCuore());
        //System.out.println(p.presentazione());
        //System.out.println(s.presentazione());

        //UP-CASTING: Posso assegnare un oggetto di una sottoclasse ad una variabile della superclasse (cast implicito, trasforma un tipo in un altro tipo)

        Persona p3;
        p3 = s;
        System.out.println(p3.metodoGenerico());

        Persona p4 = new Studente("Guezam", "Abousnnar", 102, "Palermo", "Nero", "Milan");
        System.out.println(p4.metodoGenerico());


        //DOWN-CASTING
        Persona p5 = new Persona("test", "test", 2, "Rovigo", "Giallo", "Juve");
        Studente s5;

        //s5 = (Studente) p5; //Down-casting (Casting esplicito), operazione non possibile
        //System.out.println(s5.metodoNuovo());

        //BINDING DINAMICO: A RUNTIME CHIAMA IL METODO CORRETTO
        Persona p10 = new Studente("Alessandro", "Manzoni", 10, "Palermo", "Nero", "Milan");
        Persona p20 = new Docente("Gino", "Angela", 502, "Venezia", "Azzurro", "Milan");
        System.out.println(p10.presentazione());
        System.out.println(p20.presentazione());
    }
}