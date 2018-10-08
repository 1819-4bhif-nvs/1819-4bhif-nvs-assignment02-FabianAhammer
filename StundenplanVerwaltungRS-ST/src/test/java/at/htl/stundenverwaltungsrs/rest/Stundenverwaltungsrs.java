package at.htl.stundenverwaltungsrs.rest;

import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class Stundenverwaltungsrs {

    private Client client;
    private WebTarget tut;

    @Before
    public void initClient(){
        this.client = ClientBuilder.newClient();
        this.tut = this.client.target("http://localhost:8080/stundenverwaltung/rs/stundenverwaltung/nexthour");
    }

    @Test
    public void fetchHours()
    {
        Response res = this.tut.request(MediaType.TEXT_PLAIN).get();
        assertThat(res.getStatus(),is(200));
        String payload = res.readEntity(String.class);
        assertTrue(payload.startsWith("Hours: "));
    }
}
