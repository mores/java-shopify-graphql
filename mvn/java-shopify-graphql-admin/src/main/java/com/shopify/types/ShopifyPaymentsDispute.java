package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsDispute implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private MoneyV2 amount;

  
  private LocalDate evidenceDueBy;

  
  private LocalDate evidenceSentOn;

  
  private LocalDate finalizedOn;

  
  private String id;

  
  private OffsetDateTime initiatedAt;

  
  private String legacyResourceId;

  
  private Order order;

  
  private ShopifyPaymentsDisputeReasonDetails reasonDetails;

  
  private DisputeStatus status;

  
  private DisputeType type;

  public ShopifyPaymentsDispute() {
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  
  public LocalDate getEvidenceDueBy() {
    return evidenceDueBy;
  }

  public void setEvidenceDueBy(LocalDate evidenceDueBy) {
    this.evidenceDueBy = evidenceDueBy;
  }

  
  public LocalDate getEvidenceSentOn() {
    return evidenceSentOn;
  }

  public void setEvidenceSentOn(LocalDate evidenceSentOn) {
    this.evidenceSentOn = evidenceSentOn;
  }

  
  public LocalDate getFinalizedOn() {
    return finalizedOn;
  }

  public void setFinalizedOn(LocalDate finalizedOn) {
    this.finalizedOn = finalizedOn;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public OffsetDateTime getInitiatedAt() {
    return initiatedAt;
  }

  public void setInitiatedAt(OffsetDateTime initiatedAt) {
    this.initiatedAt = initiatedAt;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public ShopifyPaymentsDisputeReasonDetails getReasonDetails() {
    return reasonDetails;
  }

  public void setReasonDetails(ShopifyPaymentsDisputeReasonDetails reasonDetails) {
    this.reasonDetails = reasonDetails;
  }

  
  public DisputeStatus getStatus() {
    return status;
  }

  public void setStatus(DisputeStatus status) {
    this.status = status;
  }

  
  public DisputeType getType() {
    return type;
  }

  public void setType(DisputeType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsDispute{amount='" + amount + "', evidenceDueBy='" + evidenceDueBy + "', evidenceSentOn='" + evidenceSentOn + "', finalizedOn='" + finalizedOn + "', id='" + id + "', initiatedAt='" + initiatedAt + "', legacyResourceId='" + legacyResourceId + "', order='" + order + "', reasonDetails='" + reasonDetails + "', status='" + status + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsDispute that = (ShopifyPaymentsDispute) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(evidenceDueBy, that.evidenceDueBy) &&
        Objects.equals(evidenceSentOn, that.evidenceSentOn) &&
        Objects.equals(finalizedOn, that.finalizedOn) &&
        Objects.equals(id, that.id) &&
        Objects.equals(initiatedAt, that.initiatedAt) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(order, that.order) &&
        Objects.equals(reasonDetails, that.reasonDetails) &&
        Objects.equals(status, that.status) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, evidenceDueBy, evidenceSentOn, finalizedOn, id, initiatedAt, legacyResourceId, order, reasonDetails, status, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 amount;

    
    private LocalDate evidenceDueBy;

    
    private LocalDate evidenceSentOn;

    
    private LocalDate finalizedOn;

    
    private String id;

    
    private OffsetDateTime initiatedAt;

    
    private String legacyResourceId;

    
    private Order order;

    
    private ShopifyPaymentsDisputeReasonDetails reasonDetails;

    
    private DisputeStatus status;

    
    private DisputeType type;

    public ShopifyPaymentsDispute build() {
      ShopifyPaymentsDispute result = new ShopifyPaymentsDispute();
      result.amount = this.amount;
      result.evidenceDueBy = this.evidenceDueBy;
      result.evidenceSentOn = this.evidenceSentOn;
      result.finalizedOn = this.finalizedOn;
      result.id = this.id;
      result.initiatedAt = this.initiatedAt;
      result.legacyResourceId = this.legacyResourceId;
      result.order = this.order;
      result.reasonDetails = this.reasonDetails;
      result.status = this.status;
      result.type = this.type;
      return result;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder evidenceDueBy(LocalDate evidenceDueBy) {
      this.evidenceDueBy = evidenceDueBy;
      return this;
    }

    
    public Builder evidenceSentOn(LocalDate evidenceSentOn) {
      this.evidenceSentOn = evidenceSentOn;
      return this;
    }

    
    public Builder finalizedOn(LocalDate finalizedOn) {
      this.finalizedOn = finalizedOn;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder initiatedAt(OffsetDateTime initiatedAt) {
      this.initiatedAt = initiatedAt;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder reasonDetails(ShopifyPaymentsDisputeReasonDetails reasonDetails) {
      this.reasonDetails = reasonDetails;
      return this;
    }

    
    public Builder status(DisputeStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder type(DisputeType type) {
      this.type = type;
      return this;
    }
  }
}
