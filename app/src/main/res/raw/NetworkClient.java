import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.CertificatePinner;

public class NetworkClient {
    private static OkHttpClient client;

    public static OkHttpClient getClient() {
        if (client == null) {
            CertificatePinner certificatePinner = new CertificatePinner.Builder()
                    .add("yourdomain.com", "sha256/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA=") // Aquí usa el hash del certificado
                    .build();

            client = new OkHttpClient.Builder()
                    .certificatePinner(certificatePinner)
                    .build();
        }
        return client;
    }

    public static Response makeRequest(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        return getClient().newCall(request).execute();
    }
}
