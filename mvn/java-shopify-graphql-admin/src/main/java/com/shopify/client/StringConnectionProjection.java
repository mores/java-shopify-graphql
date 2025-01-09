package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StringConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StringConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StringConnection"));
  }

  public StringConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StringEdgeProjection<StringConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     StringEdgeProjection<StringConnectionProjection<PARENT, ROOT>, ROOT> projection = new StringEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PageInfoProjection<StringConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<StringConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }

  public StringConnectionProjection<PARENT, ROOT> nodes() {
    getFields().put("nodes", null);
    return this;
  }
}
