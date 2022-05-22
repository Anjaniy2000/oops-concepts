package abstraction.interfaces;

public interface VideoEditor {
    public abstract void editVideo();
    public default void uploadVideo(){
        System.out.println("Uploading Video.");
    }
}
