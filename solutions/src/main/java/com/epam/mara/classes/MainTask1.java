package com.epam.mara.classes;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        System.out.println("Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString(). Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.\n" /*+
                "\n" +
                "1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.\n" +
                "Создать массив объектов. Вывести:\n" +
                "a) список студентов заданного факультета;\n" +
                "b) списки студентов для каждого факультета и курса;\n" +
                "c) список студентов, родившихся после заданного года;\n" +
                "d) список учебной группы."*/);

        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();

        System.out.println("Хотите ввести данные студентов вручную (1) или использовать имеющийся список (2)?");
        int inputMethod = input.nextInt();
        input.nextLine();

        int n;

        Student students[];

        switch(inputMethod) {
            case 1: { // ввод данных о студентах вручную
                System.out.print("Введите количество студентов:");
                n = input.nextInt();
                input.nextLine();

                students = new Student[n];

                for (int i = 0; i < n; i++) {
                    students[i] = new Student();
                    students[i].setId(randomizer.nextInt(1000000000));

                    System.out.println("Введите фамилию " + (i+1) + " студента:");
                    students[i].setLastName(input.nextLine());

                    System.out.println("Введите имя " + (i+1) + " студента:");
                    students[i].setFirstName(input.nextLine());

                    System.out.println("Введите отчество " + (i+1) + " студента:");
                    students[i].setPatronymic(input.nextLine());

                    System.out.println("Введите дату рождения " + (i+1) + " студента:");
                    Calendar date = new GregorianCalendar();
                    System.out.println("год рождения:");
                    date.set(Calendar.YEAR,input.nextInt());
                    System.out.println("месяц рождения (от 1 до 12):");
                    date.set(Calendar.MONTH,input.nextInt() - 1);
                    System.out.println("день рождения:");
                    date.set(Calendar.DAY_OF_MONTH,input.nextInt());
                    students[i].setDateOfBirth(date);
                    input.nextLine();

                    System.out.println("Введите адрес " + (i+1) + " студента:");
                    students[i].setAddress(input.nextLine());

                    System.out.println("Введите телефон " + (i+1) + " студента:");
                    students[i].setPhone(input.nextLine());

                    System.out.println("Введите факультет " + (i+1) + " студента:");
                    String faculty = input.nextLine().toUpperCase();
                    students[i].setFaculty(defineFaculty(faculty));

                    System.out.println("На каком курсе учится " + (i+1) + " студент?");
                    students[i].setYear(input.nextInt());
                    input.nextLine();

                    System.out.println("В какой учебной группе?");
                    students[i].setGroup(input.nextLine());

                    System.out.println(students[i]);
                }
                break;
            }
            case 2: {
                n = 15;
                students = new Student[n];
                int id;
                Calendar date;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[0] = new Student(id,"Иван","Алексеевич","Петров",date,"Гродно","+375291234567",Faculties.FKP,1,"110022") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[1] = new Student(id,"Александр","Фёдорович","Иванов",date,"Витебск","+375291234567",Faculties.FKP,1,"110022") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[2] = new Student(id,"Алексей","Петрович","Богданович",date,"Брест","+375291234567",Faculties.FKP,1,"110022") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[3] = new Student(id,"Пётр","Юрьевич","Сидоров",date,"Минск","+375291234567",Faculties.FKSIS,3,"851021") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[4] = new Student(id,"Фёдор","Дмитриевич","Андреев",date,"Гомель","+375291234567",Faculties.FKSIS,3,"851021") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[5] = new Student(id,"Николай","Владимирович","Александров",date,"Бобруйск","+375291234567",Faculties.FKSIS,3,"851021") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[6] = new Student(id,"Анна","Александровна","Алексеева",date,"Могилёв","+375291234567",Faculties.FIK,2,"930042") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[7] = new Student(id,"Екатерина","Петровна","Кусь",date,"Молодечно","+375291234567",Faculties.FIK,2,"930042") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[8] = new Student(id,"Валерий","Михайлович","Павлов",date,"Пинск","+375291234567",Faculties.FITU,1,"140501") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[9] = new Student(id,"Вероника","Андреевна","Мяу",date,"Лида","+375291234567",Faculties.FITU,1,"140501") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[10] = new Student(id,"Анастасия","Алексеевна","Михайлова",date,"Дятлово","+375291234567",Faculties.FITU,1,"140501") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[11] = new Student(id,"Анатолий","Александрович","Николаев",date,"Сморгонь","+375291234567",Faculties.VF,4,"780302") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[12] = new Student(id,"Павел","Олегович","Владимиров",date,"Минск","+375291234567",Faculties.VF,4,"780302") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[13] = new Student(id,"Владимир","Иванович","Пивоварчик",date,"Орша","+375291234567",Faculties.IEF,1,"165022") ;

                id = randomizer.nextInt(1000000000);
                date = setRandomDate();
                students[14] = new Student(id,"Алёна","Андреевна","Яновская",date,"Полоцк","+375291234567",Faculties.IEF,1,"165022") ;

                for (int i = 0; i < n; i++) {
                    System.out.println(students[i]);
                }

                break;
            }
            default:
                n = 0;
                students = new Student[0];
        }

        boolean workFlag = true;
        while (workFlag) {
            System.out.println("Выберите критерий вывода данных из списка (от 1 до 4):\n" +
                    "\t 1. Список студентов заданного факультета;\n" +
                    "\t 2. Списки студентов для каждого факультета и курса;\n" +
                    "\t 3. Список студентов, родившихся после заданного года;\n" +
                    "\t 4. Список учебной группы.\n" +
                    "Для выхода введите 5.");
            int task = input.nextInt();
            input.nextLine();

            switch (task) {
                case 1: {
                    System.out.println("1. Список студентов заданного факультета (выберите факультет):");
                    String choseFaculty = input.nextLine().toUpperCase();
                    for (int i = 0; i < n; i++) {
                        if (students[i].faculty == defineFaculty(choseFaculty)) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                }

                case 2: {
                    System.out.println("2. Списки студентов для каждого факультета и курса");
                    for (int i = 0; i < Faculties.values().length; i++) {
                        System.out.println(Faculties.values()[i]);
                        for (int j = 1; j < 5; j++) {
                            boolean yearFlag = true; // do we need to print year?

                            for (int k = 0; k < n; k++) {
                                if ((students[k].faculty == Faculties.values()[i]) && (students[k].year == j)) {
                                    if (yearFlag) {
                                        System.out.println(j + "курс:");
                                        yearFlag = false;
                                    }
                                    System.out.println(students[k]);
                                }
                            }
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.println("3. Список студентов, родившихся после заданного года.\n" +
                            "Задайте год (не позднее 2002): ");
                    int chosenYear = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < n; i++) {
                        if (students[i].dateOfBirth.get(Calendar.YEAR) > chosenYear) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.println("4. Список учебной группы. Выберите группу из списка:");
                    int count;

                    // show available groups
                    System.out.println(students[0].group);
                    if (n > 1) {
                        for (int i = 1; i < n; i++) {
                            count = 0;
                            for (int j = 0; j < i; j++) {
                                if (students[i].group != students[j].group) {
                                    count++;
                                } else break;
                            }
                            if (count == i) {
                                System.out.println(students[i].group);
                            }
                        }
                    }

                    String chosenGroup = input.nextLine();

                    for (int i = 0; i < n; i++) {
                        if (students[i].group.equals(chosenGroup)) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                }

                case 5: {
                    workFlag = false;
                    System.out.println("Выход");
                    break;
                }
            }
        }
    }

    static Faculties defineFaculty(String faculty) {
        switch (faculty.toUpperCase()) {
            case "FKP":
            case "ФКП":
            case "FCAD": {return Faculties.FKP;}

            case "FKSIS":
            case "ФКСИС":
            case "КСИС": {return Faculties.FKSIS;}

            case "FIK":
            case "ФИК": {return Faculties.FIK;}

            case "FRE":
            case "ФРЭ": {return Faculties.FRE;}

            case "IEF":
            case "ИЭФ": {return Faculties.IEF;}

            case "FITU":
            case "ФИТУ": {return Faculties.FITU;}

            case "VF":
            case "ВФ":
            case "ВОЕННЫЙ": {return Faculties.VF;}

            case "IIT":
            case "ИИТ": {return Faculties.IIT;}

            default: {return null;}
        }
    }

    static Calendar setRandomDate() {
        Calendar randomDate = new GregorianCalendar();
        Random random = new Random();

        randomDate.set(Calendar.YEAR,(2020 - 18 - random.nextInt(33) )); // age from 18 to 50
        randomDate.set(Calendar.MONTH,random.nextInt(12));
        randomDate.set(Calendar.DAY_OF_MONTH,random.nextInt(30));

        return randomDate;
    }
}
