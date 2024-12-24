package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReverseDeliveryShippingDeliverable implements ReverseDeliveryDeliverable {
  
  private ReverseDeliveryLabelV2 label;

  
  private ReverseDeliveryTrackingV2 tracking;

  public ReverseDeliveryShippingDeliverable() {
  }

  
  public ReverseDeliveryLabelV2 getLabel() {
    return label;
  }

  public void setLabel(ReverseDeliveryLabelV2 label) {
    this.label = label;
  }

  
  public ReverseDeliveryTrackingV2 getTracking() {
    return tracking;
  }

  public void setTracking(ReverseDeliveryTrackingV2 tracking) {
    this.tracking = tracking;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryShippingDeliverable{label='" + label + "', tracking='" + tracking + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryShippingDeliverable that = (ReverseDeliveryShippingDeliverable) o;
    return Objects.equals(label, that.label) &&
        Objects.equals(tracking, that.tracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, tracking);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ReverseDeliveryLabelV2 label;

    
    private ReverseDeliveryTrackingV2 tracking;

    public ReverseDeliveryShippingDeliverable build() {
      ReverseDeliveryShippingDeliverable result = new ReverseDeliveryShippingDeliverable();
      result.label = this.label;
      result.tracking = this.tracking;
      return result;
    }

    
    public Builder label(ReverseDeliveryLabelV2 label) {
      this.label = label;
      return this;
    }

    
    public Builder tracking(ReverseDeliveryTrackingV2 tracking) {
      this.tracking = tracking;
      return this;
    }
  }
}
