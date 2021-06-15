public class VaccinoA extends Vaccino
{
    private static int id=0;

    public VaccinoA(String aziendaFarmaceutica, int giorniRichiamo) throws DatiErratiException
    {
        super(aziendaFarmaceutica, giorniRichiamo, id);
        ++id;
    }

    @Override
    public String toString()
    {
        return "\nVaccinoA:" +
                super.toString() +
                '\n';
    }
}