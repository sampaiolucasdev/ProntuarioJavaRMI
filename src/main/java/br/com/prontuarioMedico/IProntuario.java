package br.com.prontuarioMedico;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IProntuario extends Remote {

	public String cadastroPaciente(String nomePaciente, String dataNascimento, String telefonePaciente) throws RemoteException;
	public String getCadastropaciente() throws RemoteException;
	
	public String cadastroMedico(String nomeMedico, String especialidade, String telefoneMedico, String crm) throws RemoteException;
	public String getCadastroMedico() throws RemoteException;
	
	public String editarFichaPaciente(String nomePaciente, String nomeMedico, String descricao) throws RemoteException;
	public String getFichaPaciente() throws RemoteException;
}
