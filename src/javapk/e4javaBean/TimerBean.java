package javapk.e4javaBean;

public class TimerBean {

    private long start;

    public TimerBean() {
        start = System.currentTimeMillis();
    }

    public long getElapsedMillis() {
        long now = System.currentTimeMillis();
        return now - start;
    }

    public long getElapsedSeconds() {
        return this.getElapsedMillis() / 1000;
    }

    public void reset() {
        start = System.currentTimeMillis();
    }

    public long getStartTime() {
        return start;
    }

    public void setStartTime(long time) {
        if (time <= 0) {
            reset();
        } else {
            start = time;
        }
    }

    public static void main(String args[]) {
        TimerBean tb = new TimerBean();
        for (int i = 0; i < 2000000; i++) {
            double t = Math.random();
        }
        System.out.println(tb.getElapsedSeconds());
        System.out.println(tb.getElapsedMillis());
    }
}
