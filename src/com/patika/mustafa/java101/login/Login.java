package com.patika.mustafa.java101.login;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		
		login();
		
	}
	
	private static void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen Kullanıcı adını giriniz:");
		String userName = scanner.nextLine();
		System.out.println("lütfen şifrenizi giriniz:");
		String password = scanner.nextLine();
		
		if (userName.equals("patika") && password.equalsIgnoreCase("java123")) {
			
			System.out.println("Giriş yaptınız");
			
		} else {
			
			System.out.println("Bilgileriniz yanlış !");
			System.out.println("Şifrenizi sıfırlamak  istiyormusunuz 'E' ");
			String input = scanner.nextLine();
			System.out.println("lütfen oluşturmak istediğiniz yeni şifrenizi giriniz: ");
			while (true) {
				if (input.equalsIgnoreCase("e")) {
					
					String newpasword = scanner.nextLine();
					if (newpasword.equalsIgnoreCase(password) || newpasword.equalsIgnoreCase("java123")) {
						System.out.println("Şifre oluşturulamadı girdiğiniz şifre"
								+ " eski şifrenizle ve son giriş yaptığınız değerle aynı olamalıdır!!!");
						System.out.println("Lütfen Başka Şifre giriniz \n");
						
					} else {
						System.out.println("Şifre oluşturuldu");
						break;
					}
					
				} else {
					System.out.println("Sistemden çıkılıyor...");
					break;
				}
			}
			
		}
		scanner.close();
	}
	
}
