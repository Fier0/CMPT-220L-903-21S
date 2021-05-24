public class lab_7 {
    public static void main(String[] args) {
	    Data first = new Data(1);
        Data second = new Data(2);
        Data third = new Data(3);
        Data fourth = new Data(4);
        Data fifth = new Data(5);

        first.nextData = second;
        second.nextData = third;
        third.nextData = fourth;
        fourth.nextData = fifth;
    }
}
