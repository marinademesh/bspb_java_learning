public class JavaLesson2 {
    // Создаем 3 массива с данными о Клиентах. clientName - ФИО Клиента, age - возраст в годах,  gender - пол.
    // Предпологаем, что изначально в каждом массиве в элементе массива с индексом i++ - хранится информация о конкретном Клиенте.
    // Например: Иванов Иван Иванович 77 лет М - характеристики Клиентов будут записаны в каждый из 3х массивов в элемент с индексом i,
    // о следующем Клиенте в элемент массива i+1 и т.д.
    // Михаил, если возможно, то расскажите на Лекции о вариантах решения данной задачи. (если можно с примерами). Не нравится, что массивы никак не связаны между собой.

    public static void main(String[] args) {
// Задаем ФИО Клиентов.
        String[] clientName = new String[10];
        clientName [0]="Петров Петр Петрович";
        clientName [1]="Пупкина Галина Ивановна";
        clientName [2]="Белов Петр Адреевич";
        clientName [3]="Эйнштейн Роза Марковна ";
        clientName [4]="Шариков Полиграф Полиграфович";
        clientName [5]="Бубликова Алла Ивановна";
        clientName [6]="Сидоров Алексей Иванович";
        clientName [7]="Буркин Петр Петрович";
        clientName [8]="Козлов Игорь Сергеевич";
        clientName [9]="Милая Мила Мирковна";

        // Задаем возраст Клиентов в полных годах.
        int [] age = new int[10];
        age [0]=77;
        age [1]=18;
        age [2]=22;
        age [3]=56;
        age [4]=24;
        age [5]=33;
        age [6]=55;
        age [7]=27;
        age [8]=27;
        age [9]=47;

        // Задаем пол Клиентов. Предпоагаем,что true - мужчина, а false - женщина.
        boolean [] gender = new boolean[10];
        gender [0]= true;
        gender [1]= false;
        gender [2]= true;
        gender [3]= false;
        gender [4]= true;
        gender [5]= false;
        gender [6]= true;
        gender [7]= true;
        gender [8]= true;
        gender [9]= false;

        // Выводим по возрастанию возраста всех мужчин.
        for (int i = 0; i < age.length; i++) {
            for (int j = i + 1; j < age.length; j++) {
                if (age[j] < age[i]) {
                    int ageSwap = age[i];
                    String clientNameSwap = clientName[i];
                    boolean genderSwap = gender[i];

                    age[i] = age[j];
                    clientName[i] = clientName[j];
                    gender[i] = gender[j];

                    age[j] = ageSwap;
                    clientName[j] = clientNameSwap;
                    gender[j] = genderSwap;
                }
            }
            if (gender[i] == true) {
                System.out.println(clientName[i] + " " + age[i]+ " " +"М"); //выбор по полу - если true, то будет выводить Клиентов мужчин
            }
            // Если закомментировать верхнее условие и открыть нижнее, то будут выводится женщины.
            //    if (gender[i] == false){
            //      System.out.println(clientName[i] + " " + age[i]+ " " +"Ж");
            //   }

        }
    }
}
