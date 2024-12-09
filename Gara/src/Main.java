public class Main {
    public static void main(String[] args) {
        try {
            Pilota p1 = new Pilota("Mario", "Andretti", "America");
            Pilota p2 = new Pilota("Michael", "Schumacher", "Tedesco");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}