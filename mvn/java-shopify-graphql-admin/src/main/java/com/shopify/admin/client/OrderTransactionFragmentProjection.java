package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OrderTransactionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderTransactionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderTransaction"));
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> amountRoundingSet(
      ) {
     MoneyBagProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountRoundingSet", projection);
     return projection;
  }

  public MoneyBagProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public MoneyV2Projection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> amountV2() {
     MoneyV2Projection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountV2", projection);
     return projection;
  }

  public OrderTransactionErrorCodeProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> errorCode(
      ) {
     OrderTransactionErrorCodeProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionErrorCodeProjection<>(this, getRoot());
     getFields().put("errorCode", projection);
     return projection;
  }

  public TransactionFeeProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> fees() {
     TransactionFeeProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new TransactionFeeProjection<>(this, getRoot());
     getFields().put("fees", projection);
     return projection;
  }

  public OrderTransactionKindProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> kind(
      ) {
     OrderTransactionKindProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionKindProjection<>(this, getRoot());
     getFields().put("kind", projection);
     return projection;
  }

  public MoneyV2Projection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> maximumRefundableV2(
      ) {
     MoneyV2Projection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("maximumRefundableV2", projection);
     return projection;
  }

  public OrderProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public OrderTransactionProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> parentTransaction(
      ) {
     OrderTransactionProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());
     getFields().put("parentTransaction", projection);
     return projection;
  }

  public PaymentDetailsProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> paymentDetails(
      ) {
     PaymentDetailsProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentDetailsProjection<>(this, getRoot());
     getFields().put("paymentDetails", projection);
     return projection;
  }

  public ImageProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> paymentIcon() {
     ImageProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("paymentIcon", projection);
     return projection;
  }

  public PaymentMethodsProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> paymentMethod(
      ) {
     PaymentMethodsProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentMethodsProjection<>(this, getRoot());
     getFields().put("paymentMethod", projection);
     return projection;
  }

  public CurrencyCodeProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> settlementCurrency(
      ) {
     CurrencyCodeProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("settlementCurrency", projection);
     return projection;
  }

  public ShopifyPaymentsTransactionSetProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> shopifyPaymentsSet(
      ) {
     ShopifyPaymentsTransactionSetProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsTransactionSetProjection<>(this, getRoot());
     getFields().put("shopifyPaymentsSet", projection);
     return projection;
  }

  public OrderTransactionStatusProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     OrderTransactionStatusProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MoneyBagProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> totalUnsettledSet(
      ) {
     MoneyBagProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalUnsettledSet", projection);
     return projection;
  }

  public MoneyV2Projection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> totalUnsettledV2(
      ) {
     MoneyV2Projection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalUnsettledV2", projection);
     return projection;
  }

  public StaffMemberProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> user() {
     StaffMemberProjection<OrderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("user", projection);
     return projection;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> accountNumber() {
    getFields().put("accountNumber", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> amount() {
    getFields().put("amount", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> authorizationCode() {
    getFields().put("authorizationCode", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> authorizationExpiresAt() {
    getFields().put("authorizationExpiresAt", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> formattedGateway() {
    getFields().put("formattedGateway", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> gateway() {
    getFields().put("gateway", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> manualPaymentGateway() {
    getFields().put("manualPaymentGateway", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> manuallyCapturable() {
    getFields().put("manuallyCapturable", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> maximumRefundable() {
    getFields().put("maximumRefundable", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> multiCapturable() {
    getFields().put("multiCapturable", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> paymentId() {
    getFields().put("paymentId", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> processedAt() {
    getFields().put("processedAt", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> receiptJson() {
    getFields().put("receiptJson", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> settlementCurrencyRate() {
    getFields().put("settlementCurrencyRate", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  public OrderTransactionFragmentProjection<PARENT, ROOT> totalUnsettled() {
    getFields().put("totalUnsettled", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderTransaction {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
