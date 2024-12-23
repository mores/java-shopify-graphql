package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentReminderSendProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentReminderSendProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentReminderSendPayload"));
  }

  public PaymentReminderSendProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentReminderSendUserErrorProjection<PaymentReminderSendProjectionRoot<PARENT, ROOT>, PaymentReminderSendProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PaymentReminderSendUserErrorProjection<PaymentReminderSendProjectionRoot<PARENT, ROOT>, PaymentReminderSendProjectionRoot<PARENT, ROOT>> projection = new PaymentReminderSendUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PaymentReminderSendProjectionRoot<PARENT, ROOT> success() {
    getFields().put("success", null);
    return this;
  }
}
