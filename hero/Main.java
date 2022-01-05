package hero;


public class Main {
    public static void main(String[] args) {

        Elf elf = new Elf("Elf",10);
        MuseElf museElf = new MuseElf("MuseElf",20);
        Wizard wizard = new Wizard("Wizard", 30);
        DarkWizard darkWizard = new DarkWizard("DarkWizard",40);
        SoulMaster soulMaster = new SoulMaster("SoulMaster",50);
        Knight knight = new Knight("Knight",60);
        DarkKnight darkKnight = new DarkKnight("DarkKnight",70);
        BladeKnight bladeKnight = new BladeKnight("BladeKnight",80);

        System.out.println(elf);
        System.out.println(museElf);
        System.out.println(wizard);
        System.out.println(darkWizard);
        System.out.println(soulMaster);
        System.out.println(knight);
        System.out.println(darkKnight);
        System.out.println(bladeKnight);

    }
}
