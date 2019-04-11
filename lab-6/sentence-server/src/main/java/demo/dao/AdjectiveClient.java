package demo.dao;

import demo.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "ADJECTIVE")
public interface AdjectiveClient {

    @GetMapping("/")
    Word getWord();
}
