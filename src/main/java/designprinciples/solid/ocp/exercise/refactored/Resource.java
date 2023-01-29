package designprinciples.solid.ocp.exercise.refactored;

public interface Resource {
    int findFree();
    void markFree(int resourceId);
    void markBusy(int resourceId);
}
