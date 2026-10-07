package opgave1;

public class Window {

    private int widthCm;
    private int heightCm;

    public Window(int widthCm, int heightCm){
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    public int getAreaCm2(){
        return widthCm * heightCm;
    }

    @Override
    public String toString(){
        return " " + heightCm
                + "x" + widthCm
                + "cm, Area: " + getAreaCm2();
    }

}
