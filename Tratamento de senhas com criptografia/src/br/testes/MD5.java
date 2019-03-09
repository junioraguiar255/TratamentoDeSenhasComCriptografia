package br.testes;

import java.security.NoSuchAlgorithmException;

import javax.swing.JOptionPane;

/**
 * @author JOSEMAR JUNIOR
 *
 */

public class MD5 {

	public static void main(String[] args) {
		String password1 = "senha13";
		String password2 = "Senha2";

		try {
			String password1MD5 = ConvertPasswordToMD5.convertPasswordToMD5(password1);
			String password2MD5 = ConvertPasswordToMD5.convertPasswordToMD5(password2);

			String s = JOptionPane.showInputDialog("digite");
			String ps = ConvertPasswordToMD5.convertPasswordToMD5(s);

			String passwordCompareMD5 = ConvertPasswordToMD5.convertPasswordToMD5(password1);

			System.out.println("Password1: " + password1MD5);
			System.out.println("Password2: " + password2MD5);

			System.out.println("passwordCompareMD5: " + passwordCompareMD5);

			if (ps.equals(passwordCompareMD5)) {
				System.out.println("Compare OK");
			} else {
				System.out.println("Comparação errada");
			}

//            if (s.equals(passwordCompareMD5)) {
//                System.out.println("Compare OK");
//            } else {
//                System.out.println("Compare NÃO");
//            }
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
