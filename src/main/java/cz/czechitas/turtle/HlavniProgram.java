package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;


    public void start() {
        zofka = new Turtle();
        Color puvodniBarva = zofka.getPenColor();
        Color cervena = new Color(255, 0, 0);
        Color modra = new Color(0, 0, 255);
        Color zelena = new Color(0, 255, 0);
        Color ruzova = new Color(241, 112, 204);
        Color hneda = new Color(147, 43, 43);
        Color cerna = new Color(0, 0, 0);

        //zofka se přesune na misto a nakresli trojuhelnik
        zofka.setLocation(200, 200);
        rovnostrannyTrojuhelnik(100, modra);

        //zofka se presune na misto a nakresli ctverec
        zofka.setLocation(500, 200);
        nakresliCtverec(100, cervena);

        //zofka se presune na misto a nakresli obdelnik
        zofka.setLocation(800, 200);
        nakresliObdelnik(100, 200, zelena);

        //zofka se presune na misto a nakresli kolecko
        zofka.setLocation(900, 150);
        nakresliMnohouhelnik(10, 30, hneda);

        //zofka nakresli snehulaka na zvolene pozici
        novySnehulak(300, 400, 100, 30, modra);

        //zofka nakresli zmrzlinu na zvolene pozici
        zmrzlina(200, 40, hneda, 700, 600, 70, 30, ruzova);

        //zofka nakresli masinku vybranymi barvami
        masinka(modra, cerna, cervena);

    }


    public static void main(String[] args) {
        new HlavniProgram().start();

    }

    /*private void snehulak(double polomer1, double polomer2, double polomer3, double polomer4, int pocetStran, int souradniceX, int souradniceY, Color barva) {
        zofka.setPenColor(barva);
        zofka.setLocation((souradniceX + polomer1), souradniceY);
        kolecko(polomer1, pocetStran);
        zofka.setLocation((souradniceX + polomer2), (souradniceY + polomer1 + polomer2));
        kolecko(polomer2, pocetStran);
        zofka.setLocation((souradniceX + polomer3), (souradniceY + polomer1 + (2 * polomer2) + polomer3));
        kolecko(polomer3, pocetStran);
        zofka.setLocation(((souradniceX + polomer2 + (2 * polomer4))), (souradniceY + polomer1 + polomer2));
        kolecko(polomer4, pocetStran);
        zofka.setLocation((souradniceX - polomer2), (souradniceY + polomer1 + polomer2));
        kolecko(polomer4, pocetStran);
        zofka.setLocation((souradniceX - (polomer1 / 2)), (souradniceY - (polomer1 / 2)));
        zofka.setPenColor(Color.black);
        kolecko(2, 10);
        zofka.setLocation((souradniceX + (polomer1 / 2)), (souradniceY - (0.5 * polomer1)));
        kolecko(2, 10);
        zofka.setLocation(souradniceX, souradniceY);
        rovnostrannyTrojuhelnik(5, Color.red);
        zofka.setLocation((souradniceX), (souradniceY + polomer1 + (0.5 * polomer2)));
        zofka.setPenColor(Color.black);
        kolecko(2, 10);
        zofka.setLocation((souradniceX), (souradniceY + polomer1 + polomer2));
        kolecko(2, 10);
        zofka.setLocation((souradniceX), (souradniceY + polomer1 + (1.5 * polomer2)));
        kolecko(2, 10);

        zofka.setLocation((souradniceX), (souradniceY + polomer1 + (2 * polomer2) + (0.5 * polomer3)));
        kolecko(2, 10);
        zofka.setLocation((souradniceX), (souradniceY + polomer1 + (2 * polomer2) + polomer3));
        kolecko(2, 10);
        zofka.setLocation((souradniceX), (souradniceY + polomer1 + (2 * polomer2) + (1.5 * polomer3)));
        kolecko(2, 10);


    }*/

    /**
     * metoda nakresli snehulaka s nasledujicimi vstupnimi parametry
     * @param souradniceX - vstupni pozice na ose x
     * @param souradniceY - vstupni pozice na ose y
     * @param polomer - polomer nejvetsi koule snehulaka
     * @param pocetStran - pocet stran - pro vykresleni koule
     * @param barva - barva snehulaka
     */
    private void novySnehulak(double souradniceX, double souradniceY, double polomer, int pocetStran, Color barva) {
        zofka.setPenColor(barva);
        zofka.setLocation((souradniceX + (polomer * 0.5)), souradniceY);
        kolecko((polomer * 0.5), pocetStran);

        zofka.setLocation((souradniceX + (polomer * 0.7)), (souradniceY + (polomer * 1.2)));
        kolecko((polomer * 0.7), pocetStran);
        zofka.setLocation((souradniceX + polomer), (souradniceY + (polomer * 2.9) ));
        kolecko(polomer, pocetStran);
        zofka.setLocation((souradniceX + (polomer * 1.3) ), (souradniceY + polomer * 1.2 ));
        kolecko((polomer * 0.3), pocetStran);
        zofka.setLocation((souradniceX - (polomer * 0.7)), (souradniceY + (polomer * 1.2) ));
        kolecko((polomer * 0.3), pocetStran);
        zofka.setLocation((souradniceX - (polomer * 0.25)), (souradniceY - (polomer * 0.25)));
        zofka.setPenColor(Color.black);
        kolecko(2, 10);
        zofka.setLocation((souradniceX + (polomer * 0.25)), (souradniceY - (0.25 * polomer)));
        kolecko(2, 10);
        zofka.setLocation(souradniceX, souradniceY);
        rovnostrannyTrojuhelnik(5, Color.red);
        zofka.setLocation((souradniceX), (souradniceY + polomer * 0.85 ));
        zofka.setPenColor(Color.black);
        kolecko(2, 10);
        zofka.setLocation((souradniceX), (souradniceY + (polomer * 1.2 )));
        kolecko(2, 10);
        zofka.setLocation((souradniceX), (souradniceY + (polomer * 1.55 )));
        kolecko(2, 10);

        zofka.setLocation((souradniceX), (souradniceY + (polomer * 2.4)));
        kolecko(2, 10);
        zofka.setLocation((souradniceX), ((souradniceY + (polomer * 2.9) )));
        kolecko(2, 10);
        zofka.setLocation((souradniceX), (souradniceY + (polomer * 3.4)));
        kolecko(2, 10);


    }


    /**
     * metoda nakresli kolecko s nasledujicimi vstupnimi parametry:
     * @param polomer - polomer kolecka
     * @param pocetStran - pocet stran pro vykresleni kolecka
     */
    private void kolecko(double polomer, int pocetStran) {

        double uhel = 360 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            zofka.move((2 * Math.PI * polomer) / pocetStran);
            zofka.turnLeft(uhel);
        }


    }


    private double vypocitejDelkuTretiStrany(double velikostRamene, double uhelMeziRameny) {
        double tretiStrana;
        tretiStrana = Math.abs((velikostRamene * Math.sin((uhelMeziRameny * Math.PI / 180) / 2.0)) * 2.0);
        return tretiStrana;

    }

    /**
     * metoda nakresli rovnoramenny trojuhelnik s nasledujicimi vstupnimi parametry:
     * @param velikostRamene - delka strany a a b
     * @param uhelMeziRameny - uhel mezi stranami a a b
     * @param barva - barva trojuhelniku
     */
    private void nakresliRovnoramennyTrojuhelnik(double velikostRamene, double uhelMeziRameny, Color barva) {
        zofka.setPenColor(barva);
        double uhelMeziZakladnouARamenem = (180 - uhelMeziRameny) / 2;

        zofka.turnLeft(90 - uhelMeziZakladnouARamenem);
        zofka.move(velikostRamene);
        zofka.turnLeft(180 - uhelMeziRameny);
        zofka.move(velikostRamene);
        zofka.turnLeft(180 - uhelMeziZakladnouARamenem);

        double delkaZakladny = vypocitejDelkuTretiStrany(velikostRamene, uhelMeziRameny);
        zofka.move(delkaZakladny);
        zofka.turnLeft(90);


    }

    /**
     * metoda nakresli kornout ke zmrzline s nasledujicimi vstupnimi parametry:
     * @param velikostRamene - delka strany a a b
     * @param uhelMeziRameny - uhel mezi stranami a a b
     * @param barva - barva kornoutu
     */
    private void kornout(double velikostRamene, double uhelMeziRameny, Color barva) {
        zofka.setPenColor(barva);
        double uhelMeziZakladnouARamenem = (180 - uhelMeziRameny) / 2;

        zofka.turnRight(uhelMeziRameny / 2);
        zofka.move(velikostRamene);
        zofka.turnLeft(180 - uhelMeziZakladnouARamenem);
        double delkaZakladny = vypocitejDelkuTretiStrany(velikostRamene, uhelMeziRameny);
        zofka.move(delkaZakladny);
        zofka.turnLeft(180 - uhelMeziZakladnouARamenem);
        zofka.move(velikostRamene);
        zofka.turnLeft(160);
    }

    /**
     * metoda nakresli ctverec s nasledujicimi vstupnimi parametry:
     * @param delkaA - delka strany
     * @param barva - barva ctverce
     */
    private void nakresliCtverec(double delkaA, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(delkaA);
            zofka.turnLeft(90);
        }

    }

    /**
     * metoda nakresli obdelnik s nasledujicimi vstupnimi parametry:
     * @param delkaA - delka strany a
     * @param delkaB - delka strany b
     * @param barva - barva obdelniku
     */
    private void nakresliObdelnik(double delkaA, double delkaB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {

            zofka.move(delkaA);
            zofka.turnLeft(90);
            zofka.move(delkaB);
            zofka.turnLeft(90);
        }

    }

    /**
     * metoda nakresli rovnostranny trojuhelnik s nasledujicimi vstupnimi parametry:
     * @param strana - delka strany
     * @param barva - barva trojuhelniku
     */
    private void rovnostrannyTrojuhelnik(double strana, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 3; i++) {
            zofka.move(strana);
            zofka.turnLeft(120);
        }

    }

    /**
     * metoda nakresli kolecko (bez pouziti prumeru) s nasledujicimi vstupnimi parametry:
     * @param delkaStrany - delka strany
     * @param pocetStran - pocet stran pro vykresleni kolecka
     * @param barva - barva kolecka
     */
    private void nakresliMnohouhelnik(double delkaStrany, int pocetStran, Color barva) {
        zofka.setPenColor(barva);
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(uhel);

        }
    }

    /**
     * metoda nakresli zmrzlinu s nasledujicimi vstupnimi parametry:
     * @param velikostRamene - delka strany a a b - u trojuhelniku
     * @param uhelMeziRameny - uhel mezi strami a a b - u trojuhelniku
     * @param barva1 - barva kornoutu
     * @param souradniceX - vychozi pozice kornoutu - osa x
     * @param souradniceY - vychozi pozice kornoutu - osa y
     * @param polomer - polomer zmrzliny
     * @param pocetStran - pocet stran pro vykresleni zmrzliny
     * @param barva2 - barva zmrzliny
     */
    private void zmrzlina(double velikostRamene, double uhelMeziRameny, Color barva1, double souradniceX, double souradniceY, double polomer, int pocetStran, Color barva2) {
        zofka.setLocation(souradniceX, souradniceY);
        kornout(velikostRamene, uhelMeziRameny, barva1);
        zofka.setLocation((souradniceX + polomer), (souradniceY - velikostRamene));
        zofka.setPenColor(barva2);
        kolecko(polomer, pocetStran);
    }


    /**
     * metoda nakresli masinku a vagonek s uhlim s nasledujicimi vstupnimi parametry:
     * @param barvaMasinky
     * @param barvaKolecek
     * @param barvaOkenka
     */
    private void masinka(Color barvaMasinky, Color barvaKolecek, Color barvaOkenka) {
        zofka.setLocation(1060, 400);
        nakresliObdelnik(40, 20, Color.BLACK);
        zofka.setLocation(1300, 500);

        nakresliObdelnik(200, 100, barvaMasinky);
        zofka.setPenColor(barvaKolecek);
        kolecko(50, 30);
        zofka.setLocation(1200, 500);
        nakresliObdelnik(100, 200, barvaMasinky);
        zofka.setLocation(1160, 525);
        zofka.setPenColor(barvaKolecek);
        kolecko(25, 30);
        zofka.setLocation(1070, 525);
        kolecko(25, 30);
        zofka.setLocation(900, 520);
        zofka.turnRight(135);
        nakresliRovnoramennyTrojuhelnik(100, 90, barvaMasinky);
        zofka.turnLeft(135);
        zofka.setLocation(1280, 380);
        nakresliCtverec(60, barvaOkenka);
        zofka.setLocation(1330, 470);
        nakresliObdelnik(15, 30, barvaKolecek);

        // zofka se presune na novou pozici a nakreslí vagonek
        zofka.setLocation(1530, 500);
        nakresliObdelnik(100, 200, barvaMasinky);
        zofka.setLocation(1490, 525);
        zofka.setPenColor(barvaKolecek);
        kolecko(25, 30);
        zofka.setLocation(1400, 525);
        kolecko(25, 30);

        //zofka se presune na novou pozici a nakresli do vagonku uhli
        zofka.setLocation(1520, 380);
        for (int i = 1; i < 7; i++) {
            kolecko(10, 30);
            zofka.setLocation((1520 - (i * 30)), 380);
        }
        zofka.setLocation(1500, 360);
        for (int i = 1; i < 6; i++) {
            kolecko(10, 30);
            zofka.setLocation((1500 - (i * 30)), 360);

        }
        zofka.setLocation(1480, 340);
        for (int i = 1; i < 5; i++) {
            kolecko(10, 30);
            zofka.setLocation((1480 - (i * 30)), 340);
        }
    }

}