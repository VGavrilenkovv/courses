package oop;

/**
 * Created by Student on 10.12.2018.
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone(7332255, 55, 365);
        Phone phone1 = new Phone(365, 55);
        Phone phone2 = new Phone();

        /*phone.num =7332255;
        phone.weight=55;
        phone.model=365;
        */

        System.out.println("модель телефона - " + phone.model + "номер телефона - " + phone.num + "размеры телефона =" + phone.weight);
        phone.receiveCall("Mather", "8888");
        System.out.println(phone.getNumber());
        System.out.println(phone1.model + " " + phone1.weight + " " + phone1.num);
        System.out.println(phone2.model + " " + phone2.weight + " " + phone2.num);


    }


}
