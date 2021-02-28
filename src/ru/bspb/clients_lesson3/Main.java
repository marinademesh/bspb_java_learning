package ru.bspb.clients_lesson3;

public class  Main {

    public static void main(String[] args) {

        Client[] clients = new Client[]{
                new Client("Козлов Андрей Иванович", 45, "М"),
                new Client("Пончик Андрей Петрович", 55, "М"),
                new Client("Бубликов Петр Сергеевич", 32, "М"),
                new Client("Мартышкина Анна Львовна", 27, "Ж"),
                new Client("Козлов Андрей Иванович", 45, "М"),
                new Client("Советова Мария Петровна", 44, "Ж"),
                new Client("Львов Игорь Павлович", 33, "М"),
                new Client("Пончик Андрей Петрович", 55, "М"),
                new Client("Бубликов Петр Сергеевич", 32, "М"),
                new Client("Мартышкина Анна Львовна", 27, "Ж"),
                new Client("Шариков Шарик Шарикович", 27, "М"),
                new Client("Кошкина Клавдия Тимофеевнв", 44, "Ж"),
                new Client("Бубликов Петр Сергеевич", 32, "М"),
                new Client("Кусков Рафинад Сахарович", 51, "М"),
                new Client("Конфеткина Анна Львовна", 67, "Ж"),
                new Client("Львов Игорь Павлович", 33, "М")
        };

        for (int i = 0; i < clients.length; i++) {
            for (int j = i + 1; j < clients.length; j++) {
                if (clients[j].getAge() < clients[i].getAge()) {
                    int ageSwap = clients[i].getAge();
                    String clientNameSwap = clients[i].getName();
                    String genderSwap = clients[i].getGender();
                    clients[i] = clients[j];
                    clients[j] = new Client(clientNameSwap, ageSwap, genderSwap);
                }
            }
        }
        for (int i = 0; i < clients.length; i++){
            if ((clients[i].equals(clients[i + 1]) == false)) {
                if (clients[i].getGender() == "М") {
                    System.out.println(clients[i]);}//переопределили метод to String в Client
                }
                // Можно не переопределять метод
                //{System.out.println(clients[i].getName() + " " + clients[i].getAge() + " " + clients[i].getGender());}}
            }
        }
    }






