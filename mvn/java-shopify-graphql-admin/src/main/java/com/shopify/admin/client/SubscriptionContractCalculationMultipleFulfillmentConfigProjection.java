package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCalculationMultipleFulfillmentConfigProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCalculationMultipleFulfillmentConfigProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculationMultipleFulfillmentConfig"));
  }

  public SubscriptionContractCalculationMultipleFulfillmentConfigProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCalculationCadenceProjection<SubscriptionContractCalculationMultipleFulfillmentConfigProjection<PARENT, ROOT>, ROOT> cadence(
      ) {
     SubscriptionContractCalculationCadenceProjection<SubscriptionContractCalculationMultipleFulfillmentConfigProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractCalculationCadenceProjection<>(this, getRoot());
     getFields().put("cadence", projection);
     return projection;
  }

  public SubscriptionContractCalculationMultipleFulfillmentConfigProjection<PARENT, ROOT> numberOfFulfillments(
      ) {
    getFields().put("numberOfFulfillments", null);
    return this;
  }
}
