package db;

public class MySQLConnection {
    public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/center"+
            "?verifyServerCertificate=false"+
            "&allowPublicKeyRetrieval=true"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC";
}
