package less;

/**
 * Created by Student on 10.12.2018.
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        phone.num =987987;
        phone.weight=55;
        phone.model="7";

        System.out.println("модель телефона - " + phone.model + "номер телефона - "+ phone.num + "размеры телефона ="+phone.weight);
    }
}
