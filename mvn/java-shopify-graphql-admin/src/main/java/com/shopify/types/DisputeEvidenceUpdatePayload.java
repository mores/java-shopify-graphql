package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DisputeEvidenceUpdatePayload {
  
  private ShopifyPaymentsDisputeEvidence disputeEvidence;

  
  private List<DisputeEvidenceUpdateUserError> userErrors;

  public DisputeEvidenceUpdatePayload() {
  }

  
  public ShopifyPaymentsDisputeEvidence getDisputeEvidence() {
    return disputeEvidence;
  }

  public void setDisputeEvidence(ShopifyPaymentsDisputeEvidence disputeEvidence) {
    this.disputeEvidence = disputeEvidence;
  }

  
  public List<DisputeEvidenceUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DisputeEvidenceUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DisputeEvidenceUpdatePayload{disputeEvidence='" + disputeEvidence + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DisputeEvidenceUpdatePayload that = (DisputeEvidenceUpdatePayload) o;
    return Objects.equals(disputeEvidence, that.disputeEvidence) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputeEvidence, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ShopifyPaymentsDisputeEvidence disputeEvidence;

    
    private List<DisputeEvidenceUpdateUserError> userErrors;

    public DisputeEvidenceUpdatePayload build() {
      DisputeEvidenceUpdatePayload result = new DisputeEvidenceUpdatePayload();
      result.disputeEvidence = this.disputeEvidence;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder disputeEvidence(ShopifyPaymentsDisputeEvidence disputeEvidence) {
      this.disputeEvidence = disputeEvidence;
      return this;
    }

    
    public Builder userErrors(List<DisputeEvidenceUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
