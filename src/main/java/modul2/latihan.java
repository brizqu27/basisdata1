package modul2;
import java.util. ArrayList;

public class latihan {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        System.out.println("Nama Hewan : " + hewan);

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        ArrayList<String> deletedData = new ArrayList<>();

        for(String warna : deleteHewan){
            hewan.removeIf(h -> h.equals(warna));
            deletedData.add(warna);
        }

        System.out.println("Hewan Yang Dihapus : \n" + deletedData);
        System.out.println("Output Setelah Data Dihapus : \n" + hewan);
    }
}
