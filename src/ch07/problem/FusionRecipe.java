package ch07.problem;

public class FusionRecipe extends Recipe {
    public FusionRecipe() {
        this.title = "불닭파스타";
        this.cookTime = 20;
        this.isVegan = false;
    }

    @Override
    public String getDescription() {
        return "매콤달콤한 불닭파스타를 추천합니다!";
    }
}
