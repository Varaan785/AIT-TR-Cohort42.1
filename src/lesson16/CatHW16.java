package lesson16;

public class CatHW16 {

    int maxbelly;
    int realbelly;

    public CatHW16(int maxbelly) {
        this.maxbelly = maxbelly;
        this.realbelly = 0;
    }
    public void eathw(Plate plate) {
        int food = plate.amountFood();
        if (food > maxbelly - realbelly) {
            food = maxbelly - realbelly;
        }

        realbelly += food;
        plate.decreaseFood(food);
    }
}

