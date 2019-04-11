package demo.dao;

import demo.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "VERB")
public interface VerbClient {

    @GetMapping("/")
    Word getWord();
}
