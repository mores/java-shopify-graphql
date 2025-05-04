package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSegmentMemberEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSegmentMemberEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSegmentMemberEdge"));
  }

  public CustomerSegmentMemberEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSegmentMemberProjection<CustomerSegmentMemberEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CustomerSegmentMemberProjection<CustomerSegmentMemberEdgeProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMemberProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CustomerSegmentMemberEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
