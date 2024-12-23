package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StaffMemberPermissionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StaffMemberPermissionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StaffMemberPermission"));
  }

  public StaffMemberPermissionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
