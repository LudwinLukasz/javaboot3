package uml;

/**
 * Created by arabk on 12.08.2017.
 */
public class Employee extends Person {
    // agregacja
    private Manager manager = new Manager();
    // przy kodowaniu w parach
    // klasa reeruje na sama siebie
    private Employee partner = null;

}
