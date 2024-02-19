package lesson16;

public class CatL16 {
    int maxVolume;



    int raelVolume;


    public CatL16(int maxVolume) {
        this.maxVolume = maxVolume;
        this.raelVolume = 0;
    }

    public void eat(Plate plate) {
        int food = plate.amountFood();
        if (food > maxVolume - raelVolume) {
            food = maxVolume - raelVolume;
        }

        raelVolume += food;
        plate.decreaseFood(food);
    }
}
