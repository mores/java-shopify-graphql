package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerDeletePayload"));
  }

  public CustomerDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopProjection<CustomerDeleteProjectionRoot<PARENT, ROOT>, CustomerDeleteProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<CustomerDeleteProjectionRoot<PARENT, ROOT>, CustomerDeleteProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<CustomerDeleteProjectionRoot<PARENT, ROOT>, CustomerDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerDeleteProjectionRoot<PARENT, ROOT>, CustomerDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerDeleteProjectionRoot<PARENT, ROOT> deletedCustomerId() {
    getFields().put("deletedCustomerId", null);
    return this;
  }
}
