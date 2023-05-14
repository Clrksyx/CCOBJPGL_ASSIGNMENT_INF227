public class RobotExplorer implements Explorer {
 
    public void visit(Jupiter jupiter) {
        System.out.println("loading guidelines from the system... exploring Jupiter");
    }

   
    public void visit(Mars mars) {
        System.out.println("loading guidelines from the system... exploring Mars");
    }

   
    public void visit(Saturn saturn) {
        System.out.println("loading guidelines from the system... exploring Saturn");
    }

    public void visit(Uranus uranus) {
        System.out.println("loading guidelines from the system... exploring Uranus");
    }
}