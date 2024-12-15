package testlist;

public class NameOccurence {
    private String name;
    private int occurrence;

    public NameOccurence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "    {name: \"" + name + "\", occurrence: " + occurrence + "}";
    }
}
