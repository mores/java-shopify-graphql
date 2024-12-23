package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CustomerPaymentMethodProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethod"));
  }

  public CustomerPaymentMethodProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerPaymentMethodProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerPaymentMethodProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerPaymentInstrumentProjection<CustomerPaymentMethodProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodProjectionRoot<PARENT, ROOT>> instrument(
      ) {
    CustomerPaymentInstrumentProjection<CustomerPaymentMethodProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentInstrumentProjection<>(this, this);    
    getFields().put("instrument", projection);
    return projection;
  }

  public CustomerPaymentMethodRevocationReasonProjection<CustomerPaymentMethodProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodProjectionRoot<PARENT, ROOT>> revokedReason(
      ) {
    CustomerPaymentMethodRevocationReasonProjection<CustomerPaymentMethodProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodRevocationReasonProjection<>(this, this);    
    getFields().put("revokedReason", projection);
    return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerPaymentMethodProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodProjectionRoot<PARENT, ROOT>> subscriptionContracts(
      ) {
    SubscriptionContractConnectionProjection<CustomerPaymentMethodProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractConnectionProjection<>(this, this);    
    getFields().put("subscriptionContracts", projection);
    return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerPaymentMethodProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodProjectionRoot<PARENT, ROOT>> subscriptionContracts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionContractConnectionProjection<CustomerPaymentMethodProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractConnectionProjection<>(this, this);    
    getFields().put("subscriptionContracts", projection);
    getInputArguments().computeIfAbsent("subscriptionContracts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("subscriptionContracts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("subscriptionContracts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("subscriptionContracts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("subscriptionContracts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("subscriptionContracts").add(reverseArg);
    return projection;
  }

  public CustomerPaymentMethodProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerPaymentMethodProjectionRoot<PARENT, ROOT> revokedAt() {
    getFields().put("revokedAt", null);
    return this;
  }
}
