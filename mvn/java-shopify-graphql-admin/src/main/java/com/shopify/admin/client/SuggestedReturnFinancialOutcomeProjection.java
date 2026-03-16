package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SuggestedReturnFinancialOutcomeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SuggestedReturnFinancialOutcomeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SuggestedReturnFinancialOutcome"));
  }

  public SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> discountedSubtotal(
      ) {
     MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedSubtotal", projection);
     return projection;
  }

  public ReturnOutcomeFinancialTransferProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> financialTransfer(
      ) {
     ReturnOutcomeFinancialTransferProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> projection = new ReturnOutcomeFinancialTransferProjection<>(this, getRoot());
     getFields().put("financialTransfer", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> maximumRefundable(
      ) {
     MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("maximumRefundable", projection);
     return projection;
  }

  public RefundDutyProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> refundDuties(
      ) {
     RefundDutyProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> projection = new RefundDutyProjection<>(this, getRoot());
     getFields().put("refundDuties", projection);
     return projection;
  }

  public ShippingRefundProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> shipping(
      ) {
     ShippingRefundProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> projection = new ShippingRefundProjection<>(this, getRoot());
     getFields().put("shipping", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> totalAdditionalFees(
      ) {
     MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAdditionalFees", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> totalCartDiscountAmount(
      ) {
     MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalCartDiscountAmount", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> totalDuties(
      ) {
     MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDuties", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> totalTax(
      ) {
     MoneyBagProjection<SuggestedReturnFinancialOutcomeProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTax", projection);
     return projection;
  }
}
