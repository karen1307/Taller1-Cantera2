package Taller1;

/**
 * Solicita datos de la cuenta bancaria
 * @author Karen Nathaly Fonseca Moreno
 */

public class BankAccount {
    /* variables*/
    private int accountNumber;/* inicializacion de variable numero de cuenta tipo int*/
    protected boolean activated;/* inicializacion de variable activacion */

    /*contructor*/
    /* asignacion de variables*/
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    /* metodos*/
    /* obtener numero de cuenta*/
    public int getAccountNumber() {
        return accountNumber;
    }
    /* asignar numero de cuenta*/
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /* obtener activacion */
    public boolean getActivated() {
        return activated;
    }
    /* asignar ativacion*/
    public void isActivated(boolean activated) {
        this.activated = activated;
    }

    public void accountStatus(){
        if(activated == true){
            System.out.println("Cuenta del usuario activa");
        } else {
            System.out.println("Cuenta del usuario inactiva");
        }
    }
}
