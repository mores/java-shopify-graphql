package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Reports the status of product for a Sales Channel or Storefront API.
 * This might include why a product is not available in a Sales Channel
 * and how a merchant might fix this.
 */
public class ProductResourceFeedback {
  /**
   * The time when the feedback was generated. Used to help determine whether
   * incoming feedback is outdated compared to existing feedback.
   */
  private OffsetDateTime feedbackGeneratedAt;

  /**
   * The feedback messages presented to the merchant.
   */
  private List<String> messages;

  /**
   * The ID of the product associated with the feedback.
   */
  private String productId;

  /**
   * The timestamp of the product associated with the feedback.
   */
  private OffsetDateTime productUpdatedAt;

  /**
   * Conveys the state of the feedback and whether it requires merchant action or not.
   */
  private ResourceFeedbackState state;

  public ProductResourceFeedback() {
  }

  /**
   * The time when the feedback was generated. Used to help determine whether
   * incoming feedback is outdated compared to existing feedback.
   */
  public OffsetDateTime getFeedbackGeneratedAt() {
    return feedbackGeneratedAt;
  }

  public void setFeedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
    this.feedbackGeneratedAt = feedbackGeneratedAt;
  }

  /**
   * The feedback messages presented to the merchant.
   */
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  /**
   * The ID of the product associated with the feedback.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * The timestamp of the product associated with the feedback.
   */
  public OffsetDateTime getProductUpdatedAt() {
    return productUpdatedAt;
  }

  public void setProductUpdatedAt(OffsetDateTime productUpdatedAt) {
    this.productUpdatedAt = productUpdatedAt;
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
    return "ProductResourceFeedback{feedbackGeneratedAt='" + feedbackGeneratedAt + "', messages='" + messages + "', productId='" + productId + "', productUpdatedAt='" + productUpdatedAt + "', state='" + state + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductResourceFeedback that = (ProductResourceFeedback) o;
    return Objects.equals(feedbackGeneratedAt, that.feedbackGeneratedAt) &&
        Objects.equals(messages, that.messages) &&
        Objects.equals(productId, that.productId) &&
        Objects.equals(productUpdatedAt, that.productUpdatedAt) &&
        Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackGeneratedAt, messages, productId, productUpdatedAt, state);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The time when the feedback was generated. Used to help determine whether
     * incoming feedback is outdated compared to existing feedback.
     */
    private OffsetDateTime feedbackGeneratedAt;

    /**
     * The feedback messages presented to the merchant.
     */
    private List<String> messages;

    /**
     * The ID of the product associated with the feedback.
     */
    private String productId;

    /**
     * The timestamp of the product associated with the feedback.
     */
    private OffsetDateTime productUpdatedAt;

    /**
     * Conveys the state of the feedback and whether it requires merchant action or not.
     */
    private ResourceFeedbackState state;

    public ProductResourceFeedback build() {
      ProductResourceFeedback result = new ProductResourceFeedback();
      result.feedbackGeneratedAt = this.feedbackGeneratedAt;
      result.messages = this.messages;
      result.productId = this.productId;
      result.productUpdatedAt = this.productUpdatedAt;
      result.state = this.state;
      return result;
    }

    /**
     * The time when the feedback was generated. Used to help determine whether
     * incoming feedback is outdated compared to existing feedback.
     */
    public Builder feedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
      this.feedbackGeneratedAt = feedbackGeneratedAt;
      return this;
    }

    /**
     * The feedback messages presented to the merchant.
     */
    public Builder messages(List<String> messages) {
      this.messages = messages;
      return this;
    }

    /**
     * The ID of the product associated with the feedback.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * The timestamp of the product associated with the feedback.
     */
    public Builder productUpdatedAt(OffsetDateTime productUpdatedAt) {
      this.productUpdatedAt = productUpdatedAt;
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
