package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrdersCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrdersCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public DraftOrdersCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<DraftOrdersCountProjectionRoot<PARENT, ROOT>, DraftOrdersCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<DraftOrdersCountProjectionRoot<PARENT, ROOT>, DraftOrdersCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public DraftOrdersCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
