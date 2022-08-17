package earth.terrarium.spiritualize.api;

public interface AbstractEnergy {
    long insertEnergy(long maxAmount);
    long extractEnergy(long maxAmount);
    long getEnergyLevel();
    long getMaxCapacity();
}
