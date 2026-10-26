package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.MailingAddressInput;
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
 * Creates a new [`MailingAddress`](https://shopify.dev/docs/api/storefront/current/objects/MailingAddress) for a [`Customer`](https://shopify.dev/docs/api/storefront/current/objects/Customer). Use the customer's [access token](https://shopify.dev/docs/api/storefront/current/mutations/customerAddressCreate#arguments-customerAccessToken)
 * to identify them. Successful creation returns the new address. 
 *   
 * Each customer can have multiple addresses.
 */
public class CustomerAddressCreateGraphQLQuery extends GraphQLQuery {
  public CustomerAddressCreateGraphQLQuery(String customerAccessToken, MailingAddressInput address,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }if (address != null || fieldsSet.contains("address")) {
        getInput().put("address", address);
    }
  }

  public CustomerAddressCreateGraphQLQuery(String customerAccessToken, MailingAddressInput address,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }if (address != null || fieldsSet.contains("address")) {
        getInput().put("address", address);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerAddressCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerAddressCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String customerAccessToken;

    private MailingAddressInput address;

    private String queryName;

    public CustomerAddressCreateGraphQLQuery build() {
      return new CustomerAddressCreateGraphQLQuery(customerAccessToken, address, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The customer mailing address to create.
     */
    public Builder address(MailingAddressInput address) {
      this.address = address;
      this.fieldsSet.add("address");
      return this;
    }

    /**
     * The customer mailing address to create.
     */
    public Builder addressReference(String variableRef) {
      this.variableReferences.put("address", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MailingAddressInput"))).build());
      this.fieldsSet.add("address");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
