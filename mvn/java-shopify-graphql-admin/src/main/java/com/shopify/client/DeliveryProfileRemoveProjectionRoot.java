package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryProfileRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfileRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryProfileRemovePayload"));
  }

  public DeliveryProfileRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<DeliveryProfileRemoveProjectionRoot<PARENT, ROOT>, DeliveryProfileRemoveProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<DeliveryProfileRemoveProjectionRoot<PARENT, ROOT>, DeliveryProfileRemoveProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UserErrorProjection<DeliveryProfileRemoveProjectionRoot<PARENT, ROOT>, DeliveryProfileRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DeliveryProfileRemoveProjectionRoot<PARENT, ROOT>, DeliveryProfileRemoveProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
