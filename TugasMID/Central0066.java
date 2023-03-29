//Nama	: Nurul Azmi
//NIM	: 13020210066

interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0066 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0066 objek = new Central0066();
        System.out.println("main");
        objek.aaa();
    }
}
