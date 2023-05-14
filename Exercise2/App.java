public class App {

    public static void main(String[] args) {

        Jupiter jupiter = new Jupiter();
        Mars mars = new Mars();
        Saturn saturn = new Saturn();
        Uranus uranus = new Uranus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        jupiter.accept(astronaut);
        mars.accept(astronaut);
        saturn.accept(astronaut);
        uranus.accept(astronaut);
        
        jupiter.accept(rover);
        mars.accept(rover);
        saturn.accept(rover);
        uranus.accept(rover);
        

    }
}
