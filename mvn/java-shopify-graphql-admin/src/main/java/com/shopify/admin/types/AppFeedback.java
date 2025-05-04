package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Reports the status of shops and their resources and displays this information
 * within Shopify admin. AppFeedback is used to notify merchants about steps they need to take
 * to set up an app on their store.
 */
public class AppFeedback {
  /**
   * The application associated to the feedback.
   */
  private App app;

  /**
   * The date and time when the app feedback was generated.
   */
  private OffsetDateTime feedbackGeneratedAt;

  /**
   * A link to where merchants can resolve errors.
   */
  private Link link;

  /**
   * The feedback message presented to the merchant.
   */
  private List<UserError> messages;

  /**
   * Conveys the state of the feedback and whether it requires merchant action or not.
   */
  private ResourceFeedbackState state;

  public AppFeedback() {
  }

  /**
   * The application associated to the feedback.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The date and time when the app feedback was generated.
   */
  public OffsetDateTime getFeedbackGeneratedAt() {
    return feedbackGeneratedAt;
  }

  public void setFeedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
    this.feedbackGeneratedAt = feedbackGeneratedAt;
  }

  /**
   * A link to where merchants can resolve errors.
   */
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  /**
   * The feedback message presented to the merchant.
   */
  public List<UserError> getMessages() {
    return messages;
  }

  public void setMessages(List<UserError> messages) {
    this.messages = messages;
  }

  /**
   * Conveys the state of the feedback and whether it requires merchant action or not.
   */
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
    /**
     * The application associated to the feedback.
     */
    private App app;

    /**
     * The date and time when the app feedback was generated.
     */
    private OffsetDateTime feedbackGeneratedAt;

    /**
     * A link to where merchants can resolve errors.
     */
    private Link link;

    /**
     * The feedback message presented to the merchant.
     */
    private List<UserError> messages;

    /**
     * Conveys the state of the feedback and whether it requires merchant action or not.
     */
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

    /**
     * The application associated to the feedback.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The date and time when the app feedback was generated.
     */
    public Builder feedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
      this.feedbackGeneratedAt = feedbackGeneratedAt;
      return this;
    }

    /**
     * A link to where merchants can resolve errors.
     */
    public Builder link(Link link) {
      this.link = link;
      return this;
    }

    /**
     * The feedback message presented to the merchant.
     */
    public Builder messages(List<UserError> messages) {
      this.messages = messages;
      return this;
    }

    /**
     * Conveys the state of the feedback and whether it requires merchant action or not.
     */
    public Builder state(ResourceFeedbackState state) {
      this.state = state;
      return this;
    }
  }
}
