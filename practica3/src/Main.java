public class Main{
    public static void main(String[] args){
	Soldier captain = new Captain("123");
	Soldier lieutenant = new Lieutenant("456");
	Soldier privat = new Private("789");
	captain.addSoldier(lieutenant);
	lieutenant.addSoldier(privat);
	System.out.println("--------------------------------------------");
	System.out.println(captain);
	System.out.println(lieutenant);
	System.out.println(privat);
	captain.relayOrder("Formation gammma");
	captain = new TankArmor(captain);
	captain = new IronCheems(captain);
	lieutenant = new GrapheneArmor(lieutenant);
	lieutenant = new Turbine(lieutenant);
	privat = new KevlarArmor(privat);
	privat = new DragonSlayerSword(privat);
	System.out.println(captain);
	System.out.println(lieutenant);
	System.out.println(privat);
	System.out.println("--------------------------------------------");
	System.out.println(captain);
	System.out.println(lieutenant);
	System.out.println(privat);
	System.out.println("--------------------------------------------");
	captain.report();
	
	
	
	
    }
}
