package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class ProductResourceFeedbackInput {
  
  private String productId;

  
  private ResourceFeedbackState state;

  
  private OffsetDateTime feedbackGeneratedAt;

  
  private OffsetDateTime productUpdatedAt;

  
  private List<String> messages;

  public ProductResourceFeedbackInput() {
  }

  
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  public ResourceFeedbackState getState() {
    return state;
  }

  public void setState(ResourceFeedbackState state) {
    this.state = state;
  }

  
  public OffsetDateTime getFeedbackGeneratedAt() {
    return feedbackGeneratedAt;
  }

  public void setFeedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
    this.feedbackGeneratedAt = feedbackGeneratedAt;
  }

  
  public OffsetDateTime getProductUpdatedAt() {
    return productUpdatedAt;
  }

  public void setProductUpdatedAt(OffsetDateTime productUpdatedAt) {
    this.productUpdatedAt = productUpdatedAt;
  }

  
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
    
    private String productId;

    
    private ResourceFeedbackState state;

    
    private OffsetDateTime feedbackGeneratedAt;

    
    private OffsetDateTime productUpdatedAt;

    
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

    
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    
    public Builder state(ResourceFeedbackState state) {
      this.state = state;
      return this;
    }

    
    public Builder feedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
      this.feedbackGeneratedAt = feedbackGeneratedAt;
      return this;
    }

    
    public Builder productUpdatedAt(OffsetDateTime productUpdatedAt) {
      this.productUpdatedAt = productUpdatedAt;
      return this;
    }

    
    public Builder messages(List<String> messages) {
      this.messages = messages;
      return this;
    }
  }
}
