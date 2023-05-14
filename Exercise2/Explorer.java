public interface Explorer  {

    void visit(Jupiter jupiter);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Uranus uranus);

    default void visit(Planet planet) {
        System.out.println("We've arrived on an unfamiliar world...");
    }
}
