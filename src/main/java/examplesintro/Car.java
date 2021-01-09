package examplesintro;

public class Car {

    public int kuroLikutis = 50;
    public int tepaloKiekis = 3;
    public int languSkystis = 2;
    public int baterijosProcentai = 50;

    public int gautiKuroLikuti() {
        return kuroLikutis;
    }

    public void vaziuoti(int atsumasKm) {
        if(atsumasKm > 100) {
            //changed object state
            kuroLikutis = 5;
        } else {
            kuroLikutis = 40;
        }
    }

    public int gautiTepaloKieki(){
        return tepaloKiekis;
    }

    public void eikvotiTepala(int pravaziuotiKm) {
        if(pravaziuotiKm > 10000) {
            tepaloKiekis = tepaloKiekis - 1;
        }
    }

    public int gautiLanguSkyscioKieki() {
        return languSkystis;
    }

    public int gautiLanguSkyscioKieki(int papurskimuSkaicius) {
        if(papurskimuSkaicius > 30) {
            languSkystis = languSkystis - 1;
        }
        return languSkystis;
    }
}
