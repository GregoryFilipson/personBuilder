public class Main {
    public static void main(String[] args)  {
        Person player = new PersonBuilder()
                .setName("Лионель")
                .setSurname("Месси")
                .setAge(33)
                .setAddress("Барселона")
                .build();

        Person son = player.newChildBuilder()
                .setName("Тьяго")
                .setAge(5)
                .build();

        System.out.println(player);
        System.out.println(son);

        try {
            new PersonBuilder().build();
        } catch (IllegalArgumentException e) {
            System.out.println("Не введено имя и/или фамилия человека!");
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            System.out.println("Введен не верный возраст");
        }
    }
}

