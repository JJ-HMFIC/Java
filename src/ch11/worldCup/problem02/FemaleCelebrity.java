package ch11.worldCup.problem02;

public class FemaleCelebrity implements Celebrity {
    private String name;

    public FemaleCelebrity(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof FemaleCelebrity female) {
            return female.getName().equals(this.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "여자 연예인: " + this.name;
    }
}
