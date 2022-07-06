public class Tickets {
    public static void main(String[] args) {

        int ticketPrice = 5000;
        int milesForBonus = 20;
        int bonus = ticketPrice / milesForBonus;

        System.out.println ("Спасибо Вам за то, что пользуетесь услугами нашей Авиакомпании. При приобретении билета стоимостью " + ticketPrice + " руб., Ваш бонусный счёт пополнится на " + bonus + " бонусных миль.");
    }
}
