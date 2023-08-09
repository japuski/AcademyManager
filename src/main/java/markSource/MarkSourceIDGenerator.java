package markSource;

public class MarkSourceIDGenerator {
    private static int id;
    public static int generateId(){
        incrementID();
        return id;
    }
    private static void incrementID(){
        id++;
    }
}
