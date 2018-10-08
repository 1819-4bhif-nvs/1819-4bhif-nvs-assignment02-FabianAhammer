package model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class StundenVerwaltung {

    String lehrer;
    Date stunde;

    //region Constructor
    public StundenVerwaltung() {

    }

    public StundenVerwaltung(String lehrer, Date stunde) {
        this.lehrer = lehrer;
        this.stunde = stunde;
    }
    //endregion

    //region Getter and Setter
    public String getLehrer() {
        return lehrer;
    }

    public void setLehrer(String lehrer) {
        this.lehrer = lehrer;
    }

    public Date getStunde() {
        return stunde;
    }

    public void setStunde(Date stunde) {
        this.stunde = stunde;
    }
    //endregion
}
