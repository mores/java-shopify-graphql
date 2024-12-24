package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentOrderMergeInput {
  
  private List<FulfillmentOrderMergeInputMergeIntent> mergeIntents;

  public FulfillmentOrderMergeInput() {
  }

  
  public List<FulfillmentOrderMergeInputMergeIntent> getMergeIntents() {
    return mergeIntents;
  }

  public void setMergeIntents(List<FulfillmentOrderMergeInputMergeIntent> mergeIntents) {
    this.mergeIntents = mergeIntents;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderMergeInput{mergeIntents='" + mergeIntents + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderMergeInput that = (FulfillmentOrderMergeInput) o;
    return Objects.equals(mergeIntents, that.mergeIntents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergeIntents);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<FulfillmentOrderMergeInputMergeIntent> mergeIntents;

    public FulfillmentOrderMergeInput build() {
      FulfillmentOrderMergeInput result = new FulfillmentOrderMergeInput();
      result.mergeIntents = this.mergeIntents;
      return result;
    }

    
    public Builder mergeIntents(List<FulfillmentOrderMergeInputMergeIntent> mergeIntents) {
      this.mergeIntents = mergeIntents;
      return this;
    }
  }
}
