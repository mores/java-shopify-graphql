package com.shopify.admin.client;

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
 * Retrieves a [`SubscriptionContract`](https://shopify.dev/docs/api/customer/latest/objects/SubscriptionContract) by ID.
 *   
 * The contract tracks the subscription's lifecycle through various [statuses](https://shopify.dev/docs/api/admin-graphql/latest/queries/subscriptionContract#returns-SubscriptionContract.fields.status),
 * and links to related billing attempts, generated
 * [`Order`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
 * objects, and the customer's [`CustomerPaymentMethod`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerPaymentMethod).
 */
public class SubscriptionContractGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public SubscriptionContractGraphQLQuery(String id, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionContractGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContract";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String queryName;

    public SubscriptionContractGraphQLQuery build() {
      return new SubscriptionContractGraphQLQuery(id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the Subscription Contract to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the Subscription Contract to return.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
