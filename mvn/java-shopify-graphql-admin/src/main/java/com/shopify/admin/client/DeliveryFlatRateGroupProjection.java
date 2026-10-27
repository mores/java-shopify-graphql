package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryFlatRateGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryFlatRateGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryFlatRateGroup"));
  }

  public DeliveryFlatRateGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryRateGroupConditionsProjection<DeliveryFlatRateGroupProjection<PARENT, ROOT>, ROOT> conditions(
      ) {
     DeliveryRateGroupConditionsProjection<DeliveryFlatRateGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryRateGroupConditionsProjection<>(this, getRoot());
     getFields().put("conditions", projection);
     return projection;
  }

  public DeliveryFlatRateProjection<DeliveryFlatRateGroupProjection<PARENT, ROOT>, ROOT> rate() {
     DeliveryFlatRateProjection<DeliveryFlatRateGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryFlatRateProjection<>(this, getRoot());
     getFields().put("rate", projection);
     return projection;
  }

  public DeliveryFlatRateGroupProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
