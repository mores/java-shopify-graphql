package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonedCheckoutsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonedCheckoutsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public AbandonedCheckoutsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<AbandonedCheckoutsCountProjectionRoot<PARENT, ROOT>, AbandonedCheckoutsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<AbandonedCheckoutsCountProjectionRoot<PARENT, ROOT>, AbandonedCheckoutsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public AbandonedCheckoutsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
