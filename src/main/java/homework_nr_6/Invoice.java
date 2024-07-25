package homework_nr_6;

public class Invoice {

     private String deviceModel;
     private String productDescription;
     private int numberPP;
     private double price;

    public Invoice(String deviceModel, String productDescription, int numberPP, double price) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        setPrice(price);
        setNumberPP(numberPP);
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getNumberPP() {
        return numberPP;
    }

    public void setNumberPP(int numberPP) {
        if (numberPP > 0){
            this.numberPP = numberPP;
        }else {
            this.numberPP = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }else{
            this.price = 0.0;
        }
    }

    public double getAmount(){
        return price * numberPP;
    }

    public static void main(String[] args) {
        Invoice obj1 = new Invoice(
                "Poco",
                "Phone",
                3,
                100.0);

        System.out.println("Сумма к оплате состовляет - " + obj1.getAmount());
    }
}
