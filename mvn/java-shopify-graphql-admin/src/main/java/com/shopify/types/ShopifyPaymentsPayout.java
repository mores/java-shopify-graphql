package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Payouts represent the movement of money between a merchant's Shopify
 * Payments balance and their bank account.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopifyPaymentsPayout implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  /**
   * The bank account for the payout.
   */
  private ShopifyPaymentsBankAccount bankAccount;

  /**
   * The business entity associated with the payout.
   */
  private BusinessEntity businessEntity;

  /**
   * The total amount and currency of the payout.
   */
  private MoneyV2 gross;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The exact time when the payout was issued. The payout only contains
   * balance transactions that were available at this time.
   */
  private OffsetDateTime issuedAt;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The total amount and currency of the payout.
   */
  private MoneyV2 net;

  /**
   * The transfer status of the payout.
   */
  private ShopifyPaymentsPayoutStatus status;

  /**
   * The summary of the payout.
   */
  private ShopifyPaymentsPayoutSummary summary;

  /**
   * The direction of the payout.
   */
  private ShopifyPaymentsPayoutTransactionType transactionType;

  public ShopifyPaymentsPayout() {
  }

  /**
   * The bank account for the payout.
   */
  public ShopifyPaymentsBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(ShopifyPaymentsBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  /**
   * The business entity associated with the payout.
   */
  public BusinessEntity getBusinessEntity() {
    return businessEntity;
  }

  public void setBusinessEntity(BusinessEntity businessEntity) {
    this.businessEntity = businessEntity;
  }

  /**
   * The total amount and currency of the payout.
   */
  public MoneyV2 getGross() {
    return gross;
  }

  public void setGross(MoneyV2 gross) {
    this.gross = gross;
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
   * The exact time when the payout was issued. The payout only contains
   * balance transactions that were available at this time.
   */
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
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
   * The total amount and currency of the payout.
   */
  public MoneyV2 getNet() {
    return net;
  }

  public void setNet(MoneyV2 net) {
    this.net = net;
  }

  /**
   * The transfer status of the payout.
   */
  public ShopifyPaymentsPayoutStatus getStatus() {
    return status;
  }

  public void setStatus(ShopifyPaymentsPayoutStatus status) {
    this.status = status;
  }

  /**
   * The summary of the payout.
   */
  public ShopifyPaymentsPayoutSummary getSummary() {
    return summary;
  }

  public void setSummary(ShopifyPaymentsPayoutSummary summary) {
    this.summary = summary;
  }

  /**
   * The direction of the payout.
   */
  public ShopifyPaymentsPayoutTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(ShopifyPaymentsPayoutTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsPayout{bankAccount='" + bankAccount + "', businessEntity='" + businessEntity + "', gross='" + gross + "', id='" + id + "', issuedAt='" + issuedAt + "', legacyResourceId='" + legacyResourceId + "', net='" + net + "', status='" + status + "', summary='" + summary + "', transactionType='" + transactionType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsPayout that = (ShopifyPaymentsPayout) o;
    return Objects.equals(bankAccount, that.bankAccount) &&
        Objects.equals(businessEntity, that.businessEntity) &&
        Objects.equals(gross, that.gross) &&
        Objects.equals(id, that.id) &&
        Objects.equals(issuedAt, that.issuedAt) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(net, that.net) &&
        Objects.equals(status, that.status) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(transactionType, that.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, businessEntity, gross, id, issuedAt, legacyResourceId, net, status, summary, transactionType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The bank account for the payout.
     */
    private ShopifyPaymentsBankAccount bankAccount;

    /**
     * The business entity associated with the payout.
     */
    private BusinessEntity businessEntity;

    /**
     * The total amount and currency of the payout.
     */
    private MoneyV2 gross;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The exact time when the payout was issued. The payout only contains
     * balance transactions that were available at this time.
     */
    private OffsetDateTime issuedAt;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The total amount and currency of the payout.
     */
    private MoneyV2 net;

    /**
     * The transfer status of the payout.
     */
    private ShopifyPaymentsPayoutStatus status;

    /**
     * The summary of the payout.
     */
    private ShopifyPaymentsPayoutSummary summary;

    /**
     * The direction of the payout.
     */
    private ShopifyPaymentsPayoutTransactionType transactionType;

    public ShopifyPaymentsPayout build() {
      ShopifyPaymentsPayout result = new ShopifyPaymentsPayout();
      result.bankAccount = this.bankAccount;
      result.businessEntity = this.businessEntity;
      result.gross = this.gross;
      result.id = this.id;
      result.issuedAt = this.issuedAt;
      result.legacyResourceId = this.legacyResourceId;
      result.net = this.net;
      result.status = this.status;
      result.summary = this.summary;
      result.transactionType = this.transactionType;
      return result;
    }

    /**
     * The bank account for the payout.
     */
    public Builder bankAccount(ShopifyPaymentsBankAccount bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    /**
     * The business entity associated with the payout.
     */
    public Builder businessEntity(BusinessEntity businessEntity) {
      this.businessEntity = businessEntity;
      return this;
    }

    /**
     * The total amount and currency of the payout.
     */
    public Builder gross(MoneyV2 gross) {
      this.gross = gross;
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
     * The exact time when the payout was issued. The payout only contains
     * balance transactions that were available at this time.
     */
    public Builder issuedAt(OffsetDateTime issuedAt) {
      this.issuedAt = issuedAt;
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
     * The total amount and currency of the payout.
     */
    public Builder net(MoneyV2 net) {
      this.net = net;
      return this;
    }

    /**
     * The transfer status of the payout.
     */
    public Builder status(ShopifyPaymentsPayoutStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The summary of the payout.
     */
    public Builder summary(ShopifyPaymentsPayoutSummary summary) {
      this.summary = summary;
      return this;
    }

    /**
     * The direction of the payout.
     */
    public Builder transactionType(ShopifyPaymentsPayoutTransactionType transactionType) {
      this.transactionType = transactionType;
      return this;
    }
  }
}
