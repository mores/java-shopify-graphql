package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public SegmentsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<SegmentsCountProjectionRoot<PARENT, ROOT>, SegmentsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<SegmentsCountProjectionRoot<PARENT, ROOT>, SegmentsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public SegmentsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
