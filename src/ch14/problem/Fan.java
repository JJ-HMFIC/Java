package ch14.problem;

public class Fan implements Runnable {
    private String name;
    private boolean isVIP;
    private EntryManager entryManager;

    public Fan(String name, boolean isVIP, EntryManager entryManager) {
        this.name = name;
        this.isVIP = isVIP;
        this.entryManager = entryManager;
    }

    boolean isVIP() {
        return isVIP;
    }

    String getName() {
        return name;
    }

    @Override
    public void run() {
        entryManager.registerFan(this);
        while (!entryManager.processEntry(this)) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
