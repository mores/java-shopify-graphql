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
 * Removes a shipping line from an existing order. For more information on how to
 * use the GraphQL Admin API to edit an existing order, refer to [Edit existing orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
 */
public class OrderEditRemoveShippingLineGraphQLQuery extends GraphQLQuery {
  public OrderEditRemoveShippingLineGraphQLQuery(String id, String shippingLineId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (shippingLineId != null || fieldsSet.contains("shippingLineId")) {
        getInput().put("shippingLineId", shippingLineId);
    }
  }

  public OrderEditRemoveShippingLineGraphQLQuery(String id, String shippingLineId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (shippingLineId != null || fieldsSet.contains("shippingLineId")) {
        getInput().put("shippingLineId", shippingLineId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public OrderEditRemoveShippingLineGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditRemoveShippingLine";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String shippingLineId;

    private String queryName;

    public OrderEditRemoveShippingLineGraphQLQuery build() {
      return new OrderEditRemoveShippingLineGraphQLQuery(id, shippingLineId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * or the order edit session to edit. This is the edit from which the shipping line is removed.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * or the order edit session to edit. This is the edit from which the shipping line is removed.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the calculated shipping line to remove.
     */
    public Builder shippingLineId(String shippingLineId) {
      this.shippingLineId = shippingLineId;
      this.fieldsSet.add("shippingLineId");
      return this;
    }

    /**
     * The ID of the calculated shipping line to remove.
     */
    public Builder shippingLineIdReference(String variableRef) {
      this.variableReferences.put("shippingLineId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("shippingLineId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
