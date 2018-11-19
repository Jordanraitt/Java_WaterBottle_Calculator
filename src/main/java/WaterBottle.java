public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){

        this.volume = volume;
    }

    public int hasVolume(){
        return this.volume;
    }

    public int takeDrink(){
        int result = (this.volume - 10);
        {
            return result;
        }
    }

    public int emptyBottle(){
        int result = (this.volume = 0);
        {
            return result;
        }
    }

    public int fillBottle(){
      int result = (this.volume = 100);
        {
            return result;
        }
    }
}
