package ch11.worldCup.problem02;

public class MaleCelebrity implements Celebrity {
    private String name;

    public MaleCelebrity(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MaleCelebrity male) {
            return male.getName().equals(this.getName());
        }
        return false;
    }

    @Override
    public String toString() {
        return "남자 연예인: " + this.name ;
    }
}
