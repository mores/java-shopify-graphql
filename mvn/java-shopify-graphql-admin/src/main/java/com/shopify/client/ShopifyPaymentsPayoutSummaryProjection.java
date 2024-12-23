package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsPayoutSummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsPayoutSummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsPayoutSummary"));
  }

  public ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> adjustmentsFee(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("adjustmentsFee", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> adjustmentsGross(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("adjustmentsGross", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> advanceFees(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("advanceFees", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> advanceGross(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("advanceGross", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> chargesFee(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("chargesFee", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> chargesGross(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("chargesGross", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> refundsFee(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("refundsFee", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> refundsFeeGross(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("refundsFeeGross", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> reservedFundsFee(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("reservedFundsFee", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> reservedFundsGross(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("reservedFundsGross", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> retriedPayoutsFee(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("retriedPayoutsFee", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> retriedPayoutsGross(
      ) {
     MoneyV2Projection<ShopifyPaymentsPayoutSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("retriedPayoutsGross", projection);
     return projection;
  }
}
