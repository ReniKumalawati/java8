package Lambda;

public class Salutation {
    private String word;
    private String origin;
    private int priority;

    public Salutation(String word, String origin, int priority){
        this.word = word;
        this.word = word != null ? word : this.word;
        this.origin = origin;
        this.priority = priority;
    }

    public String getWord() {
        return word;
    }

    public String getOrigin() {
        return origin;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
