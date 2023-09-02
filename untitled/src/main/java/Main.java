import controller.Controller;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createToy("Micky mouse",5,5);
        controller.createToy("Baer", 10, 20);
        controller.createToy("Mouse",50,60);

        controller.getToys();
        System.out.println("controller.winToys() = " + controller.winToys());
        controller.update();
        controller.getToys();
    }
}