public class FabricaMedic implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu){
        return new Medic(nume, salariu);
    }
}
