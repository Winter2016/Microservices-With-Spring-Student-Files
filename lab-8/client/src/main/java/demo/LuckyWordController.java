package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
// TODO: Add @ConfigurationProperties here.
@RefreshScope
//@ConfigurationProperties("word-config")
public class LuckyWordController {

	@Value("${wordConfig.luckyWord}")
	String luckyWord;
	@Value("${wordConfig.preamble}")
	String preamble;

	String fullStatement;

	@PostConstruct
	private void init(){
		fullStatement = preamble + ": " + luckyWord;
	}
	
	@GetMapping("/lucky-word")
	public String showLuckyWord() {
//		return preamble + ": " + luckyWord;
		return fullStatement;
	}

	public String getLuckyWord() {
		return luckyWord;
	}

	public void setLuckyWord(String luckyWord) {
		this.luckyWord = luckyWord;
	}

	public String getPreamble() {
		return preamble;
	}

	public void setPreamble(String preamble) {
		this.preamble = preamble;
	}
}
