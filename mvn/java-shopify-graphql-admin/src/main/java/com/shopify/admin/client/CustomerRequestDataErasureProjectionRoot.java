package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerRequestDataErasureProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerRequestDataErasureProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerRequestDataErasurePayload"));
  }

  public CustomerRequestDataErasureProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerRequestDataErasureUserErrorProjection<CustomerRequestDataErasureProjectionRoot<PARENT, ROOT>, CustomerRequestDataErasureProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerRequestDataErasureUserErrorProjection<CustomerRequestDataErasureProjectionRoot<PARENT, ROOT>, CustomerRequestDataErasureProjectionRoot<PARENT, ROOT>> projection = new CustomerRequestDataErasureUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerRequestDataErasureProjectionRoot<PARENT, ROOT> customerId() {
    getFields().put("customerId", null);
    return this;
  }
}
