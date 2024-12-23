package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BlogsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public BlogsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<BlogsCountProjectionRoot<PARENT, ROOT>, BlogsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<BlogsCountProjectionRoot<PARENT, ROOT>, BlogsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public BlogsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
