public class FabricaBrancardier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu){
        return new Brancardier(nume, salariu);
    }
}
