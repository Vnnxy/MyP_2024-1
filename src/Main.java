public class Main {

	public static void main(String[] args) {
		Korby korby = new Korby();
		MeganMan meganman = new MeganMan();
		Arena arena = new Arena(korby, meganman);
		Caster caster = new Caster(arena);
		Viewer view = new Viewer(meganman, "User03928", arena);
		Viewer view1 = new Viewer(korby, "User8372", arena);
		Viewer view2 = new Viewer(meganman, "User6272", arena);
		Viewer view3 = new Viewer(korby, "User0293", arena);
		arena.fight1();
	}
}
