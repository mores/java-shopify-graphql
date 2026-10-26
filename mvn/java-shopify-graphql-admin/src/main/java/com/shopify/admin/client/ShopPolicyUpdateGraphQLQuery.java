package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ShopPolicyInput;
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
 * Updates a shop policy.
 */
public class ShopPolicyUpdateGraphQLQuery extends GraphQLQuery {
  public ShopPolicyUpdateGraphQLQuery(ShopPolicyInput shopPolicy, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (shopPolicy != null || fieldsSet.contains("shopPolicy")) {
        getInput().put("shopPolicy", shopPolicy);
    }
  }

  public ShopPolicyUpdateGraphQLQuery(ShopPolicyInput shopPolicy, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (shopPolicy != null || fieldsSet.contains("shopPolicy")) {
        getInput().put("shopPolicy", shopPolicy);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ShopPolicyUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopPolicyUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ShopPolicyInput shopPolicy;

    private String queryName;

    public ShopPolicyUpdateGraphQLQuery build() {
      return new ShopPolicyUpdateGraphQLQuery(shopPolicy, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The properties to use when updating the shop policy.
     */
    public Builder shopPolicy(ShopPolicyInput shopPolicy) {
      this.shopPolicy = shopPolicy;
      this.fieldsSet.add("shopPolicy");
      return this;
    }

    /**
     * The properties to use when updating the shop policy.
     */
    public Builder shopPolicyReference(String variableRef) {
      this.variableReferences.put("shopPolicy", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ShopPolicyInput"))).build());
      this.fieldsSet.add("shopPolicy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
