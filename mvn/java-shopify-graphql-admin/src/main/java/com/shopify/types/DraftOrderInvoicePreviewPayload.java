package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DraftOrderInvoicePreviewPayload {
  
  private String previewHtml;

  
  private String previewSubject;

  
  private List<UserError> userErrors;

  public DraftOrderInvoicePreviewPayload() {
  }

  
  public String getPreviewHtml() {
    return previewHtml;
  }

  public void setPreviewHtml(String previewHtml) {
    this.previewHtml = previewHtml;
  }

  
  public String getPreviewSubject() {
    return previewSubject;
  }

  public void setPreviewSubject(String previewSubject) {
    this.previewSubject = previewSubject;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DraftOrderInvoicePreviewPayload{previewHtml='" + previewHtml + "', previewSubject='" + previewSubject + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderInvoicePreviewPayload that = (DraftOrderInvoicePreviewPayload) o;
    return Objects.equals(previewHtml, that.previewHtml) &&
        Objects.equals(previewSubject, that.previewSubject) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previewHtml, previewSubject, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String previewHtml;

    
    private String previewSubject;

    
    private List<UserError> userErrors;

    public DraftOrderInvoicePreviewPayload build() {
      DraftOrderInvoicePreviewPayload result = new DraftOrderInvoicePreviewPayload();
      result.previewHtml = this.previewHtml;
      result.previewSubject = this.previewSubject;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder previewHtml(String previewHtml) {
      this.previewHtml = previewHtml;
      return this;
    }

    
    public Builder previewSubject(String previewSubject) {
      this.previewSubject = previewSubject;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
