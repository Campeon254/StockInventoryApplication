import java.security.MessageDigest;//cryptographic hash function
import java.security.NoSuchAlgorithmException;//handling errors
class Passwords {
    public Passwords() {
        }
        public static String hashPassword(String password) {//takes a string input an returns a string hashed version
        try {
            //select SHA hashing algorithm
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());//converts passwords to bytes
            
            //building the final readable string 
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                //iterates over each byte converting it to hexadecimal for storing
                sb.append(String.format("%02x", b));
            }
            return sb.toString();//returns the hashed password as string
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
}
