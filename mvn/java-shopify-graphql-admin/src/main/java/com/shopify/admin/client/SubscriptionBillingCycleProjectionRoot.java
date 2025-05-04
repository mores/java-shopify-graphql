package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SubscriptionBillingCycleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycle"));
  }

  public SubscriptionBillingCycleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptConnectionProjection<SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>> billingAttempts(
      ) {
    SubscriptionBillingAttemptConnectionProjection<SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, this);    
    getFields().put("billingAttempts", projection);
    return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>> billingAttempts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionBillingAttemptConnectionProjection<SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, this);    
    getFields().put("billingAttempts", projection);
    getInputArguments().computeIfAbsent("billingAttempts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("billingAttempts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("billingAttempts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("billingAttempts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("billingAttempts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("billingAttempts").add(reverseArg);
    return projection;
  }

  public SubscriptionBillingCycleEditedContractProjection<SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>> editedContract(
      ) {
    SubscriptionBillingCycleEditedContractProjection<SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleEditedContractProjection<>(this, this);    
    getFields().put("editedContract", projection);
    return projection;
  }

  public SubscriptionContractProjection<SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>> sourceContract(
      ) {
    SubscriptionContractProjection<SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("sourceContract", projection);
    return projection;
  }

  public SubscriptionBillingCycleBillingCycleStatusProjection<SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>> status(
      ) {
    SubscriptionBillingCycleBillingCycleStatusProjection<SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleBillingCycleStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public SubscriptionBillingCycleProjectionRoot<PARENT, ROOT> billingAttemptExpectedDate() {
    getFields().put("billingAttemptExpectedDate", null);
    return this;
  }

  public SubscriptionBillingCycleProjectionRoot<PARENT, ROOT> cycleEndAt() {
    getFields().put("cycleEndAt", null);
    return this;
  }

  public SubscriptionBillingCycleProjectionRoot<PARENT, ROOT> cycleIndex() {
    getFields().put("cycleIndex", null);
    return this;
  }

  public SubscriptionBillingCycleProjectionRoot<PARENT, ROOT> cycleStartAt() {
    getFields().put("cycleStartAt", null);
    return this;
  }

  public SubscriptionBillingCycleProjectionRoot<PARENT, ROOT> edited() {
    getFields().put("edited", null);
    return this;
  }

  public SubscriptionBillingCycleProjectionRoot<PARENT, ROOT> skipped() {
    getFields().put("skipped", null);
    return this;
  }
}
