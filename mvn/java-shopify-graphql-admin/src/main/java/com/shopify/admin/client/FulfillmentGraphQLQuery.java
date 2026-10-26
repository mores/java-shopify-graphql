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
 * Retrieves a [`Fulfillment`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Fulfillment) by its ID. A fulfillment is a record that the merchant has completed their
 * work required for one or more line items in an
 * [`Order`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order). It
 * includes tracking information, [`LineItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem)
 * objects, and the status of the fulfillment.
 *   
 * Use this query to track the progress of shipped items, view tracking details,
 * or check [fulfillment events](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentEvent)
 * for example when a package is out for delivery or delivered.
 */
public class FulfillmentGraphQLQuery extends GraphQLQuery {
  public FulfillmentGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public FulfillmentGraphQLQuery(String id, String queryName, Set<String> fieldsSet,
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

  public FulfillmentGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "fulfillment";
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

    public FulfillmentGraphQLQuery build() {
      return new FulfillmentGraphQLQuery(id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the Fulfillment to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the Fulfillment to return.
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
