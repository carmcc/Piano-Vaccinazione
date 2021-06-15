public class VaccinoB extends Vaccino
{
    private static int id=0;
    private String modalitàSomministrazione;

    public VaccinoB(String aziendaFarmaceutica, int giorniRichiamo, String modalitàSomministrazione) throws DatiErratiException
    {
        super(aziendaFarmaceutica, giorniRichiamo, id);
        ++id;
        this.modalitàSomministrazione = modalitàSomministrazione;
    }


    public String getModalitàSomministrazione()
    {
        return modalitàSomministrazione;
    }
    @Override
    public String toString()
    {
        return  "\nVaccinoB: " +
                super.toString() +
                ", modalità di somministrazione: " + modalitàSomministrazione +
                '\n';
    }
}
