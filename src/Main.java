public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1 () {

        System.out.println("____________Задачи 1 - 3____________");

        var dog = 8D; //Здесь добавил букву D после 8, чтобы поменять int на double, так как в задаче нужно отнять десятичное число и консоль ругалась

        var cat = 3.6;

        var paper = 763789;

        System.out.println(dog);

        System.out.println(cat);

        System.out.println(paper);

        dog = dog + 4;

        cat = cat + 4;

        paper = 763789 + 4;

        System.out.println(dog);

        System.out.println(cat);

        System.out.println(paper);

        dog = dog - 3.5;

        cat = cat - 1.6;

        paper = paper - 7639;

        System.out.println(dog);

        System.out.println(cat);

        System.out.println(paper);

    }

    public static void task2 () {

        System.out.println("____________Задачи 4 - 5____________");

        var friend = 19;

        System.out.println(friend);

        friend = friend * 2;

        System.out.println(friend);

        friend = friend / 7;

        System.out.println(friend);

        var frog = 3.5;

        System.out.println(frog);

        frog = frog * 10;

        //Хотелось бы на этом этапе перевести переменную в int, чтобы не выводился лишний 0, но не знаю как это сделать

        System.out.println(frog);

        frog = frog / 3.5;

        System.out.println(frog);

        frog = frog + 4;

        System.out.println(frog);

    }

    public static void task3 () {

        System.out.println("____________Задачи 6 - 7____________");

        var boxer1 = 78.2;

        var boxer2 = 82.7;

        System.out.println("Вес одного боксера " + boxer1 + " киллограм, а второго " + boxer2 + " киллограмм.");

        var boxersWeight = boxer1 + boxer2;

        System.out.println("Общий вес боксеров равен " + boxersWeight + " киллограмм");

        var differenceBetweenBoxers = boxer2 - boxer1;

        var differenceBetweenBoxers2 = boxer2 % boxer1;

        System.out.println("Разница в весе между боксерами по первому способу равна " + differenceBetweenBoxers + " киллограм, и " + differenceBetweenBoxers2 + " киллограм по второму способу.");
    }

    public static void task4 () {
        System.out.println("____________Задача 8____________");

        var sumOfHours = 640;

        var jobTime = 8;

        var totalEmployees = sumOfHours / jobTime;

        System.out.println("Всего работников в компании - " + totalEmployees + " человек.");

        totalEmployees = totalEmployees + 94;

        sumOfHours = totalEmployees * 8;

        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + sumOfHours + " часа работы может быть поделено между сотрудниками.");

    }

}