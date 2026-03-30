@FunctionalInterface
interface Machine {
    String start();
}

abstract class Appliance implements Machine {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

class Fan extends Appliance {
    @Override
    public String start() {
        return "Fan is running";
    }
}

class WashingMachine extends Appliance {
    @Override
    public String start() {
        return "Washing Machine is operating";
    }
}

public class Machines {
    public static void main(String[] args) {
        Machine fan = new Fan();
        Machine washer = new WashingMachine();

        System.out.println(fan.start());
        System.out.println(washer.start());
    }
}