package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class AppFeedback {
  
  private App app;

  
  private OffsetDateTime feedbackGeneratedAt;

  
  private Link link;

  
  private List<UserError> messages;

  
  private ResourceFeedbackState state;

  public AppFeedback() {
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public OffsetDateTime getFeedbackGeneratedAt() {
    return feedbackGeneratedAt;
  }

  public void setFeedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
    this.feedbackGeneratedAt = feedbackGeneratedAt;
  }

  
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  
  public List<UserError> getMessages() {
    return messages;
  }

  public void setMessages(List<UserError> messages) {
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
    return "AppFeedback{app='" + app + "', feedbackGeneratedAt='" + feedbackGeneratedAt + "', link='" + link + "', messages='" + messages + "', state='" + state + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppFeedback that = (AppFeedback) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(feedbackGeneratedAt, that.feedbackGeneratedAt) &&
        Objects.equals(link, that.link) &&
        Objects.equals(messages, that.messages) &&
        Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, feedbackGeneratedAt, link, messages, state);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private App app;

    
    private OffsetDateTime feedbackGeneratedAt;

    
    private Link link;

    
    private List<UserError> messages;

    
    private ResourceFeedbackState state;

    public AppFeedback build() {
      AppFeedback result = new AppFeedback();
      result.app = this.app;
      result.feedbackGeneratedAt = this.feedbackGeneratedAt;
      result.link = this.link;
      result.messages = this.messages;
      result.state = this.state;
      return result;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder feedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
      this.feedbackGeneratedAt = feedbackGeneratedAt;
      return this;
    }

    
    public Builder link(Link link) {
      this.link = link;
      return this;
    }

    
    public Builder messages(List<UserError> messages) {
      this.messages = messages;
      return this;
    }

    
    public Builder state(ResourceFeedbackState state) {
      this.state = state;
      return this;
    }
  }
}
