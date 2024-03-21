package classes;

import java.util.HashMap;
import java.util.Map;

public class ContClienti extends Cont{
    private Map<Integer, String> carduri = new HashMap<>();;
    private String numeDetinator;

    public ContClienti(Map<Integer, String> carduri, String numeDetinator) {
        this.carduri = carduri;
        this.numeDetinator = numeDetinator;
    }

    public ContClienti() {
    }

    public Map<Integer, String> getCarduri() {
        return carduri;
    }

    public String getNumeDetinator() {
        return numeDetinator;
    }

    public void setCarduri(Map<Integer, String> carduri) {
        for( Integer nrCard: carduri.keySet()){
            this.carduri.put(nrCard, carduri.get(nrCard));
        }
    }

    public void setNumeDetinator(String numeDetinator) {
        this.numeDetinator = numeDetinator;
    }

    @Override
    public String toString() {
        return "ContClienti{" +
                "carduri=" + carduri +
                ", numeDetinator='" + numeDetinator + '\'' +
                '}';
    }

    @Override
    public ContClienti clone() {
        ContClienti contExistent = new ContClienti();
        contExistent.setCarduri(this.getCarduri());
        contExistent.setNumeDetinator(this.getNumeDetinator());
        return contExistent;

    }
}
