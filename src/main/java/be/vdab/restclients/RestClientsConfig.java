package be.vdab.restclients;

//import java.io.IOException;
//import java.io.InputStream;
import java.net.URL;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:restclients.properties")
public class RestClientsConfig {
	@Bean
	@Qualifier("ECB")
	ECBKoersenClient ecbKoersenClient(@Value("${ecbKoersenURL}") URL url) {
		return new ECBKoersenClient(url);
	}
	@Bean
	@Qualifier("Fixer")
	FixerKoersenClient fixerKoersenClient(@Value("${fixerKoersenURL}") URL url) {
		return new FixerKoersenClient(url);
	}
//	@Bean
//	KoersenClient koersenClient(@Value("${fixerKoersenURL}") URL fixerURL,
//			@Value("${ecbKoersenURL}") URL ecbURL) {
//		try (InputStream stream = fixerURL.openStream()) {
//			return new FixerKoersenClient(fixerURL);
//		} catch (IOException ex) {
//			return new ECBKoersenClient(ecbURL);
//		}
//		
//	}
}
