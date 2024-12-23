package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BlogFeedProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogFeedProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BlogFeed"));
  }

  public BlogFeedProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BlogFeedProjection<PARENT, ROOT> location() {
    getFields().put("location", null);
    return this;
  }

  public BlogFeedProjection<PARENT, ROOT> path() {
    getFields().put("path", null);
    return this;
  }
}
