package br.com.prontuarioMedico;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Client {

	public static void main(String[] args) {
		
		
			
			try {
				IProntuario stub = (IProntuario) Naming.lookup("rmi://localhost:1099/Servicos");
				System.out.println("ola");
				stub.cadastroPaciente("lucas", "06/04/1995", "92319709");
			} catch (MalformedURLException | RemoteException | NotBoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			
		
	}

	
}
