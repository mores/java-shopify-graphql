package com.shopify.admin.client;

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

  public PaymentMandateResourceConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> mandates(
      ) {
     PaymentMandateResourceConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> projection = new PaymentMandateResourceConnectionProjection<>(this, getRoot());
     getFields().put("mandates", projection);
     return projection;
  }

  public PaymentMandateResourceConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> mandates(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PaymentMandateResourceConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> projection = new PaymentMandateResourceConnectionProjection<>(this, getRoot());    
    getFields().put("mandates", projection);
    getInputArguments().computeIfAbsent("mandates", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("mandates").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("mandates").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("mandates").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("mandates").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("mandates").add(reverseArg);
    return projection;
  }

  public PaymentMandateResourceConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> mandatesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    PaymentMandateResourceConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> projection = new PaymentMandateResourceConnectionProjection<>(this, getRoot());    
    getFields().put("mandates", projection);
    getInputArguments().computeIfAbsent("mandates", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("mandates").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("mandates").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("mandates").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("mandates").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("mandates").add(reverseArg);
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
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("subscriptionContracts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("subscriptionContracts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("subscriptionContracts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("subscriptionContracts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("subscriptionContracts").add(reverseArg);
    return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> subscriptionContractsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionContractConnectionProjection<CustomerPaymentMethodProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());    
    getFields().put("subscriptionContracts", projection);
    getInputArguments().computeIfAbsent("subscriptionContracts", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("subscriptionContracts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("subscriptionContracts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("subscriptionContracts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("subscriptionContracts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
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
