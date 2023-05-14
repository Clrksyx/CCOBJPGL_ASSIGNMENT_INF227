public class HumanExplorer implements Explorer {

    public void visit(Jupiter jupiter) {
        System.out.println("Deploying a Restaurant to Jupiter... exploring life");
    }

   
    public void visit(Mars mars) {
        System.out.println("Deploying a Hotel to Mars... exploring life");
    }

  
    public void visit(Saturn saturn) {
        System.out.println("Deploying a House to Saturn... exploring life");
    }

    public void visit(Uranus uranus) {
        System.out.println("Deploying a Gold to Uranus... exploring life");
    }
}