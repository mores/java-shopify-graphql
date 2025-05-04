package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppCreditConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppCreditConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppCreditConnection"));
  }

  public AppCreditConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppCreditEdgeProjection<AppCreditConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     AppCreditEdgeProjection<AppCreditConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppCreditEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AppCreditProjection<AppCreditConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     AppCreditProjection<AppCreditConnectionProjection<PARENT, ROOT>, ROOT> projection = new AppCreditProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AppCreditConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<AppCreditConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
