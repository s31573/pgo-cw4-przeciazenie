public class Address {

    public String createAddress(String kraj, String miasto, String postal, String street, String flatNo){
        return String.format("Kraj: %s | %s %s, %s %s", kraj, street, flatNo, postal, miasto);
    }

    public String createAddress(String kraj, String miasto, String postal, String street){
        return createAddress(kraj, miasto, postal, street, "");
    }

    public String createAddress(String kraj, String miasto, String postal){
        return createAddress(kraj, miasto, postal, "", "");
    }

    public String createAddress(String kraj, String miasto){
        return createAddress(kraj, miasto, "", "", "");
    }

    public String createAddress(String kraj){
        return createAddress(kraj, "", "", "", "");
    }

}
