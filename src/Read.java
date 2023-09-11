class Read extends Thread {
    int start;
    int stop;
    int delay;

    public Read(int start, int stop, int delay) {
        this.start = start;
        this.stop = stop;
        this.delay = delay;
    }

    @Override
    public void run() {
        for(int i = start ; i < stop ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}