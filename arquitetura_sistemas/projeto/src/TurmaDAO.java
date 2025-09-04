import java.util.ArrayList;
import java.util.List;

import turma.Aluno;

public class TurmaDAO {

    public ArrayList<Aluno> load() {
        ArrayList<Aluno> listDAO = new ArrayList<>();
        listDAO.add(new Aluno("Iago", "9845"));
        listDAO.add(new Aluno("Pan", "0909"));
        listDAO.add(new Aluno("Bilas", "1111"));
        listDAO.add(new Aluno("Cato", "1234"));
        
        return listDAO;
    }
    
    public void save() {
        
    }

    public void update() {

    }

    public void delete() {

    }
}
