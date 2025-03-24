import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
class Passwords {
    public Passwords() {
        }
        public static String hashPassword(String password) {
        try {
            //select SHA hashing algorithm
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());//converts passwords tp bytes

            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                //convert bytes to hexadecimal for storing
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
}
