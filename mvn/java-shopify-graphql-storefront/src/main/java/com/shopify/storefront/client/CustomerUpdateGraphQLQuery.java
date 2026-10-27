package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CustomerUpdateInput;
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
 * Updates a [customer's](https://shopify.dev/docs/api/storefront/current/objects/Customer)
 * personal information such as name, password, and marketing preferences.
 * Requires a valid [`CustomerAccessToken`](https://shopify.dev/docs/api/storefront/current/objects/CustomerAccessToken)
 * to authenticate the customer making the update.
 *   
 * If the customer's password is updated, then all previous access tokens become
 * invalid. The mutation returns a new access token in the payload to maintain
 * the customer's session.
 *   
 * > Caution:
 * > Password changes invalidate all existing access tokens. Ensure your app
 * handles the new token returned in the response to avoid logging the customer out.
 */
public class CustomerUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerUpdateGraphQLQuery(String customerAccessToken, CustomerUpdateInput customer,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }if (customer != null || fieldsSet.contains("customer")) {
        getInput().put("customer", customer);
    }
  }

  public CustomerUpdateGraphQLQuery(String customerAccessToken, CustomerUpdateInput customer,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }if (customer != null || fieldsSet.contains("customer")) {
        getInput().put("customer", customer);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String customerAccessToken;

    private CustomerUpdateInput customer;

    private String queryName;

    public CustomerUpdateGraphQLQuery build() {
      return new CustomerUpdateGraphQLQuery(customerAccessToken, customer, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The access token used to identify the customer.
     */
    public Builder customerAccessToken(String customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      this.fieldsSet.add("customerAccessToken");
      return this;
    }

    /**
     * The access token used to identify the customer.
     */
    public Builder customerAccessTokenReference(String variableRef) {
      this.variableReferences.put("customerAccessToken", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("customerAccessToken");
      return this;
    }

    /**
     * The customer object input.
     */
    public Builder customer(CustomerUpdateInput customer) {
      this.customer = customer;
      this.fieldsSet.add("customer");
      return this;
    }

    /**
     * The customer object input.
     */
    public Builder customerReference(String variableRef) {
      this.variableReferences.put("customer", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CustomerUpdateInput"))).build());
      this.fieldsSet.add("customer");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
