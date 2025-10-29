package ISP.after;

public class MainIsp {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        RobotWorker robot = new RobotWorker();

        human.work();
        human.eat();
        robot.work();
    }
}