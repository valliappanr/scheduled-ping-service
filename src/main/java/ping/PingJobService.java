package ping;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by vuswati on 02/06/2016.
 */
@Component
public class PingJobService {
    Logger log = Logger.getLogger(PingJobService.class);
    public void executeSampleJob() {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        try {
            CloseableHttpResponse response = client.execute(new HttpGet("http://www.google.com"));
            log.info(response.getStatusLine().getStatusCode());
        } catch (IOException iex) {
            log.error(String.format("%s", iex.getMessage()));
        }
    }
}
