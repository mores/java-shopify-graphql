package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StaffMemberEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StaffMemberEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StaffMemberEdge"));
  }

  public StaffMemberEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StaffMemberProjection<StaffMemberEdgeProjection<PARENT, ROOT>, ROOT> node() {
     StaffMemberProjection<StaffMemberEdgeProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public StaffMemberEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
