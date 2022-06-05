public class Main
{
    public static void main (String [] args) throws DatiErratiException, DoseNonSomministrabbileException
    {
        Persona p1 = new Persona(56,"MARIO", 0);
        VaccinoA vaccino1 = new VaccinoA("Astrazeneca", 13);
        VaccinoB vaccino2 = new VaccinoB("Pfizer",15,"modalità di somministrazione");
        p1.eseguiVaccino(vaccino1);
        p1.eseguiVaccino(vaccino2);
        System.out.println(p1);
    }
}
