public class Dessert {
    private String name;
    private int calories;
    private boolean needsHeating;
    public DietType diet;

    public Dessert(String name, int calories, boolean needsHeating, DietType diet) {
        this.name = name;
        this.calories = calories;
        this.needsHeating = needsHeating;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isNeedsHeating() {
        return needsHeating;
    }

    public void setNeedsHeating(boolean needsHeating) {
        this.needsHeating = needsHeating;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", needsHeating=" + needsHeating +
                ", diet=" + diet +
                '}';
    }
}
