package ru.bspb.clients_lesson3;

public class  Main {

    public static void main(String[] args) {

        ClientFL[] clientFLS = new ClientFL[]{
                new ClientFL("Козлов Андрей Иванович", 45, "М"),
                new ClientFL("Пончик Андрей Петрович", 55, "М"),
                new ClientFL("Бубликов Петр Сергеевич", 32, "М"),
                new ClientFL("Мартышкина Анна Львовна", 27, "Ж"),
                new ClientFL("Козлов Андрей Иванович", 45, "М"),
                new ClientFL("Советова Мария Петровна", 44, "Ж"),
                new ClientFL("Львов Игорь Павлович", 33, "М"),
                new ClientFL("Пончик Андрей Петрович", 55, "М"),
                new ClientFL("Бубликов Петр Сергеевич", 32, "М"),
                new ClientFL("Мартышкина Анна Львовна", 27, "Ж"),
                new ClientFL("Шариков Шарик Шарикович", 27, "М"),
                new ClientFL("Кошкина Клавдия Тимофеевнв", 44, "Ж"),
                new ClientFL("Бубликов Петр Сергеевич", 32, "М"),
                new ClientFL("Кусков Рафинад Сахарович", 51, "М"),
                new ClientFL("Конфеткина Анна Львовна", 67, "Ж"),
                new ClientFL("Львов Игорь Павлович", 33, "М")
        };

        for (int i = 0; i < clientFLS.length; i++) {
            for (int j = i + 1; j < clientFLS.length; j++) {
                if (clientFLS[j].getAge() < clientFLS[i].getAge()) {
                    int ageSwap = clientFLS[i].getAge();
                    String clientNameSwap = clientFLS[i].getName();
                    String genderSwap = clientFLS[i].getGender();
                    clientFLS[i] = clientFLS[j];
                    clientFLS[j] = new ClientFL(clientNameSwap, ageSwap, genderSwap);
                }
            }
        }
        for (int i = 0; i < clientFLS.length; i++){
            if ((clientFLS[i].equals(clientFLS[i + 1]) == false)) {
                if (clientFLS[i].getGender() == "М") {
                    System.out.println(clientFLS[i]);}//переопределили метод to String в Client
                }
                // Можно не переопределять метод
                //{System.out.println(clients[i].getName() + " " + clients[i].getAge() + " " + clients[i].getGender());}}
            }
        }
    }






