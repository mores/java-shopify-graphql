package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryMethod implements com.shopify.types.Node {
  
  private DeliveryMethodAdditionalInformation additionalInformation;

  
  private DeliveryBrandedPromise brandedPromise;

  
  private String id;

  
  private OffsetDateTime maxDeliveryDateTime;

  
  private DeliveryMethodType methodType;

  
  private OffsetDateTime minDeliveryDateTime;

  
  private String presentedName;

  
  private String serviceCode;

  
  private String sourceReference;

  public DeliveryMethod() {
  }

  
  public DeliveryMethodAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(DeliveryMethodAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  
  public DeliveryBrandedPromise getBrandedPromise() {
    return brandedPromise;
  }

  public void setBrandedPromise(DeliveryBrandedPromise brandedPromise) {
    this.brandedPromise = brandedPromise;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public OffsetDateTime getMaxDeliveryDateTime() {
    return maxDeliveryDateTime;
  }

  public void setMaxDeliveryDateTime(OffsetDateTime maxDeliveryDateTime) {
    this.maxDeliveryDateTime = maxDeliveryDateTime;
  }

  
  public DeliveryMethodType getMethodType() {
    return methodType;
  }

  public void setMethodType(DeliveryMethodType methodType) {
    this.methodType = methodType;
  }

  
  public OffsetDateTime getMinDeliveryDateTime() {
    return minDeliveryDateTime;
  }

  public void setMinDeliveryDateTime(OffsetDateTime minDeliveryDateTime) {
    this.minDeliveryDateTime = minDeliveryDateTime;
  }

  
  public String getPresentedName() {
    return presentedName;
  }

  public void setPresentedName(String presentedName) {
    this.presentedName = presentedName;
  }

  
  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  
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
    
    private DeliveryMethodAdditionalInformation additionalInformation;

    
    private DeliveryBrandedPromise brandedPromise;

    
    private String id;

    
    private OffsetDateTime maxDeliveryDateTime;

    
    private DeliveryMethodType methodType;

    
    private OffsetDateTime minDeliveryDateTime;

    
    private String presentedName;

    
    private String serviceCode;

    
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

    
    public Builder additionalInformation(
        DeliveryMethodAdditionalInformation additionalInformation) {
      this.additionalInformation = additionalInformation;
      return this;
    }

    
    public Builder brandedPromise(DeliveryBrandedPromise brandedPromise) {
      this.brandedPromise = brandedPromise;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder maxDeliveryDateTime(OffsetDateTime maxDeliveryDateTime) {
      this.maxDeliveryDateTime = maxDeliveryDateTime;
      return this;
    }

    
    public Builder methodType(DeliveryMethodType methodType) {
      this.methodType = methodType;
      return this;
    }

    
    public Builder minDeliveryDateTime(OffsetDateTime minDeliveryDateTime) {
      this.minDeliveryDateTime = minDeliveryDateTime;
      return this;
    }

    
    public Builder presentedName(String presentedName) {
      this.presentedName = presentedName;
      return this;
    }

    
    public Builder serviceCode(String serviceCode) {
      this.serviceCode = serviceCode;
      return this;
    }

    
    public Builder sourceReference(String sourceReference) {
      this.sourceReference = sourceReference;
      return this;
    }
  }
}
