package database;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	public static void main(String[] args) throws SQLException {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("manualPU");
            EntityManager em = emf.createEntityManager();
            
//            Paciente pct = new Paciente();
//            pct.setNomePaciente("Eduardo");
//            pct.setDataNascimento("06/04/1995");
//            pct.setTelefonePaciente("92319709");
//            pct.setDescricao("teste");

            Medico md = new Medico();
            //md.setId(1);
            md.setCrm("1256");
            md.setEspecialidade("Clinica Medica");
            md.setNomeMedico("Carlos Silva");
            md.setTelefoneMedico("99976545");
            
            em.getTransaction().begin();
            
            try {
                //SALVAR (INSERÇÃO OU UPDATE)
                em.merge(md); 
                
                
                //PROCURAR POR ID
                //Paciente pct = em.find(Paciente.class, 1);
                //Medico md = em.find(Medico.class, 1);
                //System.out.println("Paciente" + pct);
                //em.merge(md);
                em.getTransaction().commit();
            } catch (Exception e) {
                System.out.println("Erro ao salvar!");
                em.getTransaction().rollback();
            }
	}

}
