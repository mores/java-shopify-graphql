package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ValidationDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ValidationDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ValidationDeletePayload"));
  }

  public ValidationDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ValidationUserErrorProjection<ValidationDeleteProjectionRoot<PARENT, ROOT>, ValidationDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ValidationUserErrorProjection<ValidationDeleteProjectionRoot<PARENT, ROOT>, ValidationDeleteProjectionRoot<PARENT, ROOT>> projection = new ValidationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ValidationDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
