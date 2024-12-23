package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public CatalogsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<CatalogsCountProjectionRoot<PARENT, ROOT>, CatalogsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<CatalogsCountProjectionRoot<PARENT, ROOT>, CatalogsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public CatalogsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
