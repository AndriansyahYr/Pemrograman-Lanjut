public class mainMobil{
	public static void main(String[] args){
		Mobil mobilA[] = new Mobil[3]; //mengisi panjang array
		for(int i=0;i<mobilA.length;i++){
			mobilA[i] = new Mobil(); //instansiasi objek Mobil
			int kecepatan = 30;
			String warna = "merah";
			String noPlat = "N 123 UY";
			mobilA[i].isiAtribut(noPlat, warna, kecepatan);
			mobilA[i].displayMessage();
		}
	}
}

