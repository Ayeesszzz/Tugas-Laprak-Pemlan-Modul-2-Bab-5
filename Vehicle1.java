public class Vehicle1 {
    private double load;

    private final double maxLoad = 10000;

  
    public Vehicle1 (double max) {
        this.maxLoad = max;
    }

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return this.maxLoad;
    }

    public boolean addBox(double weight) {
        double temp = this.load + weight;
        if(temp <= maxLoad) {
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }

    public double hitungPembagian(String nil, String nil2) {
        double n1 = Double.parseDouble(nil);
        double n2 = Double.parseDouble(nil2);
        return n1 / n2;
    }
}