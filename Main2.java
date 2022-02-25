class  currency_conventer{
    private double currecny;


    private static final int rub = 88;

    public double convert(double currencyrub){
        return currencyrub / rub;
    }
    public double swapconvert(double currencydollar){
        return currencydollar * rub;
    }
}

public class Main2 {
    public static void main(String[] args) {
        currency_conventer c = new currency_conventer();
        System.out.println(c.convert(8800));
        System.out.println(c.swapconvert(4));
    }

}

