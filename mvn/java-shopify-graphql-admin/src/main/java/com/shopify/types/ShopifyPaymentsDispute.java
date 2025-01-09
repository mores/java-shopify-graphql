package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A dispute occurs when a buyer questions the legitimacy of a charge with their financial institution.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsDispute implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  /**
   * The total amount disputed by the cardholder.
   */
  private MoneyV2 amount;

  /**
   * The deadline for evidence submission.
   */
  private LocalDate evidenceDueBy;

  /**
   * The date when evidence was sent. Returns null if evidence hasn't yet been sent.
   */
  private LocalDate evidenceSentOn;

  /**
   * The date when this dispute was resolved. Returns null if the dispute isn't yet resolved.
   */
  private LocalDate finalizedOn;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The date when this dispute was initiated.
   */
  private OffsetDateTime initiatedAt;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The order that contains the charge that's under dispute.
   */
  private Order order;

  /**
   * The reason of the dispute.
   */
  private ShopifyPaymentsDisputeReasonDetails reasonDetails;

  /**
   * The current state of the dispute.
   */
  private DisputeStatus status;

  /**
   * Indicates if this dispute is still in the inquiry phase or has turned into a chargeback.
   */
  private DisputeType type;

  public ShopifyPaymentsDispute() {
  }

  /**
   * The total amount disputed by the cardholder.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * The deadline for evidence submission.
   */
  public LocalDate getEvidenceDueBy() {
    return evidenceDueBy;
  }

  public void setEvidenceDueBy(LocalDate evidenceDueBy) {
    this.evidenceDueBy = evidenceDueBy;
  }

  /**
   * The date when evidence was sent. Returns null if evidence hasn't yet been sent.
   */
  public LocalDate getEvidenceSentOn() {
    return evidenceSentOn;
  }

  public void setEvidenceSentOn(LocalDate evidenceSentOn) {
    this.evidenceSentOn = evidenceSentOn;
  }

  /**
   * The date when this dispute was resolved. Returns null if the dispute isn't yet resolved.
   */
  public LocalDate getFinalizedOn() {
    return finalizedOn;
  }

  public void setFinalizedOn(LocalDate finalizedOn) {
    this.finalizedOn = finalizedOn;
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
   * The date when this dispute was initiated.
   */
  public OffsetDateTime getInitiatedAt() {
    return initiatedAt;
  }

  public void setInitiatedAt(OffsetDateTime initiatedAt) {
    this.initiatedAt = initiatedAt;
  }

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The order that contains the charge that's under dispute.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The reason of the dispute.
   */
  public ShopifyPaymentsDisputeReasonDetails getReasonDetails() {
    return reasonDetails;
  }

  public void setReasonDetails(ShopifyPaymentsDisputeReasonDetails reasonDetails) {
    this.reasonDetails = reasonDetails;
  }

  /**
   * The current state of the dispute.
   */
  public DisputeStatus getStatus() {
    return status;
  }

  public void setStatus(DisputeStatus status) {
    this.status = status;
  }

  /**
   * Indicates if this dispute is still in the inquiry phase or has turned into a chargeback.
   */
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
    /**
     * The total amount disputed by the cardholder.
     */
    private MoneyV2 amount;

    /**
     * The deadline for evidence submission.
     */
    private LocalDate evidenceDueBy;

    /**
     * The date when evidence was sent. Returns null if evidence hasn't yet been sent.
     */
    private LocalDate evidenceSentOn;

    /**
     * The date when this dispute was resolved. Returns null if the dispute isn't yet resolved.
     */
    private LocalDate finalizedOn;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The date when this dispute was initiated.
     */
    private OffsetDateTime initiatedAt;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The order that contains the charge that's under dispute.
     */
    private Order order;

    /**
     * The reason of the dispute.
     */
    private ShopifyPaymentsDisputeReasonDetails reasonDetails;

    /**
     * The current state of the dispute.
     */
    private DisputeStatus status;

    /**
     * Indicates if this dispute is still in the inquiry phase or has turned into a chargeback.
     */
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

    /**
     * The total amount disputed by the cardholder.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The deadline for evidence submission.
     */
    public Builder evidenceDueBy(LocalDate evidenceDueBy) {
      this.evidenceDueBy = evidenceDueBy;
      return this;
    }

    /**
     * The date when evidence was sent. Returns null if evidence hasn't yet been sent.
     */
    public Builder evidenceSentOn(LocalDate evidenceSentOn) {
      this.evidenceSentOn = evidenceSentOn;
      return this;
    }

    /**
     * The date when this dispute was resolved. Returns null if the dispute isn't yet resolved.
     */
    public Builder finalizedOn(LocalDate finalizedOn) {
      this.finalizedOn = finalizedOn;
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
     * The date when this dispute was initiated.
     */
    public Builder initiatedAt(OffsetDateTime initiatedAt) {
      this.initiatedAt = initiatedAt;
      return this;
    }

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The order that contains the charge that's under dispute.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The reason of the dispute.
     */
    public Builder reasonDetails(ShopifyPaymentsDisputeReasonDetails reasonDetails) {
      this.reasonDetails = reasonDetails;
      return this;
    }

    /**
     * The current state of the dispute.
     */
    public Builder status(DisputeStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Indicates if this dispute is still in the inquiry phase or has turned into a chargeback.
     */
    public Builder type(DisputeType type) {
      this.type = type;
      return this;
    }
  }
}
