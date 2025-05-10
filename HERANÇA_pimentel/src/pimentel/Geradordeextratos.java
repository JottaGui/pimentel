package pimentel;


import  java.util.Date;
import java.text.SimpleDateFormat;

public class Geradordeextratos {

	
	public void imprimeextratobasico(conta c) {
		
		
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy   HH:mm:ss");
	Date agora = new Date();	
		
		
		System.out.println("DATA "  + sdf.format(agora));
		System.out.println("Saldo: "  + c.getSaldo());
		
	}
}
