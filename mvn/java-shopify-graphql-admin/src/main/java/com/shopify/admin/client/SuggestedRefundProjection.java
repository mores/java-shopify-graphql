package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SuggestedRefundProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SuggestedRefundProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SuggestedRefund"));
  }

  public SuggestedRefundProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> discountedSubtotalSet() {
     MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedSubtotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> maximumRefundableSet() {
     MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("maximumRefundableSet", projection);
     return projection;
  }

  public RefundDutyProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> refundDuties() {
     RefundDutyProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new RefundDutyProjection<>(this, getRoot());
     getFields().put("refundDuties", projection);
     return projection;
  }

  public RefundLineItemProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> refundLineItems() {
     RefundLineItemProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new RefundLineItemProjection<>(this, getRoot());
     getFields().put("refundLineItems", projection);
     return projection;
  }

  public ShippingRefundProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> shipping() {
     ShippingRefundProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new ShippingRefundProjection<>(this, getRoot());
     getFields().put("shipping", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> subtotalSet() {
     MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalSet", projection);
     return projection;
  }

  public SuggestedRefundMethodProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> suggestedRefundMethods(
      ) {
     SuggestedRefundMethodProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new SuggestedRefundMethodProjection<>(this, getRoot());
     getFields().put("suggestedRefundMethods", projection);
     return projection;
  }

  public SuggestedOrderTransactionProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> suggestedTransactions(
      ) {
     SuggestedOrderTransactionProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new SuggestedOrderTransactionProjection<>(this, getRoot());
     getFields().put("suggestedTransactions", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> totalCartDiscountAmountSet(
      ) {
     MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalCartDiscountAmountSet", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> totalDutiesSet() {
     MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDutiesSet", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> totalTaxSet() {
     MoneyBagProjection<SuggestedRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxSet", projection);
     return projection;
  }

  public SuggestedRefundProjection<PARENT, ROOT> amount() {
    getFields().put("amount", null);
    return this;
  }

  public SuggestedRefundProjection<PARENT, ROOT> maximumRefundable() {
    getFields().put("maximumRefundable", null);
    return this;
  }

  public SuggestedRefundProjection<PARENT, ROOT> subtotal() {
    getFields().put("subtotal", null);
    return this;
  }

  public SuggestedRefundProjection<PARENT, ROOT> totalTaxes() {
    getFields().put("totalTaxes", null);
    return this;
  }
}
