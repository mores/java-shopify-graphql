package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SuggestedReturnRefundProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SuggestedReturnRefundProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SuggestedReturnRefund"));
  }

  public SuggestedReturnRefundProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> discountedSubtotal(
      ) {
     MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedSubtotal", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> maximumRefundable(
      ) {
     MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("maximumRefundable", projection);
     return projection;
  }

  public RefundDutyProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> refundDuties() {
     RefundDutyProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> projection = new RefundDutyProjection<>(this, getRoot());
     getFields().put("refundDuties", projection);
     return projection;
  }

  public ShippingRefundProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> shipping() {
     ShippingRefundProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> projection = new ShippingRefundProjection<>(this, getRoot());
     getFields().put("shipping", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> subtotal() {
     MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotal", projection);
     return projection;
  }

  public SuggestedOrderTransactionProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> suggestedTransactions(
      ) {
     SuggestedOrderTransactionProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> projection = new SuggestedOrderTransactionProjection<>(this, getRoot());
     getFields().put("suggestedTransactions", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> totalCartDiscountAmount(
      ) {
     MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalCartDiscountAmount", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> totalDuties() {
     MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDuties", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> totalTax() {
     MoneyBagProjection<SuggestedReturnRefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTax", projection);
     return projection;
  }
}
