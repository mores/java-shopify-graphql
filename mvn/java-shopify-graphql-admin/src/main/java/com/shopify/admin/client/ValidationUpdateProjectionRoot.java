package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ValidationUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ValidationUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ValidationUpdatePayload"));
  }

  public ValidationUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ValidationUserErrorProjection<ValidationUpdateProjectionRoot<PARENT, ROOT>, ValidationUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ValidationUserErrorProjection<ValidationUpdateProjectionRoot<PARENT, ROOT>, ValidationUpdateProjectionRoot<PARENT, ROOT>> projection = new ValidationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ValidationProjection<ValidationUpdateProjectionRoot<PARENT, ROOT>, ValidationUpdateProjectionRoot<PARENT, ROOT>> validation(
      ) {
    ValidationProjection<ValidationUpdateProjectionRoot<PARENT, ROOT>, ValidationUpdateProjectionRoot<PARENT, ROOT>> projection = new ValidationProjection<>(this, this);    
    getFields().put("validation", projection);
    return projection;
  }
}
