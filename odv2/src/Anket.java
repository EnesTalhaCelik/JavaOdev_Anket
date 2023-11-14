// Enes Talha Çelik
// 223405031


import java.util.Scanner;
import static java.lang.Integer.sum;




public class Anket {

    public static float ortalama(int[][] cevaplar,int i,int j,int katilim){
        float ort = 0;
        for(int k = 0 ; k< j ;k++){
            ort += cevaplar[i][k]*(k+1);

        }
        ort = ort/katilim;
        return ort;
    }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] sorular = new String[5];
            int[] toplam = new int[5];

            int[][] cevaplar = new int[5][10];
            int geciciCevap = 0;
            int kisi = 0;

            float ort = 0;
            float enYuksek = 0;
            float enDusuk = 10;

            sorular[0] = "Internet ve ulaşım altyapısına verdiğiniz önem ";

            sorular[1] = "Sokakların güvenliğine verdiğiniz önem ";

            sorular[2] = "Ekonomi konusuna verdiğiniz önem ";

            sorular[3] = "Server'in Yaptığı 60x lik kupon tutar mı ? (çok sağlam kupon) ";

            sorular[4] = "İklim değişikliğine verdiğiniz önem ";




            while(true){
                System.out.println("Hoşgeldiniz! ankete katılmak istermisiniz 1 , 0");
                if(scanner.nextInt()!=1){
                    break;
                }
                kisi ++;
                System.out.println(kisi + ". kişi için anke dolduruluyor.");

                for(int j = 0 ; j <5 ; j++) {
                    System.out.println(sorular[j]);

                    while (true) {

                        geciciCevap = scanner.nextInt();

                        if (geciciCevap >= 1 && geciciCevap <= 10) {
                            toplam[j]+=geciciCevap;
                            break;

                        }


                    }
                    cevaplar[j][sum(geciciCevap,-1)] ++;

                }

            }

            System.out.print("\n\n\n");
            System.out.println("Sorular     1Puan 2Puan 3Puan 4Puan 5Puan 6Puan 7Puan 8Puan 9Puan 10Puan       Ortalama       Toplam");

            for(int i = 0 ; i <5 ; i++){
                System.out.print("Soru "+sum(i,1)+"        ");

                for(int j = 0 ; j <10 ; j++){
                    System.out.print(cevaplar[i][j]+"     ");

                }
                ort = ortalama(cevaplar,i,10,kisi);
                System.out.print("       "+ort);
                System.out.print("           "+toplam[i]);
                System.out.print("\n");

                if(ort > enYuksek){
                    enYuksek = ort;
                }
                if (ort < enDusuk) {
                    enDusuk = ort;
                }

            }

            System.out.print("\n");

            System.out.println("Sistemde bulunan en büyük ortalama değeri :"+enYuksek);
            System.out.println("Sistemde bulunan en düşük ortalama değeri :"+enDusuk);


            System.out.println("\nİyi günler.");


        }


}
