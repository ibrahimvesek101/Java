package j31_Map.Tasks;

import java.util.HashMap;
import java.util.Scanner;

public class TaskProject {
	static HashMap<String, String> kisi = new HashMap<>();
	static Scanner input = new Scanner(System.in);
	              /* Task->
                     Girilen tc kimlik numarasini(4 haneli), tam isim(ad-soyad), adres, telefon bilgilerini

                     tc ile diğer bilgileri depolayan kayıt();
                     tc ile diğer bilgileri okutan goster();
                     tc ile diğer bilgileri silen  sil();

                     methodları create edip kullanıcı sonlandırana kadar tercihli run eden pr yazınız.
               */

	public static void main(String[] args) {


		selectOption();

	}

	private static void selectOption() {
		System.out.println("yapmak istediğiniz işemi giriniz :\n0:işlemi sonlandır\n" +
				"1:kullanıcı ekle\n2:kullanıcı bilgisi alma\n3:kullanıcı silme");
		int secim = input.nextInt();
		switch (secim) {
			case 0:
				cikis();
				break;
			case 1:
				saveInfo();
				break;
			case 2:
				getInfo();
				break;
			case 3:
				removeInfo();
				break;
			default:
				System.out.println("yanlış giriş yaptınız. Tekrar deneyiniz");
				selectOption();
				break;
		}
	}

	private static void cikis() {
		System.out.println("Agam çıkışın yapıldı. selametle....");
	}

	private static void removeInfo() {
		System.out.print("silinecek tc yi giriniz :");
		String silinecekTc = input.next();
		if (kisi.containsKey(silinecekTc)) {//1. adım
			kisi.remove(silinecekTc);
			System.out.println(" Agam girilen tc gayet başarılı silindi "+ kisi);//silinecekTc nin tüm bilgilerini person map'inden getirdik.(map.get(key);tüm değerleri value getirir.)

		} else {System.out.println(" Agam aradığınız tc sahip şahıs yoktur.\n tekrar deneyin");//2. adım
			removeInfo();}//kullanıcı, silinenTc ye sahip şahıs olmadığı  için tekrar tc girişi için
		selectOption();
	}

	private static void getInfo() {
		System.out.print(" Agam aradığınız tc yi giriniz :");
		String arananTc = input.next();
		if (kisi.containsKey(arananTc)) {
			System.out.println(kisi.get(arananTc));//aranaTc nin tüm bilgilerini person mmap'inden getirdik.(map.get(key);tüm değerleri value getirir.)
		} else {System.out.println(" Agam aradığınız tc sahip şahıs yoktur.\n tekrar deneyin");
			getInfo();}//kullanıcı, arananTc ye sahip şahıs olmadığı  için tekrar tc girişi için //kullanıcı var olan tc girdiği için tekrar tc girişi için saveInfo() metoda geri gönderdik. metoda geri gönderdik.
		selectOption();
	}



	private static void saveInfo() {

		System.out.print(" Agam 4 haneli tc  giresen : ");
		String tc = input.next();//nextLine hata verir.çünkü bir üst satır println değil print olduğu için tum satırı alır.
		input.nextLine();//arda arda scan.nextline çalışınca hata vermemesi için boş bir sc.nextLine(); atadık .

		if (kisi.containsKey(tc)) {
			System.out.println("Agam var olan bir tc girdiniz tekrar deneyiniz...");
			saveInfo();//kullanıcı var olan tc girdiği için tekrar tc girişi için saveInfo() metoda geri gönderdik.
		} else {
			System.out.print("adınızı giriniz: ");
			String name = input.nextLine();

			System.out.print("soyadınızı giriniz: ");
			String surName = input.nextLine();

			System.out.print("adres giriniz: ");
			String adress = input.nextLine();

			System.out.print("tel  giriniz: ");
			String phone = input.nextLine();

			String values = name + " " + surName + " " + adress + " " + phone;//tc haric verileri bir stringe atadık
			kisi.put(tc, values);//person map'ine tc key olarak diğer bilgiler (name surname...) value olarak eklendi.
			System.out.println("verilerinizi doğru şekilde girdiniz tebrikler verileriniz kaydedildi. verileriniz : "+ kisi);
			System.out.println("     *****    ");
			selectOption();
		}

	}
}
