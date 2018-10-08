package at.htl.rest;

import model.StundenVerwaltung;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("stundenverwaltung")
public class StundenVerwaltungsEndpoint {

    @GET
    @Path("nexthour")
    public StundenVerwaltung nächsteStunde()
    {
        Date date = new Date();
        date = Date.from(Instant.now());
        return new StundenVerwaltung("Hours: Mayr am", date);
    }

}
