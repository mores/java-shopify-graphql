package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StaffMemberConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StaffMemberConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StaffMemberConnection"));
  }

  public StaffMemberConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StaffMemberEdgeProjection<StaffMemberConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     StaffMemberEdgeProjection<StaffMemberConnectionProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public StaffMemberProjection<StaffMemberConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     StaffMemberProjection<StaffMemberConnectionProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<StaffMemberConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<StaffMemberConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
