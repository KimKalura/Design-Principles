package designprinciples.solid.ocp.exercise.refactored;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        int resourceId = resource.findFree();
        resource.markBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource, int resourceId) {
        resource.markFree(resourceId);
    }
}