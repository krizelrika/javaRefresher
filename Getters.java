class Phone {
    private String model;
    private int storage;
    private int megapixels;

    public Phone(String mo, int s, int me) {
        model = mo;
        storage = s;
        megapixels = me;
    }

    public String getModel() {
        return model;
    }
}

public class Getters {
    public static void main(String[] args) {

        Phone myPhone = new Phone("iPhone", 256, 12);
        System.out.println(myPhone.getModel());
        System.out.println(myPhone.getModel().toUpperCase());
        System.out.println(myPhone.getModel().startsWith("b"));
        System.out.println(myPhone.getModel().indexOf("n"));

    }
}