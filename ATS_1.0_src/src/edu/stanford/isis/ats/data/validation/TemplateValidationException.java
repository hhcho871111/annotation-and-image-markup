package edu.stanford.isis.ats.data.validation;

import edu.stanford.isis.ats.utils.ATSException;

/**
 * @author Vladimir Kleper
 */
public class TemplateValidationException extends ATSException {
    private static final long serialVersionUID = 3103926041018142191L;
    
    private String reason;

    public TemplateValidationException(String message) {
        super(message);
    }

    public TemplateValidationException(String message, String reason) {
        super(message);
        this.reason = reason;
    }

    public TemplateValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public TemplateValidationException(String message, String reason, Throwable cause) {
        super(message, cause);
        this.reason = reason;
    }

    public TemplateValidationException(Throwable cause) {
        super(cause);
    }

    public String getReason() {
        return this.reason;
    }
}