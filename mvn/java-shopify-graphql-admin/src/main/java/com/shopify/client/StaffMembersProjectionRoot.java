package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StaffMembersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StaffMembersProjectionRoot() {
    super(null, null, java.util.Optional.of("StaffMemberConnection"));
  }

  public StaffMembersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StaffMemberEdgeProjection<StaffMembersProjectionRoot<PARENT, ROOT>, StaffMembersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    StaffMemberEdgeProjection<StaffMembersProjectionRoot<PARENT, ROOT>, StaffMembersProjectionRoot<PARENT, ROOT>> projection = new StaffMemberEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public StaffMemberProjection<StaffMembersProjectionRoot<PARENT, ROOT>, StaffMembersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    StaffMemberProjection<StaffMembersProjectionRoot<PARENT, ROOT>, StaffMembersProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<StaffMembersProjectionRoot<PARENT, ROOT>, StaffMembersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<StaffMembersProjectionRoot<PARENT, ROOT>, StaffMembersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
