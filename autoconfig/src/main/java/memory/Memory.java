package memory;

public class Memory {
    private long useed;
    private long max;

    public Memory(long useed, long max) {
        this.useed = useed;
        this.max = max;
    }

    public long getUseed() {
        return useed;
    }

    public long getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "useed=" + useed +
                ", max=" + max +
                '}';
    }
}
