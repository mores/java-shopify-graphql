package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionBillingAttemptProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingAttempt"));
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> errorCode(
      ) {
    SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingAttemptErrorCodeProjection<>(this, this);    
    getFields().put("errorCode", projection);
    return projection;
  }

  public OrderProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public SubscriptionBillingAttemptProcessingErrorProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> processingError(
      ) {
    SubscriptionBillingAttemptProcessingErrorProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingAttemptProcessingErrorProjection<>(this, this);    
    getFields().put("processingError", projection);
    return projection;
  }

  public SubscriptionContractProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> subscriptionContract(
      ) {
    SubscriptionContractProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("subscriptionContract", projection);
    return projection;
  }

  public OrderTransactionConnectionProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> transactions(
      ) {
    OrderTransactionConnectionProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionConnectionProjection<>(this, this);    
    getFields().put("transactions", projection);
    return projection;
  }

  public OrderTransactionConnectionProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderTransactionConnectionProjection<SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>, SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionConnectionProjection<>(this, this);    
    getFields().put("transactions", projection);
    getInputArguments().computeIfAbsent("transactions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("transactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("transactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("transactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("transactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("transactions").add(reverseArg);
    return projection;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> errorMessage() {
    getFields().put("errorMessage", null);
    return this;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> idempotencyKey() {
    getFields().put("idempotencyKey", null);
    return this;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> nextActionUrl() {
    getFields().put("nextActionUrl", null);
    return this;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> originTime() {
    getFields().put("originTime", null);
    return this;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> paymentGroupId() {
    getFields().put("paymentGroupId", null);
    return this;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> paymentSessionId() {
    getFields().put("paymentSessionId", null);
    return this;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> ready() {
    getFields().put("ready", null);
    return this;
  }

  public SubscriptionBillingAttemptProjectionRoot<PARENT, ROOT> respectInventoryPolicy() {
    getFields().put("respectInventoryPolicy", null);
    return this;
  }
}
