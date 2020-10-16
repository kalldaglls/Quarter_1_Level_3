public abstract class Auto implements Runnable  {
    protected String name;
    protected float fuelCapacity;
    protected float fuelConsumption;
    protected float size;
    protected FuelStation fuelStation;

    public Auto(String name, float fuelCapacity, float fuelConsumption, float size, FuelStation fuelStation) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
        this.size = size;
        this.fuelStation = fuelStation;
    }

    public void checkFuel (){
        while(true) {
            try {
                if (size <= 2.0F) {
                    size = fuelStation.reFuel(fuelCapacity);
                    System.out.println(name + " is going to refuel!");
                }
                System.out.println(String.format("[%s] is driving. %s fuel, %s capacity, %s consumption", name, size,fuelCapacity,fuelConsumption));
                Thread.sleep(3000);
                size -= fuelConsumption;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        checkFuel();
    }

    public void doFuel(){}

}
