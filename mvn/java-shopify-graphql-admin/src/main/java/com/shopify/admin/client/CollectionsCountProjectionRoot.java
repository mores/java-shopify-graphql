package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public CollectionsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<CollectionsCountProjectionRoot<PARENT, ROOT>, CollectionsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<CollectionsCountProjectionRoot<PARENT, ROOT>, CollectionsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public CollectionsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
