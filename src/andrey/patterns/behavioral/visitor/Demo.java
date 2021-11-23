package andrey.patterns.behavioral.visitor;

public class Demo {
    public static void main(String[] args) {
        BuildHome buildHome = new BuildHome();

        BuilderPig NifNif = new NifNif();
        BuilderPig NafNaf = new NafNaf();
        BuilderPig NufNuf = new NufNuf();

        System.out.println("Build start\n=============================\n");
        buildHome.built(NifNif);
        System.out.println("\n=======================");
        buildHome.built(NafNaf);
        System.out.println("\n=======================");
        buildHome.built(NufNuf);
    }
}
