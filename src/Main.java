import java.math.BigDecimal;

public class Main {

    enum Operazione {
        ADDIZIONE(),
        SOTTRAZIONE(),
        MOLTIPLICAZIONE(),
        DIVISIONE(),
        MIN(),
        MAX();

    }

    public static void main(String[] args) {
        BigDecimal numero1 = new BigDecimal("10.5");
        BigDecimal numero2 = new BigDecimal("5.2");

        eseguiOperazione(Operazione.ADDIZIONE, numero1, numero2);
        eseguiOperazione(Operazione.SOTTRAZIONE, numero1, numero2);
        eseguiOperazione(Operazione.MOLTIPLICAZIONE, numero1, numero2);
        eseguiOperazione(Operazione.DIVISIONE, numero1, numero2);
        eseguiOperazione(Operazione.MIN, numero1, numero2);
        eseguiOperazione(Operazione.MAX, numero1, numero2);
    }

    private static void eseguiOperazione(Operazione operazione, BigDecimal num1, BigDecimal num2) {
        BigDecimal risultato;

        switch (operazione) {
            case ADDIZIONE:
                risultato = num1.add(num2);
                break;
            case SOTTRAZIONE:
                risultato = num1.subtract(num2);
                break;
            case MOLTIPLICAZIONE:
                risultato = num1.multiply(num2);
                break;
            case DIVISIONE:
                risultato = num1.divide(num2, BigDecimal.ROUND_HALF_UP);
                break;
            case MIN:
                risultato = num1.min(num2);
                break;
            case MAX:
                risultato = num1.max(num2);
                break;
            default:
                throw new IllegalArgumentException("Operazione non supportata");
        }

        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Risultato: " + risultato);
        System.out.println();
    }
}
