package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerGenerateAccountActivationUrlProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerGenerateAccountActivationUrlProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerGenerateAccountActivationUrlPayload"));
  }

  public CustomerGenerateAccountActivationUrlProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<CustomerGenerateAccountActivationUrlProjectionRoot<PARENT, ROOT>, CustomerGenerateAccountActivationUrlProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerGenerateAccountActivationUrlProjectionRoot<PARENT, ROOT>, CustomerGenerateAccountActivationUrlProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerGenerateAccountActivationUrlProjectionRoot<PARENT, ROOT> accountActivationUrl() {
    getFields().put("accountActivationUrl", null);
    return this;
  }
}
