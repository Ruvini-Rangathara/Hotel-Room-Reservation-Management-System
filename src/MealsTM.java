public class MealsTM {
    private String mealType;
    private String meal;
    private String mealPrice;

    public MealsTM(String mealType, String meal, double mealPrice) {}

    public MealsTM(String mealType, String meal, String mealPrice) {
        this.mealType = mealType;
        this.meal = meal;
        this.mealPrice = mealPrice;
    }

    public String getMealType() {return mealType;}
    public void setMealType(String mealType) {this.mealType = mealType;}
    public String getMeal() {return meal;}
    public void setMeal(String meal) {this.meal = meal;}
    public String getMealPrice() {return mealPrice;}
    public void setMealPrice(String mealPrice) {this.mealPrice = mealPrice;}
}
