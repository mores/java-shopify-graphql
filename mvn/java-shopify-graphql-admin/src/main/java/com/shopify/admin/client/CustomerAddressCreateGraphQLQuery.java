package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MailingAddressInput;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates a new [`MailingAddress`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MailingAddress) for a [`Customer`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer). You can optionally set the address as the customer's default address.
 *   
 * You can only add addresses to existing customers. Each customer can have multiple addresses.
 */
public class CustomerAddressCreateGraphQLQuery extends GraphQLQuery {
  public CustomerAddressCreateGraphQLQuery(String customerId, MailingAddressInput address,
      Boolean setAsDefault, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (address != null || fieldsSet.contains("address")) {
        getInput().put("address", address);
    }if (setAsDefault != null || fieldsSet.contains("setAsDefault")) {
        getInput().put("setAsDefault", setAsDefault);
    }
  }

  public CustomerAddressCreateGraphQLQuery(String customerId, MailingAddressInput address,
      Boolean setAsDefault, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (address != null || fieldsSet.contains("address")) {
        getInput().put("address", address);
    }if (setAsDefault != null || fieldsSet.contains("setAsDefault")) {
        getInput().put("setAsDefault", setAsDefault);
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

    private String customerId;

    private MailingAddressInput address;

    private Boolean setAsDefault;

    private String queryName;

    public CustomerAddressCreateGraphQLQuery build() {
      return new CustomerAddressCreateGraphQLQuery(customerId, address, setAsDefault, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * Specifies the fields to use when creating the address.
     */
    public Builder address(MailingAddressInput address) {
      this.address = address;
      this.fieldsSet.add("address");
      return this;
    }

    /**
     * Specifies the fields to use when creating the address.
     */
    public Builder addressReference(String variableRef) {
      this.variableReferences.put("address", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MailingAddressInput"))).build());
      this.fieldsSet.add("address");
      return this;
    }

    /**
     * Whether to set the address as the customer's default address.
     */
    public Builder setAsDefault(Boolean setAsDefault) {
      this.setAsDefault = setAsDefault;
      this.fieldsSet.add("setAsDefault");
      return this;
    }

    /**
     * Whether to set the address as the customer's default address.
     */
    public Builder setAsDefaultReference(String variableRef) {
      this.variableReferences.put("setAsDefault", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("setAsDefault");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
