public abstract class Auto {
    protected String name;
    protected float fuelCapacity;
    protected float fuelConsumption;
    protected float size;

    public Auto(String name, float fuelCapacity, float fuelConsumption) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public void checkFuel (){
        while(true) {
            try {
                System.out.println(String.format("[%s] is driving. %s fuel"));
                Thread.sleep(3000);
                size -= fuelConsumption;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
