package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A payment transaction in the context of an order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderTransaction implements com.shopify.types.Node {
  /**
   * The masked account number associated with the payment method.
   */
  private String accountNumber;

  /**
   * The amount of money.
   */
  private String amount;

  /**
   * The rounding adjustment applied on the cash amount in shop and presentment currencies.
   */
  private MoneyBag amountRoundingSet;

  /**
   * The amount and currency of the transaction in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * The amount and currency of the transaction.
   */
  private MoneyV2 amountV2;

  /**
   * Authorization code associated with the transaction.
   */
  private String authorizationCode;

  /**
   * The time when the authorization expires. This field is available only to stores on a Shopify Plus plan.
   */
  private OffsetDateTime authorizationExpiresAt;

  /**
   * Date and time when the transaction was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A standardized error code, independent of the payment provider.
   */
  private OrderTransactionErrorCode errorCode;

  /**
   * The transaction fees charged on the order transaction. Only present for Shopify Payments transactions.
   */
  private List<TransactionFee> fees;

  /**
   * The human-readable payment gateway name used to process the transaction.
   */
  private String formattedGateway;

  /**
   * The payment gateway used to process the transaction.
   */
  private String gateway;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The kind of transaction.
   */
  private OrderTransactionKind kind;

  /**
   * Whether the transaction can be manually captured.
   */
  private boolean manuallyCapturable;

  /**
   * Specifies the available amount to refund on the gateway.
   * This value is only available for transactions of type `SuggestedRefund`.
   */
  private String maximumRefundable;

  /**
   * Specifies the available amount with currency to refund on the gateway.
   * This value is only available for transactions of type `SuggestedRefund`.
   */
  private MoneyV2 maximumRefundableV2;

  /**
   * Whether the transaction can be captured multiple times.
   */
  private boolean multiCapturable;

  /**
   * The associated order.
   */
  private Order order;

  /**
   * The associated parent transaction, for example the authorization of a capture.
   */
  private OrderTransaction parentTransaction;

  /**
   * The payment details for the transaction.
   */
  private PaymentDetails paymentDetails;

  /**
   * The payment icon to display for the transaction.
   */
  private Image paymentIcon;

  /**
   * The payment ID associated with the transaction.
   */
  private String paymentId;

  /**
   * The payment method used for the transaction. This value is `null` if the payment method is unknown.
   */
  private PaymentMethods paymentMethod;

  /**
   * Date and time when the transaction was processed.
   */
  private OffsetDateTime processedAt;

  /**
   * The transaction receipt that the payment gateway attaches to the transaction.
   * The value of this field depends on which payment gateway processed the transaction.
   */
  private String receiptJson;

  /**
   * The settlement currency.
   */
  private CurrencyCode settlementCurrency;

  /**
   * The rate used when converting the transaction amount to settlement currency.
   */
  private String settlementCurrencyRate;

  /**
   * Contains all Shopify Payments information related to an order transaction.
   * This field is available only to stores on a Shopify Plus plan.
   */
  private ShopifyPaymentsTransactionSet shopifyPaymentsSet;

  /**
   * The status of this transaction.
   */
  private OrderTransactionStatus status;

  /**
   * Whether the transaction is a test transaction.
   */
  private boolean test;

  /**
   * Specifies the available amount to capture on the gateway.
   * Only available when an amount is capturable or manually mark as paid.
   */
  private String totalUnsettled;

  /**
   * Specifies the available amount with currency to capture on the gateway in shop and presentment currencies.
   * Only available when an amount is capturable or manually mark as paid.
   */
  private MoneyBag totalUnsettledSet;

  /**
   * Specifies the available amount with currency to capture on the gateway.
   * Only available when an amount is capturable or manually mark as paid.
   */
  private MoneyV2 totalUnsettledV2;

  /**
   * Staff member who was logged into the Shopify POS device when the transaction was processed.
   */
  private StaffMember user;

  public OrderTransaction() {
  }

  /**
   * The masked account number associated with the payment method.
   */
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * The amount of money.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * The rounding adjustment applied on the cash amount in shop and presentment currencies.
   */
  public MoneyBag getAmountRoundingSet() {
    return amountRoundingSet;
  }

  public void setAmountRoundingSet(MoneyBag amountRoundingSet) {
    this.amountRoundingSet = amountRoundingSet;
  }

  /**
   * The amount and currency of the transaction in shop and presentment currencies.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  /**
   * The amount and currency of the transaction.
   */
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

  /**
   * Date and time when the transaction was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A standardized error code, independent of the payment provider.
   */
  public OrderTransactionErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(OrderTransactionErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * The transaction fees charged on the order transaction. Only present for Shopify Payments transactions.
   */
  public List<TransactionFee> getFees() {
    return fees;
  }

  public void setFees(List<TransactionFee> fees) {
    this.fees = fees;
  }

  /**
   * The human-readable payment gateway name used to process the transaction.
   */
  public String getFormattedGateway() {
    return formattedGateway;
  }

  public void setFormattedGateway(String formattedGateway) {
    this.formattedGateway = formattedGateway;
  }

  /**
   * The payment gateway used to process the transaction.
   */
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
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
   * The kind of transaction.
   */
  public OrderTransactionKind getKind() {
    return kind;
  }

  public void setKind(OrderTransactionKind kind) {
    this.kind = kind;
  }

  /**
   * Whether the transaction can be manually captured.
   */
  public boolean getManuallyCapturable() {
    return manuallyCapturable;
  }

  public void setManuallyCapturable(boolean manuallyCapturable) {
    this.manuallyCapturable = manuallyCapturable;
  }

  /**
   * Specifies the available amount to refund on the gateway.
   * This value is only available for transactions of type `SuggestedRefund`.
   */
  public String getMaximumRefundable() {
    return maximumRefundable;
  }

  public void setMaximumRefundable(String maximumRefundable) {
    this.maximumRefundable = maximumRefundable;
  }

  /**
   * Specifies the available amount with currency to refund on the gateway.
   * This value is only available for transactions of type `SuggestedRefund`.
   */
  public MoneyV2 getMaximumRefundableV2() {
    return maximumRefundableV2;
  }

  public void setMaximumRefundableV2(MoneyV2 maximumRefundableV2) {
    this.maximumRefundableV2 = maximumRefundableV2;
  }

  /**
   * Whether the transaction can be captured multiple times.
   */
  public boolean getMultiCapturable() {
    return multiCapturable;
  }

  public void setMultiCapturable(boolean multiCapturable) {
    this.multiCapturable = multiCapturable;
  }

  /**
   * The associated order.
   */
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

  /**
   * The payment details for the transaction.
   */
  public PaymentDetails getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
  }

  /**
   * The payment icon to display for the transaction.
   */
  public Image getPaymentIcon() {
    return paymentIcon;
  }

  public void setPaymentIcon(Image paymentIcon) {
    this.paymentIcon = paymentIcon;
  }

  /**
   * The payment ID associated with the transaction.
   */
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  /**
   * The payment method used for the transaction. This value is `null` if the payment method is unknown.
   */
  public PaymentMethods getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethods paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * Date and time when the transaction was processed.
   */
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  /**
   * The transaction receipt that the payment gateway attaches to the transaction.
   * The value of this field depends on which payment gateway processed the transaction.
   */
  public String getReceiptJson() {
    return receiptJson;
  }

  public void setReceiptJson(String receiptJson) {
    this.receiptJson = receiptJson;
  }

  /**
   * The settlement currency.
   */
  public CurrencyCode getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(CurrencyCode settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }

  /**
   * The rate used when converting the transaction amount to settlement currency.
   */
  public String getSettlementCurrencyRate() {
    return settlementCurrencyRate;
  }

  public void setSettlementCurrencyRate(String settlementCurrencyRate) {
    this.settlementCurrencyRate = settlementCurrencyRate;
  }

  /**
   * Contains all Shopify Payments information related to an order transaction.
   * This field is available only to stores on a Shopify Plus plan.
   */
  public ShopifyPaymentsTransactionSet getShopifyPaymentsSet() {
    return shopifyPaymentsSet;
  }

  public void setShopifyPaymentsSet(ShopifyPaymentsTransactionSet shopifyPaymentsSet) {
    this.shopifyPaymentsSet = shopifyPaymentsSet;
  }

  /**
   * The status of this transaction.
   */
  public OrderTransactionStatus getStatus() {
    return status;
  }

  public void setStatus(OrderTransactionStatus status) {
    this.status = status;
  }

  /**
   * Whether the transaction is a test transaction.
   */
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  /**
   * Specifies the available amount to capture on the gateway.
   * Only available when an amount is capturable or manually mark as paid.
   */
  public String getTotalUnsettled() {
    return totalUnsettled;
  }

  public void setTotalUnsettled(String totalUnsettled) {
    this.totalUnsettled = totalUnsettled;
  }

  /**
   * Specifies the available amount with currency to capture on the gateway in shop and presentment currencies.
   * Only available when an amount is capturable or manually mark as paid.
   */
  public MoneyBag getTotalUnsettledSet() {
    return totalUnsettledSet;
  }

  public void setTotalUnsettledSet(MoneyBag totalUnsettledSet) {
    this.totalUnsettledSet = totalUnsettledSet;
  }

  /**
   * Specifies the available amount with currency to capture on the gateway.
   * Only available when an amount is capturable or manually mark as paid.
   */
  public MoneyV2 getTotalUnsettledV2() {
    return totalUnsettledV2;
  }

  public void setTotalUnsettledV2(MoneyV2 totalUnsettledV2) {
    this.totalUnsettledV2 = totalUnsettledV2;
  }

  /**
   * Staff member who was logged into the Shopify POS device when the transaction was processed.
   */
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
    /**
     * The masked account number associated with the payment method.
     */
    private String accountNumber;

    /**
     * The amount of money.
     */
    private String amount;

    /**
     * The rounding adjustment applied on the cash amount in shop and presentment currencies.
     */
    private MoneyBag amountRoundingSet;

    /**
     * The amount and currency of the transaction in shop and presentment currencies.
     */
    private MoneyBag amountSet;

    /**
     * The amount and currency of the transaction.
     */
    private MoneyV2 amountV2;

    /**
     * Authorization code associated with the transaction.
     */
    private String authorizationCode;

    /**
     * The time when the authorization expires. This field is available only to stores on a Shopify Plus plan.
     */
    private OffsetDateTime authorizationExpiresAt;

    /**
     * Date and time when the transaction was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A standardized error code, independent of the payment provider.
     */
    private OrderTransactionErrorCode errorCode;

    /**
     * The transaction fees charged on the order transaction. Only present for Shopify Payments transactions.
     */
    private List<TransactionFee> fees;

    /**
     * The human-readable payment gateway name used to process the transaction.
     */
    private String formattedGateway;

    /**
     * The payment gateway used to process the transaction.
     */
    private String gateway;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The kind of transaction.
     */
    private OrderTransactionKind kind;

    /**
     * Whether the transaction can be manually captured.
     */
    private boolean manuallyCapturable;

    /**
     * Specifies the available amount to refund on the gateway.
     * This value is only available for transactions of type `SuggestedRefund`.
     */
    private String maximumRefundable;

    /**
     * Specifies the available amount with currency to refund on the gateway.
     * This value is only available for transactions of type `SuggestedRefund`.
     */
    private MoneyV2 maximumRefundableV2;

    /**
     * Whether the transaction can be captured multiple times.
     */
    private boolean multiCapturable;

    /**
     * The associated order.
     */
    private Order order;

    /**
     * The associated parent transaction, for example the authorization of a capture.
     */
    private OrderTransaction parentTransaction;

    /**
     * The payment details for the transaction.
     */
    private PaymentDetails paymentDetails;

    /**
     * The payment icon to display for the transaction.
     */
    private Image paymentIcon;

    /**
     * The payment ID associated with the transaction.
     */
    private String paymentId;

    /**
     * The payment method used for the transaction. This value is `null` if the payment method is unknown.
     */
    private PaymentMethods paymentMethod;

    /**
     * Date and time when the transaction was processed.
     */
    private OffsetDateTime processedAt;

    /**
     * The transaction receipt that the payment gateway attaches to the transaction.
     * The value of this field depends on which payment gateway processed the transaction.
     */
    private String receiptJson;

    /**
     * The settlement currency.
     */
    private CurrencyCode settlementCurrency;

    /**
     * The rate used when converting the transaction amount to settlement currency.
     */
    private String settlementCurrencyRate;

    /**
     * Contains all Shopify Payments information related to an order transaction.
     * This field is available only to stores on a Shopify Plus plan.
     */
    private ShopifyPaymentsTransactionSet shopifyPaymentsSet;

    /**
     * The status of this transaction.
     */
    private OrderTransactionStatus status;

    /**
     * Whether the transaction is a test transaction.
     */
    private boolean test;

    /**
     * Specifies the available amount to capture on the gateway.
     * Only available when an amount is capturable or manually mark as paid.
     */
    private String totalUnsettled;

    /**
     * Specifies the available amount with currency to capture on the gateway in shop and presentment currencies.
     * Only available when an amount is capturable or manually mark as paid.
     */
    private MoneyBag totalUnsettledSet;

    /**
     * Specifies the available amount with currency to capture on the gateway.
     * Only available when an amount is capturable or manually mark as paid.
     */
    private MoneyV2 totalUnsettledV2;

    /**
     * Staff member who was logged into the Shopify POS device when the transaction was processed.
     */
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

    /**
     * The masked account number associated with the payment method.
     */
    public Builder accountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    /**
     * The amount of money.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The rounding adjustment applied on the cash amount in shop and presentment currencies.
     */
    public Builder amountRoundingSet(MoneyBag amountRoundingSet) {
      this.amountRoundingSet = amountRoundingSet;
      return this;
    }

    /**
     * The amount and currency of the transaction in shop and presentment currencies.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * The amount and currency of the transaction.
     */
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

    /**
     * Date and time when the transaction was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A standardized error code, independent of the payment provider.
     */
    public Builder errorCode(OrderTransactionErrorCode errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    /**
     * The transaction fees charged on the order transaction. Only present for Shopify Payments transactions.
     */
    public Builder fees(List<TransactionFee> fees) {
      this.fees = fees;
      return this;
    }

    /**
     * The human-readable payment gateway name used to process the transaction.
     */
    public Builder formattedGateway(String formattedGateway) {
      this.formattedGateway = formattedGateway;
      return this;
    }

    /**
     * The payment gateway used to process the transaction.
     */
    public Builder gateway(String gateway) {
      this.gateway = gateway;
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
     * The kind of transaction.
     */
    public Builder kind(OrderTransactionKind kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Whether the transaction can be manually captured.
     */
    public Builder manuallyCapturable(boolean manuallyCapturable) {
      this.manuallyCapturable = manuallyCapturable;
      return this;
    }

    /**
     * Specifies the available amount to refund on the gateway.
     * This value is only available for transactions of type `SuggestedRefund`.
     */
    public Builder maximumRefundable(String maximumRefundable) {
      this.maximumRefundable = maximumRefundable;
      return this;
    }

    /**
     * Specifies the available amount with currency to refund on the gateway.
     * This value is only available for transactions of type `SuggestedRefund`.
     */
    public Builder maximumRefundableV2(MoneyV2 maximumRefundableV2) {
      this.maximumRefundableV2 = maximumRefundableV2;
      return this;
    }

    /**
     * Whether the transaction can be captured multiple times.
     */
    public Builder multiCapturable(boolean multiCapturable) {
      this.multiCapturable = multiCapturable;
      return this;
    }

    /**
     * The associated order.
     */
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

    /**
     * The payment details for the transaction.
     */
    public Builder paymentDetails(PaymentDetails paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }

    /**
     * The payment icon to display for the transaction.
     */
    public Builder paymentIcon(Image paymentIcon) {
      this.paymentIcon = paymentIcon;
      return this;
    }

    /**
     * The payment ID associated with the transaction.
     */
    public Builder paymentId(String paymentId) {
      this.paymentId = paymentId;
      return this;
    }

    /**
     * The payment method used for the transaction. This value is `null` if the payment method is unknown.
     */
    public Builder paymentMethod(PaymentMethods paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * Date and time when the transaction was processed.
     */
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    /**
     * The transaction receipt that the payment gateway attaches to the transaction.
     * The value of this field depends on which payment gateway processed the transaction.
     */
    public Builder receiptJson(String receiptJson) {
      this.receiptJson = receiptJson;
      return this;
    }

    /**
     * The settlement currency.
     */
    public Builder settlementCurrency(CurrencyCode settlementCurrency) {
      this.settlementCurrency = settlementCurrency;
      return this;
    }

    /**
     * The rate used when converting the transaction amount to settlement currency.
     */
    public Builder settlementCurrencyRate(String settlementCurrencyRate) {
      this.settlementCurrencyRate = settlementCurrencyRate;
      return this;
    }

    /**
     * Contains all Shopify Payments information related to an order transaction.
     * This field is available only to stores on a Shopify Plus plan.
     */
    public Builder shopifyPaymentsSet(ShopifyPaymentsTransactionSet shopifyPaymentsSet) {
      this.shopifyPaymentsSet = shopifyPaymentsSet;
      return this;
    }

    /**
     * The status of this transaction.
     */
    public Builder status(OrderTransactionStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Whether the transaction is a test transaction.
     */
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    /**
     * Specifies the available amount to capture on the gateway.
     * Only available when an amount is capturable or manually mark as paid.
     */
    public Builder totalUnsettled(String totalUnsettled) {
      this.totalUnsettled = totalUnsettled;
      return this;
    }

    /**
     * Specifies the available amount with currency to capture on the gateway in shop and presentment currencies.
     * Only available when an amount is capturable or manually mark as paid.
     */
    public Builder totalUnsettledSet(MoneyBag totalUnsettledSet) {
      this.totalUnsettledSet = totalUnsettledSet;
      return this;
    }

    /**
     * Specifies the available amount with currency to capture on the gateway.
     * Only available when an amount is capturable or manually mark as paid.
     */
    public Builder totalUnsettledV2(MoneyV2 totalUnsettledV2) {
      this.totalUnsettledV2 = totalUnsettledV2;
      return this;
    }

    /**
     * Staff member who was logged into the Shopify POS device when the transaction was processed.
     */
    public Builder user(StaffMember user) {
      this.user = user;
      return this;
    }
  }
}
