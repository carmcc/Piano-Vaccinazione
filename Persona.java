public class Persona
{
    private int eta;
    private String nome;
    private final int sesso; //1 donna : 0 uomo
    private Vaccino[] elencoVaccini;
    private int vacciniEseguiti;

    public Persona(int eta, String nome, int sesso) throws DatiErratiException
    {
        if ((eta < 0 || eta > 99))
            throw new DatiErratiException("la persona non può essere più piccola di 0 anni e più grande di 99 anni");
        else if (nome.length() < 2)
            throw new DatiErratiException("la persona non può avere un numero più corto di 2 lettere");
        else if (sesso < 0 || sesso > 1)
            throw new DatiErratiException("sesso: 0 Uomo / 1 Donna");
        else
        {
            this.eta = eta;
            this.nome = nome;
            this.sesso = sesso;
            elencoVaccini = new Vaccino[100];
            vacciniEseguiti = 0;
        }
    }

    public void eseguiVaccino(Vaccino v) throws DoseNonSomministrabbileException
    {
        if(vacciniEseguiti == 100) //se si è raggiunto il nr massimo i vaccini interrompi il metodo
            return;

        if (v instanceof VaccinoA)
        {
            if (eta < 14)
                throw new DoseNonSomministrabbileException("Il vaccino A non può essere somministrato a persone con età minore a 14 anni");
            else
            {
                elencoVaccini[vacciniEseguiti] = v;
                ++vacciniEseguiti;
            }
        }
        else
        {
            if(sesso == 0 && eta < 18)
                throw new DoseNonSomministrabbileException("Il vaccino B non può essere somministrato agli uomini con età inferiore a 18 anni");
            else if( sesso == 1 && eta < 60)
            {
                throw new DoseNonSomministrabbileException("Il vaccino B non può essere somministrato alle donne con età minore a 60 anni");
            }
            else
            {
                elencoVaccini[vacciniEseguiti] = v;
                ++vacciniEseguiti;
            }
        }
    }

    public void eseguiVaccino(VaccinoA v) throws DoseNonSomministrabbileException
    {
        if (eta < 14)
            throw new DoseNonSomministrabbileException("Il vaccino A non può essere somministrato a persone con età minore a 14 anni");
        else
        {
            elencoVaccini[vacciniEseguiti] = v;
            ++vacciniEseguiti;
        }
    }
    public void eseguiVaccino(VaccinoB v) throws DoseNonSomministrabbileException
    {
        if(sesso == 0 && eta < 18)
            throw new DoseNonSomministrabbileException("Il vaccino B non può essere somministrato agli uomini con età inferiore a 18 anni");
        else if( sesso == 1 && eta < 60)
        {
            throw new DoseNonSomministrabbileException("Il vaccino B non può essere somministrato alle donne con età minore a 60 anni");
        }
        else
        {
            elencoVaccini[vacciniEseguiti] = v;
            ++vacciniEseguiti;
        }
    }

    public int getEta()
    {
        return eta;
    }

    public String getNome()
    {
        return nome;
    }

    public int getSesso()
    {
        return sesso;
    }

    public int getVacciniEseguiti()
    {
        return vacciniEseguiti;
    }

    @Override
    public String toString()
    {
        String out = "";
        out+= "Persona{" +
                "  eta= " + eta +
                ", nome= '" + nome + '\'' +
                ", sesso= " + sesso +
                ", vacciniEseguiti= " + vacciniEseguiti +
                '}';
        for (int i = 0; i < vacciniEseguiti; i++)
        {
            out+= "\n"+elencoVaccini[i].toString();
        }
        return out;
    }
}
