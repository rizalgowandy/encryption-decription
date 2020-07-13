class Army {

	public static void createArmy() {
		// Implement this method
		// Your task is to create objects: 5 Unit, 3 Knight, 1 General, 1 Doctor.
		Unit unit1 = new Unit("a");
		Unit unit2 = new Unit("b");
		Unit unit3 = new Unit("c");
		Unit unit4 = new Unit("d");
		Unit unit5 = new Unit("e");
		Knight k1 = new Knight("a");
		Knight k2 = new Knight("b");
		Knight k3 = new Knight("c");
		General g1 = new General("a");
		Doctor d1 = new Doctor("a");
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