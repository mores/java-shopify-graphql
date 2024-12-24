package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class ResourceFeedbackCreateInput {
  
  private OffsetDateTime feedbackGeneratedAt;

  
  private List<String> messages;

  
  private ResourceFeedbackState state;

  public ResourceFeedbackCreateInput() {
  }

  
  public OffsetDateTime getFeedbackGeneratedAt() {
    return feedbackGeneratedAt;
  }

  public void setFeedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
    this.feedbackGeneratedAt = feedbackGeneratedAt;
  }

  
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  
  public ResourceFeedbackState getState() {
    return state;
  }

  public void setState(ResourceFeedbackState state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "ResourceFeedbackCreateInput{feedbackGeneratedAt='" + feedbackGeneratedAt + "', messages='" + messages + "', state='" + state + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourceFeedbackCreateInput that = (ResourceFeedbackCreateInput) o;
    return Objects.equals(feedbackGeneratedAt, that.feedbackGeneratedAt) &&
        Objects.equals(messages, that.messages) &&
        Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackGeneratedAt, messages, state);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime feedbackGeneratedAt;

    
    private List<String> messages;

    
    private ResourceFeedbackState state;

    public ResourceFeedbackCreateInput build() {
      ResourceFeedbackCreateInput result = new ResourceFeedbackCreateInput();
      result.feedbackGeneratedAt = this.feedbackGeneratedAt;
      result.messages = this.messages;
      result.state = this.state;
      return result;
    }

    
    public Builder feedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
      this.feedbackGeneratedAt = feedbackGeneratedAt;
      return this;
    }

    
    public Builder messages(List<String> messages) {
      this.messages = messages;
      return this;
    }

    
    public Builder state(ResourceFeedbackState state) {
      this.state = state;
      return this;
    }
  }
}
