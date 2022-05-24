package keywords;

/*
System.gc() + Override Finalize() Method:
 */
public class Finalize {

    private int objectID;

    public Finalize(int objectID){
        this.objectID = objectID;
        System.out.println("Created " + this.objectID);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroyed " + this.objectID);
    }

    public static void main(String[] args) {
        new Finalize(11);
        new Finalize(22);
        new Finalize(33);

        for(int i = 0 ; i < 100 ; i++){
            System.gc();
        }
    }
}
