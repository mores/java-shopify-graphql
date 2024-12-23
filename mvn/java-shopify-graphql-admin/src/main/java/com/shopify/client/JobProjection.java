package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class JobProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public JobProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Job"));
  }

  public JobProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QueryProjection<JobProjection<PARENT, ROOT>, ROOT> query() {
     QueryProjection<JobProjection<PARENT, ROOT>, ROOT> projection = new QueryProjection<>(this, getRoot());
     getFields().put("query", projection);
     return projection;
  }

  public JobProjection<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public JobProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
