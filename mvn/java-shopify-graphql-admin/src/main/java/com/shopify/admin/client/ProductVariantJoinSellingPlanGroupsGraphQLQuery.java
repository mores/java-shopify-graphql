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
 * Adds multiple selling plan groups to a product variant.
 */
public class ProductVariantJoinSellingPlanGroupsGraphQLQuery extends GraphQLQuery {
  public ProductVariantJoinSellingPlanGroupsGraphQLQuery(String id,
      List<String> sellingPlanGroupIds, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (sellingPlanGroupIds != null || fieldsSet.contains("sellingPlanGroupIds")) {
        getInput().put("sellingPlanGroupIds", sellingPlanGroupIds);
    }
  }

  public ProductVariantJoinSellingPlanGroupsGraphQLQuery(String id,
      List<String> sellingPlanGroupIds, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (sellingPlanGroupIds != null || fieldsSet.contains("sellingPlanGroupIds")) {
        getInput().put("sellingPlanGroupIds", sellingPlanGroupIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ProductVariantJoinSellingPlanGroupsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantJoinSellingPlanGroups";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private List<String> sellingPlanGroupIds;

    private String queryName;

    public ProductVariantJoinSellingPlanGroupsGraphQLQuery build() {
      return new ProductVariantJoinSellingPlanGroupsGraphQLQuery(id, sellingPlanGroupIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the product variant.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the product variant.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The IDs of the selling plan groups to add.
     */
    public Builder sellingPlanGroupIds(List<String> sellingPlanGroupIds) {
      this.sellingPlanGroupIds = sellingPlanGroupIds;
      this.fieldsSet.add("sellingPlanGroupIds");
      return this;
    }

    /**
     * The IDs of the selling plan groups to add.
     */
    public Builder sellingPlanGroupIdsReference(String variableRef) {
      this.variableReferences.put("sellingPlanGroupIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("sellingPlanGroupIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
