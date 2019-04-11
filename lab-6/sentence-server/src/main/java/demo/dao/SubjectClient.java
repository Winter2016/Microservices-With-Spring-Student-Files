package demo.dao;

import demo.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "SUBJECT")
public interface SubjectClient {

    @GetMapping("/")
    Word getWord();
}
