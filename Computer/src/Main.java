public class Main {
    public static void main(String[] args) {
        Desktop d1 = new Desktop("Intel i7", 16, 512, "Dell", "XPS", "Windows 11", "NVIDIA RTX 3060");
        Server s1 = new Server("AMD EPYC", 64, 2000, "HP", "ProLiant", "Linux", 2, true);
        Notebook n1 = new Notebook(20, 16, 5, 2);
        Notebook n2 = new Notebook(20, 16, 5, 2);

        System.out.println(d1);
        System.out.println(s1);
        System.out.println(n1);
        System.out.println(n1.equals(n2));


        PcFissi p1; // Up-casting
        p1 = d1;
        System.out.println(p1);

        //Down-casting
        Desktop d2 = new Desktop("Intel i7", 16, 512, "Dell", "XPS", "Windows 11", "NVIDIA RTX 3060");
        Server s4;
        // s4 = (Server) d2;
    }
}