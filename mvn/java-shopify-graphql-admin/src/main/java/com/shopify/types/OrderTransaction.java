package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderTransaction implements com.shopify.types.Node {
  
  private String accountNumber;

  
  private String amount;

  
  private MoneyBag amountRoundingSet;

  
  private MoneyBag amountSet;

  
  private MoneyV2 amountV2;

  /**
   * Authorization code associated with the transaction.
   */
  private String authorizationCode;

  /**
   * The time when the authorization expires. This field is available only to stores on a Shopify Plus plan.
   */
  private OffsetDateTime authorizationExpiresAt;

  
  private OffsetDateTime createdAt;

  
  private OrderTransactionErrorCode errorCode;

  
  private List<TransactionFee> fees;

  
  private String formattedGateway;

  
  private String gateway;

  
  private String id;

  
  private OrderTransactionKind kind;

  
  private boolean manuallyCapturable;

  
  private String maximumRefundable;

  
  private MoneyV2 maximumRefundableV2;

  
  private boolean multiCapturable;

  
  private Order order;

  /**
   * The associated parent transaction, for example the authorization of a capture.
   */
  private OrderTransaction parentTransaction;

  
  private PaymentDetails paymentDetails;

  
  private Image paymentIcon;

  
  private String paymentId;

  
  private PaymentMethods paymentMethod;

  
  private OffsetDateTime processedAt;

  
  private String receiptJson;

  
  private CurrencyCode settlementCurrency;

  
  private String settlementCurrencyRate;

  
  private ShopifyPaymentsTransactionSet shopifyPaymentsSet;

  
  private OrderTransactionStatus status;

  
  private boolean test;

  
  private String totalUnsettled;

  
  private MoneyBag totalUnsettledSet;

  
  private MoneyV2 totalUnsettledV2;

  
  private StaffMember user;

  public OrderTransaction() {
  }

  
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  
  public MoneyBag getAmountRoundingSet() {
    return amountRoundingSet;
  }

  public void setAmountRoundingSet(MoneyBag amountRoundingSet) {
    this.amountRoundingSet = amountRoundingSet;
  }

  
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  
  public MoneyV2 getAmountV2() {
    return amountV2;
  }

  public void setAmountV2(MoneyV2 amountV2) {
    this.amountV2 = amountV2;
  }

  /**
   * Authorization code associated with the transaction.
   */
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  /**
   * The time when the authorization expires. This field is available only to stores on a Shopify Plus plan.
   */
  public OffsetDateTime getAuthorizationExpiresAt() {
    return authorizationExpiresAt;
  }

  public void setAuthorizationExpiresAt(OffsetDateTime authorizationExpiresAt) {
    this.authorizationExpiresAt = authorizationExpiresAt;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public OrderTransactionErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(OrderTransactionErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  
  public List<TransactionFee> getFees() {
    return fees;
  }

  public void setFees(List<TransactionFee> fees) {
    this.fees = fees;
  }

  
  public String getFormattedGateway() {
    return formattedGateway;
  }

  public void setFormattedGateway(String formattedGateway) {
    this.formattedGateway = formattedGateway;
  }

  
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public OrderTransactionKind getKind() {
    return kind;
  }

  public void setKind(OrderTransactionKind kind) {
    this.kind = kind;
  }

  
  public boolean getManuallyCapturable() {
    return manuallyCapturable;
  }

  public void setManuallyCapturable(boolean manuallyCapturable) {
    this.manuallyCapturable = manuallyCapturable;
  }

  
  public String getMaximumRefundable() {
    return maximumRefundable;
  }

  public void setMaximumRefundable(String maximumRefundable) {
    this.maximumRefundable = maximumRefundable;
  }

  
  public MoneyV2 getMaximumRefundableV2() {
    return maximumRefundableV2;
  }

  public void setMaximumRefundableV2(MoneyV2 maximumRefundableV2) {
    this.maximumRefundableV2 = maximumRefundableV2;
  }

  
  public boolean getMultiCapturable() {
    return multiCapturable;
  }

  public void setMultiCapturable(boolean multiCapturable) {
    this.multiCapturable = multiCapturable;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The associated parent transaction, for example the authorization of a capture.
   */
  public OrderTransaction getParentTransaction() {
    return parentTransaction;
  }

  public void setParentTransaction(OrderTransaction parentTransaction) {
    this.parentTransaction = parentTransaction;
  }

  
  public PaymentDetails getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
  }

  
  public Image getPaymentIcon() {
    return paymentIcon;
  }

  public void setPaymentIcon(Image paymentIcon) {
    this.paymentIcon = paymentIcon;
  }

  
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  
  public PaymentMethods getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethods paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  
  public String getReceiptJson() {
    return receiptJson;
  }

  public void setReceiptJson(String receiptJson) {
    this.receiptJson = receiptJson;
  }

  
  public CurrencyCode getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(CurrencyCode settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }

  
  public String getSettlementCurrencyRate() {
    return settlementCurrencyRate;
  }

  public void setSettlementCurrencyRate(String settlementCurrencyRate) {
    this.settlementCurrencyRate = settlementCurrencyRate;
  }

  
  public ShopifyPaymentsTransactionSet getShopifyPaymentsSet() {
    return shopifyPaymentsSet;
  }

  public void setShopifyPaymentsSet(ShopifyPaymentsTransactionSet shopifyPaymentsSet) {
    this.shopifyPaymentsSet = shopifyPaymentsSet;
  }

  
  public OrderTransactionStatus getStatus() {
    return status;
  }

  public void setStatus(OrderTransactionStatus status) {
    this.status = status;
  }

  
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  
  public String getTotalUnsettled() {
    return totalUnsettled;
  }

  public void setTotalUnsettled(String totalUnsettled) {
    this.totalUnsettled = totalUnsettled;
  }

  
  public MoneyBag getTotalUnsettledSet() {
    return totalUnsettledSet;
  }

  public void setTotalUnsettledSet(MoneyBag totalUnsettledSet) {
    this.totalUnsettledSet = totalUnsettledSet;
  }

  
  public MoneyV2 getTotalUnsettledV2() {
    return totalUnsettledV2;
  }

  public void setTotalUnsettledV2(MoneyV2 totalUnsettledV2) {
    this.totalUnsettledV2 = totalUnsettledV2;
  }

  
  public StaffMember getUser() {
    return user;
  }

  public void setUser(StaffMember user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "OrderTransaction{accountNumber='" + accountNumber + "', amount='" + amount + "', amountRoundingSet='" + amountRoundingSet + "', amountSet='" + amountSet + "', amountV2='" + amountV2 + "', authorizationCode='" + authorizationCode + "', authorizationExpiresAt='" + authorizationExpiresAt + "', createdAt='" + createdAt + "', errorCode='" + errorCode + "', fees='" + fees + "', formattedGateway='" + formattedGateway + "', gateway='" + gateway + "', id='" + id + "', kind='" + kind + "', manuallyCapturable='" + manuallyCapturable + "', maximumRefundable='" + maximumRefundable + "', maximumRefundableV2='" + maximumRefundableV2 + "', multiCapturable='" + multiCapturable + "', order='" + order + "', parentTransaction='" + parentTransaction + "', paymentDetails='" + paymentDetails + "', paymentIcon='" + paymentIcon + "', paymentId='" + paymentId + "', paymentMethod='" + paymentMethod + "', processedAt='" + processedAt + "', receiptJson='" + receiptJson + "', settlementCurrency='" + settlementCurrency + "', settlementCurrencyRate='" + settlementCurrencyRate + "', shopifyPaymentsSet='" + shopifyPaymentsSet + "', status='" + status + "', test='" + test + "', totalUnsettled='" + totalUnsettled + "', totalUnsettledSet='" + totalUnsettledSet + "', totalUnsettledV2='" + totalUnsettledV2 + "', user='" + user + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderTransaction that = (OrderTransaction) o;
    return Objects.equals(accountNumber, that.accountNumber) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(amountRoundingSet, that.amountRoundingSet) &&
        Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(amountV2, that.amountV2) &&
        Objects.equals(authorizationCode, that.authorizationCode) &&
        Objects.equals(authorizationExpiresAt, that.authorizationExpiresAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(errorCode, that.errorCode) &&
        Objects.equals(fees, that.fees) &&
        Objects.equals(formattedGateway, that.formattedGateway) &&
        Objects.equals(gateway, that.gateway) &&
        Objects.equals(id, that.id) &&
        Objects.equals(kind, that.kind) &&
        manuallyCapturable == that.manuallyCapturable &&
        Objects.equals(maximumRefundable, that.maximumRefundable) &&
        Objects.equals(maximumRefundableV2, that.maximumRefundableV2) &&
        multiCapturable == that.multiCapturable &&
        Objects.equals(order, that.order) &&
        Objects.equals(parentTransaction, that.parentTransaction) &&
        Objects.equals(paymentDetails, that.paymentDetails) &&
        Objects.equals(paymentIcon, that.paymentIcon) &&
        Objects.equals(paymentId, that.paymentId) &&
        Objects.equals(paymentMethod, that.paymentMethod) &&
        Objects.equals(processedAt, that.processedAt) &&
        Objects.equals(receiptJson, that.receiptJson) &&
        Objects.equals(settlementCurrency, that.settlementCurrency) &&
        Objects.equals(settlementCurrencyRate, that.settlementCurrencyRate) &&
        Objects.equals(shopifyPaymentsSet, that.shopifyPaymentsSet) &&
        Objects.equals(status, that.status) &&
        test == that.test &&
        Objects.equals(totalUnsettled, that.totalUnsettled) &&
        Objects.equals(totalUnsettledSet, that.totalUnsettledSet) &&
        Objects.equals(totalUnsettledV2, that.totalUnsettledV2) &&
        Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, amount, amountRoundingSet, amountSet, amountV2, authorizationCode, authorizationExpiresAt, createdAt, errorCode, fees, formattedGateway, gateway, id, kind, manuallyCapturable, maximumRefundable, maximumRefundableV2, multiCapturable, order, parentTransaction, paymentDetails, paymentIcon, paymentId, paymentMethod, processedAt, receiptJson, settlementCurrency, settlementCurrencyRate, shopifyPaymentsSet, status, test, totalUnsettled, totalUnsettledSet, totalUnsettledV2, user);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String accountNumber;

    
    private String amount;

    
    private MoneyBag amountRoundingSet;

    
    private MoneyBag amountSet;

    
    private MoneyV2 amountV2;

    /**
     * Authorization code associated with the transaction.
     */
    private String authorizationCode;

    /**
     * The time when the authorization expires. This field is available only to stores on a Shopify Plus plan.
     */
    private OffsetDateTime authorizationExpiresAt;

    
    private OffsetDateTime createdAt;

    
    private OrderTransactionErrorCode errorCode;

    
    private List<TransactionFee> fees;

    
    private String formattedGateway;

    
    private String gateway;

    
    private String id;

    
    private OrderTransactionKind kind;

    
    private boolean manuallyCapturable;

    
    private String maximumRefundable;

    
    private MoneyV2 maximumRefundableV2;

    
    private boolean multiCapturable;

    
    private Order order;

    /**
     * The associated parent transaction, for example the authorization of a capture.
     */
    private OrderTransaction parentTransaction;

    
    private PaymentDetails paymentDetails;

    
    private Image paymentIcon;

    
    private String paymentId;

    
    private PaymentMethods paymentMethod;

    
    private OffsetDateTime processedAt;

    
    private String receiptJson;

    
    private CurrencyCode settlementCurrency;

    
    private String settlementCurrencyRate;

    
    private ShopifyPaymentsTransactionSet shopifyPaymentsSet;

    
    private OrderTransactionStatus status;

    
    private boolean test;

    
    private String totalUnsettled;

    
    private MoneyBag totalUnsettledSet;

    
    private MoneyV2 totalUnsettledV2;

    
    private StaffMember user;

    public OrderTransaction build() {
      OrderTransaction result = new OrderTransaction();
      result.accountNumber = this.accountNumber;
      result.amount = this.amount;
      result.amountRoundingSet = this.amountRoundingSet;
      result.amountSet = this.amountSet;
      result.amountV2 = this.amountV2;
      result.authorizationCode = this.authorizationCode;
      result.authorizationExpiresAt = this.authorizationExpiresAt;
      result.createdAt = this.createdAt;
      result.errorCode = this.errorCode;
      result.fees = this.fees;
      result.formattedGateway = this.formattedGateway;
      result.gateway = this.gateway;
      result.id = this.id;
      result.kind = this.kind;
      result.manuallyCapturable = this.manuallyCapturable;
      result.maximumRefundable = this.maximumRefundable;
      result.maximumRefundableV2 = this.maximumRefundableV2;
      result.multiCapturable = this.multiCapturable;
      result.order = this.order;
      result.parentTransaction = this.parentTransaction;
      result.paymentDetails = this.paymentDetails;
      result.paymentIcon = this.paymentIcon;
      result.paymentId = this.paymentId;
      result.paymentMethod = this.paymentMethod;
      result.processedAt = this.processedAt;
      result.receiptJson = this.receiptJson;
      result.settlementCurrency = this.settlementCurrency;
      result.settlementCurrencyRate = this.settlementCurrencyRate;
      result.shopifyPaymentsSet = this.shopifyPaymentsSet;
      result.status = this.status;
      result.test = this.test;
      result.totalUnsettled = this.totalUnsettled;
      result.totalUnsettledSet = this.totalUnsettledSet;
      result.totalUnsettledV2 = this.totalUnsettledV2;
      result.user = this.user;
      return result;
    }

    
    public Builder accountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder amountRoundingSet(MoneyBag amountRoundingSet) {
      this.amountRoundingSet = amountRoundingSet;
      return this;
    }

    
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    
    public Builder amountV2(MoneyV2 amountV2) {
      this.amountV2 = amountV2;
      return this;
    }

    /**
     * Authorization code associated with the transaction.
     */
    public Builder authorizationCode(String authorizationCode) {
      this.authorizationCode = authorizationCode;
      return this;
    }

    /**
     * The time when the authorization expires. This field is available only to stores on a Shopify Plus plan.
     */
    public Builder authorizationExpiresAt(OffsetDateTime authorizationExpiresAt) {
      this.authorizationExpiresAt = authorizationExpiresAt;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder errorCode(OrderTransactionErrorCode errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    
    public Builder fees(List<TransactionFee> fees) {
      this.fees = fees;
      return this;
    }

    
    public Builder formattedGateway(String formattedGateway) {
      this.formattedGateway = formattedGateway;
      return this;
    }

    
    public Builder gateway(String gateway) {
      this.gateway = gateway;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder kind(OrderTransactionKind kind) {
      this.kind = kind;
      return this;
    }

    
    public Builder manuallyCapturable(boolean manuallyCapturable) {
      this.manuallyCapturable = manuallyCapturable;
      return this;
    }

    
    public Builder maximumRefundable(String maximumRefundable) {
      this.maximumRefundable = maximumRefundable;
      return this;
    }

    
    public Builder maximumRefundableV2(MoneyV2 maximumRefundableV2) {
      this.maximumRefundableV2 = maximumRefundableV2;
      return this;
    }

    
    public Builder multiCapturable(boolean multiCapturable) {
      this.multiCapturable = multiCapturable;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The associated parent transaction, for example the authorization of a capture.
     */
    public Builder parentTransaction(OrderTransaction parentTransaction) {
      this.parentTransaction = parentTransaction;
      return this;
    }

    
    public Builder paymentDetails(PaymentDetails paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }

    
    public Builder paymentIcon(Image paymentIcon) {
      this.paymentIcon = paymentIcon;
      return this;
    }

    
    public Builder paymentId(String paymentId) {
      this.paymentId = paymentId;
      return this;
    }

    
    public Builder paymentMethod(PaymentMethods paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    
    public Builder receiptJson(String receiptJson) {
      this.receiptJson = receiptJson;
      return this;
    }

    
    public Builder settlementCurrency(CurrencyCode settlementCurrency) {
      this.settlementCurrency = settlementCurrency;
      return this;
    }

    
    public Builder settlementCurrencyRate(String settlementCurrencyRate) {
      this.settlementCurrencyRate = settlementCurrencyRate;
      return this;
    }

    
    public Builder shopifyPaymentsSet(ShopifyPaymentsTransactionSet shopifyPaymentsSet) {
      this.shopifyPaymentsSet = shopifyPaymentsSet;
      return this;
    }

    
    public Builder status(OrderTransactionStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    
    public Builder totalUnsettled(String totalUnsettled) {
      this.totalUnsettled = totalUnsettled;
      return this;
    }

    
    public Builder totalUnsettledSet(MoneyBag totalUnsettledSet) {
      this.totalUnsettledSet = totalUnsettledSet;
      return this;
    }

    
    public Builder totalUnsettledV2(MoneyV2 totalUnsettledV2) {
      this.totalUnsettledV2 = totalUnsettledV2;
      return this;
    }

    
    public Builder user(StaffMember user) {
      this.user = user;
      return this;
    }
  }
}
