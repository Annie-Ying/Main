package com.dy.why.main;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream finput = new FileInputStream("/D��/��ϰ/a");
			
			DataInputStream  dinput = new DataInputStream(finput);
			
			String r =dinput.readUTF();
			
			System.out.println(r);
			
			dinput.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

