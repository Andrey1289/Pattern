package andrey.patterns.structural.adapter;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public boolean checkFits(RoundPeg peg){
        boolean result;
        result = (this.getRadius()>= peg.getRadius());
        return result;
    }
}
