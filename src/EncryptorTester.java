public class EncryptorTester {
    public static void main(String[] args) {
        String[][] arr = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
        Encryptor encrypt = new Encryptor(arr);
        encrypt.encryption(2);
    }
}
