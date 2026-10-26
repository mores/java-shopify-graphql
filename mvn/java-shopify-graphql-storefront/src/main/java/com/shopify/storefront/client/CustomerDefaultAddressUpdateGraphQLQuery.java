package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Updates the default address of an existing [`Customer`](https://shopify.dev/docs/api/storefront/current/objects/Customer).
 * Requires a [customer access token](https://shopify.dev/docs/api/storefront/current/mutations/customerDefaultAddressUpdate#arguments-customerAccessToken)
 * to identify the customer and an address ID to specify which address to set as
 * the new default.
 */
public class CustomerDefaultAddressUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerDefaultAddressUpdateGraphQLQuery(String customerAccessToken, String addressId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }if (addressId != null || fieldsSet.contains("addressId")) {
        getInput().put("addressId", addressId);
    }
  }

  public CustomerDefaultAddressUpdateGraphQLQuery(String customerAccessToken, String addressId,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }if (addressId != null || fieldsSet.contains("addressId")) {
        getInput().put("addressId", addressId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerDefaultAddressUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerDefaultAddressUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String customerAccessToken;

    private String addressId;

    private String queryName;

    public CustomerDefaultAddressUpdateGraphQLQuery build() {
      return new CustomerDefaultAddressUpdateGraphQLQuery(customerAccessToken, addressId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * ID of the address to set as the new default for the customer.
     */
    public Builder addressId(String addressId) {
      this.addressId = addressId;
      this.fieldsSet.add("addressId");
      return this;
    }

    /**
     * ID of the address to set as the new default for the customer.
     */
    public Builder addressIdReference(String variableRef) {
      this.variableReferences.put("addressId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("addressId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
