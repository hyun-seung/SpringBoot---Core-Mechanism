package hello.datasource;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.util.List;

@Slf4j
public class MyDataSource {

    private String url;
    private String username;
    private String password;
    private int maxCoonection;
    private Duration timeout;
    private List<String> options;

    public MyDataSource(String url, String username, String password, int maxCoonection, Duration timeout, List<String> options) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.maxCoonection = maxCoonection;
        this.timeout = timeout;
        this.options = options;
    }

    @PostConstruct
    public void init() {
        log.info("url={}", url);
        log.info("username={}", username);
        log.info("password={}", password);
        log.info("maxCoonection={}", maxCoonection);
        log.info("timeout={}", timeout);
        log.info("options={}", options);
    }
}
