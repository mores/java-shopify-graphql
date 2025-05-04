package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a resource feedback object.
 */
public class ResourceFeedbackCreateInput {
  /**
   * The date and time when the feedback was generated. Used to help determine whether
   * incoming feedback is outdated compared to existing feedback.
   */
  private OffsetDateTime feedbackGeneratedAt;

  /**
   * If the feedback state is `requires_action`, then you can send a string message
   * that communicates the action to be taken by the merchant.
   * The string must be a single message up to 100 characters long and must end with a period.
   * You need to adhere to the message formatting rules or your requests will fail:
   * - `[Explanation of the problem]. [Suggested action].`
   *   
   * **Examples:**
   * - `[Your app name]` isn't connected. Connect your account to use this sales channel. `[Learn more]`
   * - `[Your app name]` isn't configured. Agree to the terms and conditions to use this app. `[Learn more]`
   * Both `Your app name` and `Learn more` (a button which directs merchants to
   * your app) are automatically populated in the Shopify admin.
   */
  private List<String> messages;

  /**
   * The state of the feedback and whether it requires merchant action.
   */
  private ResourceFeedbackState state;

  public ResourceFeedbackCreateInput() {
  }

  /**
   * The date and time when the feedback was generated. Used to help determine whether
   * incoming feedback is outdated compared to existing feedback.
   */
  public OffsetDateTime getFeedbackGeneratedAt() {
    return feedbackGeneratedAt;
  }

  public void setFeedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
    this.feedbackGeneratedAt = feedbackGeneratedAt;
  }

  /**
   * If the feedback state is `requires_action`, then you can send a string message
   * that communicates the action to be taken by the merchant.
   * The string must be a single message up to 100 characters long and must end with a period.
   * You need to adhere to the message formatting rules or your requests will fail:
   * - `[Explanation of the problem]. [Suggested action].`
   *   
   * **Examples:**
   * - `[Your app name]` isn't connected. Connect your account to use this sales channel. `[Learn more]`
   * - `[Your app name]` isn't configured. Agree to the terms and conditions to use this app. `[Learn more]`
   * Both `Your app name` and `Learn more` (a button which directs merchants to
   * your app) are automatically populated in the Shopify admin.
   */
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  /**
   * The state of the feedback and whether it requires merchant action.
   */
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
    /**
     * The date and time when the feedback was generated. Used to help determine whether
     * incoming feedback is outdated compared to existing feedback.
     */
    private OffsetDateTime feedbackGeneratedAt;

    /**
     * If the feedback state is `requires_action`, then you can send a string message
     * that communicates the action to be taken by the merchant.
     * The string must be a single message up to 100 characters long and must end with a period.
     * You need to adhere to the message formatting rules or your requests will fail:
     * - `[Explanation of the problem]. [Suggested action].`
     *   
     * **Examples:**
     * - `[Your app name]` isn't connected. Connect your account to use this sales channel. `[Learn more]`
     * - `[Your app name]` isn't configured. Agree to the terms and conditions to use this app. `[Learn more]`
     * Both `Your app name` and `Learn more` (a button which directs merchants to
     * your app) are automatically populated in the Shopify admin.
     */
    private List<String> messages;

    /**
     * The state of the feedback and whether it requires merchant action.
     */
    private ResourceFeedbackState state;

    public ResourceFeedbackCreateInput build() {
      ResourceFeedbackCreateInput result = new ResourceFeedbackCreateInput();
      result.feedbackGeneratedAt = this.feedbackGeneratedAt;
      result.messages = this.messages;
      result.state = this.state;
      return result;
    }

    /**
     * The date and time when the feedback was generated. Used to help determine whether
     * incoming feedback is outdated compared to existing feedback.
     */
    public Builder feedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
      this.feedbackGeneratedAt = feedbackGeneratedAt;
      return this;
    }

    /**
     * If the feedback state is `requires_action`, then you can send a string message
     * that communicates the action to be taken by the merchant.
     * The string must be a single message up to 100 characters long and must end with a period.
     * You need to adhere to the message formatting rules or your requests will fail:
     * - `[Explanation of the problem]. [Suggested action].`
     *   
     * **Examples:**
     * - `[Your app name]` isn't connected. Connect your account to use this sales channel. `[Learn more]`
     * - `[Your app name]` isn't configured. Agree to the terms and conditions to use this app. `[Learn more]`
     * Both `Your app name` and `Learn more` (a button which directs merchants to
     * your app) are automatically populated in the Shopify admin.
     */
    public Builder messages(List<String> messages) {
      this.messages = messages;
      return this;
    }

    /**
     * The state of the feedback and whether it requires merchant action.
     */
    public Builder state(ResourceFeedbackState state) {
      this.state = state;
      return this;
    }
  }
}
