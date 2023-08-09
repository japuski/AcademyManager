package markSource;

public class MarkSourceCreator {

    public MarkSource createMarkSource(MarkSourceType type, String name, int maxPoints){
        if (type == null){
            return null;
        }
        if (type == MarkSourceType.EXAM){
            return new Exam(name, maxPoints);
        }
        if (type == MarkSourceType.HOMEWORK){
           // return new Homework();
        }

        return null;
    }

}
