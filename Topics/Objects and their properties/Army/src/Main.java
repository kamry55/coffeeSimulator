class Army {

    public static void createArmy() {
        Unit myunit = new Unit("Jack");
        Unit myunit2 = new Unit("Jill");
        Unit myunit3 = new Unit("John");
        Unit myunit4 = new Unit("Jacob");
        Unit myunit5 = new Unit("Jaylen");

        Knight myknight = new Knight("Austin");
        Knight myknight2 = new Knight("Avery");
        Knight myknight3 = new Knight("Allen");

        General myGeneral = new General("Marcus");

        Doctor myDoctor = new Doctor("Larry");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}