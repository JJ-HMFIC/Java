package ch07.problem;

public abstract class Recipe {
    protected String title;
    protected int cookTime;
    protected boolean isVegan;

    public abstract String getDescription();

    public String toString() {
        return null;
    }
}
