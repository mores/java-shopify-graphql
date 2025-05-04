package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ValidationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ValidationsProjectionRoot() {
    super(null, null, java.util.Optional.of("ValidationConnection"));
  }

  public ValidationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ValidationEdgeProjection<ValidationsProjectionRoot<PARENT, ROOT>, ValidationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ValidationEdgeProjection<ValidationsProjectionRoot<PARENT, ROOT>, ValidationsProjectionRoot<PARENT, ROOT>> projection = new ValidationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ValidationProjection<ValidationsProjectionRoot<PARENT, ROOT>, ValidationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ValidationProjection<ValidationsProjectionRoot<PARENT, ROOT>, ValidationsProjectionRoot<PARENT, ROOT>> projection = new ValidationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ValidationsProjectionRoot<PARENT, ROOT>, ValidationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ValidationsProjectionRoot<PARENT, ROOT>, ValidationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
