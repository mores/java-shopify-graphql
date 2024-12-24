package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ShopResourceFeedbackCreatePayload {
  
  private AppFeedback feedback;

  
  private List<ShopResourceFeedbackCreateUserError> userErrors;

  public ShopResourceFeedbackCreatePayload() {
  }

  
  public AppFeedback getFeedback() {
    return feedback;
  }

  public void setFeedback(AppFeedback feedback) {
    this.feedback = feedback;
  }

  
  public List<ShopResourceFeedbackCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ShopResourceFeedbackCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ShopResourceFeedbackCreatePayload{feedback='" + feedback + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopResourceFeedbackCreatePayload that = (ShopResourceFeedbackCreatePayload) o;
    return Objects.equals(feedback, that.feedback) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedback, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private AppFeedback feedback;

    
    private List<ShopResourceFeedbackCreateUserError> userErrors;

    public ShopResourceFeedbackCreatePayload build() {
      ShopResourceFeedbackCreatePayload result = new ShopResourceFeedbackCreatePayload();
      result.feedback = this.feedback;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder feedback(AppFeedback feedback) {
      this.feedback = feedback;
      return this;
    }

    
    public Builder userErrors(List<ShopResourceFeedbackCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
