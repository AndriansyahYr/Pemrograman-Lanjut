public class Mobil{
	String noPlat;
	String warna;
	int kecepatan;
	void isiAtribut(String noPlat, String warna, int kecepatan){
		this.noPlat = noPlat;
		this.warna = warna;
		this.kecepatan = kecepatan;
	}
	void displayMessage(){
		System.out.println("No Plat 	: "+noPlat);
		System.out.println("Warna  		: "+warna);
		System.out.println("Kecepatan  	: "+kecepatan);
	}
}