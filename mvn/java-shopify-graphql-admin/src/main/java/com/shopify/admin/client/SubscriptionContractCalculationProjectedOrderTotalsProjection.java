package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCalculationProjectedOrderTotalsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculationProjectedOrderTotals"));
  }

  public SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> subtotal(
      ) {
     MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("subtotal", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> total(
      ) {
     MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("total", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> totalDelivery(
      ) {
     MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalDelivery", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> totalDeliveryDiscounts(
      ) {
     MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalDeliveryDiscounts", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> totalMerchandiseDiscounts(
      ) {
     MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalMerchandiseDiscounts", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> totalTax(
      ) {
     MoneyV2Projection<SubscriptionContractCalculationProjectedOrderTotalsProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalTax", projection);
     return projection;
  }
}
