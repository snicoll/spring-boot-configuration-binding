package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@SpringBootApplication
@EnableConfigurationProperties(EmailProperties.class)
public class DemoApplication {

    public static void main(String[] args) {
        // These twos are equivalent (relaxed binding)
        //System.setProperty("email.no-reply-to", "override@foo.bar");
        //System.setProperty("EMAIL_NO_REPLY_TO", "override@foo.bar");

        SpringApplication.run(DemoApplication.class, args);
    }

    @Service
    static class Startup implements CommandLineRunner {

        @Autowired
        private EmailProperties properties;

        @Override
        public void run(String... strings) throws Exception {
            System.out.println("-----------------------------------------");
            System.out.println("Client support: " + this.properties.getClientSupport());
            System.out.println("Partner support: " + this.properties.getPartnerSupport());
            System.out.println("No reply to: " + this.properties.getNoReplyTo());
            System.out.println("Support reply to: " + this.properties.getSupportReplyTo());
            System.out.println("OpS notification: " + this.properties.getOpsNotification());
            System.out.println("-----------------------------------------");
        }
    }
}
