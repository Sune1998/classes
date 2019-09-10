public class main {

    public static void main(String[] args) {
        studerene sune = new studerene();
        studerene mik  =  new studerene();
        studerene simon = new studerene();
        studerene nicki = new studerene();
        //kaptiel 9.2

        sune.setNavn("sune bro");
        mik.setNavn("Mik");
        simon.setNavn("Simon");
        nicki.setNavn("Nicki");

        sune.setBirthyear(1998);
        mik.setBirthyear(1998);
        simon.setBirthyear(1999);
        nicki.setBirthyear(1982);


        sune.setHometown("slagelse");
        mik.setHometown("Korsør");
        simon.setHometown("Næver");
        nicki.setHometown("næver");

        System.out.println("De studerene er:" + sune.getNavn() + mik.getNavn()  + nicki.getNavn() + simon.getNavn());
        System.out.println("Deres alder er:" + sune.getBirthyear() + mik.getBirthyear() + nicki.getBirthyear() + simon.getBirthyear());
        System.out.println("De bor i" + sune.getHometown() + mik.getHometown()  + nicki.getHometown() + simon.getHometown());


    }
}
