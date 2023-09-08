import java.util.Random;
/**
 * Main class, sets up the Arena and choose one combat
 * 
 * @author equipo.
 */

public class Main {
    /**
     * Main method, sets the arena and runs a fight.
     * 
     */
    public static void main(String[] args) {
	Korby korby = new Korby();
	MeganMan meganman = new MeganMan();
	Dittuu dittuu = new Dittuu();
	Arena arena = new Arena(korby, meganman, dittuu);
	Caster caster = new Caster(arena);
	Viewer view = new Viewer(meganman, "User03928", arena);
	Viewer view1 = new Viewer(korby, "User8372", arena);
	Viewer view2 = new Viewer(dittuu, "User6272", arena);
	Viewer view3 = new Viewer(korby, "User0293", arena);
	Random random = new Random();
	switch (random.nextInt(3)){
	case 0:
	    arena.fight1();
	    break;
	case 1:
	    arena.fight2();
	    break;
	case 2:
	    arena.fight3();
	    break;
	default:
	    break;
	}
    }
}
