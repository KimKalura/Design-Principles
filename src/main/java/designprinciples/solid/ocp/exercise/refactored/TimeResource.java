package designprinciples.solid.ocp.exercise.refactored;

public class TimeResource implements Resource{

    private int id;
    @Override
    public int findFree() {
        return 0;
    }

    @Override
    public void markFree(int resourceId) {

    }

    @Override
    public void markBusy(int resourceId) {

    }
}