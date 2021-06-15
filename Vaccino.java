public abstract class Vaccino
{

    private int idCode;
    private String aziendaFarmaceutica;
    private int giorniRichiamo;

    public Vaccino(String aziendaFarmaceutica, int giorniRichiamo, int id) throws DatiErratiException
    {
        if (giorniRichiamo < 10)
            throw new DatiErratiException("Per effettuare il richiamo si chiede un minimo di 10 giorni");
        else
        {
            this.aziendaFarmaceutica = aziendaFarmaceutica;
            this.giorniRichiamo = giorniRichiamo;
            this.idCode = id;
        }
    }

    public String getAziendaFarmaceutica()
    {
        return aziendaFarmaceutica;
    }

    public int getGiorniRichiamo()
    {
        return giorniRichiamo;
    }

    @Override
    public String toString()
    {
        return " aziendaFarmaceutica= '" + aziendaFarmaceutica + '\'' +
                ", giorniRichiamo= " + giorniRichiamo +
                ", ID code: " + idCode+
                '\t';
    }
}
