package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The delivery method used by a fulfillment order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryMethod implements com.shopify.types.Node {
  /**
   * The Additional information to consider when performing the delivery.
   */
  private DeliveryMethodAdditionalInformation additionalInformation;

  /**
   * The branded promise that was presented to the buyer during checkout.  For example: Shop Promise.
   */
  private DeliveryBrandedPromise brandedPromise;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The latest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
   */
  private OffsetDateTime maxDeliveryDateTime;

  /**
   * The type of the delivery method.
   */
  private DeliveryMethodType methodType;

  /**
   * The earliest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
   */
  private OffsetDateTime minDeliveryDateTime;

  /**
   * The name of the delivery option that was presented to the buyer during checkout.
   */
  private String presentedName;

  /**
   * A reference to the shipping method.
   */
  private String serviceCode;

  /**
   * Source reference is promise provider specific data associated with delivery promise.
   */
  private String sourceReference;

  public DeliveryMethod() {
  }

  /**
   * The Additional information to consider when performing the delivery.
   */
  public DeliveryMethodAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(DeliveryMethodAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  /**
   * The branded promise that was presented to the buyer during checkout.  For example: Shop Promise.
   */
  public DeliveryBrandedPromise getBrandedPromise() {
    return brandedPromise;
  }

  public void setBrandedPromise(DeliveryBrandedPromise brandedPromise) {
    this.brandedPromise = brandedPromise;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The latest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
   */
  public OffsetDateTime getMaxDeliveryDateTime() {
    return maxDeliveryDateTime;
  }

  public void setMaxDeliveryDateTime(OffsetDateTime maxDeliveryDateTime) {
    this.maxDeliveryDateTime = maxDeliveryDateTime;
  }

  /**
   * The type of the delivery method.
   */
  public DeliveryMethodType getMethodType() {
    return methodType;
  }

  public void setMethodType(DeliveryMethodType methodType) {
    this.methodType = methodType;
  }

  /**
   * The earliest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
   */
  public OffsetDateTime getMinDeliveryDateTime() {
    return minDeliveryDateTime;
  }

  public void setMinDeliveryDateTime(OffsetDateTime minDeliveryDateTime) {
    this.minDeliveryDateTime = minDeliveryDateTime;
  }

  /**
   * The name of the delivery option that was presented to the buyer during checkout.
   */
  public String getPresentedName() {
    return presentedName;
  }

  public void setPresentedName(String presentedName) {
    this.presentedName = presentedName;
  }

  /**
   * A reference to the shipping method.
   */
  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  /**
   * Source reference is promise provider specific data associated with delivery promise.
   */
  public String getSourceReference() {
    return sourceReference;
  }

  public void setSourceReference(String sourceReference) {
    this.sourceReference = sourceReference;
  }

  @Override
  public String toString() {
    return "DeliveryMethod{additionalInformation='" + additionalInformation + "', brandedPromise='" + brandedPromise + "', id='" + id + "', maxDeliveryDateTime='" + maxDeliveryDateTime + "', methodType='" + methodType + "', minDeliveryDateTime='" + minDeliveryDateTime + "', presentedName='" + presentedName + "', serviceCode='" + serviceCode + "', sourceReference='" + sourceReference + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryMethod that = (DeliveryMethod) o;
    return Objects.equals(additionalInformation, that.additionalInformation) &&
        Objects.equals(brandedPromise, that.brandedPromise) &&
        Objects.equals(id, that.id) &&
        Objects.equals(maxDeliveryDateTime, that.maxDeliveryDateTime) &&
        Objects.equals(methodType, that.methodType) &&
        Objects.equals(minDeliveryDateTime, that.minDeliveryDateTime) &&
        Objects.equals(presentedName, that.presentedName) &&
        Objects.equals(serviceCode, that.serviceCode) &&
        Objects.equals(sourceReference, that.sourceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, brandedPromise, id, maxDeliveryDateTime, methodType, minDeliveryDateTime, presentedName, serviceCode, sourceReference);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The Additional information to consider when performing the delivery.
     */
    private DeliveryMethodAdditionalInformation additionalInformation;

    /**
     * The branded promise that was presented to the buyer during checkout.  For example: Shop Promise.
     */
    private DeliveryBrandedPromise brandedPromise;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The latest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
     */
    private OffsetDateTime maxDeliveryDateTime;

    /**
     * The type of the delivery method.
     */
    private DeliveryMethodType methodType;

    /**
     * The earliest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
     */
    private OffsetDateTime minDeliveryDateTime;

    /**
     * The name of the delivery option that was presented to the buyer during checkout.
     */
    private String presentedName;

    /**
     * A reference to the shipping method.
     */
    private String serviceCode;

    /**
     * Source reference is promise provider specific data associated with delivery promise.
     */
    private String sourceReference;

    public DeliveryMethod build() {
      DeliveryMethod result = new DeliveryMethod();
      result.additionalInformation = this.additionalInformation;
      result.brandedPromise = this.brandedPromise;
      result.id = this.id;
      result.maxDeliveryDateTime = this.maxDeliveryDateTime;
      result.methodType = this.methodType;
      result.minDeliveryDateTime = this.minDeliveryDateTime;
      result.presentedName = this.presentedName;
      result.serviceCode = this.serviceCode;
      result.sourceReference = this.sourceReference;
      return result;
    }

    /**
     * The Additional information to consider when performing the delivery.
     */
    public Builder additionalInformation(
        DeliveryMethodAdditionalInformation additionalInformation) {
      this.additionalInformation = additionalInformation;
      return this;
    }

    /**
     * The branded promise that was presented to the buyer during checkout.  For example: Shop Promise.
     */
    public Builder brandedPromise(DeliveryBrandedPromise brandedPromise) {
      this.brandedPromise = brandedPromise;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The latest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
     */
    public Builder maxDeliveryDateTime(OffsetDateTime maxDeliveryDateTime) {
      this.maxDeliveryDateTime = maxDeliveryDateTime;
      return this;
    }

    /**
     * The type of the delivery method.
     */
    public Builder methodType(DeliveryMethodType methodType) {
      this.methodType = methodType;
      return this;
    }

    /**
     * The earliest delivery date and time when the fulfillment is expected to arrive at the buyer's location.
     */
    public Builder minDeliveryDateTime(OffsetDateTime minDeliveryDateTime) {
      this.minDeliveryDateTime = minDeliveryDateTime;
      return this;
    }

    /**
     * The name of the delivery option that was presented to the buyer during checkout.
     */
    public Builder presentedName(String presentedName) {
      this.presentedName = presentedName;
      return this;
    }

    /**
     * A reference to the shipping method.
     */
    public Builder serviceCode(String serviceCode) {
      this.serviceCode = serviceCode;
      return this;
    }

    /**
     * Source reference is promise provider specific data associated with delivery promise.
     */
    public Builder sourceReference(String sourceReference) {
      this.sourceReference = sourceReference;
      return this;
    }
  }
}
