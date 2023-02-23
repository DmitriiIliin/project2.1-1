
public class Main {
    public static void main(String[] args) {

        int bonusForMile = 20; //бонусов за 1 милю
        int ticketPrice = 14203; // стоимость билета
        int totalBonus; // количество бонусных миль за перелеты
        totalBonus = ticketPrice / bonusForMile;
        //Количество бонусных миль
        System.out.println((totalBonus) + " Ваше количество бонусных миль");
    }

}