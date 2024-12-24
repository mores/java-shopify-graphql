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
public class ShopifyPaymentsPayout implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private ShopifyPaymentsBankAccount bankAccount;

  
  private BusinessEntity businessEntity;

  
  private MoneyV2 gross;

  
  private String id;

  
  private OffsetDateTime issuedAt;

  
  private String legacyResourceId;

  
  private MoneyV2 net;

  
  private ShopifyPaymentsPayoutStatus status;

  
  private ShopifyPaymentsPayoutSummary summary;

  
  private ShopifyPaymentsPayoutTransactionType transactionType;

  public ShopifyPaymentsPayout() {
  }

  
  public ShopifyPaymentsBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(ShopifyPaymentsBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  
  public BusinessEntity getBusinessEntity() {
    return businessEntity;
  }

  public void setBusinessEntity(BusinessEntity businessEntity) {
    this.businessEntity = businessEntity;
  }

  
  public MoneyV2 getGross() {
    return gross;
  }

  public void setGross(MoneyV2 gross) {
    this.gross = gross;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public MoneyV2 getNet() {
    return net;
  }

  public void setNet(MoneyV2 net) {
    this.net = net;
  }

  
  public ShopifyPaymentsPayoutStatus getStatus() {
    return status;
  }

  public void setStatus(ShopifyPaymentsPayoutStatus status) {
    this.status = status;
  }

  
  public ShopifyPaymentsPayoutSummary getSummary() {
    return summary;
  }

  public void setSummary(ShopifyPaymentsPayoutSummary summary) {
    this.summary = summary;
  }

  
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
    
    private ShopifyPaymentsBankAccount bankAccount;

    
    private BusinessEntity businessEntity;

    
    private MoneyV2 gross;

    
    private String id;

    
    private OffsetDateTime issuedAt;

    
    private String legacyResourceId;

    
    private MoneyV2 net;

    
    private ShopifyPaymentsPayoutStatus status;

    
    private ShopifyPaymentsPayoutSummary summary;

    
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

    
    public Builder bankAccount(ShopifyPaymentsBankAccount bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    
    public Builder businessEntity(BusinessEntity businessEntity) {
      this.businessEntity = businessEntity;
      return this;
    }

    
    public Builder gross(MoneyV2 gross) {
      this.gross = gross;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder issuedAt(OffsetDateTime issuedAt) {
      this.issuedAt = issuedAt;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder net(MoneyV2 net) {
      this.net = net;
      return this;
    }

    
    public Builder status(ShopifyPaymentsPayoutStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder summary(ShopifyPaymentsPayoutSummary summary) {
      this.summary = summary;
      return this;
    }

    
    public Builder transactionType(ShopifyPaymentsPayoutTransactionType transactionType) {
      this.transactionType = transactionType;
      return this;
    }
  }
}
