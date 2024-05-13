package classes;

public class ProcesareDocumente  {
    VerificareActe verificareActe;

    public ProcesareDocumente() {
        this.verificareActe = new PersoanaFizica();
    }

    public void setVerificareActe(VerificareActe verificareActe) {
        this.verificareActe = verificareActe;
    }

    public void verificaDocumente(){
        verificareActe.verificaActe();
    }

}
