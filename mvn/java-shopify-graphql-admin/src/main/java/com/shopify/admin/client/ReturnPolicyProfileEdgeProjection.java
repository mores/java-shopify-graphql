package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnPolicyProfileEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnPolicyProfileEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnPolicyProfileEdge"));
  }

  public ReturnPolicyProfileEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnPolicyProfileProjection<ReturnPolicyProfileEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ReturnPolicyProfileProjection<ReturnPolicyProfileEdgeProjection<PARENT, ROOT>, ROOT> projection = new ReturnPolicyProfileProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ReturnPolicyProfileEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
