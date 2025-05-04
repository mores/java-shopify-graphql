package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ValidationCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ValidationCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ValidationCreatePayload"));
  }

  public ValidationCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ValidationUserErrorProjection<ValidationCreateProjectionRoot<PARENT, ROOT>, ValidationCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ValidationUserErrorProjection<ValidationCreateProjectionRoot<PARENT, ROOT>, ValidationCreateProjectionRoot<PARENT, ROOT>> projection = new ValidationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ValidationProjection<ValidationCreateProjectionRoot<PARENT, ROOT>, ValidationCreateProjectionRoot<PARENT, ROOT>> validation(
      ) {
    ValidationProjection<ValidationCreateProjectionRoot<PARENT, ROOT>, ValidationCreateProjectionRoot<PARENT, ROOT>> projection = new ValidationProjection<>(this, this);    
    getFields().put("validation", projection);
    return projection;
  }
}
