public class Cat {
    private String name;
    private int appetite;
    //Сытость
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(int food) {
        if (food >= appetite) {
            System.out.println("Кот " + name + " съел " + appetite + " корма и стал сытым");
            this.satiety = true;
        }
        else{
            System.out.println("Коту " + name + " не хватило еды и он остался голодным");
            this.satiety = false;
        }
     }
}