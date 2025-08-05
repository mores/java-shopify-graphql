package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderTransactionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderTransactionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderTransaction"));
  }

  public OrderTransactionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> amountRoundingSet() {
     MoneyBagProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountRoundingSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public MoneyV2Projection<OrderTransactionProjection<PARENT, ROOT>, ROOT> amountV2() {
     MoneyV2Projection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountV2", projection);
     return projection;
  }

  public CurrencyExchangeAdjustmentProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> currencyExchangeAdjustment(
      ) {
     CurrencyExchangeAdjustmentProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new CurrencyExchangeAdjustmentProjection<>(this, getRoot());
     getFields().put("currencyExchangeAdjustment", projection);
     return projection;
  }

  public PointOfSaleDeviceProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> device() {
     PointOfSaleDeviceProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDeviceProjection<>(this, getRoot());
     getFields().put("device", projection);
     return projection;
  }

  public OrderTransactionErrorCodeProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> errorCode(
      ) {
     OrderTransactionErrorCodeProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionErrorCodeProjection<>(this, getRoot());
     getFields().put("errorCode", projection);
     return projection;
  }

  public TransactionFeeProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> fees() {
     TransactionFeeProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new TransactionFeeProjection<>(this, getRoot());
     getFields().put("fees", projection);
     return projection;
  }

  public OrderTransactionKindProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> kind() {
     OrderTransactionKindProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionKindProjection<>(this, getRoot());
     getFields().put("kind", projection);
     return projection;
  }

  public LocationProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public MoneyV2Projection<OrderTransactionProjection<PARENT, ROOT>, ROOT> maximumRefundableV2() {
     MoneyV2Projection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("maximumRefundableV2", projection);
     return projection;
  }

  public OrderProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public OrderTransactionProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> parentTransaction(
      ) {
     OrderTransactionProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());
     getFields().put("parentTransaction", projection);
     return projection;
  }

  public PaymentDetailsProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> paymentDetails() {
     PaymentDetailsProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new PaymentDetailsProjection<>(this, getRoot());
     getFields().put("paymentDetails", projection);
     return projection;
  }

  public ImageProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> paymentIcon() {
     ImageProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("paymentIcon", projection);
     return projection;
  }

  public PaymentMethodsProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> paymentMethod() {
     PaymentMethodsProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new PaymentMethodsProjection<>(this, getRoot());
     getFields().put("paymentMethod", projection);
     return projection;
  }

  public CurrencyCodeProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> settlementCurrency(
      ) {
     CurrencyCodeProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("settlementCurrency", projection);
     return projection;
  }

  public ShopifyPaymentsTransactionSetProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> shopifyPaymentsSet(
      ) {
     ShopifyPaymentsTransactionSetProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsTransactionSetProjection<>(this, getRoot());
     getFields().put("shopifyPaymentsSet", projection);
     return projection;
  }

  public OrderTransactionStatusProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> status() {
     OrderTransactionStatusProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MoneyBagProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> totalUnsettledSet() {
     MoneyBagProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalUnsettledSet", projection);
     return projection;
  }

  public MoneyV2Projection<OrderTransactionProjection<PARENT, ROOT>, ROOT> totalUnsettledV2() {
     MoneyV2Projection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalUnsettledV2", projection);
     return projection;
  }

  public StaffMemberProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> user() {
     StaffMemberProjection<OrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("user", projection);
     return projection;
  }

  public OrderTransactionProjection<PARENT, ROOT> accountNumber() {
    getFields().put("accountNumber", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> amount() {
    getFields().put("amount", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> authorizationCode() {
    getFields().put("authorizationCode", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> authorizationExpiresAt() {
    getFields().put("authorizationExpiresAt", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> formattedGateway() {
    getFields().put("formattedGateway", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> gateway() {
    getFields().put("gateway", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> manualPaymentGateway() {
    getFields().put("manualPaymentGateway", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> manuallyCapturable() {
    getFields().put("manuallyCapturable", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> maximumRefundable() {
    getFields().put("maximumRefundable", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> multiCapturable() {
    getFields().put("multiCapturable", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> paymentId() {
    getFields().put("paymentId", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> processedAt() {
    getFields().put("processedAt", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> receiptJson() {
    getFields().put("receiptJson", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> settlementCurrencyRate() {
    getFields().put("settlementCurrencyRate", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  public OrderTransactionProjection<PARENT, ROOT> totalUnsettled() {
    getFields().put("totalUnsettled", null);
    return this;
  }
}
