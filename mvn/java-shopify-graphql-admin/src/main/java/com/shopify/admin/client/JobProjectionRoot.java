package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class JobProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public JobProjectionRoot() {
    super(null, null, java.util.Optional.of("Job"));
  }

  public JobProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QueryProjection<JobProjectionRoot<PARENT, ROOT>, JobProjectionRoot<PARENT, ROOT>> query() {
    QueryProjection<JobProjectionRoot<PARENT, ROOT>, JobProjectionRoot<PARENT, ROOT>> projection = new QueryProjection<>(this, this);    
    getFields().put("query", projection);
    return projection;
  }

  public JobProjectionRoot<PARENT, ROOT> done() {
    getFields().put("done", null);
    return this;
  }

  public JobProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
