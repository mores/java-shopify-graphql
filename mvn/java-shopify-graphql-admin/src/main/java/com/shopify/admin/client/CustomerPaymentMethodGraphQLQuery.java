package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Returns a vaulted customer payment method by its ID, including the instrument
 * type (credit card, PayPal, etc.), billing address, and current status.
 * Optionally includes revoked payment methods. Use this to look up a specific
 * saved payment method for a customer — for example, to check whether a
 * subscription's payment method is still valid or to display stored payment details.
 */
public class CustomerPaymentMethodGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodGraphQLQuery(String id, Boolean showRevoked, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (showRevoked != null || fieldsSet.contains("showRevoked")) {
        getInput().put("showRevoked", showRevoked);
    }
  }

  public CustomerPaymentMethodGraphQLQuery(String id, Boolean showRevoked, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (showRevoked != null || fieldsSet.contains("showRevoked")) {
        getInput().put("showRevoked", showRevoked);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerPaymentMethodGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethod";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private Boolean showRevoked;

    private String queryName;

    public CustomerPaymentMethodGraphQLQuery build() {
      return new CustomerPaymentMethodGraphQLQuery(id, showRevoked, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the CustomerPaymentMethod to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the CustomerPaymentMethod to return.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Whether to show the customer's revoked payment method.
     */
    public Builder showRevoked(Boolean showRevoked) {
      this.showRevoked = showRevoked;
      this.fieldsSet.add("showRevoked");
      return this;
    }

    /**
     * Whether to show the customer's revoked payment method.
     */
    public Builder showRevokedReference(String variableRef) {
      this.variableReferences.put("showRevoked", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("showRevoked");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
