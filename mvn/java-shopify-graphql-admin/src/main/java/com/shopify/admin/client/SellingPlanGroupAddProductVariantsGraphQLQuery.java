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
 * Adds multiple product variants to a selling plan group.
 */
public class SellingPlanGroupAddProductVariantsGraphQLQuery extends GraphQLQuery {
  public SellingPlanGroupAddProductVariantsGraphQLQuery(String id, List<String> productVariantIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (productVariantIds != null || fieldsSet.contains("productVariantIds")) {
        getInput().put("productVariantIds", productVariantIds);
    }
  }

  public SellingPlanGroupAddProductVariantsGraphQLQuery(String id, List<String> productVariantIds,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (productVariantIds != null || fieldsSet.contains("productVariantIds")) {
        getInput().put("productVariantIds", productVariantIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SellingPlanGroupAddProductVariantsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "sellingPlanGroupAddProductVariants";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private List<String> productVariantIds;

    private String queryName;

    public SellingPlanGroupAddProductVariantsGraphQLQuery build() {
      return new SellingPlanGroupAddProductVariantsGraphQLQuery(id, productVariantIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the selling plan group.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the selling plan group.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The IDs of the product variants to add.
     */
    public Builder productVariantIds(List<String> productVariantIds) {
      this.productVariantIds = productVariantIds;
      this.fieldsSet.add("productVariantIds");
      return this;
    }

    /**
     * The IDs of the product variants to add.
     */
    public Builder productVariantIdsReference(String variableRef) {
      this.variableReferences.put("productVariantIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("productVariantIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
