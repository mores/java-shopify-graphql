package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for an email.
 */
public class EmailInput {
  /**
   * Specifies the email subject.
   */
  private String subject;

  /**
   * Specifies the email recipient.
   */
  private String to;

  /**
   * Specifies the email sender.
   */
  private String from;

  /**
   * Specifies the email body.
   */
  private String body;

  /**
   * Specifies any bcc recipients for the email.
   */
  private List<String> bcc;

  /**
   * Specifies a custom message to include in the email.
   */
  private String customMessage;

  public EmailInput() {
  }

  /**
   * Specifies the email subject.
   */
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Specifies the email recipient.
   */
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  /**
   * Specifies the email sender.
   */
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  /**
   * Specifies the email body.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  /**
   * Specifies any bcc recipients for the email.
   */
  public List<String> getBcc() {
    return bcc;
  }

  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }

  /**
   * Specifies a custom message to include in the email.
   */
  public String getCustomMessage() {
    return customMessage;
  }

  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }

  @Override
  public String toString() {
    return "EmailInput{subject='" + subject + "', to='" + to + "', from='" + from + "', body='" + body + "', bcc='" + bcc + "', customMessage='" + customMessage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmailInput that = (EmailInput) o;
    return Objects.equals(subject, that.subject) &&
        Objects.equals(to, that.to) &&
        Objects.equals(from, that.from) &&
        Objects.equals(body, that.body) &&
        Objects.equals(bcc, that.bcc) &&
        Objects.equals(customMessage, that.customMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, to, from, body, bcc, customMessage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the email subject.
     */
    private String subject;

    /**
     * Specifies the email recipient.
     */
    private String to;

    /**
     * Specifies the email sender.
     */
    private String from;

    /**
     * Specifies the email body.
     */
    private String body;

    /**
     * Specifies any bcc recipients for the email.
     */
    private List<String> bcc;

    /**
     * Specifies a custom message to include in the email.
     */
    private String customMessage;

    public EmailInput build() {
      EmailInput result = new EmailInput();
      result.subject = this.subject;
      result.to = this.to;
      result.from = this.from;
      result.body = this.body;
      result.bcc = this.bcc;
      result.customMessage = this.customMessage;
      return result;
    }

    /**
     * Specifies the email subject.
     */
    public Builder subject(String subject) {
      this.subject = subject;
      return this;
    }

    /**
     * Specifies the email recipient.
     */
    public Builder to(String to) {
      this.to = to;
      return this;
    }

    /**
     * Specifies the email sender.
     */
    public Builder from(String from) {
      this.from = from;
      return this;
    }

    /**
     * Specifies the email body.
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * Specifies any bcc recipients for the email.
     */
    public Builder bcc(List<String> bcc) {
      this.bcc = bcc;
      return this;
    }

    /**
     * Specifies a custom message to include in the email.
     */
    public Builder customMessage(String customMessage) {
      this.customMessage = customMessage;
      return this;
    }
  }
}
