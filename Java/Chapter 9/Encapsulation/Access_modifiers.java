public class Access_modifiers {
    public static void main(String[] args){

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Adil";
        // myAcc.password  = "12345678";
        myAcc.setPassword("12345678");

    }
}


class BankAccount {
    public String username;
    @SuppressWarnings("unused")
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

}
