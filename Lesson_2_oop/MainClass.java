package Lesson_2_oop;
public class MainClass {
    public static void main(String[] args) {
       
        Cat[] cats = {
            new Cat("Barsik", 5),
            new Cat("Boris", 7),
            new Cat("Valerian", 11),
            new Cat("Richard", 13),
            new Cat("Musia", 5),
            new Cat("Tihon", 14),
            new Cat("Vasia", 23),
            new Cat("Stepan", 9)
        };

        Plate plate = new Plate(50);
        
        //Кормление котов из тарелки
        for (Cat cat : cats) {
            cat.eat(plate.getFood());
            if(cat.getSatiety()){
                plate.setFood(plate.getFood() - cat.getAppetite());
            }
            plate.info();
        }
       
        //Проверка добавления еды
        plate.addFood(5);
        plate.info();
    }
}
