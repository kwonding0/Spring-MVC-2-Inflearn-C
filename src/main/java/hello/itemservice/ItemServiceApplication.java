package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	/*@Bean //해당빈은 스프링 부트가 자동으로 빈등록 해줌
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		//해당 부분에 작성된 [Beanname].properties 파일을 읽는다. (그래서 messsage.properties, errors.properties 두가지 파일을 읽어들인다는 뜻)
		messageSource.setBasenames("messages", "errors");
		messageSource.setDefaultEncoding("utf-8");
		return messageSource;
	}*/

}
