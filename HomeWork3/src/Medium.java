public class Medium {
    public static void GetCountry(Cat cat) {
        switch (cat.getPedigreeNumber()) {
            case Russia:
                System.out.println(cat.getName() + " - Страна происхождения кошки: Россия");
                break;
            case England:
                System.out.println(cat.getName() + " - Страна происхождения кошки: Англия");
                break;
            case Sholtandia:
                System.out.println(cat.getName() + " - Страна происхождения кошки: Шотландия");
                break;
        }
    }
    public static void main(String[] args) {
        Cat cat = new Cat("Фелекс", 60, 2, Cat.PedigreeNumberType.England);
        Cat cat2 = new Cat("Боня", 80, 3, Cat.PedigreeNumberType.Russia);
        Cat cat3 = new Cat("Кот", 50, 1, Cat.PedigreeNumberType.Sholtandia);
        Cat cat4 = new Cat();
        cat4.setPedigreeNumber(Cat.PedigreeNumberType.Russia);
        GetCountry(cat);
        GetCountry(cat2);
        GetCountry(cat3);
        GetCountry(cat4);

    }


}
