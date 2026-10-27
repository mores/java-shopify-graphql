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
 * Removes a line item discount that was applied as part of an order edit.
 */
public class OrderEditRemoveLineItemDiscountGraphQLQuery extends GraphQLQuery {
  public OrderEditRemoveLineItemDiscountGraphQLQuery(String id, String discountApplicationId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (discountApplicationId != null || fieldsSet.contains("discountApplicationId")) {
        getInput().put("discountApplicationId", discountApplicationId);
    }
  }

  public OrderEditRemoveLineItemDiscountGraphQLQuery(String id, String discountApplicationId,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (discountApplicationId != null || fieldsSet.contains("discountApplicationId")) {
        getInput().put("discountApplicationId", discountApplicationId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public OrderEditRemoveLineItemDiscountGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditRemoveLineItemDiscount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String discountApplicationId;

    private String queryName;

    public OrderEditRemoveLineItemDiscountGraphQLQuery build() {
      return new OrderEditRemoveLineItemDiscountGraphQLQuery(id, discountApplicationId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * or the order edit session to edit. This is the edit from which the line item discount is removed.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * or the order edit session to edit. This is the edit from which the line item discount is removed.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the [calculated discount application](https://shopify.dev/api/admin-graphql/latest/interfaces/calculateddiscountapplication)
     * to remove.
     */
    public Builder discountApplicationId(String discountApplicationId) {
      this.discountApplicationId = discountApplicationId;
      this.fieldsSet.add("discountApplicationId");
      return this;
    }

    /**
     * The ID of the [calculated discount application](https://shopify.dev/api/admin-graphql/latest/interfaces/calculateddiscountapplication)
     * to remove.
     */
    public Builder discountApplicationIdReference(String variableRef) {
      this.variableReferences.put("discountApplicationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("discountApplicationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
