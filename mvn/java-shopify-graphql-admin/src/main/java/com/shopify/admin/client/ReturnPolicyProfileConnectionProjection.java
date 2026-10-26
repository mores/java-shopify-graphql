package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnPolicyProfileConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnPolicyProfileConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnPolicyProfileConnection"));
  }

  public ReturnPolicyProfileConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnPolicyProfileEdgeProjection<ReturnPolicyProfileConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ReturnPolicyProfileEdgeProjection<ReturnPolicyProfileConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnPolicyProfileEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReturnPolicyProfileProjection<ReturnPolicyProfileConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ReturnPolicyProfileProjection<ReturnPolicyProfileConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnPolicyProfileProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReturnPolicyProfileConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ReturnPolicyProfileConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
