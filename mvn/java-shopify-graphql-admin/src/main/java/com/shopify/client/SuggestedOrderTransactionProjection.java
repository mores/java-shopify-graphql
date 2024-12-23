package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SuggestedOrderTransactionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SuggestedOrderTransactionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SuggestedOrderTransaction"));
  }

  public SuggestedOrderTransactionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<SuggestedOrderTransactionProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<SuggestedOrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public SuggestedOrderTransactionKindProjection<SuggestedOrderTransactionProjection<PARENT, ROOT>, ROOT> kind(
      ) {
     SuggestedOrderTransactionKindProjection<SuggestedOrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new SuggestedOrderTransactionKindProjection<>(this, getRoot());
     getFields().put("kind", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedOrderTransactionProjection<PARENT, ROOT>, ROOT> maximumRefundableSet(
      ) {
     MoneyBagProjection<SuggestedOrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("maximumRefundableSet", projection);
     return projection;
  }

  public OrderTransactionProjection<SuggestedOrderTransactionProjection<PARENT, ROOT>, ROOT> parentTransaction(
      ) {
     OrderTransactionProjection<SuggestedOrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());
     getFields().put("parentTransaction", projection);
     return projection;
  }

  public PaymentDetailsProjection<SuggestedOrderTransactionProjection<PARENT, ROOT>, ROOT> paymentDetails(
      ) {
     PaymentDetailsProjection<SuggestedOrderTransactionProjection<PARENT, ROOT>, ROOT> projection = new PaymentDetailsProjection<>(this, getRoot());
     getFields().put("paymentDetails", projection);
     return projection;
  }

  public SuggestedOrderTransactionProjection<PARENT, ROOT> accountNumber() {
    getFields().put("accountNumber", null);
    return this;
  }

  public SuggestedOrderTransactionProjection<PARENT, ROOT> amount() {
    getFields().put("amount", null);
    return this;
  }

  public SuggestedOrderTransactionProjection<PARENT, ROOT> formattedGateway() {
    getFields().put("formattedGateway", null);
    return this;
  }

  public SuggestedOrderTransactionProjection<PARENT, ROOT> gateway() {
    getFields().put("gateway", null);
    return this;
  }

  public SuggestedOrderTransactionProjection<PARENT, ROOT> maximumRefundable() {
    getFields().put("maximumRefundable", null);
    return this;
  }
}
