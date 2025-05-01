package ch07.problem;

public class KoreanRecipe extends Recipe {
    public KoreanRecipe() {
        this.title = "김치찌개";
        this.cookTime = 20;
        this.isVegan = false;
    }

    @Override
    public String getDescription() {
        return "매콤한 김치찌개를 추천합니다!";
    }

    public String getSpicinessLevel() {
        return "→ 맵기: ★★★☆☆";
    }

    @Override
    public String toString() {
        return String.format("%s(%d) - %s",
                this.title, this.cookTime, this.isVegan ? "비건" : "비건 아님");
    }


}
