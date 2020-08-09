package Task_07;

public class Test {

    public static void main(String[] args) {
        Batman bruceWayne = new Batman(2, 5, 0);
        JamesBond jamesBond = new JamesBond(1, 1, 0);
        Joker joker = new Joker(0, 0, 2);
        Pinguim cobblepot = new Pinguim(1, 2, 3);
        Goldfinger goldfinger = new Goldfinger(2, 0, 2);
        DrNo juliusNo = new DrNo(2, 2, 0);

        System.out.println("================== Batman ==================");
        bruceWayne.shoot();
        bruceWayne.run(2, 3);
        bruceWayne.jump(1);
        bruceWayne.camouflage(2);

        System.out.println("\n================ James Bond =================");
        jamesBond.run(2, 2);
        jamesBond.jump(1);
        jamesBond.shoot();

        System.out.println("\n================== Coringa ===================");
        joker.shoot();
        joker.jump(1);
        joker.run(2, 3);
        joker.die();

        System.out.println("\n================== Pinguim ===================");
        cobblepot.shoot();
        cobblepot.run(2, 2);
        cobblepot.jump(0);

        System.out.println("\n================= Goldfinger =================");
        goldfinger.jump(1);
        goldfinger.run(2, 2);
        goldfinger.personification(jamesBond);
        goldfinger.shoot();
        goldfinger.personification(bruceWayne);

        System.out.println("\n==================== DrNo ====================");
        juliusNo.run(1, 2);
        juliusNo.jump(3);
        juliusNo.shoot();
        juliusNo.die();
    }
}