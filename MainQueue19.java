import java.util.Scanner;

public class MainQueue19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList19 q = new QueueLinkedList19();

        int pilih;
        do {
            System.out.println("\n=== ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Depan");
            System.out.println("4. Lihat Belakang");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Tampilkan Semua");
            System.out.println("7. Kosongkan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Keperluan: ");
                    String kep = sc.nextLine();

                    TugasMahasiswa19 mhs = new TugasMahasiswa19(nim, nama, kep);
                    q.enqueue(mhs);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peekFront();
                    break;

                case 4:
                    q.peekRear();
                    break;

                case 5:
                    q.jumlah();
                    break;

                case 6:
                    q.print();
                    break;

                case 7:
                    q.clear();
                    break;
            }
        } while (pilih != 0);
    }
}
    
