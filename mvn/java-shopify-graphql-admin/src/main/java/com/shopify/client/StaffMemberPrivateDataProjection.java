package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StaffMemberPrivateDataProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StaffMemberPrivateDataProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StaffMemberPrivateData"));
  }

  public StaffMemberPrivateDataProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StaffMemberPermissionProjection<StaffMemberPrivateDataProjection<PARENT, ROOT>, ROOT> permissions(
      ) {
     StaffMemberPermissionProjection<StaffMemberPrivateDataProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberPermissionProjection<>(this, getRoot());
     getFields().put("permissions", projection);
     return projection;
  }

  public StaffMemberPrivateDataProjection<PARENT, ROOT> accountSettingsUrl() {
    getFields().put("accountSettingsUrl", null);
    return this;
  }

  public StaffMemberPrivateDataProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }
}
