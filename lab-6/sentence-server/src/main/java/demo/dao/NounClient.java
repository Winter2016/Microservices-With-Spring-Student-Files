package demo.dao;

import demo.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "NOUN")
public interface NounClient {

    @GetMapping("/")
    Word getWord();
}
