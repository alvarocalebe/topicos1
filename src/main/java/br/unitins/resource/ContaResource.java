package br.unitins.resource;

import java.util.List;

import br.unitins.model.Conta;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/contas")

public class ContaResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Conta> todasContas(){
    return Conta.listAll();
  }
}
