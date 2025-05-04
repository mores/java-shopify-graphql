package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerCancelDataErasureProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerCancelDataErasureProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerCancelDataErasurePayload"));
  }

  public CustomerCancelDataErasureProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerCancelDataErasureUserErrorProjection<CustomerCancelDataErasureProjectionRoot<PARENT, ROOT>, CustomerCancelDataErasureProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerCancelDataErasureUserErrorProjection<CustomerCancelDataErasureProjectionRoot<PARENT, ROOT>, CustomerCancelDataErasureProjectionRoot<PARENT, ROOT>> projection = new CustomerCancelDataErasureUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerCancelDataErasureProjectionRoot<PARENT, ROOT> customerId() {
    getFields().put("customerId", null);
    return this;
  }
}
