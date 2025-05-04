package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CustomerPaymentMethodFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CustomerPaymentMethodFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaymentMethod"));
  }

  public CustomerPaymentMethodFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerPaymentMethodFragmentProjection<PARENT, ROOT>, ROOT> customer(
      ) {
     CustomerProjection<CustomerPaymentMethodFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerPaymentInstrumentProjection<CustomerPaymentMethodFragmentProjection<PARENT, ROOT>, ROOT> instrument(
      ) {
     CustomerPaymentInstrumentProjection<CustomerPaymentMethodFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentInstrumentProjection<>(this, getRoot());
     getFields().put("instrument", projection);
     return projection;
  }

  public CustomerPaymentMethodRevocationReasonProjection<CustomerPaymentMethodFragmentProjection<PARENT, ROOT>, ROOT> revokedReason(
      ) {
     CustomerPaymentMethodRevocationReasonProjection<CustomerPaymentMethodFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodRevocationReasonProjection<>(this, getRoot());
     getFields().put("revokedReason", projection);
     return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerPaymentMethodFragmentProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      ) {
     SubscriptionContractConnectionProjection<CustomerPaymentMethodFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionContracts", projection);
     return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerPaymentMethodFragmentProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionContractConnectionProjection<CustomerPaymentMethodFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());    
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

  public CustomerPaymentMethodFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerPaymentMethodFragmentProjection<PARENT, ROOT> revokedAt() {
    getFields().put("revokedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CustomerPaymentMethod {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
