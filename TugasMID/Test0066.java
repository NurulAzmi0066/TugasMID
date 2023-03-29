//Nama	: Nurul Azmi
//NIM	: 13020210066

// class TestBalok
public class Test0066 {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(20, 35, 15);
        Balok balok3 = new Balok();
        balok3.setL(5);
        Balok balok4 = new Balok();
        balok4.setP(25);
        Balok balok5 = new Balok(20, 35, 15);
        balok5.setT(10);
        Balok balok6 = new Balok();
        balok6.info();
        Balok balok7 = new Balok(20, 35, 15);
        balok7.info();
    }
}

// class Balok
class Balok extends PersegiPanjang {
    int t;

    public Balok() {
        super();
        t = 15;
    }

    public Balok(int p, int l, int t) {
        super(p, l);
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int volume(){
        return getP() * getL() * t;
    }

    public void info(){
        System.out.println("Panjang: " + getP());
        System.out.println("Lebar: " + getL());
        System.out.println("Tinggi: " + t);
        System.out.println("Luas: " + luas());
        System.out.println("Volume: " + volume());
    }
}

// class PersegiPanjang
class PersegiPanjang {
    int p, l;

    public PersegiPanjang() {
        this.p = 30;
        this.l = 20;
    }

    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }

    public int getP() {
        return this.p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return this.l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int luas() {
        return this.p * this.l;
    }

    public int keliling() {
        return 2 * (this.p + this.l);
    }
}
