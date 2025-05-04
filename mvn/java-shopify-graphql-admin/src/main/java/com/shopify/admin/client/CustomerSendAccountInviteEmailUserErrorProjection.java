package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSendAccountInviteEmailUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSendAccountInviteEmailUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSendAccountInviteEmailUserError"));
  }

  public CustomerSendAccountInviteEmailUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSendAccountInviteEmailUserErrorCodeProjection<CustomerSendAccountInviteEmailUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerSendAccountInviteEmailUserErrorCodeProjection<CustomerSendAccountInviteEmailUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerSendAccountInviteEmailUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerSendAccountInviteEmailUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerSendAccountInviteEmailUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
