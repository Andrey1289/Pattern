package andrey.patterns.structural.bridge;

public class Tv implements Device{
    private boolean on = false;
    private int volume = 40;
    private int channel = 2;

    @Override
    public boolean IsEnabled() {
        return on;
    }

    @Override
    public void enable() {
         on = true;
    }

    @Override
    public void disable() {
       on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if(percent > 100){
            this.volume = 100;
        }else if(percent < 0){
            this.volume = 0;
        }else {
            this.volume = percent;
        }

    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
         this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("===================================");
        System.out.println("I'm Tv.");
        System.out.println("I'm" + (on ? " enable" : " disable"));
        System.out.println("Current volume is " + volume + "%");
        System.out.println("Current channel is "+ channel);
        System.out.println("======================================\n");

    }
}
