package Tugas_Akhir_GameLab;
import java.util.Scanner;
public class Main {

    public static class BangunRuang
    {
        Scanner input = new Scanner(System.in);
        public void Tampilan_Utama()
        {
            System.out.println("\n###### Bangun Ruang ######");
            System.out.println("1. Kubus ");
            System.out.println("2. Tabung ");
            System.out.println("##########################");
        }
    }

    public static class Kubus extends BangunRuang
    {
        float LuasPer, Volume, panjangTotalRusuk, S;
        int a;
        float H_luasPer(float S)
        {
            LuasPer = 6 * S * S;
            return (LuasPer);
        }
        float H_volume(float S)
        {
            Volume = S * S * S;
            return (Volume);
        }
        float H_Total(float S)
        {
            panjangTotalRusuk = 12 * S;
            return (panjangTotalRusuk);
        }

        public void Hitung_VolumeLuas()
        {
            do {
                System.out.println("\n######   KUBUS    ######");
                System.out.println("==== Hitung Volume Dan Luas ====");
                System.out.print("Masukan Panjang Rusuk Kubus : ");
                S = input.nextFloat();
                Volume = H_volume(S);
                panjangTotalRusuk = H_Total(S);
                LuasPer = H_luasPer(S);
                System.out.println("JAWAB : ");
                System.out.println("Volume kubus = " + Volume + " cm3");
                System.out.println("Luas Permukaan Kubus = " + LuasPer + " cm2");
                System.out.println("Panjang total rusuk kubus = " + panjangTotalRusuk + " cm" );
                System.out.print("Mau Menghitung Lagi (1 = Yes || 2 = No(Finish) || 3 = Back) ? ");
                a = input.nextInt();
                if (a == 1) {
                    this.Hitung_VolumeLuas();
                    break;
                }
                else if(a == 2)
                {
                    System.out.println("\nProgram Finish\nTerima Kasih :)");
                    break;
                }
                else if(a == 3)
                {
                    Pemilihan back = new Pemilihan();
                    back.Choose();
                    break;
                }
            }while (true);
        }

    }

    public static class Tabung extends BangunRuang
    {
        final double phi = 3.14285714;
        double jarijari, tinggi;
        double LuasTabung;
        double VolumeTabung;
        int b;

        public void Hitung_VolumeLuas()
        {
            do {
                System.out.println("\n######   Tabung    ######");
                System.out.println("==== Hitung Volume Dan Luas ====");
                System.out.print("Masukan Jari Jari Alas : ");
                jarijari = input.nextDouble();
                System.out.print("Masukan Tinggi : ");
                tinggi = input.nextDouble();

                // Rumus Luas Tabung
                LuasTabung = 2 * (phi * jarijari * jarijari) + (2 * phi * jarijari * tinggi);
                // Rumus Volume Tabung
                VolumeTabung = (phi * jarijari * jarijari) * tinggi;

                System.out.println("JAWAB : ");
                System.out.println("Luas Tabung = " + LuasTabung);
                System.out.println("Volume Tabung = " + VolumeTabung);
                System.out.print("Mau Menghitung Lagi(1 = Yes || 2 = No || 3 = Back) ?");
                b = input.nextInt();
                if (b == 1)
                {
                    this.Hitung_VolumeLuas();
                    break;
                }
                else if (b == 2)
                {
                    System.out.println("\nProgram Finish\nTerima Kasih :)");
                    break;
                }
                else if(b == 3)
                {
                    Pemilihan back = new Pemilihan();
                    back.Choose();
                    break;
                }
            }while (true);

        }
    }

    public static class Pemilihan extends BangunRuang
    {
        int pilih;
        public void Choose()
        {
            BangunRuang objek = new BangunRuang();
            objek.Tampilan_Utama();
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();

            if (pilih == 1)
            {
                Kubus Tampil1 = new Kubus();
                Tampil1.Hitung_VolumeLuas();
            }
            else if (pilih == 2)
            {
                Tabung Tampil2 = new Tabung();
                Tampil2.Hitung_VolumeLuas();
            }

        }
    }

    public static void main(String[] args) {
            Pemilihan Show = new Pemilihan();
            Show.Choose();
    }
}