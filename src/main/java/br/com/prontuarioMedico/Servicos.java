package br.com.prontuarioMedico;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servicos extends UnicastRemoteObject implements IProntuario{

	protected Servicos() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String cadastroPaciente(String nomePaciente, String dataNascimento, String telefonePaciente)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCadastropaciente() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cadastroMedico(String nomeMedico, String especialidade, String telefoneMedico, String crm)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCadastroMedico() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editarFichaPaciente(String nomePaciente, String nomeMedico, String descricao) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFichaPaciente() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
