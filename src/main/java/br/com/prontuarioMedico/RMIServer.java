package br.com.prontuarioMedico;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements IProntuario {
	

	private static final long serialVersionUID = 1L;
	
	String nomePaciente;
	String dataNascimento;
	String telefonePaciente;
	String nomeMedico;
	String especialidade;
	String telefoneMedico;
	String crm;
	String descricao[];
	
	public RMIServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.createRegistry(1099);
				Naming.rebind("rmi://localhost:1099/Servicos", new Servicos());
				
				System.out.println("Servidor online!");
				
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
//		
	}
	@Override
	public String cadastroPaciente(String nome, String dataNasc, String telefonePac) throws RemoteException{
		nome = nomePaciente;
		dataNasc = dataNascimento;
		telefonePac = telefonePaciente;
		
		return ("Paciente cadastrado!");		
	}
	@Override
	public String cadastroMedico(String nomeMed, String espec, String telMedico, String conselho) throws RemoteException{
		nomeMed = nomeMedico;
		espec = especialidade;
		telMedico = telefoneMedico;
		conselho = crm;
		
		return ("Médico cadastrado!");
	}
	@Override
	public String editarFichaPaciente(String nomePaciente, String nomeMedico, String descricao) throws RemoteException {
		
		return null;
	}

	@Override
	public String getCadastropaciente() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCadastroMedico() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public String getFichaPaciente() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
