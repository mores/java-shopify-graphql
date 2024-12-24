package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class EmailInput {
  
  private String subject;

  
  private String to;

  
  private String from;

  
  private String body;

  
  private List<String> bcc;

  
  private String customMessage;

  public EmailInput() {
  }

  
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  
  public List<String> getBcc() {
    return bcc;
  }

  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }

  
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
    
    private String subject;

    
    private String to;

    
    private String from;

    
    private String body;

    
    private List<String> bcc;

    
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

    
    public Builder subject(String subject) {
      this.subject = subject;
      return this;
    }

    
    public Builder to(String to) {
      this.to = to;
      return this;
    }

    
    public Builder from(String from) {
      this.from = from;
      return this;
    }

    
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    
    public Builder bcc(List<String> bcc) {
      this.bcc = bcc;
      return this;
    }

    
    public Builder customMessage(String customMessage) {
      this.customMessage = customMessage;
      return this;
    }
  }
}
