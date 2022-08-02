package rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;

import dao.ContoCorrenteDAOImpl;
import entity.ContoCorrente;
import entity.Movimento;

@Path("/conto")

public class Ewallet {
	ContoCorrenteDAOImpl contoSrv=new ContoCorrenteDAOImpl();
		@GET
		@Path("/listaconti")
		@Produces(MediaType.APPLICATION_JSON)
		public List<ContoCorrente> getAllConti() {

			return contoSrv.getAllConti();
		}


		@POST
		@Path("/crea")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response crea(ContoCorrente c) {
		
			return (Response) contoSrv.crea(c);

		}

		@PUT
		@Path("/aggiorna")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response aggiorna(ContoCorrente c) {

			return (Response) contoSrv.aggiorna(c);
		}

		@DELETE
		@Path("/cancella")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response cancella(ContoCorrente c) {

			return (Response) contoSrv.cancella(c);
		}

		@PUT
		@Path("/operazione")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response operazione(Movimento o) {

			return (Response) contoSrv.operazione(o);
		}
		@GET
		@Path("/movimenti")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Movimento> getAllMovimenti() {

			return contoSrv.getAllMovimenti();
		}
	}
