package br.unitins.repository;



import java.util.List;

import br.unitins.model.Conta;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ContaRepository implements PanacheRepository<Conta>{
  public List<Conta> findByNome(String nomeDono) {
       return find("UPPER(nomeDono) LIKE UPPER(?1)", "%"+nomeDono+"%").list();
  }

  public List<Conta> findByNomeDono(String nomeDono) {
    return null;
  }
}
