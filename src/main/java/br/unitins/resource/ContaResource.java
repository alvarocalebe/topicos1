package br.unitins.resource;

import java.util.List;

import br.unitins.model.Conta;
import br.unitins.repository.ContaRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/contas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContaResource {

  @Inject
  ContaRepository repository;

  @POST
  @Transactional
  public Conta insert(Conta conta) {
    Conta novaConta = new Conta();
    novaConta.setNomeDono(conta.getNomeDono());
    novaConta.setNumeroConta(conta.getNumeroConta());

    repository.persist(novaConta);
    return novaConta;
  }

  @GET
  public List<Conta> findAll() {
    return repository.listAll();
  }

  @GET
  @Path("/{id}")
  public Conta findById(@PathParam("id") Long id) {
    return repository.findById(id);
  }

  @GET
  @Path("/search/nomedono/{nomeDono}")
  public List<Conta> findById(@PathParam("nomeDono") String nomeDono) {
    return repository.findByNome(nomeDono);
  }

  @DELETE
  @Transactional
  @Path("delete/{id}")
  public void deletarConta(@PathParam("id") Long id) {

    Conta conta = repository.findById(id);

    if (conta != null) {
      repository.delete(conta);
    }
    System.out.println("O ID passado não exixte.");
  }

  @PUT
  @Path("/update")
  @Transactional
  public void atualizarConta(Conta conta) {
    Conta contaAtualizada = repository.findById(conta.getId());

    if (conta != null) {
     contaAtualizada.setNomeDono(conta.getNomeDono());
     contaAtualizada.setNumeroConta(conta.getNumeroConta());
     contaAtualizada.setSaldo(conta.getSaldo());

     repository.persist(contaAtualizada);

    }
  }

}
