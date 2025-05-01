package ch07.problem;

public class VeganRecipe extends Recipe {
    public VeganRecipe() {
        this.title = "두부 샐러드";
        this.cookTime = 10;
        this.isVegan = true;
    }
    @Override
    public String getDescription() {
        return "신선한 두부 샐러드를 추천합니다!";
    }
    @Override
    public String toString() {
        return String.format("%s(%d) - %s",
                this.title, this.cookTime, this.isVegan ? "비건" : "비건 아님");
    }
}
