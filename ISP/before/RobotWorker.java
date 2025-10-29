package ISP.before;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Les robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Les robots ne mangent pas");
    }
}