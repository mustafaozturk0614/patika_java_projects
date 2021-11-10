package com.patika.mustafa.java101.atm;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int right = 3;
		int balance = 1500;
		int select;
		int amount;
		
		while (true) {
			right--;
			System.out.println("lütfen kullanıcı adınızı girniz: ");
			String userName = scanner.nextLine();
			System.out.println("lütfen şifrenizi adınızı girniz: ");
			String password = scanner.nextLine();
			if (!userName.equals("patika") && !password.equals("dev123")) {
				System.out.println("Hatalı Giriş yaptınız ");
				
				if (right == 0) {
					System.out.println("Kartınız bloke olmuştur lütfen  Banka ile iletişime geçiniz");
					break;
				} else {
					System.out.println("Kalan Hakkınız: " + right);
				}
				
			} else {
				System.out.println("Bankamıza Hoşgeldiniz");
				while (true) {
					System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
					System.out.println("lütfen bir işlem seçiniz");
					select = scanner.nextInt();
					switch (select) {
						case 1:
							System.out.println("lütfen yatırmak istediğniz tutarı giriniz: ");
							amount = scanner.nextInt();
							balance += amount;
							System.out.println("Hesabınıza " + amount + "TL para yatırılımıştır");
							
							break;
						case 2:
							System.out.println("lütfen çekmek istediğniz tutarı giriniz: ");
							amount = scanner.nextInt();
							if (amount > balance) {
								System.out.println("hesabınızda yeterli miktar para yoktur");
								
							} else {
								balance -= amount;
								
								System.out.println("Hesabınıza " + amount + "TL para çekilmiştir");
								System.out.println();
								
							}
							
							break;
						case 3:
							System.out.println("Hesabınızda toplam: " + balance + "TL para vardır");
							break;
						case 4:
							System.out.println("Sistemden Çıkılıyor...");
							System.exit(0);
							break;
						
						default:
							System.out.println("geçersiz bir değer girdiniz");
							break;
					}
					
				}
				
			}
			
		}
		
	}
}
