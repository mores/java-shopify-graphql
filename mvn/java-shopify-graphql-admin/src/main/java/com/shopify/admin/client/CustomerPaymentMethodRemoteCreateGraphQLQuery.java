package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerPaymentMethodRemoteInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates a customer payment method using identifiers from remote payment
 * gateways like Stripe, Authorize.Net, or Braintree. Imports existing payment
 * methods from external gateways and associates them with [`Customer`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
 * objects in Shopify.
 *   
 * The operation processes payment methods asynchronously. The returned [`CustomerPaymentMethod`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerPaymentMethod)
 * initially has incomplete details while Shopify validates and processes the
 * remote gateway information. Use the [`customerPaymentMethod`](https://shopify.dev/docs/api/admin-graphql/latest/queries/customerPaymentMethod)
 * query to retrieve the payment method status until all details are available or
 * the payment method is revoked.
 *   
 * Learn more about [migrating customer payment methods from remote gateways](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/migrate-to-subscriptions-api/migrate-customer-information#step-2-import-payment-methods-for-customers).
 */
public class CustomerPaymentMethodRemoteCreateGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodRemoteCreateGraphQLQuery(String customerId,
      CustomerPaymentMethodRemoteInput remoteReference, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (remoteReference != null || fieldsSet.contains("remoteReference")) {
        getInput().put("remoteReference", remoteReference);
    }
  }

  public CustomerPaymentMethodRemoteCreateGraphQLQuery(String customerId,
      CustomerPaymentMethodRemoteInput remoteReference, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (remoteReference != null || fieldsSet.contains("remoteReference")) {
        getInput().put("remoteReference", remoteReference);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerPaymentMethodRemoteCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodRemoteCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String customerId;

    private CustomerPaymentMethodRemoteInput remoteReference;

    private String queryName;

    public CustomerPaymentMethodRemoteCreateGraphQLQuery build() {
      return new CustomerPaymentMethodRemoteCreateGraphQLQuery(customerId, remoteReference, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the customer.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * The ID of the customer.
     */
    public Builder customerIdReference(String variableRef) {
      this.variableReferences.put("customerId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * Remote gateway payment method details.
     */
    public Builder remoteReference(CustomerPaymentMethodRemoteInput remoteReference) {
      this.remoteReference = remoteReference;
      this.fieldsSet.add("remoteReference");
      return this;
    }

    /**
     * Remote gateway payment method details.
     */
    public Builder remoteReferenceReference(String variableRef) {
      this.variableReferences.put("remoteReference", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CustomerPaymentMethodRemoteInput"))).build());
      this.fieldsSet.add("remoteReference");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
