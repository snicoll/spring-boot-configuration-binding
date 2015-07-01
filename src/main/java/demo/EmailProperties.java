package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * This declares that this object can be bound to the "email" prefix in the
 * {@link org.springframework.core.env.Environment}. Nothing happens really
 * until you configure it as a regular Spring Bean and you add
 * {@link org.springframework.boot.context.properties.EnableConfigurationProperties}
 * to your {@code @Configuration} class.
 * <p/>
 * Alternatively, you can specify {@code @EnableConfigurationProperties(EmailProperties.class}
 * and Spring Boot will create a bean automatically for you (the latter option
 * is used, see {@link DemoApplication}.
 *
 * @author Stephane Nicoll
 */
@ConfigurationProperties("email")
public class EmailProperties {

    /**
     * Client support email.
     */
    private String clientSupport = "help@example.com";

    /**
     * Partner support email.
     */
    private String partnerSupport = "partner@example.com";

    /**
     * Don't send an email there.
     */
    private String noReplyTo = "noreply@example.com";

    /**
     * Help.
     */
    private String supportReplyTo = "support@example.com";

    /**
     * Something is broken.
     */
    private String opsNotification = "notification@example.com";

    public String getClientSupport() {
        return clientSupport;
    }

    public void setClientSupport(String clientSupport) {
        this.clientSupport = clientSupport;
    }

    public String getPartnerSupport() {
        return partnerSupport;
    }

    public void setPartnerSupport(String partnerSupport) {
        this.partnerSupport = partnerSupport;
    }

    public String getNoReplyTo() {
        return noReplyTo;
    }

    public void setNoReplyTo(String noReplyTo) {
        this.noReplyTo = noReplyTo;
    }

    public String getSupportReplyTo() {
        return supportReplyTo;
    }

    public void setSupportReplyTo(String supportReplyTo) {
        this.supportReplyTo = supportReplyTo;
    }

    public String getOpsNotification() {
        return opsNotification;
    }

    public void setOpsNotification(String opsNotification) {
        this.opsNotification = opsNotification;
    }
}
