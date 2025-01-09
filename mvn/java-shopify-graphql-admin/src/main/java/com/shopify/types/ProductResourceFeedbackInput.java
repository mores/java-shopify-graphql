package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The input fields used to create a product feedback.
 */
public class ProductResourceFeedbackInput {
  /**
   * The ID of the product that the feedback was created on.
   */
  private String productId;

  /**
   * Whether the merchant needs to take action on the product.
   */
  private ResourceFeedbackState state;

  /**
   * The date and time when the payload is constructed.
   * Used to help determine whether incoming feedback is outdated compared to
   * feedback already received, and if it should be ignored upon arrival.
   */
  private OffsetDateTime feedbackGeneratedAt;

  /**
   * The timestamp of the product associated with the feedback.
   */
  private OffsetDateTime productUpdatedAt;

  /**
   * A concise set of copy strings to be displayed to merchants. Used to guide
   * merchants in resolving problems that your app encounters when trying to make
   * use of their products.
   * You can specify up to four messages. Each message is limited to 100 characters.
   */
  private List<String> messages;

  public ProductResourceFeedbackInput() {
  }

  /**
   * The ID of the product that the feedback was created on.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * Whether the merchant needs to take action on the product.
   */
  public ResourceFeedbackState getState() {
    return state;
  }

  public void setState(ResourceFeedbackState state) {
    this.state = state;
  }

  /**
   * The date and time when the payload is constructed.
   * Used to help determine whether incoming feedback is outdated compared to
   * feedback already received, and if it should be ignored upon arrival.
   */
  public OffsetDateTime getFeedbackGeneratedAt() {
    return feedbackGeneratedAt;
  }

  public void setFeedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
    this.feedbackGeneratedAt = feedbackGeneratedAt;
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
   * A concise set of copy strings to be displayed to merchants. Used to guide
   * merchants in resolving problems that your app encounters when trying to make
   * use of their products.
   * You can specify up to four messages. Each message is limited to 100 characters.
   */
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  @Override
  public String toString() {
    return "ProductResourceFeedbackInput{productId='" + productId + "', state='" + state + "', feedbackGeneratedAt='" + feedbackGeneratedAt + "', productUpdatedAt='" + productUpdatedAt + "', messages='" + messages + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductResourceFeedbackInput that = (ProductResourceFeedbackInput) o;
    return Objects.equals(productId, that.productId) &&
        Objects.equals(state, that.state) &&
        Objects.equals(feedbackGeneratedAt, that.feedbackGeneratedAt) &&
        Objects.equals(productUpdatedAt, that.productUpdatedAt) &&
        Objects.equals(messages, that.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, state, feedbackGeneratedAt, productUpdatedAt, messages);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product that the feedback was created on.
     */
    private String productId;

    /**
     * Whether the merchant needs to take action on the product.
     */
    private ResourceFeedbackState state;

    /**
     * The date and time when the payload is constructed.
     * Used to help determine whether incoming feedback is outdated compared to
     * feedback already received, and if it should be ignored upon arrival.
     */
    private OffsetDateTime feedbackGeneratedAt;

    /**
     * The timestamp of the product associated with the feedback.
     */
    private OffsetDateTime productUpdatedAt;

    /**
     * A concise set of copy strings to be displayed to merchants. Used to guide
     * merchants in resolving problems that your app encounters when trying to make
     * use of their products.
     * You can specify up to four messages. Each message is limited to 100 characters.
     */
    private List<String> messages;

    public ProductResourceFeedbackInput build() {
      ProductResourceFeedbackInput result = new ProductResourceFeedbackInput();
      result.productId = this.productId;
      result.state = this.state;
      result.feedbackGeneratedAt = this.feedbackGeneratedAt;
      result.productUpdatedAt = this.productUpdatedAt;
      result.messages = this.messages;
      return result;
    }

    /**
     * The ID of the product that the feedback was created on.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Whether the merchant needs to take action on the product.
     */
    public Builder state(ResourceFeedbackState state) {
      this.state = state;
      return this;
    }

    /**
     * The date and time when the payload is constructed.
     * Used to help determine whether incoming feedback is outdated compared to
     * feedback already received, and if it should be ignored upon arrival.
     */
    public Builder feedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
      this.feedbackGeneratedAt = feedbackGeneratedAt;
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
     * A concise set of copy strings to be displayed to merchants. Used to guide
     * merchants in resolving problems that your app encounters when trying to make
     * use of their products.
     * You can specify up to four messages. Each message is limited to 100 characters.
     */
    public Builder messages(List<String> messages) {
      this.messages = messages;
      return this;
    }
  }
}
