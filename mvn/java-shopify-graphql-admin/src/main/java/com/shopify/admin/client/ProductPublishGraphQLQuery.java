package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductPublishInput;
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
 * Publishes a [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) to specified [`Publication`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication) objects.
 *   
 * Products sold exclusively on subscription (`requiresSellingPlan: true`) can only be published to online stores.
 */
public class ProductPublishGraphQLQuery extends GraphQLQuery {
  public ProductPublishGraphQLQuery(ProductPublishInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductPublishGraphQLQuery(ProductPublishInput input, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ProductPublishGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productPublish";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ProductPublishInput input;

    private String queryName;

    public ProductPublishGraphQLQuery build() {
      return new ProductPublishGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the product to publish and the channels to publish it to.
     */
    public Builder input(ProductPublishInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * Specifies the product to publish and the channels to publish it to.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ProductPublishInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
