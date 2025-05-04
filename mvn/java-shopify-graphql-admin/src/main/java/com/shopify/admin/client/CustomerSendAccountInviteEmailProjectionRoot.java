package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSendAccountInviteEmailProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSendAccountInviteEmailProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerSendAccountInviteEmailPayload"));
  }

  public CustomerSendAccountInviteEmailProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerSendAccountInviteEmailProjectionRoot<PARENT, ROOT>, CustomerSendAccountInviteEmailProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerSendAccountInviteEmailProjectionRoot<PARENT, ROOT>, CustomerSendAccountInviteEmailProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerSendAccountInviteEmailUserErrorProjection<CustomerSendAccountInviteEmailProjectionRoot<PARENT, ROOT>, CustomerSendAccountInviteEmailProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerSendAccountInviteEmailUserErrorProjection<CustomerSendAccountInviteEmailProjectionRoot<PARENT, ROOT>, CustomerSendAccountInviteEmailProjectionRoot<PARENT, ROOT>> projection = new CustomerSendAccountInviteEmailUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
