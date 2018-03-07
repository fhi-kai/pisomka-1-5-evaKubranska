public class Zajace implements ZajacieUsi{
//com
    @Override
    public int zajacieUsi(int pocetZajacov) {
        int pocet =0;
        if(pocetZajacov !=0) {
            for (int i = 1; i <= pocetZajacov; i++) {
                if (i % 2 == 0) {
                    pocet = pocet + 3;
                } else  {
                    pocet = pocet + 2;
                }
            }
        }
        return pocet;
    }
}