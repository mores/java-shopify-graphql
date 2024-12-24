package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class ProductResourceFeedback {
  
  private OffsetDateTime feedbackGeneratedAt;

  
  private List<String> messages;

  
  private String productId;

  
  private OffsetDateTime productUpdatedAt;

  
  private ResourceFeedbackState state;

  public ProductResourceFeedback() {
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

  
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  public OffsetDateTime getProductUpdatedAt() {
    return productUpdatedAt;
  }

  public void setProductUpdatedAt(OffsetDateTime productUpdatedAt) {
    this.productUpdatedAt = productUpdatedAt;
  }

  
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
    
    private OffsetDateTime feedbackGeneratedAt;

    
    private List<String> messages;

    
    private String productId;

    
    private OffsetDateTime productUpdatedAt;

    
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

    
    public Builder feedbackGeneratedAt(OffsetDateTime feedbackGeneratedAt) {
      this.feedbackGeneratedAt = feedbackGeneratedAt;
      return this;
    }

    
    public Builder messages(List<String> messages) {
      this.messages = messages;
      return this;
    }

    
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    
    public Builder productUpdatedAt(OffsetDateTime productUpdatedAt) {
      this.productUpdatedAt = productUpdatedAt;
      return this;
    }

    
    public Builder state(ResourceFeedbackState state) {
      this.state = state;
      return this;
    }
  }
}
