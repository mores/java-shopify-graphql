package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ReturnApproveRequestPayload {
  
  private Return _return;

  
  private List<ReturnUserError> userErrors;

  public ReturnApproveRequestPayload() {
  }

  
  public Return getReturn() {
    return _return;
  }

  public void setReturn(Return _return) {
    this._return = _return;
  }

  
  public List<ReturnUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ReturnUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ReturnApproveRequestPayload{return='" + _return + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnApproveRequestPayload that = (ReturnApproveRequestPayload) o;
    return Objects.equals(_return, that._return) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_return, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Return _return;

    
    private List<ReturnUserError> userErrors;

    public ReturnApproveRequestPayload build() {
      ReturnApproveRequestPayload result = new ReturnApproveRequestPayload();
      result._return = this._return;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder _return(Return _return) {
      this._return = _return;
      return this;
    }

    
    public Builder userErrors(List<ReturnUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
