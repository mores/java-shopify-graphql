package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCalculationCadenceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCalculationCadenceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculationCadence"));
  }

  public SubscriptionContractCalculationCadenceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCalculationCadenceUnitProjection<SubscriptionContractCalculationCadenceProjection<PARENT, ROOT>, ROOT> unit(
      ) {
     SubscriptionContractCalculationCadenceUnitProjection<SubscriptionContractCalculationCadenceProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractCalculationCadenceUnitProjection<>(this, getRoot());
     getFields().put("unit", projection);
     return projection;
  }

  public SubscriptionContractCalculationCadenceProjection<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
