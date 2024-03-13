public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() { 
        if(food > 0)
        System.out.println("Корма осталось: " + food);
        else
        System.out.println("Еды не осталось");
    }

    public void addFood(int newFood){
        this.food += newFood;
        System.out.println("В миску добавили " + newFood + " еды");
    }
}
