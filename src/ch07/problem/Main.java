package ch07.problem;

//public class Main {
//    public static void main(String[] args) {
//        Recipe hyunsoo = new KoreanRecipe();
//        Recipe soyoung = new VeganRecipe();
//
//        System.out.println("[현수의 추천 레시피]");
//        System.out.println(hyunsoo.getDescription());
//        System.out.println(hyunsoo);
//        System.out.println();
//
//        System.out.println("[소영의 추천 레시피]");
//        System.out.println(soyoung.getDescription());
//        System.out.println(soyoung);
//    }
//}
public class Main {
    public static void main(String[] args) {
        Recipe[] recipes = {
                new KoreanRecipe(),
                new VeganRecipe(),
                new FusionRecipe()
        };

//        String[] names = { "현수", "소영", "민재" };

//        System.out.println("[AI 꾸미의 자동 레시피 추천 결과]");

        for (Recipe recipe : recipes) {
            System.out.println(recipe.getDescription());
            if (recipe instanceof KoreanRecipe) {
                System.out.println(((KoreanRecipe) recipe).getSpicinessLevel());
            }
        }
    }
}