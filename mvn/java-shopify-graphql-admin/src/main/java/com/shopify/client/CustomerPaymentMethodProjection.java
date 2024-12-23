package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CustomerPaymentMethodProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaymentMethod"));
  }

  public CustomerPaymentMethodProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerPaymentInstrumentProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> instrument(
      ) {
     CustomerPaymentInstrumentProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentInstrumentProjection<>(this, getRoot());
     getFields().put("instrument", projection);
     return projection;
  }

  public CustomerPaymentMethodRevocationReasonProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> revokedReason(
      ) {
     CustomerPaymentMethodRevocationReasonProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodRevocationReasonProjection<>(this, getRoot());
     getFields().put("revokedReason", projection);
     return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      ) {
     SubscriptionContractConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionContracts", projection);
     return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionContractConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());    
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

  public CustomerPaymentMethodProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerPaymentMethodProjection<PARENT, ROOT> revokedAt() {
    getFields().put("revokedAt", null);
    return this;
  }
}
