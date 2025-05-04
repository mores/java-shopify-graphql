package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentReminderSendUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentReminderSendUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentReminderSendUserError"));
  }

  public PaymentReminderSendUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentReminderSendUserErrorCodeProjection<PaymentReminderSendUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PaymentReminderSendUserErrorCodeProjection<PaymentReminderSendUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PaymentReminderSendUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PaymentReminderSendUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PaymentReminderSendUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
