
public class Data {
    int value;
    Data nextData;

    public Data(int value){
        this.value = value;
        this.nextData = null;
    }

    public int getValue(){
        return value;
    }
    public Data getNextData(){
        return (nextData);
    }
}
